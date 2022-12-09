package com.douzone.inspectionservice.controller;

import com.douzone.inspectionservice.domain.ConclusionDTO;
import com.douzone.inspectionservice.service.InspectionService;
import com.douzone.inspectionservice.service.Kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/inspection-service")
@RequiredArgsConstructor
public class InspectionController {

    private final InspectionService service;

    private final KafkaProducer kafkaProducer;

    @PostMapping("/conclusion")
    public List<String> insertConclusion(@RequestBody List<ConclusionDTO> conclusion){

        String barcode =conclusion.get(0).getBarcode();
        String orderCode =conclusion.get(0).getOrderCode();

        String text1 = barcode;
        String text2 = orderCode;

        List data = new ArrayList<>();

        data.add(text1);
        data.add(text2);

        kafkaProducer.send("sendBarcode",barcode, orderCode);


        try{
            service.insertConclusionBatch(conclusion);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println(data);

        return data;
    }

    @PutMapping("/conclusion")
    public String updateConclusion(@RequestBody List<ConclusionDTO> conclusion) {
        service.updateConclusionBatch(conclusion);

        return "성공하였습니다.";
    }

}
