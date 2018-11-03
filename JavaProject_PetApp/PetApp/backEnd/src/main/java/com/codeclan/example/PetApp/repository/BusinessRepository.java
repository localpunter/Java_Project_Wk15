package com.codeclan.example.PetApp.repository;

import com.codeclan.example.PetApp.models.Business;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BusinessRepository extends JpaRepository<Business, Long>, BusinessRepositoryCustom {
}
