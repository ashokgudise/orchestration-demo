package com.ashok.demos.orchestrationdemoapi.customizations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class CustomService {

    @Value("${app.client-name}")
    private String clientId;
    @Value("${app.welcome-message}")
    private String welcomeMessage;

    public String getWelcomeMessage(){
        return this.welcomeMessage+ "   " +clientId+ "!";
    }
}
