package com.codeclan.example.PetApp.models;

@Entity
@Table(name = "bookings");


public class Booking {

    private Long id;

    private Long petId;

    private Long serviceId;

    private String date;


    public Booking (String date, Long petId, Long serviceId) {

        this.petId = petId;
        this/serviceId = serviceId;
        this.date - date;

    }

    public Booking() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPetId() {
        return petId;
    }

    public void setPetId(Long petId) {
        this.petId = petId;
    }

    public Long getServiceId() {
        return serviceId;
    }

    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}