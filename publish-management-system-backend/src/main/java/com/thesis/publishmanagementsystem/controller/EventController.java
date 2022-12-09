package com.thesis.publishmanagementsystem.controller;

import com.thesis.publishmanagementsystem.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/event")
public class EventController {
    @Autowired
    private EventService eventService;
}
