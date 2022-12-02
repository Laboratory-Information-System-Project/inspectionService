package com.douzone.inspectionservice.controller;

import com.douzone.inspectionservice.domain.ConclusionDTO;
import com.douzone.inspectionservice.service.InspectionService;
import com.douzone.inspectionservice.service.Kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inspection-service")
@RequiredArgsConstructor
public class InspectionController {

    private final InspectionService service;

    private final KafkaProducer kafkaProducer;

    @PostMapping("/conclusion")
    public String insertConclusion(@RequestBody List<ConclusionDTO> conclusion){

        String barcode =conclusion.get(0).getBarcode();

        kafkaProducer.send("sendBarcode",barcode);

        String text;

        try{
            service.insertConclusionBatch(conclusion);
            text= barcode;
        }catch (Exception e){
            System.out.println(e);
            text= barcode;
        }

        return text;
    }

    @PutMapping("/conclusion")
    public String updateConclusion(@RequestBody List<ConclusionDTO> conclusion) {
        service.updateConclusionBatch(conclusion);

        return "성공하였습니다.";
    }

}
