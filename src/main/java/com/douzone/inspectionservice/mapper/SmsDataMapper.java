package com.douzone.inspectionservice.mapper;

import com.douzone.inspectionservice.domain.SmsDataDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SmsDataMapper {
    List<SmsDataDTO> smsSelectAll();
    void insert(SmsDataDTO smsData);
    void update(SmsDataDTO smsData);
    void delete(@Param("smsNo") int smsNo);
}
