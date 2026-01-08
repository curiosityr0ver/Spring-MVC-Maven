package com.example.springmvcmaven.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alien")
public class Alien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aid;
    private String aname;

    public Alien() {
    }

    public Alien(Integer aid, String aname) {
        this.aid = aid;
        this.aname = aname;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid='" + aid + '\'' +
                ", aname='" + aname + '\'' +
                '}';
    }
}
