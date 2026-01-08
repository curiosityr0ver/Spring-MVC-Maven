package com.example.springmvcmaven.controller;

import com.example.springmvcmaven.model.Alien;
import com.example.springmvcmaven.repository.AlienJPARepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alien")
public class AlienController {

    @Autowired
    AlienJPARepo repository;


    @GetMapping("/all")
    List<Alien> getAllAliens(
            @RequestParam(required = false) String prefix
    ) {

        List<Alien> aliens;
        if(prefix != null && !prefix.isBlank()) {
            aliens = repository.findByAnameStartingWith(prefix);
        } else {
            aliens = repository.findAll();
        }
        return aliens;
    }

    @GetMapping("/{id}")
    Alien getAlien(
            @PathVariable Integer id
    ) {

        return repository.findById(id).orElse(null);
    }

    @PostMapping()
    Alien createAlien(
            @RequestBody String name
    ) {

        Alien alien = new Alien();
        alien.setAname(name);

        return repository.save(alien);
    }
}
