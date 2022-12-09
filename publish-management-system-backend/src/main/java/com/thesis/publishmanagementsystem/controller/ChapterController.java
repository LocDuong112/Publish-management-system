package com.thesis.publishmanagementsystem.controller;

import com.thesis.publishmanagementsystem.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/chapter")
public class ChapterController {
    @Autowired
    private ChapterService chapterService;
}
