package com.codeclan.example.PetApp.models;



public class Service {

    private Long id;
    private String type;
    Business business;

    public Service(String type, Business business) {
        this.type = type;
        this.business = business;
    }

    public Service() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }
}
