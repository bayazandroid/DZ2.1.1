package com.company;

public class Main {
    public static void main(String[] args) {
        Shelter shelter = new Shelter("Chuy", "12d");

        Dog palkan = new Dog("Palkan", "alabai", ColorEnum.BLACK, shelter);
        System.out.println(palkan.getInfo());
        palkan.makeVoice();
        palkan.makeVoice("Gav");

        Dog masha = new Dog("Masha", "ovcharka",
                ColorEnum.BROWN, shelter, new String[]{"Seat", "Down"});
        System.out.println(masha.getInfo());
        masha.makeVoice("Lie", 4);

        ClassVtoroy objectA = new ClassVtoroy("Kyrgyzstan", "Bishkek", "Chuy",
                "Arstan", ClassChetvertiy.BLUE);

        ClassTretiy objectB = new ClassTretiy("Russia", "Moscow", "Oblast", "Oranger",
                new String[]{"Hello", "Good", "Goodbye"});

        ClassTretiy objectC = new ClassTretiy("Russia", "Moscow", "Oblast",
                "Pushkin", ClassChetvertiy.RED, "Red-Bengal");

        System.out.println(objectA.getInfo());
        System.out.println("_______________");
        System.out.println(objectB.getInfo());
        System.out.println("_______________");
        System.out.println(objectC.getInfo());
    }
}
