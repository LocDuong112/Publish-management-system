package com.thesis.publishmanagementsystem.service;

import com.thesis.publishmanagementsystem.converter.AdminMapper;
import com.thesis.publishmanagementsystem.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private AdminMapper adminMapper;
}
