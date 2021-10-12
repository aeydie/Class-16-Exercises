//package org.launchcode.codingevents.controllers;
//
//
//import org.launchcode.codingevents.Data.EventRepository;
//import org.launchcode.codingevents.models.Event;
//import org.launchcode.codingevents.models.EventType;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.Errors;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
//
//@Controller
//@RequestMapping("events")
//public class EventController {
//
//    @Autowired
//    private EventRepository eventRepository;
//
//    //want to use findAll, findByID, save
//
//    @GetMapping
//    public String displayAllEvents(Model model) {
//        model.addAttribute("title", "All Events");
//        model.addAttribute("events", eventRepository.findAll());
//        return "events/index";
//    }
//
//    @GetMapping("create")
//    public String displayCreateEventForm(Model model) {
//        model.addAttribute("title", "Create Event");
//        model.addAttribute(new Event());
//        model.addAttribute("types", EventType.values());
//        return "events/create";
//    }
//
//    @PostMapping("create")
//    public String processCreateEventForm(@ModelAttribute @Valid Event newEvent,
//                                         Errors errors, Model model) {
//        if(errors.hasErrors()) {
//            model.addAttribute("title", "Create Event");
//            return "events/create";
//        }
//
//        eventRepository.save(newEvent);
//        return "redirect:";
//    }
//
//    @GetMapping("delete")
//    public String displayDeleteEventForm(Model model) {
//        model.addAttribute("title", "Delete Events");
//        model.addAttribute("events", eventRepository.findAll());
//        return "events/delete";
//    }
//
//    @PostMapping("delete")
//    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) {
//
//        if (eventIds != null) {
//            for (int id : eventIds) {
//                eventRepository.deleteById(id);
//            }
//        }
//
//        return "redirect:";
//    }
//
//}
////package org.launchcode.codingevents.controllers;
////
////        import org.apache.coyote.Request;
//////        import org.launchcode.codingevents.data.EventData;
////        import org.launchcode.codingevents.Data.EventData;
////        import org.launchcode.codingevents.models.Event;
////        import org.springframework.stereotype.Controller;
////        import org.springframework.ui.Model;
////        import org.springframework.validation.Errors;
////        import org.springframework.web.bind.annotation.*;
////
////        import javax.validation.Valid;
////        import java.util.ArrayList;
////        import java.util.List;
////
/////**
//// * Created by Chris Bay
//// */
////@Controller
////@RequestMapping("events")
////public class EventController {
////
////    @GetMapping
////    public String displayAllEvents(Model model) {
////        model.addAttribute("title", "All Events");
////        model.addAttribute("events", EventData.getAll());
////        return "events/index";
////    }
////
////    @GetMapping("create")
////    public String displayCreateEventForm(Model model) {
////        model.addAttribute("title", "Create Event");
////        return "events/create";
////    }
////
////    @PostMapping("create")
////    public String processCreateEventForm(@ModelAttribute @Valid Event newEvent,
////                                            Errors errors, Model model) {
////        if (errors.hasErrors()) {
////            model.addAttribute("title", "Create Event");
////            model.addAttribute("errorMsg", "Bad Data!");
////            model.addAttribute(new Event());
////            return "events/create";
////        }
////        EventData.add(newEvent);
////        return "redirect:";
////    }
////
////    @GetMapping("delete")
////    public String displayDeleteEventForm(Model model) {
////        model.addAttribute("title", "Delete Events");
////        model.addAttribute("events", EventData.getAll());
////        return "events/delete";
////    }
////
////    @PostMapping("delete")
////    public String processDeleteEventsForm(@RequestParam(required = false) int[] eventIds) {
////
////        if (eventIds != null) {
////            for (int id : eventIds) {
////                EventData.remove(id);
////            }
////        }
////
////        return "redirect:";
////    }
////    @GetMapping("edit/{eventId}")
////    public String displayEditForm(Model model, @PathVariable int eventId) {
////        // controller code will go here
////        Event eventToEdit = EventData.getById(eventId);
////        model.addAttribute("event", eventToEdit);
////        String title = "Edit Event" + eventToEdit.getName() + " (id=" + eventToEdit.getId() + ")";
////        model.addAttribute("title", title);
////        return "events/edit";
////    }
////    @GetMapping("edit")
////    public String processEditForm(int eventId, String name, String description) {
////        // controller code will go here
////        Event eventToEdit = EventData.getById(eventId);
////        eventToEdit.setName(name);
////        eventToEdit.setDescription(description);
////        return "redirect:";}
////
//}