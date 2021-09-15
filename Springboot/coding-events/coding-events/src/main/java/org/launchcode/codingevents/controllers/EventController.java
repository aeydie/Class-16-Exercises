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
import java.util.Map;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

    private static List<String> events = new ArrayList<>();
        private static Map<String, String> eventsMap = new HashMap<>();

    @GetMapping
            public String displayAllEvents(Model model) {
//        Map<String, String> eventsMap = new HashMap<>();
        eventsMap.put("Menteaship", "A fun meetup for connecting with mentors");
        eventsMap.put("Code With Pride", "A fun meetup sponsored by LaunchCode");
        eventsMap.put("Javascripty", "An imaginary meetup for Javascript developers");
        model.addAttribute("events", eventsMap);
        return "events/index";
    }
//    @GetMapping
//    public String displayAllEvents(Model model) {
//        model.addAttribute("title", "All Events");
//        model.addAttribute("events", events);
//        return "events/index";
//    }

    @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@RequestParam String eventName) {
        events.add("eventName");
        return "redirect:";
    }

}