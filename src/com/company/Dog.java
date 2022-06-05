package com.company;

import java.util.Arrays;

public class Dog extends Pet {

    private String name;
    private String breed;
    private String[] commands;

    @Override
    public String getInfo() {
        if (commands == null) {
            return super.getInfo() + "\nName: " + name + "\nBreed: " + breed;
        } else {
            return super.getInfo() + "\nName: " + name + "\nBreed: " + breed +
                    "\nCommands: " + Arrays.toString(commands);
        }
    }

    public Dog(String name, String breed14, ColorEnum colorEnum, Shelter shelter) {
        this.name = name;
        this.breed = breed14;
        super.setShelter(shelter);
        super.setColorEnum(colorEnum);
    }

    public Dog(String name, String breed, ColorEnum colorEnum, Shelter shelter, String[] commands) {
        this.name = name;
        this.breed = breed;
        this.commands = commands;
        super.setShelter(shelter);
        super.setColorEnum(colorEnum);
    }

    public void makeVoice() {
        System.out.println("Make sound");
    }

    public void makeVoice(String voice) {
        System.out.println(voice);
    }

    public void makeVoice(String voice, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(voice);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }
}