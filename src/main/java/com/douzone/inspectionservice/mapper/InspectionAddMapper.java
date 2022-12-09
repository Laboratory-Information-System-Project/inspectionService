package com.douzone.inspectionservice.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface InspectionAddMapper {
       void InspectionAdd(HashMap<String, String> barcode);
}
