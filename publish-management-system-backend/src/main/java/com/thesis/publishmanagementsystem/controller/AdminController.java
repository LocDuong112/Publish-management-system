package com.thesis.publishmanagementsystem.controller;

import com.thesis.publishmanagementsystem.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
}
