package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student tommy = new Student( "Tommy", LocalDate.of(2010, 10, 07), "Tommy@gmail,com" );
            Student alex = new Student( "Alex", LocalDate.of(2004, 10, 07), "Alex@gmail,com" );
            repository.saveAll(
                    List.of(tommy, alex)
            );
        };
    }
}
