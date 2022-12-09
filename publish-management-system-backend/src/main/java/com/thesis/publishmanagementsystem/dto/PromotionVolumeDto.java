package com.thesis.publishmanagementsystem.dto;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PromotionVolumeDto {
    private Long id;
    private Long promotionId;
    private Long volumeId;
}
