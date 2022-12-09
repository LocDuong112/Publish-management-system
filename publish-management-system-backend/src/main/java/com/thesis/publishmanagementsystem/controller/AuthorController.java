package com.thesis.publishmanagementsystem.controller;

import com.thesis.publishmanagementsystem.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
}
