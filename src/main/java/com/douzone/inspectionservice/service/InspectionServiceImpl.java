package com.douzone.inspectionservice.service;

import com.douzone.inspectionservice.domain.ConclusionDTO;
import com.douzone.inspectionservice.mapper.InspectionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InspectionServiceImpl implements InspectionService{

    private final InspectionMapper mapper;

    @Override
    public void insertConclusionBatch(List<ConclusionDTO> conclusion){
        mapper.insertConclusionBatchMapper(conclusion);
    }

    @Override
    public void updateConclusionBatch(List<ConclusionDTO> conclusion){
        mapper.updateConclusionBatchMapper(conclusion);
    }

}
