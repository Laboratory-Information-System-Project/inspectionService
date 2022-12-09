package com.douzone.inspectionservice.service;

import com.douzone.inspectionservice.mapper.InspectionAddMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
@RequiredArgsConstructor
public class InsertServiceImpl implements InsertService{
    private final InspectionAddMapper mapper;
    @Override
    public void InspectionAdd(HashMap<String, String> barcode) {
        mapper.InspectionAdd(barcode);
    }

}
