package com.example.server.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class ServerController {

    RestClient client = RestClient.builder().build();

    @GetMapping(value = "/server", produces = "application/json")
    public ResponseEntity<DemoPojo> server() {
        return client.get().uri("http://localhost:8081/client").retrieve().toEntity(DemoPojo.class);
    }

}
