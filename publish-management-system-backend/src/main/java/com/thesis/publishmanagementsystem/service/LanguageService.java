package com.thesis.publishmanagementsystem.service;

import com.thesis.publishmanagementsystem.converter.LanguageMapper;
import com.thesis.publishmanagementsystem.repository.LanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {
    @Autowired
    private LanguageRepository languageRepository;

    @Autowired
    private LanguageMapper languageMapper;
}
