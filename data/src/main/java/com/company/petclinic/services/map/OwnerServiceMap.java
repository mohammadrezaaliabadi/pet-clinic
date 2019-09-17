package com.company.petclinic.services.map;

import com.company.petclinic.model.Owner;
import com.company.petclinic.model.Pet;
import com.company.petclinic.services.OwnerService;
import com.company.petclinic.services.PetService;
import com.company.petclinic.services.PetTypeService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {
    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public Owner findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Owner save(Owner object) {
        if (object != null){
            if (object.getPets() != null){
                object.getPets().forEach(pet -> {
                    if (pet.getPetType()!=null){
                        if (pet.getPetType().getId()==null){
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    }else {
                        throw new RuntimeException("Pet Type is Required");
                    }

                    if (pet.getId() == null){
                        Pet savedPet = petService.save(pet);
                    }
                });
            }
            return super.save(object);
        }
        else {
            return null;
        }
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }
}
