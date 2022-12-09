package com.thesis.publishmanagementsystem.service;

import com.thesis.publishmanagementsystem.converter.AuthorMapper;
import com.thesis.publishmanagementsystem.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private AuthorMapper authorMapper;
}
