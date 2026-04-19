package com.alamin.bank.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactsController {

    @GetMapping("/contacts")
    public String getCards(){
        return "Contact Details from the DB";
    }
}
