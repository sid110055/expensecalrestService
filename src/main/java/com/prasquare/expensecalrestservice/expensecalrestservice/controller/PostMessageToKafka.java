package com.prasquare.expensecalrestservice.expensecalrestservice.controller;


import com.prasquare.expensecalrestservice.expensecalrestservice.dto.Expense;
import com.prasquare.expensecalrestservice.expensecalrestservice.dto.Group;
import com.prasquare.expensecalrestservice.expensecalrestservice.dto.Person;
import com.prasquare.expensecalrestservice.expensecalrestservice.service.SendMessageToKafka;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostMessageToKafka {

    @Autowired
    SendMessageToKafka sendMessageToKafka;

    @PostMapping("/group")
    public ResponseEntity<Group> saveGroup(@RequestBody @Valid Group group) {
        sendMessageToKafka.postMessage(group);
        return new ResponseEntity<>(group, HttpStatus.CREATED);
    }


    @PostMapping("/expense")
    public ResponseEntity<Expense> saveExpense(@RequestBody @Valid Expense expense) {
        sendMessageToKafka.postMessage(expense);
        return new ResponseEntity<>(expense, HttpStatus.CREATED);
    }


    @PostMapping("/person")
    public ResponseEntity<Person> savePerson(@RequestBody @Valid Person person) {
        sendMessageToKafka.postMessage(person);
        return new ResponseEntity<>(person, HttpStatus.CREATED);
    }
}
