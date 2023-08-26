package com.example.bookstoremanagementsystem.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class UserExceptionHandler {

    @ExceptionHandler
    public ResponseEntity<ApiException> handlerNotFound(
            UserNotFoundException ex) {
        ApiException apiEx = new ApiException();
        apiEx.setHttpStatus(HttpStatus.NOT_FOUND);
        apiEx.setMessage(ex.getMessage());
        return ResponseEntity.ok(apiEx);
    }
}
