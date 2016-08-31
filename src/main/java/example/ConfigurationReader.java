package example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * Created by mcurx on 8/30/16.
 */
@Component
@PropertySource("config.properties")
public class ConfigurationReader {

    @Value("${app.release}")
    private String release;

    @Value("${app.environment}")
    private String environment;

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getRelease() {
        return release;
    }

    public void setRelease(String release) {
        this.release = release;
    }

    @Override
    public String toString() {
        return "release = " + release + "\nenvironment = " + environment;
    }
}
