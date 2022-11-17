package com.douzone.inspectionservice.domain;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDTO {
    private Long registerCode;
    private String statusCode;
    private LocalDateTime registerDt;
    private Long barcode;
    private String inspectorId;
}
