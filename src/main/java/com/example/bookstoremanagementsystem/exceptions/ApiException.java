package com.example.bookstoremanagementsystem.exceptions;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class ApiException {

    private String message;
    private HttpStatus httpStatus;
}
