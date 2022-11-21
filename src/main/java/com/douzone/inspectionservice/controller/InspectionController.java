package com.douzone.inspectionservice.controller;

import com.douzone.inspectionservice.domain.ConclusionDTO;
import com.douzone.inspectionservice.domain.SearchDTO;
import com.douzone.inspectionservice.domain.RegisterDTO;
import com.douzone.inspectionservice.service.InspectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inspection-service")
@RequiredArgsConstructor
public class InspectionController {

    private final InspectionService service;

    @GetMapping("/register/today")
    public List<RegisterDTO> getTodayRegister(){
        return service.getTodayRegister();
    }

    @GetMapping("/register/search")
    public List<RegisterDTO> getSearchRegister(SearchDTO search){
        return service.getSearchRegister(search);
    }

    @GetMapping("/register/search/{barcode}")
    public List<RegisterDTO> getSearchRegisterNotDate(@PathVariable Long barcode){
        return service.getSearchRegisterNotDate(barcode);
    }

    @PostMapping("/conclusion")
    void insertConclusion(@RequestBody ConclusionDTO conclusion){
        service.insertConclusion(conclusion);
    }

    @GetMapping("/conclusion/all")
    public List<ConclusionDTO> getAllConclusion(){
        return service.getAllConclusion();
    }

    @PutMapping("/conclusion")
    void updateConclusion(@RequestBody ConclusionDTO conclusion) {
        service.updateConclusion(conclusion);
    }

}
