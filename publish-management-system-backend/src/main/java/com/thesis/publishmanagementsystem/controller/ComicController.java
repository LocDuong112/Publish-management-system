package com.thesis.publishmanagementsystem.controller;

import com.thesis.publishmanagementsystem.service.ComicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/comic")
public class ComicController {
    @Autowired
    private ComicService comicService;
}
