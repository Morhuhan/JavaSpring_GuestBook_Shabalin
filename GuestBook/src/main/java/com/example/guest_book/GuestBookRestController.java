package com.example.guest_book;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class GuestBookRestController {

    @GetMapping("/all-guests")
    public List<Guest> viewHomePage(Model model) {
        List<Guest> guests = new ArrayList<>();
        guests.add(new Guest("Виктор", "ASD"));
        guests.add(new Guest("ASD", "ASD"));
        return guests;
    }
}
