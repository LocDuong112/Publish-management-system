package com.thesis.publishmanagementsystem.dto;

import lombok.*;

import java.util.Date;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PromotionDto {
    private Long id;
    private String name;
    private Date startDate;
    private Date endDate;
}
