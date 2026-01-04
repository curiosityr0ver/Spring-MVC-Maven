package com.example.springmvcmaven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping()
    public String home() {
        System.out.println("Home Page Requested");
        return "index";
    }

    @PostMapping("/add")
    public String addNumbers(
            @RequestParam int a,
            @RequestParam int b,
            Model model
    ) {

        model.addAttribute("result", a+b);
        return "index";
    }
}
