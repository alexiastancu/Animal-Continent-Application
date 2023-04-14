package com.example.animalcontinentapplication;

public class Animal {
    private String name;
    private String continent;

    public Animal(String name, String continent) {
        this.name = name;
        this.continent = continent;
    }

    public String getName() {
        return name;
    }

    public String getContinent() {
        return continent;
    }

    @Override
    public String toString() {
        return name + "\n" + continent;
    }
}
