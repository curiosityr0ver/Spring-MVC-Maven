//package com.example.springmvcmaven;
//
//import com.example.springmvcmaven.model.Alien;
//import com.example.springmvcmaven.repository.AlienJPARepo;
//import com.example.springmvcmaven.repository.AlienRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.mvc.support.RedirectAttributes;
//
//import java.util.Arrays;
//import java.util.List;
//
//@Controller
//@RequestMapping("/alien")
//public class AlienController {
//
////    @Autowired
////    AlienRepository repository;
//
//    @Autowired
//    AlienJPARepo jpaRepo;
//
//    @ModelAttribute
//    public void modelData(Model m) {
//        m.addAttribute("welcomeMessage ", "Aliens");
//    }
//
//    @GetMapping()
//    public String home() {
//        System.out.println("Alien Home Arrived !");
//        return "home";
//    }
//
//    @PostMapping("/create")
//    public String registerAlien(
//            @RequestParam String alienName,
//            RedirectAttributes redirectAttributes
//    ) {
//        Alien a = new Alien();
//        a.setAname(alienName);
//        jpaRepo.save(a);
////        repository.createAlien(a);
//        System.out.println("Alien Created !");
//        return "redirect:/alien/" + a.getAid();
//    }
//
//    @GetMapping("/all")
//    public String getAliens(
//            @RequestParam(required = false) String prefix,
//            Model m
//    ) {
////        List<Alien> aliens = Arrays.asList(
////                new Alien("101", "Navin"),
////                new Alien("102", "Amanul")
////        );
//
////        m.addAttribute("aliens", repository.getAliens());
//        List<Alien> aliens;
//        System.out.println(prefix);
//        if(prefix != null && !prefix.isBlank()) {
//            aliens = jpaRepo.findByAnameStartingWith(prefix);
//        } else {
//            aliens = jpaRepo.findAll();
//        }
//        m.addAttribute("aliens", aliens);
//
//        return "aliens";
//    }
//
//    @GetMapping("/{id}")
//    public String getAlienById(
//            @PathVariable String id,
//            Model m
//    ) {
//        System.out.println("Alien's Id:: " + id);
////        Alien alien = repository.getAlienById(id);
//        Alien alien = jpaRepo.findById(Integer.parseInt(id)).orElse(null);
//        m.addAttribute("alien", alien);
//
//        return "alien";
//    }
//}
