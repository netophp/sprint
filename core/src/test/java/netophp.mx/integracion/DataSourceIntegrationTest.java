package netophp.mx.integracion;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.util.Properties;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"/PropertiesAppCtx.xml", "/DataSourceAppCtx.xml"})
public class DataSourceIntegrationTest {

    @Autowired
    DataSource dataSource;

    @Test
    public void testDataSource() {
        assertNotNull(dataSource);
    }

}
