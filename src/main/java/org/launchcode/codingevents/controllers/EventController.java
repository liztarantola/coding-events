package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Controller
@RequestMapping("events")
public class EventController {

    private static List<String> events = new ArrayList<>();

//    @GetMapping
//    public String displayAllEvents(Model model) {
//        model.addAttribute("events", events);
//        return "events/index";
//    }
    @GetMapping
    public String displayAllEvents(Model model) {
        HashMap<String,String> events = new HashMap<>();
        events.put("Strange Loop", "Thurs, Sept 30, 9AM-Sat, Oct 2, 6PM  *Conference for web developers");
        events.put("4 Weeks SQL Training Course", "Mon, Jun 21, 8:30AM-July 21  *4 week Python Programming Training Course");
        events.put("4 Weekends Ruby on Rails for Beginners", "Sat Jun 5, 10:30AM-12:30PM *4Weekend Java for beginners");
        model.addAttribute("events", events);
        return "events/index";
    }

//    lives at /events/create
    @GetMapping("create")
    public String renderCreateEventForm() {
        return "events/create";
    }

//    its ok to have the same path as method above bc they handle 2 different types of requests
    @PostMapping("create")
    public String createEvent(@RequestParam String eventName) {
        events.add(eventName);
        return "redirect:";
    }
}
