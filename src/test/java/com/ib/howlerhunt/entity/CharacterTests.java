package com.ib.howlerhunt.entity;


import com.ib.howlerhunt.utility.AttributeComp;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CharacterTests {

    @Test
    void testCharacterName() {
        Character darrow = new Character();
        darrow.setName("Darrow");
        assertEquals("Darrow", darrow.getName());
    }

    @Test
    void testCharacterGender() {
        Character darrow = new Character();
        darrow.setGender("Male");
        assertEquals("Male", darrow.getGender());
    }

    @Test
    void testCharacterAge() {
        Character darrow = new Character();
        darrow.setAge(33);
        assertEquals(33, darrow.getAge());
    }

    @Test
    void testCharacterColour() {
        Character darrow = new Character();
        darrow.setColour("Red");
        assertEquals("Red", darrow.getColour());
    }

    @Test
    void testCharacterDemonym() {
        Character darrow = new Character();
        darrow.setDemonym("Martian");
        assertEquals("Martian", darrow.getDemonym());
    }

    @Test
    void testCharacterHeight() {
        Character darrow = new Character();
        darrow.setHeight(218);
        assertEquals(218, darrow.getHeight());
    }

    void testAttributeComps(List<AttributeComp> matches, String[] expectedAttributes, Object[] expectedValues,
                            Boolean[] expectedMatches) {
        for (int i = 0; i < matches.size(); i++) {
            assertEquals(expectedAttributes[i], matches.get(i).getAttribute());
            assertEquals(expectedValues[i], matches.get(i).getValue());
            assertEquals(expectedMatches[i], matches.get(i).isMatch());
        }
    }

    @Test
    void testMatch() {
        Character darrow = new Character(2L, "Darrow", "Male", "Red", "Martian",
                "Republic", 33, 218);
        Character mustang = new Character(2L, "Mustang", "Female", "Gold", "Martian",
                "Republic", 34, 185.45);
        List<AttributeComp> matches = darrow.attributeMatches(mustang);

        String[] expectedAttributes = {"Name", "Gender", "Colour", "Demonym", "Allegiance", "Age", "Height"};
        Object[] expectedValues = {"Mustang", "Female", "Gold", "Martian", "Republic", 34, 185.45};
        Boolean[] expectedMatches = {false, false, false, true, true, false, false};

        testAttributeComps(matches, expectedAttributes, expectedValues, expectedMatches);
    }

    @Test
    void testNoMatches() {
        Character darrow = new Character(2L, "Darrow", "Male", "Red", "Martian",
                "Republic", 33, 218);
        Character evilMustang = new Character(2L, "Mustang", "Female", "Gold", "Earthling",
                "Society", 34, 185.45);
        List<AttributeComp> matches = darrow.attributeMatches(evilMustang);

        String[] expectedAttributes = {"Name", "Gender", "Colour", "Demonym", "Allegiance", "Age", "Height"};
        Object[] expectedValues = {"Mustang", "Female", "Gold", "Earthling",
                "Society", 34, 185.45};
        Boolean[] expectedMatches = {false, false, false, false, false, false, false};
        testAttributeComps(matches, expectedAttributes, expectedValues, expectedMatches);
    }

    @Test
    void testPerfectMatch() {
        Character darrow = new Character(2L, "Darrow", "Male", "Red", "Martian",
                "Republic", 33, 218);
        Character reaper = new Character(2L, "Darrow", "Male", "Red", "Martian",
                "Republic", 33, 218);
        List<AttributeComp> matches = darrow.attributeMatches(reaper);

        String[] expectedAttributes = {"Name", "Gender", "Colour", "Demonym", "Allegiance", "Age", "Height"};
        Object[] expectedValues = {"Darrow", "Male", "Red", "Martian",
                "Republic", 33, 218.0};
        Boolean[] expectedMatches = {true, true, true, true, true, true, true};
        testAttributeComps(matches, expectedAttributes, expectedValues, expectedMatches);

    }
}
