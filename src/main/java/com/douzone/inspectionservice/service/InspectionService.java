package com.douzone.inspectionservice.service;

import com.douzone.inspectionservice.domain.ConclusionDTO;

import java.util.List;

public interface InspectionService {

    void insertConclusionBatch(List<ConclusionDTO> conclusion);

    void updateConclusionBatch(List<ConclusionDTO> conclusion);
}
