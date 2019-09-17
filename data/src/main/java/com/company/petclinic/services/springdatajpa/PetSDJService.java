package com.company.petclinic.services.springdatajpa;

import com.company.petclinic.model.Pet;
import com.company.petclinic.repository.PetRepository;
import com.company.petclinic.services.PetService;

import java.util.HashSet;
import java.util.Set;

public class PetSDJService implements PetService {
    private final PetRepository petRepository;

    public PetSDJService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> findAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet findById(Long aLong) {
        return petRepository.findById(aLong).orElse(null);
    }

    @Override
    public Pet save(Pet object) {
        return petRepository.save(object);
    }

    @Override
    public void delete(Pet object) {
        petRepository.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        petRepository.deleteById(aLong);
    }
}
