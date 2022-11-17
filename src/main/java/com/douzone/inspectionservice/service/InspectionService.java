package com.douzone.inspectionservice.service;

import com.douzone.inspectionservice.domain.ConclusionDTO;
import com.douzone.inspectionservice.domain.RegisterDTO;
import com.douzone.inspectionservice.domain.SearchDTO;

import java.util.List;

public interface InspectionService {

    List<RegisterDTO> getAllRegister();

    List<RegisterDTO> getSearchRegister(SearchDTO search);

    List<RegisterDTO> getSearchRegisterNotDate(Long barcode);

    void insertConclusion(ConclusionDTO conclusion);

    List<ConclusionDTO> getAllConclusion();

    void updateConclusion(ConclusionDTO conclusion);
}
