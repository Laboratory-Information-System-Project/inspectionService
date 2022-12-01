package com.douzone.inspectionservice.controller;

import com.douzone.inspectionservice.domain.ConclusionDTO;
import com.douzone.inspectionservice.service.InspectionService;
import com.douzone.inspectionservice.service.Kafka.KafkaProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/inspection-service")
@RequiredArgsConstructor
public class InspectionController {

    private final InspectionService service;

    private final KafkaProducer kafkaProducer;

    @PostMapping("/conclusion")
    void insertConclusion(@RequestBody List<ConclusionDTO> conclusion){
        service.insertConclusionBatch(conclusion);

        String barcode =conclusion.get(0).getBarcode();

        kafkaProducer.send("sendBarcode",barcode);
    }

    @PutMapping("/conclusion")
    void updateConclusion(@RequestBody List<ConclusionDTO> conclusion) {
        service.updateConclusionBatch(conclusion);
    }

}
