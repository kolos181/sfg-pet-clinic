package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Billy Bob");
        owner1.setLastName("Thornton");
        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Johny Lee");
        owner2.setLastName("Miller");
        ownerService.save(owner2);

        System.out.println("Owners are saved...");

        Vet vet1 = new Vet();
        vet1.setFirstName("James");
        vet1.setLastName("Franko");
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Bryan");
        vet2.setLastName("Cranston");
        vetService.save(vet2);

        System.out.println("Vets are saved...");
    }
}
