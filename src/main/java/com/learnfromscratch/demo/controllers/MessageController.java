package com.learnfromscratch.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @CrossOrigin(origins = "http://localhost:3000", allowedHeaders = "*")
    @GetMapping("/message")
    public ResponseEntity<String> message() {
        return ResponseEntity.ok("Hi from backend!!");
    }
}
