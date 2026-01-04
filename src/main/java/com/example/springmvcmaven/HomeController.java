package com.example.springmvcmaven;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/home")
public class HomeController {

    @GetMapping()
    public String home() {
        System.out.println("Home Page Requested");
        return "index";
    }

    @RequestMapping("/add")
    @ResponseBody
    public int addNumbers(
            @RequestParam int a,
            @RequestParam int b
    ) {

        return a + b;
    }
}
