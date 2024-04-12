package com.prasquare.expensecalrestservice.expensecalrestservice.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.util.Date;

@Data
public class Expense {
    @NotNull(message = "Person ID cannot be empty")
    @JsonProperty("person_id")
    private Long personId;

    @NotNull(message = "Group ID cannot be empty")
    @JsonProperty("group_id")
    private Long groupId;

    @NotNull(message = "Date of entry cannot be null")
    @JsonFormat(pattern = "dd-MMM-yyyy")
    @JsonProperty("date_of_entry")
    private Date dateOfEntry;

    @NotNull(message = "Expense price cannot be null")
    @Positive(message = "Expense price must be positive")
    @JsonProperty("expense_price")
    private String expensePrice;

    @NotBlank(message = "Expense description cannot be blank")
    @JsonProperty("expense_description")
    private String expenseDescription;

}
