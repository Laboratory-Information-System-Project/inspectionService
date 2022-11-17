package com.douzone.inspectionservice.domain;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConclusionDTO {
    private Long resultNo;
    private Long registerCode;
    private String figures;
    private LocalDateTime firstInspectionDt;
    private LocalDateTime lastInspectionDt;
    private String note;
    private String sampleNote;
}
