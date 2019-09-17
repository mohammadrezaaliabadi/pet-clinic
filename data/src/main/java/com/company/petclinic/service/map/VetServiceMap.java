package com.company.petclinic.service.map;

import com.company.petclinic.model.Speciality;
import com.company.petclinic.model.Vet;
import com.company.petclinic.service.SpecialityService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements com.company.petclinic.service.VetService {
    private final SpecialityService specialityService;

    public VetServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

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

        if ((object.getSpecialities().size()>0)){
            object.getSpecialities().forEach(speciality -> {
                if (speciality.getId()==null){
                    Speciality savedSpeciality1 = specialityService.save(speciality);
                }
            });
        }
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
