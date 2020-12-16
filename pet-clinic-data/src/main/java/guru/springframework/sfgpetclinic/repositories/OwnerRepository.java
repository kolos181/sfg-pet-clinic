package guru.springframework.sfgpetclinic.repositories;

import guru.springframework.sfgpetclinic.model.Owner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface OwnerRepository extends JpaRepository<Owner, Long> {

    public Owner findByLastName(String name);
}
