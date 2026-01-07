package com.example.springmvcmaven.repository;

import com.example.springmvcmaven.model.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class AlienRepository {

    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public List<Alien> getAliens() {
        Session session = sessionFactory.getCurrentSession();
        List<Alien> aliens = session.createQuery("from Alien", Alien.class).list();

        return aliens;
    }

    @Transactional
    public void createAlien(
            Alien alien
    ) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(alien);

    }

    @Transactional
    public Alien getAlienById(String id) {
        System.out.println("here is the id: " + id);
        Session session = sessionFactory.getCurrentSession();

        Alien alien = session.find(Alien.class, id);
        return alien;
    }
}
