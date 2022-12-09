package com.thesis.publishmanagementsystem.service;

import com.thesis.publishmanagementsystem.converter.PromotionMapper;
import com.thesis.publishmanagementsystem.repository.PromotionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromotionService {
    @Autowired
    private PromotionRepository promotionRepository;

    @Autowired
    private PromotionMapper promotionMapper;
}
