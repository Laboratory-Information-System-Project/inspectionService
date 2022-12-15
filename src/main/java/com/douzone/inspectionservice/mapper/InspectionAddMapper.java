package com.douzone.inspectionservice.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface InspectionAddMapper {
       void InspectionAdd(List<Object> barcodeList);
       void updateMapper(HashMap<String,String>updateData);

}
