package com.codeclan.example.PetApp.repository;

import com.codeclan.example.PetApp.models.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long>, ServiceRepositoryCustom {
}
