package com.company.petclinic.repository;

import com.company.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitRepository extends CrudRepository<Pet,Long> {
}
