package com.thesis.publishmanagementsystem.service;

import com.thesis.publishmanagementsystem.converter.AuthorComicMapper;
import com.thesis.publishmanagementsystem.repository.AuthorComicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorComicService {
    @Autowired
    private AuthorComicRepository authorComicRepository;

    @Autowired
    private AuthorComicMapper authorComicMapper;
}
