package guru.springframework.sfgpetclinic.springdatajpa;

import guru.springframework.sfgpetclinic.model.Owner;
import org.junit.Test;
import org.mockito.Mock;

import java.util.Set;

import static org.junit.Assert.*;


public class OwnerSDJpaServiceTest {

    @Mock
    OwnerSDJpaService ownerSDJpaService;

    @Test
    public void findAll() {
        Set<Owner> owners = ownerSDJpaService.findAll();
        assertEquals(1L, owners.size());
    }
}