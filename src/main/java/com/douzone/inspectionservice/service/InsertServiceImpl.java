package com.douzone.inspectionservice.service;

import com.douzone.inspectionservice.mapper.InspectionAddMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InsertServiceImpl implements InsertService{
    private final InspectionAddMapper mapper;
    @Override
    public void InspectionAdd(List<Object> barcodeList) {
        mapper.InspectionAdd(barcodeList);
    }

    @Override
    public void updateMapper(HashMap<String, String> updateData) {
        mapper.updateMapper(updateData);
    }

}
