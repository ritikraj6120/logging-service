package com.example.loggingservice.models;

import com.example.loggingservice.dto.LogEntryRequest;

public class LogEntryDirector {

    private final LogEntryBuilder logEntryBuilder;

    public LogEntryDirector(LogEntryBuilder logEntryBuilder) {
        this.logEntryBuilder = logEntryBuilder;
    }

    public LogEntry createLogEntry(LogEntryRequest logEntryRequest) {
        System.out.println(logEntryRequest.getMessage());
        System.out.println(logEntryRequest.getLevel());
        System.out.println(logEntryRequest.getTimestamp());
        logEntryBuilder.setMessage(logEntryRequest.getMessage());
        logEntryBuilder.setProject(logEntryRequest.getProject());
        if (logEntryRequest.getLevel() != null) {
            logEntryBuilder.setLevel(logEntryRequest.getLevel());
        }
        if (logEntryRequest.getTimestamp() != null) {
            logEntryBuilder.setTimestamp(logEntryRequest.getTimestamp());
        }
        return logEntryBuilder.build();
    }

}
