package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
@RequestBody
public class HelloController {

    //lives at the path /hello
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

    //lives at /hello/goodbye
    @GetMapping("goodbye")

    public String goodbye() {
        return "Goodbye, Spring!";
    }

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello"   )
    //lives at /hello?name=launchcode
    public String helloWithQueryParam(@RequestParam String name) {
        return "Hello " + name + "!";
    }
 //handler that handles request of the form /hello/launchcode

    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name){
        return "Hello " + name + "!";
    }

    @GetMapping("form")
    @ResponseBody
    public String helloFrom() {
        return "<html>" +
                "<body>" +
                "<form action= 'hello' method= 'post'>" +
                "<input type= 'text' name= 'name'>" +
                "<input type= 'submit' value= 'Greet me'>" +
                "</form>" +
                "</body>" +
                "</html>";
    }
}
