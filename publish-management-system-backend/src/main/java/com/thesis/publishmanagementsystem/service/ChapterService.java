package com.thesis.publishmanagementsystem.service;

import com.thesis.publishmanagementsystem.converter.ChapterMapper;
import com.thesis.publishmanagementsystem.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChapterService {
    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private ChapterMapper chapterMapper;
}
