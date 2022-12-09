package com.thesis.publishmanagementsystem.dto;

import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorComicDto {
    private Long id;
    private Long authorId;
    private Long comicId;
}
