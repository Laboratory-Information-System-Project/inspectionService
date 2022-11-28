package com.douzone.inspectionservice.controller;

import com.douzone.inspectionservice.service.InsertService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/inspection-service")
@RequiredArgsConstructor
public class InsertController {
    private final InsertService service;
    @PostMapping("/insert")
    public void patient(@RequestBody HashMap<String, String> barcode){
        System.out.println(barcode);
        service.InspectionAdd(barcode);
    }
}
