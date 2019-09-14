package com.company.petclinic.bootstrap;

import com.company.petclinic.model.Owner;
import com.company.petclinic.model.Pet;
import com.company.petclinic.model.PetType;
import com.company.petclinic.model.Vet;
import com.company.petclinic.services.OwnerService;
import com.company.petclinic.services.PetTypeService;
import com.company.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
    }

    @Override
    public void run(String... args) throws Exception {

        PetType dog = new PetType();
        dog.setName("Dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("Cat");
        PetType savedCatPetType = petTypeService.save(cat);


        Owner owner1 = new Owner();
        owner1.setFirstName("Mohammad");
        owner1.setLastName("Jafari");
        owner1.setAddress("123 Azadi");
        owner1.setCity("Minab");
        owner1.setTelephone("123213213");
        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setName("Rosco");
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesPet);
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Reza");
        owner2.setLastName("Ahmadi");
        owner2.setAddress("212 Enghlab");
        owner2.setTelephone("234342345");
        Pet fionasCat = new Pet();
        fionasCat.setName("Just cat");
        fionasCat.setOwner(owner2);
        fionasCat.setBirthDate(LocalDate.now());
        fionasCat.setPetType(savedCatPetType);
        owner2.getPets().add(fionasCat);

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("Kamabar");
        vet1.setLastName("Molavi");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Zahra");
        vet2.setLastName("Ahmadi");
        vetService.save(vet2);



    }
}
