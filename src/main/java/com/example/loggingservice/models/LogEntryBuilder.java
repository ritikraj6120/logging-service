package com.example.loggingservice.models;

public class LogEntryBuilder {
    public String level;
    public String project;
    public String message;
    public long timestamp;


    public LogEntryBuilder setLevel(String level) {
        this.level = level;
        return this;
    }

    public LogEntryBuilder setLevel(String project) {
        this.project = project;
        return this;
    }

    public LogEntryBuilder setMessage(String message) {
        this.message = message;
        return this;
    }

    public LogEntryBuilder setTimestamp(long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public LogEntry build() {
        return new LogEntry(this);
    }

}
