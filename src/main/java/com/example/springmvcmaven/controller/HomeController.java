package com.example.springmvcmaven.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@RestController
@RequestMapping("/home")
public class HomeController {

    @GetMapping()
    public String home(HttpServletRequest request) {
//        System.out.println("Home Page Requested");

        return "Welcome to Spring MVC Maven: " + request.getSession().getId();
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
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
