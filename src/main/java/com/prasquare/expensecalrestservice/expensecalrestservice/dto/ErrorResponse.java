package com.prasquare.expensecalrestservice.expensecalrestservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ErrorResponse {
    private String field;
    private String errorMessage;
    private Object enteredValue;
}

