package com.boot.controller;

import com.boot.service.PostLogs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/internal/logs")
public class LogsController {

    @Autowired
    private PostLogs postLogs;

    @PostMapping("/add")
    public void addLog(@RequestBody String log) {
        postLogs.addLog(log);
    }
}