package com.company.petclinic.service.springdatajpa;

import com.company.petclinic.model.Owner;
import com.company.petclinic.repository.OwnerRepository;
import com.company.petclinic.repository.PetRepository;
import com.company.petclinic.repository.PetTypeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
@SpringBootTest
class OwnerSDJServiceTest {
    @Mock
    OwnerRepository ownerRepository;
    @Mock
    PetRepository petRepository;
    @Mock
    PetTypeRepository petTypeRepository;

    @InjectMocks
    OwnerSDJService ownerSDJService;


    @BeforeEach
    void setUp() {

    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }

    @Test
    void findByLastName() {
        Owner returnOwner = Owner.builder().id(1L).lastName("Aliabadi").build();
        when(ownerSDJService.findByLastName(any())).thenReturn(returnOwner);
        Owner mohammad = ownerSDJService.findByLastName("Aliabadi");
    }
}