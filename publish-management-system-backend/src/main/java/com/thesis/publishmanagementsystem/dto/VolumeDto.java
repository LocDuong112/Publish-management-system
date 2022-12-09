package com.thesis.publishmanagementsystem.dto;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class VolumeDto {
    private Long id;
    private Long comic_id;
    private String price;
}
