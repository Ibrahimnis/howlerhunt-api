package com.ib.howlerhunt.entity;


import com.ib.howlerhunt.utility.AttributeComp;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.*;

@Entity
public class Character {

    private @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

    private String name;
    private String gender;
    private String colour;
    private String demonym;
    private String allegiance;
    private int age;
    private double height;

    // Default constructor
    public Character() {
    }

    public Character(Long id, String name, String gender, String colour, String demonym, String allegiance, int age, double height) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.colour = colour;
        this.demonym = demonym;
        this.allegiance = allegiance;
        this.age = age;
        this.height = height;
    }

    // Getters
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getGender() {
        return this.gender;
    }

    public String getColour() {
        return this.colour;
    }

    public String getDemonym() {
        return this.demonym;
    }

    public String getAllegiance() {
        return this.allegiance;
    }

    public int getAge() {
        return this.age;
    }

    public double getHeight() {
        return this.height;
    }

    // Setters:
    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setDemonym(String demonym) {
        this.demonym = demonym;
    }

    public void setAllegiance(String allegiance) {
        this.allegiance = allegiance;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public List<AttributeComp> attributeMatches(Character guess) {
        List<AttributeComp> matches = new ArrayList<AttributeComp>();

        matches.add(new AttributeComp("Name", guess.name, this.name.equals(guess.getName())));
        matches.add(new AttributeComp("Gender", guess.gender, this.gender.equals(guess.getGender())));
        matches.add(new AttributeComp("Colour", guess.colour, this.colour.equals(guess.getColour())));
        matches.add(new AttributeComp("Demonym", guess.demonym, this.demonym.equals(guess.getDemonym())));
        matches.add(new AttributeComp("Allegiance", guess.allegiance, this.allegiance.equals(guess.getAllegiance())));
        matches.add(new AttributeComp("Age", guess.age, this.age == guess.getAge()));
        matches.add(new AttributeComp("Height", guess.height, this.height == guess.getHeight()));
        return matches;
    }
}
