package com.thesis.publishmanagementsystem.dto;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PublishPlanDto {
    private Long id;
    private Long chapterId;
    private Long adminId;
    private String name;
}
