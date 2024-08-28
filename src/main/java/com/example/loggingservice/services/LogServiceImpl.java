package com.example.loggingservice.services;

import com.example.loggingservice.models.LogEntry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {

    private static final String TOPIC = "logs";

    private final KafkaTemplate<String, LogEntry> kafkaTemplate;

    @Autowired
    public LogServiceImpl(KafkaTemplate<String, LogEntry> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public void processLog(LogEntry logEntry) {
        kafkaTemplate.send(TOPIC, logEntry);
    }
}
