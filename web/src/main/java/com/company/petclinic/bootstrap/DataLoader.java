package com.company.petclinic.bootstrap;

import com.company.petclinic.model.Owner;
import com.company.petclinic.model.Vet;
import com.company.petclinic.services.OwnerService;
import com.company.petclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final OwnerService ownerService;
    private final VetService vetService;

    @Autowired
    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1l);
        owner1.setFirstName("Mohammad");
        owner1.setLastName("Jafari");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2l);
        owner2.setFirstName("Reza");
        owner2.setLastName("Ahmadi");
        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1l);
        vet1.setFirstName("Kamabar");
        vet1.setLastName("Molavi");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2l);
        vet2.setFirstName("Zahra");
        vet2.setLastName("Ahmadi");
        vetService.save(vet2);



    }
}
