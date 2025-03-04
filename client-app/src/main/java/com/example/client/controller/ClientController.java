package com.example.client.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @GetMapping(value = "/client", produces = "application/json")
    public ResponseEntity<DemoPojo> hello() {
        String body = "{\"message\":\"Hello World\"}";
        DemoPojo pojo = new DemoPojo(List.of(body));
        return ResponseEntity.ok(pojo);
    }
}
