package com.codeclan.example.PetApp.repository;

import com.codeclan.example.PetApp.models.PetOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PetOwnerRepository extends JpaRepository<PetOwner, Long>, PetOwnerRepositoryCustom {
}
