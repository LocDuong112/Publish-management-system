package com.thesis.publishmanagementsystem.controller;

import com.thesis.publishmanagementsystem.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/page")
public class PageController {
    @Autowired
    private PageService pageService;
}
