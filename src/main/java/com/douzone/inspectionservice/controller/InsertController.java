package com.douzone.inspectionservice.controller;

import com.douzone.inspectionservice.service.InsertService;
import com.douzone.inspectionservice.service.Kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/inspection-service")
@RequiredArgsConstructor
public class InsertController {
    private final InsertService service;
    private final KafkaProducer kafkaProducer;
    @PostMapping("/insert")
    public void patient(@RequestBody HashMap<String, String> barcode){
        System.out.println(barcode);
        service.InspectionAdd(barcode);
    }
    @PostMapping("updateData")
    @ResponseStatus(HttpStatus.CREATED)
    public void updateData(@RequestBody HashMap<String, List<String>> prescribeCode){
        System.out.println(prescribeCode);
        kafkaProducer.send("updateStatus","D", prescribeCode.get("prescribeCodeList"));

    }
}
