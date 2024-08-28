package com.example.loggingservice.models;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class LogEntry {
    private String level;
    private String project;
    private String message;
    private Long timestamp;

    public LogEntry(LogEntryBuilder builder ){
        this.level = builder.level;
        this.project  = builder.project;
        this.message = builder.message;
        this.timestamp = builder.timestamp;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void getProject(String project){
        return project;
    }

    public String setProject(String project){
        this.project = project;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }
//    public String toString(){
//        return ""+ " level : " + this.level +
//                " message: " + this.message +
//                " timestamp: " + this.timestamp;
//    }

}
