package com.dh.mssubscription.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController {

    @Value("${idRandom}")
    private String idRandom;

    @GetMapping("/subscription/find")
    public ResponseEntity<String> find() {
        return ResponseEntity.ok(idRandom);
    }
}
