package com.company.petclinic.services;

import com.company.petclinic.model.Owner;

import java.util.Set;

public interface OwnerService extends CrudService<Owner,Long>{
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
