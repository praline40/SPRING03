package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
 



@Controller
public class DoctorController {

    @GetMapping("/")
    public String index() {
        return "index.html";  
    }


    @GetMapping("/doctor/")
    public String doctor(Model model,
                         @RequestParam(required=false, defaultValue="0") int number,
                         @RequestParam(required=false, defaultValue="John Smith") String name) {
        model.addAttribute("number", number);
        model.addAttribute("name", name);
        return "doctor"; // On renvoit la page doctor.html
    }
}
