package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository){
        return args -> {
            Student jaye = new Student(
                    1L,
                    "Jaye",
                    "jaye.play@gmail.com",
                    LocalDate.of(1984, FEBRUARY, 4)
            );

            Student jamel = new Student(
                    "Jamel",
                    "jamel.play@gmail.com",
                    LocalDate.of(1989, JANUARY, 14)
            );

            repository.saveAll(
                    List.of(jaye,jamel)
            );
        };
    }

}
