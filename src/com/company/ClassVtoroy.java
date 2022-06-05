package com.company;

import java.util.Random;

public class ClassVtoroy extends ClassPervuy {
    private int age = generatedDefaultAge();
    private String name;

    public ClassVtoroy(String country, String capital, String region, String name, ClassChetvertiy classChetvertiy) {
        super(country, capital, region);
        this.name = name;
        this.classChetvertiy = classChetvertiy;
    }

    private ClassChetvertiy classChetvertiy;

    public ClassVtoroy(String country, String capital, String region) {
        super(country, capital, region);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public ClassChetvertiy getClassChetvertiy() {
        return classChetvertiy;
    }

    public int generatedDefaultAge() {
        Random random = new Random();
        return random.nextInt(10) + 1;
    }

    public String getInfo() {
        if (getName() == null) {
            return super.getInfo() + "\nName is not found";
        } else {
            return super.getInfo() + "\nName: " + name
                    + "\nAge: " + age + "\nColor: " + classChetvertiy;
        }
    }
}
