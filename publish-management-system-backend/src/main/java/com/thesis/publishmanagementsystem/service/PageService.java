package com.thesis.publishmanagementsystem.service;

import com.thesis.publishmanagementsystem.converter.PageMapper;
import com.thesis.publishmanagementsystem.repository.PageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PageService {
    @Autowired
    private PageRepository pageRepository;

    @Autowired
    private PageMapper pageMapper;
}
