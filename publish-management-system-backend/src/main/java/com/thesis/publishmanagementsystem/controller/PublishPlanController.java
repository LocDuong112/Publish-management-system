package com.thesis.publishmanagementsystem.controller;

import com.thesis.publishmanagementsystem.service.PublishPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/publishPlan")
public class PublishPlanController {
    @Autowired
    private PublishPlanService publishPlanService;
}
