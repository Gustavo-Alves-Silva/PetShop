package Projeto.BackEndPetShop.service;

import Projeto.BackEndPetShop.exception.UserNotFoundException;
import Projeto.BackEndPetShop.model.Pet;
import Projeto.BackEndPetShop.repo.PetRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class PetService {
    
    private final PetRepo petRepo;

    @Autowired
    public PetService(PetRepo petRepo){this.petRepo = petRepo; }


    public List<Pet> findAllPets() {
        return petRepo.findAll();
    }

    public Pet findPetById(Long id) {
        return petRepo.findPetById(id).orElseThrow(()-> new UserNotFoundException("User by id: "+id+" was not found"));
    }

    public Pet addPet(Pet pet) {
        pet.setPetCode((UUID.randomUUID().toString()));
        return petRepo.save(pet);
    }

    public Pet updatePet(Pet pet) {
        return petRepo.save(pet);
    }

    public void deletePet(Long id) {
        petRepo.deletePetById(id);
    }
}
