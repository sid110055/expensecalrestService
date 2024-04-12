package com.prasquare.expensecalrestservice.expensecalrestservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Group {
    @JsonProperty("id")
    @NotNull(message = "Id cannot be null")
    private Long id;

    @JsonProperty("name")
    @NotNull(message = "Name cannot be null")
    @Size(min = 1, max = 50, message = "Name must be between 1 and 50 characters")
    private String name;

    @JsonProperty("person")
    public List<Person> person = new ArrayList<>();
}
