package com.ashok.demos.orchestrationdemoapi.controller;

import com.ashok.demos.orchestrationdemoapi.customizations.CustomService;
import com.ashok.demos.orchestrationdemoapi.customizations.StatusResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneOffset;

@RestController
@Slf4j
public class CustomController {

    @Autowired
    CustomService customerService;

    @RequestMapping("/status")
    public ResponseEntity<StatusResponse> getStatus() {
        StatusResponse response = new StatusResponse(customerService.getWelcomeMessage(), LocalDateTime.now(ZoneOffset.UTC));
        return ResponseEntity
                .ok()
                .body(response);
    }

}
