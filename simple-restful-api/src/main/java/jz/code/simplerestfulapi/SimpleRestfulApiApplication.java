package jz.code.simplerestfulapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//Application main entry point. It uses sprint boot annotation to enforce dependency injection
@SpringBootApplication
@EnableWebMvc
public class SimpleRestfulApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SimpleRestfulApiApplication.class, args);
    }

}
