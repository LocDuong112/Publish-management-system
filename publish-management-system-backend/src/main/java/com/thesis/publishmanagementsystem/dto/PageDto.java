package com.thesis.publishmanagementsystem.dto;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class PageDto {
    private Long id;
    private Long chapterId;
    private Long languageId;
    private boolean banned;
    private Integer pageNumber;
}
