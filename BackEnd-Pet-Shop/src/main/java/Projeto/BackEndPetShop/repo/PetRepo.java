package Projeto.BackEndPetShop.repo;

import Projeto.BackEndPetShop.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PetRepo extends JpaRepository<Pet, Long> {

        Optional<Pet> findPetById(Long id);

        void deletePetById(Long id);
}
