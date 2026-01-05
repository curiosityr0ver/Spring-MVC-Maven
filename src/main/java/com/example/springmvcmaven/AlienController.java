package com.example.springmvcmaven;

import com.example.springmvcmaven.model.Alien;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Arrays;
import java.util.List;

@Controller
@RequestMapping("/alien")
public class AlienController {

    @ModelAttribute
    public void modelData(Model m) {
        m.addAttribute("welcomeMessage ", "Aliens");
    }

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

    @GetMapping("/all")
    public String getAliens(
            Model m
    ) {
        List<Alien> aliens = Arrays.asList(
                new Alien("101", "Navin"),
                new Alien("102", "Amanul")
        );
        m.addAttribute("aliens", aliens);
        return "aliens";
    }
}
