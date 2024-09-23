package com.ib.howlerhunt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ib.howlerhunt.entity.Character;

@SpringBootApplication
public class HowlerhuntApiApplication {

    public static void main(String[] args) {

        SpringApplication.run(HowlerhuntApiApplication.class, args);
    }

    @GetMapping
    public Character Hello() {
        return new Character(1234567890123456789L, "Darrow",
                "Male", "Red", "Martian", "Republic", 33, 220);
    }
}
