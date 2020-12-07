package guru.springframework.sfgpetclinic.bootstrap;

import guru.springframework.sfgpetclinic.model.*;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetTypeService;
import guru.springframework.sfgpetclinic.services.SpecialityService;
import guru.springframework.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;
    private final PetTypeService petTypeService;
    private final SpecialityService specialityService;


    public DataLoader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService, SpecialityService specialityService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
        this.petTypeService = petTypeService;
        this.specialityService = specialityService;
    }

    @Override
    public void run(String... args) throws Exception {
        if(petTypeService.findAll().size()  == 0) {
            loadData();
        }
    }

    private void loadData() {
        PetType dog = new PetType();
        dog.setName("dog");
        PetType savedDogPetType = petTypeService.save(dog);

        PetType cat = new PetType();
        cat.setName("cat");
        PetType savedCatPetType = petTypeService.save(cat);

        Owner owner1 = new Owner();
        owner1.setFirstName("Billy Bob");
        owner1.setLastName("Thornton");
        owner1.setAddress("Chornovoloa 1032");
        owner1.setCity("Baslbad");
        owner1.setTelephone("+395822233");

        Pet mikesPet = new Pet();
        mikesPet.setPetType(savedDogPetType);
        mikesPet.setOwner(owner1);
        mikesPet.setName("Barky");
        mikesPet.setBirthDate(LocalDate.now());
        owner1.getPets().add(mikesPet);

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Johny Lee");
        owner2.setLastName("Miller");
        owner2.setAddress("Chornovoloa 313");
        owner2.setCity("Ivant-Berald");
        owner2.setTelephone("+395822233");

        Pet johnysCat = new Pet();
        johnysCat.setPetType(savedCatPetType);
        johnysCat.setOwner(owner2);
        johnysCat.setName("Spoty");
        johnysCat.setBirthDate(LocalDate.now());
        owner2.getPets().add(johnysCat);

        ownerService.save(owner2);

        System.out.println("Owners are saved...");

        Speciality radiology = new Speciality();
        radiology.setDescription("radiology");
        Speciality savedRadiology = specialityService.save(radiology);

        Speciality surgery = new Speciality();
        surgery.setDescription("surgery");
        Speciality savedSurgery = specialityService.save(surgery);

        Speciality dentistry = new Speciality();
        surgery.setDescription("dentistry");
        Speciality savedDentistry = specialityService.save(dentistry);


        Vet vet1 = new Vet();
        vet1.setFirstName("James");
        vet1.setLastName("Franko");
        specialityService.findAll().add(savedRadiology);
        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Bryan");
        vet2.setLastName("Cranston");
        specialityService.findAll().add(savedSurgery);
        vetService.save(vet2);

        System.out.println("Vets are saved...");
    }
}
