package example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created by mcurx on 8/30/16.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Application.class)
@TestPropertySource("classpath:test.properties")
public class ConfigurationReaderTest {

    @Autowired
    ConfigurationReader configurationReader;

    @Test
    public void testRelease() throws Exception {
        assertEquals("test", configurationReader.getRelease());
        assertEquals("development", configurationReader.getEnvironment());
    }
}
