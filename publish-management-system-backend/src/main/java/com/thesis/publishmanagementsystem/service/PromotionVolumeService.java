package com.thesis.publishmanagementsystem.service;

import com.thesis.publishmanagementsystem.converter.PromotionVolumeMapper;
import com.thesis.publishmanagementsystem.repository.PromotionVolumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PromotionVolumeService {
    @Autowired
    private PromotionVolumeRepository promotionVolumeRepository;

    @Autowired
    private PromotionVolumeMapper promotionVolumeMapper;
}
