package com.thesis.publishmanagementsystem.service;

import com.thesis.publishmanagementsystem.converter.EventMapper;
import com.thesis.publishmanagementsystem.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService {
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventMapper eventMapper;
}
