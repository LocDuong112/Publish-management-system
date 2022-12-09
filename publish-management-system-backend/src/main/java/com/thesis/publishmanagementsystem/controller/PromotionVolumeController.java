package com.thesis.publishmanagementsystem.controller;

import com.thesis.publishmanagementsystem.service.PromotionVolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/promotionVolume")
public class PromotionVolumeController {
    @Autowired
    private PromotionVolumeService promotionVolumeService;
}
