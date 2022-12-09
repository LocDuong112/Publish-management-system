package com.thesis.publishmanagementsystem.dto;

import lombok.*;

import java.util.Date;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class EventDto {
    private Long id;
    private Long publishPlanId;
    private Date startDate;
    private Date endDate;
    private String description;
}
