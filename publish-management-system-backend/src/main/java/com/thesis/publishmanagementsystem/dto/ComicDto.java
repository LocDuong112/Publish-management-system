package com.thesis.publishmanagementsystem.dto;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ComicDto {
    private Long id;
    private Long typeId;
    private String name;
    private String countryOrigin;
    private String countryPublish;
    private boolean published;
    private String readPlatform;
}
