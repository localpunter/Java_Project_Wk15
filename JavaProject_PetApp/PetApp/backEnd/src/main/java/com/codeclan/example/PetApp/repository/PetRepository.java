package com.codeclan.example.PetApp.repository;

import com.codeclan.example.PetApp.models.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet, Long>, PetRepositoryCustom {

}
