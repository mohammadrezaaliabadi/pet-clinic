package com.company.petclinic.services.map;

import com.company.petclinic.model.Vet;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements com.company.petclinic.services.VetService {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object);
    }


    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
