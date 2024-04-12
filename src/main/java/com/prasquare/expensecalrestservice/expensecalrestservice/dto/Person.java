package com.prasquare.expensecalrestservice.expensecalrestservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Person {
    @NotNull(message = "id cannot be null")
    @JsonProperty("id")
    private Long Id;

    @NotNull(message = "name cannot be null")
    @JsonProperty("name")
    private String Name;

    @NotNull(message = "user_name cannot be null")
    @JsonProperty("user_name")
    private String user_name;

    @NotNull(message = "pwd cannot be null")
    @JsonProperty("pwd")
    private String pwd;

    @JsonProperty("expenses")
    private List<Expense> expenseList = new ArrayList<>();

}

