package com.example.springmvcmaven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping()
    public String home() {
        System.out.println("Home Page Requested");
        return "index";
    }

    // Action
    @PostMapping("/add")
    public String addNumbers(
            @RequestParam int a,
            @RequestParam int b,
            RedirectAttributes redirectAttributes
    ) {
        int result = a + b;
        redirectAttributes.addFlashAttribute("result", result);
        return "redirect:/home/result";
    }

    // Result page
    @GetMapping("/result")
    public String result() {
        return "result";
    }
}
