package com.thesis.publishmanagementsystem.controller;

import com.thesis.publishmanagementsystem.service.LanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/language")
public class LanguageController {
    @Autowired
    private LanguageService languageService;
}
