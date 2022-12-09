package com.thesis.publishmanagementsystem.dto;

import lombok.*;

import java.util.Date;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AuthorDto {
    private Long id;
    private String name;
    private String payMethod;
    private Date dob;
}
