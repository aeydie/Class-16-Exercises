package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@ResponseBody
@RequestMapping("skills")
@Controller
public class SkillsController {

    @GetMapping("/")
    public String listSkills() {
             return    "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
               "<o1>" +
                     "<li>Java</li>" +
               "<li>JavaScript</li>" +
               "<li>Python</li>" +
                     "</ol>" +
               "</body>" +
               "</html>";
    }


}
