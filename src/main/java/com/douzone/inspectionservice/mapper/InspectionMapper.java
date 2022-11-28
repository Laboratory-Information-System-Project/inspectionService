package com.douzone.inspectionservice.mapper;

import com.douzone.inspectionservice.domain.ConclusionDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InspectionMapper {

    void insertConclusionBatchMapper(List<ConclusionDTO> conclusion);

    void updateConclusionBatchMapper(List<ConclusionDTO> conclusion);
}
