package com.champets.fureverhome.pet.service;

import com.champets.fureverhome.pet.Pet;

import java.util.List;

public interface PetService {
    List<Pet> findAllPets();
    Pet savePet(Pet pet);

    Pet findPetById(long petId);

    void updatePet(Pet pet);
}
