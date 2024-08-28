package com.example.loggingservice.services;

import com.example.loggingservice.models.LogEntry;

public interface LogService {
    void processLog(LogEntry logEntry);
}