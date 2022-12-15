package com.douzone.inspectionservice.service;

import java.util.HashMap;
import java.util.List;

public interface InsertService {
    void InspectionAdd(List<Object> barcode);
    void updateMapper(HashMap<String, String> updateData);
}
