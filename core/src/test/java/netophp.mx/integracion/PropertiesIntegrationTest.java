package netophp.mx.integracion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Properties;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/PropertiesAppCtx.xml"})
public class PropertiesIntegrationTest {

    @Autowired
    Properties properties;

    @Test
    public void testProperties() {
        assertNotNull(properties);
    }

    @Test
    public void testUsernameNotNull() {
        assertNotNull(properties.getProperty("database.username"));
    }
}
