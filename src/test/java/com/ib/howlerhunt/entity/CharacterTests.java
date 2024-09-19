package com.ib.howlerhunt.entity;


import com.ib.howlerhunt.untility.AttributeComp;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharacterTests {
    private Character darrow = new Character();

    @Test
    void testCharacterName() {
        darrow.setName("Darrow");
        assertEquals("Darrow", darrow.getName());
    }

    @Test
    void testCharacterGender() {
        darrow.setGender("Male");
        assertEquals("Male", darrow.getGender());
    }

    @Test
    void testCharacterAge() {
        darrow.setAge(33);
        assertEquals(33, darrow.getAge());
    }

    @Test
    void testCharacterColour() {
        darrow.setColour("Red");
        assertEquals("Red", darrow.getColour());
    }

    @Test
    void testCharacterDemonym() {
        darrow.setDemonym("Martian");
        assertEquals("Martian", darrow.getDemonym());
    }

    @Test
    void testCharacterHeight() {
        darrow.setHeight(218);
        assertEquals(220, darrow.getHeight());
    }

    @Test
    void testMatch() {
        Character mustang = new Character(2L, "Mustang", "Female", "Gold", "Martian",
                34, 185);

        List<AttributeComp> matches = darrow.attributeMatches(mustang);

    }
}
