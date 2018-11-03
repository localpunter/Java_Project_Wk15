package com.codeclan.example.PetApp;

import com.codeclan.example.PetApp.models.Pet;
import com.codeclan.example.PetApp.models.PetOwner;
import com.codeclan.example.PetApp.repository.PetOwnerRepository;
import com.codeclan.example.PetApp.repository.PetRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PetAppApplicationTests {

	@Autowired
	PetRepository petRepository;

	@Autowired
	PetOwnerRepository petOwnerRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void canSavePetOwner() {
		PetOwner petOwner = new PetOwner("Andrew");
		petOwnerRepository.save(petOwner);
		Pet pet = new Pet("Fido", "Dog", petOwner);
		petRepository.save(pet);
		petOwner.addPet(pet);
		petOwnerRepository.save(petOwner);
	}

}
