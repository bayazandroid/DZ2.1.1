package com.company;

import java.util.Arrays;

public class ClassTretiy extends ClassVtoroy {
    final private String species;

    public String getSpecies() {
        return species;
    }

    public String[] getWords() {
        return words;
    }

    private String[] words;

    public ClassTretiy(String country, String capital, String region, String species, String[] words) {
        super(country, capital, region);
        this.species = species;
        this.words = words;
    }

    public ClassTretiy(String country, String capital, String region, String name, ClassChetvertiy classChetvertiy, String species) {
        super(country, capital, region, name, classChetvertiy);
        this.species = species;
    }

    @Override
    public String getInfo() {
        if (words == null) {
            return super.getInfo() + "\nSpecies: " + getSpecies();
        } else {
            return super.getInfo() + "\nSpecies: " + getSpecies() + "\nPhrase: " + Arrays.toString(words);
        }
    }
}
