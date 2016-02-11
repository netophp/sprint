package netophp.mx.integracion;

import netophp.mx.dao.PersonaDao;
import netophp.mx.domain.Persona;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

import java.util.Properties;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/DataSourceAppCtx.xml", "/PropertiesAppCtx.xml", "/HibernateAppCtx.xml", "/AopAppCtx.xml"})
@Transactional
public class PersonaDaoIntegrationTest {

    @Autowired
    PersonaDao personaDao;

    static Persona persona = new Persona();

    static Long personaId = 0L;

    @Test
    @Rollback(false)
    public void test001creaPersona() {
        persona.setNombre("Neto");
        persona.setApellido("Davila");
        persona.setEmail("netophp@gmail.com");
        persona.setEdad(40);
        personaDao.create(persona);
        assertTrue(persona.getId() > 0);
        personaId = persona.getId();
    }

    @Test
    public void test002readPersona() {
        Persona readPersona = personaDao.read(personaId);
        assertNotNull(readPersona.getNombre());
    }

    @Test
    @Rollback(false)
    public void test003updatePersona() {
        Persona updatePersona = personaDao.read(personaId);
        updatePersona.setNombre("Netillo");
        personaDao.update(updatePersona);
        Persona updatedPersona = personaDao.read(personaId);
        assertTrue(updatedPersona.getNombre().equals("Netillo"));
    }

    @Test
    @Rollback(false)
    public void test004deletePersona() {
        personaDao.delete(persona);
    }

}