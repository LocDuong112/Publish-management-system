package com.thesis.publishmanagementsystem.controller;

import com.thesis.publishmanagementsystem.service.AuthorComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/authorComic")
public class AuthorComicController {
    @Autowired
    private AuthorComicService authorComicService;
}
