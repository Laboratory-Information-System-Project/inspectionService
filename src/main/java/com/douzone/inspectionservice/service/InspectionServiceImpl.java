package com.douzone.inspectionservice.service;

import com.douzone.inspectionservice.domain.ConclusionDTO;
import com.douzone.inspectionservice.domain.RegisterDTO;
import com.douzone.inspectionservice.domain.SearchDTO;
import com.douzone.inspectionservice.mapper.InspectionMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InspectionServiceImpl implements InspectionService{

    private final InspectionMapper mapper;

    @Override
    public List<RegisterDTO> getAllRegister(){
        return mapper.getAllRegisterMapper();
    }

    @Override
    public List<RegisterDTO> getSearchRegister(SearchDTO search){
        return mapper.getSearchRegisterMapper(search);
    }

    @Override
    public List<RegisterDTO> getSearchRegisterNotDate(Long barcode){
        return mapper.getSearchRegisterNotDateMapper(barcode);
    }

    @Override
    public void insertConclusion(ConclusionDTO conclusion){
        mapper.insertConclusionMapper(conclusion);
    }

    @Override
    public List<ConclusionDTO> getAllConclusion(){
        return mapper.getAllConclusionMapper();
    }

    @Override
    public void updateConclusion(ConclusionDTO conclusion){
        mapper.updateConclusionMapper(conclusion);
    }

}
