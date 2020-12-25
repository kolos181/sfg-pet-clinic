package guru.springframework.sfgpetclinic.model;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BaseEntityTest {

    BaseEntity baseEntity;

    @Before
    public void setUp() {
        baseEntity = new BaseEntity();
    }

    @Test
    public void getId() {
        Long idValue = 41L;
        baseEntity.setId(idValue);
        assertEquals(idValue, baseEntity.getId());
    }
}