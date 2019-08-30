package com.company.petclinic.services.map;

import com.company.petclinic.model.Pet;
import com.company.petclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;
@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save(Pet object) {
        return null;
    }

    @Override
    Pet save(Long aLong, Pet object) {
        return super.save(aLong, object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
