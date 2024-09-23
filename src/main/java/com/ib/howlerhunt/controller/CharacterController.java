package com.ib.howlerhunt.controller;

import com.ib.howlerhunt.entity.Character;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/character")
public class CharacterController {

    @GetMapping
    public List<Character> getStudent() {
        return List.of(new Character(1234567890123456789L, "Darrow",
                "Male", "Red", "Martian", "Republic", 33, 220));
    }
}
