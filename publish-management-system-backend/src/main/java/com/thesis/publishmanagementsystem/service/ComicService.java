package com.thesis.publishmanagementsystem.service;

import com.thesis.publishmanagementsystem.converter.ComicMapper;
import com.thesis.publishmanagementsystem.repository.ComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComicService {
    @Autowired
    private ComicRepository comicRepository;

    @Autowired
    private ComicMapper comicMapper;
}
