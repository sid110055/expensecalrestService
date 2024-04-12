package com.prasquare.expensecalrestservice.expensecalrestservice.controller;

import com.prasquare.expensecalrestservice.expensecalrestservice.dto.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<List<ErrorResponse>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        List<ErrorResponse> errors = ex.getBindingResult().getFieldErrors().stream().map(error -> new ErrorResponse("person." + error.getField(), error.getDefaultMessage(), ((error.getRejectedValue() != null) ? error.getRejectedValue() : null))).collect(Collectors.toList());

        return ResponseEntity.badRequest().body(errors);
    }
}