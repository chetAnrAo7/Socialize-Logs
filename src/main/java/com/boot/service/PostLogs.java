package com.boot.service;

import com.boot.entities.Logs;
import com.boot.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostLogs
{
    @Autowired
    LogRepository logRepo;

    public void addLog(String log)
    {
        Logs logs = new Logs();
        logs.setLog(log);
        logRepo.save(logs);
    }
}