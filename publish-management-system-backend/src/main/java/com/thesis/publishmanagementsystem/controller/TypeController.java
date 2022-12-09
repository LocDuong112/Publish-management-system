package com.thesis.publishmanagementsystem.controller;

import com.thesis.publishmanagementsystem.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/type")
public class TypeController {
    @Autowired
    private TypeService typeService;
}
