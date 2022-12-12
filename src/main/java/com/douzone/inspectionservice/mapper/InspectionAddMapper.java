package com.douzone.inspectionservice.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface InspectionAddMapper {
       void inspectionAdd(Map<String, String> barcode);
}
