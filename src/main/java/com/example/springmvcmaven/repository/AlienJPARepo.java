package com.example.springmvcmaven.repository;

import com.example.springmvcmaven.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AlienJPARepo extends JpaRepository<Alien, Integer> {

    List<Alien> findByAnameStartingWith(String prefix);
}
