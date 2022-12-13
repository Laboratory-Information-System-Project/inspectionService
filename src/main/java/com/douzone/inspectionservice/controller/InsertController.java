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
    public void patient(@RequestBody HashMap<String, List<Object>> barcodeList){
        System.out.println(barcodeList.get("barcodeList"));
        service.InspectionAdd(barcodeList.get("barcodeList"));
    }
    @PostMapping("/kafka")
    public void kafka(@RequestBody HashMap<String ,String>barcodeList){
        System.out.println(barcodeList.get("barcodeList"));
        kafkaProducer.send("sendBarcodeUpdate",barcodeList.get("barcodeList"));
    }
}
