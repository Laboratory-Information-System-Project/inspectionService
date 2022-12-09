package com.douzone.inspectionservice.domain;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConclusionDTO implements Serializable {
    private Long resultNo;
    private String inspectionCode;
    private Long registerCode;
    private String figures;
    private LocalDateTime inspectionDt;
    private LocalDateTime reportedDt;
    private String note;
    private String barcode;
    private String orderCode;
}
