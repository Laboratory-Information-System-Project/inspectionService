package com.douzone.inspectionservice.mapper;

import com.douzone.inspectionservice.domain.ConclusionDTO;
import com.douzone.inspectionservice.domain.RegisterDTO;
import com.douzone.inspectionservice.domain.SearchDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InspectionMapper {

    List<RegisterDTO> getAllRegisterMapper();

    List<RegisterDTO> getSearchRegisterMapper(SearchDTO search);

    List<RegisterDTO> getSearchRegisterNotDateMapper(Long barcode);

    void insertConclusionMapper(ConclusionDTO conclusion);

    List<ConclusionDTO> getAllConclusionMapper();

    void updateConclusionMapper(ConclusionDTO conclusion);
}
