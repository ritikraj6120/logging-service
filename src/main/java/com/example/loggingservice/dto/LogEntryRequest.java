package com.example.loggingservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;

import com.example.loggingservice.validation.FieldIfProvidedNotNull;

public class LogEntryRequest {
    @JsonProperty("level")
    @FieldIfProvidedNotNull(message="level if provided can't be empty")
    private String level;

    @JsonProperty("message")
    @NotBlank(message = "The 'message' field is required.")
    private String message;

    @JsonProperty("project")
    @NotBlank(message="The 'prject' field is required")
    private String project;

    @JsonProperty("timestamp")
    @FieldIfProvidedNotNull(message="timestamp if provided can't be zero")
    private Long timestamp;

    public String getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public String toString(){
        return "params in logEntryRequest"+ " level : " + this.level +
                " message: " + this.message +
                " timestamp: " + this.timestamp+
                " project: " + this.project;
    }
}
