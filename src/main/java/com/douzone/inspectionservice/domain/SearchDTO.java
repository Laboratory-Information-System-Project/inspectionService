package com.douzone.inspectionservice.domain;

import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SearchDTO {
    private Long barcode;
    private Date stDate;
    private Date endDate;
}
