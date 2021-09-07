//package org.launchcode.skillstracker;
//
//public class SkillsController {
//}
package org.launchcode.skillstracker.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestMapping

public class SkillsController {

//    @GetMapping("/")
//    public String skillsList() {
//        String html = "<html>" +
//                "<body>" +
//                "<h1>Skills Tracker</h1>" +
//                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
//                "<ol>" +
//                "<li>Java</li>" +
//                "<li>JavaScript</li>" +
//                "<li>Python</li>" +
//                "</ol>" +
//                "</body>" +
//                "</html>";
//        return html;
//    }

    @RequestMapping(value = "response", method = {RequestMethod.GET, RequestMethod.POST})
    public String response(@RequestParam String name) {
        return "Hello + name";
    }

    @GetMapping("form")
    public String skillsForm() {
        String html = "<html" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>Here is the list of skills we would like to learn!</h2>" +
                "<form method = 'post' action = 'response'/>" +
                "<input type  = 'text' name = 'name' /> " +
                "<select name = 'language' id = 'language'>" +
                "<option language = 'Java'>Java</option>" +
                "<option language = 'Javascript'>Javasript</option>" +
                "<option language = 'Python'>Python</option>" +
                "</select>" +
                "<input type ='submit' value = 'Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
        return html;
    }
}




