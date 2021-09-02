package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
//@RequestMapping("hello")
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

//    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST}, value = "hello")
//    //lives at /hello?name=launchcode
//    public String helloWithQueryParam(@RequestParam String name) {
//        return "Hello " + name + "!";
//    }
 //handler that handles request of the form /hello/launchcode

    @GetMapping("hello/{name}")
    public String helloWithPathParam(@PathVariable String name){
        return "Hello " + name + "!";
    }


//    @RequestMapping(value="hello", method = RequestMethod.POST)
//    @ResponseBody
//    public String helloPost(@RequestParam String name, @RequestParam String language) {
//        if (name == null) {
//            name = "World";
//        }
//
//        return createMessage(name, language);
//    }
    @GetMapping()
    public static String createMessage(String n, String l) {
        String greeting = "";

        if (l.equals("english")) {
            greeting = "Hello";
        }
        else if (l.equals("french")) {
            greeting = "Bonjour";
        }
        else if (l.equals("italian")) {
            greeting = "Bonjourno";
        }
        else if (l.equals("spanish")) {
            greeting = "Hola";
        }
        else if (l.equals("german")) {
            greeting = "Hallo";
        }

        return greeting + " " + n;
    }

        @RequestMapping(value="hello", method = RequestMethod.POST)
        public String helloPost(@RequestParam String name, @RequestParam String language) {
            if (name == null) {
                name = "World";
            }

            return createMessage(name, language);
        }
    @GetMapping("form")
    public String helloForm() {
             return   "<html>" +
                "<body>" +
                "<form action= '/hello' method= 'post'>" +
                        "<input type= 'text' name= 'name'>" +
                        "<select id= 'language' name = 'language'>" +
//                     <option value="dog">Dog</option>
                        "  <option value= 'english'>English</option>" +
                        "  <option value= 'french'>French</option>" +
                        "  <option value= 'italian'>Italian</option>" +
                        "  <option value= 'spanish'>Spanish</option>" +
                        "  <option value= 'german'>German</option>" +
                        "</select>" +

                        "<input type= 'submit' value= 'Greet me'>" +

                "</form>" +
                "</body>" +
                "</html>";
//        return controllerExercisesString;
    }
}
