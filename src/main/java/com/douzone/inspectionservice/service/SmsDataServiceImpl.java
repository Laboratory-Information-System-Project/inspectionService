package com.douzone.inspectionservice.service;

import com.douzone.inspectionservice.domain.SmsDataDTO;
import com.douzone.inspectionservice.mapper.SmsDataMapper;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SmsDataServiceImpl implements SmsDataService {
    private final SmsDataMapper mapper;

    @Override
    public List<SmsDataDTO> SmsAllList(){
        return mapper.smsSelectAll();
    }

    @Override
    public void insert(SmsDataDTO smsData) {
        mapper.insert(smsData);
    }

    @Override
    public void update(SmsDataDTO smsData) {
        mapper.update(smsData);
    }

    @Override
    public void delete(int smsNo) {
        mapper.delete(smsNo);
    }
}
