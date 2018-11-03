package com.codeclan.example.PetApp.models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "businesses")

public class Business {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
//   private ArrayList<Service> serviceList;


    public Business(String name) {
        this.name = name;
//        this.serviceList = new ArrayList<>();
    }

    public Business() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
