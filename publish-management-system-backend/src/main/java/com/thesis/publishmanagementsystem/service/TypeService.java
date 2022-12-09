package com.thesis.publishmanagementsystem.service;

import com.thesis.publishmanagementsystem.converter.TypeMapper;
import com.thesis.publishmanagementsystem.repository.TypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TypeService {
    @Autowired
    private TypeRepository typeRepository;

    @Autowired
    private TypeMapper typeMapper;
}
