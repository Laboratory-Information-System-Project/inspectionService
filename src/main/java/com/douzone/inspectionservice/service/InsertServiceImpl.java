package com.douzone.inspectionservice.service;

import com.douzone.inspectionservice.mapper.InspectionAddMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class InsertServiceImpl implements InsertService{
    private final InspectionAddMapper mapper;
    @Override
    public void InspectionAdd(List<Object> barcodeList) {
        mapper.InspectionAdd(barcodeList);
    }

}
