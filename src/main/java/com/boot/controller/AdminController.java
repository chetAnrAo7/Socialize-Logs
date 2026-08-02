package com.boot.controller;

import com.boot.entities.Logs;
import com.boot.repository.LogRepository;
import com.boot.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/admin")
public class AdminController
{
    
    @Autowired
    LogRepository logs;

    @Autowired
    LogRepository logRepo;

    @Autowired
    AdminService adminService;

    @GetMapping("/signIn")
    public ResponseEntity<Boolean> signIn(@RequestParam String username,@RequestParam String password)
    {
        return ResponseEntity.of(Optional.of(adminService.signInAdmin(username,password)));
    }

    @GetMapping("/getAllLogs")
    public ResponseEntity<List<Logs>> displayLogs()
    {
        List<Logs> logData = logRepo.findAll();
        return ResponseEntity.of(Optional.of(logData));
    }

}