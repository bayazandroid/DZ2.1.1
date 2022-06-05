package com.company;

public class ClassPervuy {
    private String country;
    private String capital;
    private String region;

    public ClassPervuy(String country, String capital, String region) {
        this.country = country;
        this.capital = capital;
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public String getCapital() {
        return capital;
    }

    public String getRegion() {
        return region;
    }

    public String getInfo() {
        return "\nCountry: " + getCountry() + "\nCapital: " + getCapital()
                + "\nRegion: " + getRegion();
    }
}
