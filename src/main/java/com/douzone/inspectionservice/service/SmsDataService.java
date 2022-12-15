package com.douzone.inspectionservice.service;
import com.douzone.inspectionservice.domain.SmsDataDTO;

import java.util.List;
public interface SmsDataService {
    List<SmsDataDTO> SmsAllList();
    public void insert(SmsDataDTO smsData);
    public void update(SmsDataDTO smsData);
    public void delete(int smsNo);
}
