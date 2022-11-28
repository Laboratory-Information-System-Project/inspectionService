package com.douzone.inspectionservice.controller;

import com.douzone.inspectionservice.domain.ConclusionDTO;
import com.douzone.inspectionservice.service.InspectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inspection-service")
@RequiredArgsConstructor
public class InspectionController {

    private final InspectionService service;

    @PostMapping("/conclusion")
    void insertConclusion(@RequestBody List<ConclusionDTO> conclusion){
        service.insertConclusionBatch(conclusion);
    }

    @PutMapping("/conclusion")
    void updateConclusion(@RequestBody List<ConclusionDTO> conclusion) {
        service.updateConclusionBatch(conclusion);
    }

}
