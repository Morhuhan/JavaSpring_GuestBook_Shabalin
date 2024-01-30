package com.example.guest_book;

import org.springframework.stereotype.Component;

public class Guest {

    public String name;
    public String feedback;

    public Guest(String name, String feedback) {
        this.name = name;
        this.feedback = feedback;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
