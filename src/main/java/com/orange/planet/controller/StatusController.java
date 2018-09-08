package com.orange.planet.controller;

import com.orange.planet.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class StatusController {
    @Autowired
    private StatusService statusService;
}
