package com.codeclan.example.PetApp.models;

import com.codeclan.example.PetApp.models.PetOwner;
import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "pets")
public class Pet {
    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "petowner_id", nullable = false)
    private PetOwner petowner;

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    public Pet(){
    }

    public Pet(String name, String type){
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PetOwner getPetowner() {
        return petowner;
    }

    public void setPetowner(PetOwner petowner) {
        this.petowner = petowner;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }
}