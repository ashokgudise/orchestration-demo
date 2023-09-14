package com.ashok.demos.orchestrationdemoapi.customizations;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusResponse {

    private String status;
    private LocalDateTime datetime;
}
