package com.douzone.inspectionservice.service;

import com.douzone.inspectionservice.mapper.InspectionAddMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@RequiredArgsConstructor
public class InsertServiceImpl implements InsertService{
    private final InspectionAddMapper mapper;
    @Override
    public void InspectionAdd(HashMap<String, Object> barcode) {
        Map<String, String> insert = new HashMap<>();
        insert.put("inspectorId", barcode.get("inspectorId").toString());
        insert.put("barcode", barcode.get("barcode").toString());

        mapper.inspectionAdd(insert);
    }

}
