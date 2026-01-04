package com.example.springmvcmaven;

import com.example.springmvcmaven.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/alien")
public class AlienController {

    @GetMapping()
    public String home() {
        System.out.println("Alien Home Arrived !");
        return "home";
    }

    @PostMapping("/create")
    public String registerAlien(
            @RequestParam String alienID,
            @RequestParam String alienName,
            RedirectAttributes redirectAttributes
    ) {
        Alien a = new Alien();
        a.setAid(alienID);
        a.setAname(alienName);
        System.out.println("Alien Created !");
        redirectAttributes.addFlashAttribute("alien", a);
        return "redirect:/alien";
    }
}
