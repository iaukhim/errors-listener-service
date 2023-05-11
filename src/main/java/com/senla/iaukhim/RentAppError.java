package com.senla.iaukhim;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class RentAppError {

    private String fullyClassifiedName;

    private String causeFullName;

    private String stackTrace;

    private LocalDateTime timeStamp;
}
