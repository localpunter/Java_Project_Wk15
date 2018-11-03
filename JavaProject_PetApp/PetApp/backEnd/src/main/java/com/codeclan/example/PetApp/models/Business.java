package com.codeclan.example.PetApp.models;

import javax.persistence.Entity;
import java.util.ArrayList;

@Entity

public class Business {

   private Long id;
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
