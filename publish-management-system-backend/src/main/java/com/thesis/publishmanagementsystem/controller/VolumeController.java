package com.thesis.publishmanagementsystem.controller;

import com.thesis.publishmanagementsystem.service.VolumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/volume")
public class VolumeController {
    @Autowired
    private VolumeService volumeService;
}
