//package com.example.loggingservice.controllers;
//
//import jakarta.validation.Valid;
//
//import com.fasterxml.jackson.databind.ObjectMapper;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.loggingservice.services.LogService;
//import com.example.loggingservice.dto.LogEntryRequest;
//import com.example.loggingservice.models.LogEntry;
//import com.example.loggingservice.models.LogEntryDirector;
//import com.example.loggingservice.models.LogEntryBuilder;
//
//
//@RestController("/")
//public class LogController {
//
//
//    private final LogService logService;
//
//    @Autowired
//    public LogController(LogService logService) {
//        this.logService = logService;
//    }
//
//    @PostMapping("/a")
//    public ResponseEntity<String> receiveLog(@Valid @RequestBody LogEntryRequest logEntryRequest) {
//        try {
//
//            LogEntryDirector logEntryDirector = new LogEntryDirector(new LogEntryBuilder());
//            LogEntry logEntry = logEntryDirector.createLogEntry(logEntryRequest);
//            return ResponseEntity.status(HttpStatus.OK).body("Logs received successfully");
////            logService.processLog(logEntry);
////            return ResponseEntity.status(HttpStatus.OK).body("Logs received successfully");
//        } catch (Exception e){
//            System.out.println(e);
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
//        }
//    }
//
//    @GetMapping("/")
//    public ResponseEntity<?> ping() {
//        try{
//            return ResponseEntity.status(HttpStatus.OK).body("All Ok");
//        } catch (Exception e){
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Internal Server Error");
//        }
//    }
//}
