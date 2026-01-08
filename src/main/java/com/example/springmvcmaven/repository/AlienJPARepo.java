package com.example.springmvcmaven.repository;

import com.example.springmvcmaven.model.Alien;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlienJPARepo extends JpaRepository<Alien, Integer> {
}
