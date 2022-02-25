package peaksoft.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import peaksoft.model.Dog;
import peaksoft.model.Timer;

import java.util.Calendar;

@Configuration
@ComponentScan(basePackages = "peaksoft")
public class AppConfig {

    @Bean
    @Scope("prototype")
    public Dog dog(){
        return new Dog();
    }

    @Bean
    @Scope("prototype")
    public Timer timer(){
        return new Timer();
    }


}
