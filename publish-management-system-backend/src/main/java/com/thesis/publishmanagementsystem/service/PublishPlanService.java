package com.thesis.publishmanagementsystem.service;

import com.thesis.publishmanagementsystem.converter.PublishPlanMapper;
import com.thesis.publishmanagementsystem.repository.PublishPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PublishPlanService {
    @Autowired
    private PublishPlanRepository publishPlanRepository;

    @Autowired
    private PublishPlanMapper publishPlanMapper;
}
