package com.example.guest_book;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
class GuestBookViewController {
    public List<Guest> guests;

    public GuestBookViewController() {
        guests = new ArrayList<>();
    }

    @GetMapping("/")
    String indexController(Model model) {
        return "index";
    }

    @GetMapping("/guestbook")
    String GuestBookController(Model model) {
        model.addAttribute("guests", guests);
        return "guestbook.html";
    }

    @PostMapping("/")
    String add(Model model,
               @ModelAttribute("guestFeedback") String name,
               @ModelAttribute("guestFeedback") String guestFeedback) {

        if (name != null && guestFeedback != null) {
            // Создать гостя
            Guest g = new Guest(name, guestFeedback);

            // Добавить гостя в список
            guests.add(g);

            // Отправить гостя в модель
            model.addAttribute("guests", guests);
        }

        return "guestbook.html";
    }
}
