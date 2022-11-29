package com.thesis.publishmanagementsystem.service;

import com.thesis.publishmanagementsystem.converter.VolumeMapper;
import com.thesis.publishmanagementsystem.repository.VolumeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VolumeService {
    @Autowired
    private VolumeRepository volumeRepository;

    private VolumeMapper volumeMapper;
}
