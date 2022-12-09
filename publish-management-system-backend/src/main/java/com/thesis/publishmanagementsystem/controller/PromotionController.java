package com.thesis.publishmanagementsystem.controller;

import com.thesis.publishmanagementsystem.service.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/promotion")
public class PromotionController {
    @Autowired
    private PromotionService promotionService;
}
