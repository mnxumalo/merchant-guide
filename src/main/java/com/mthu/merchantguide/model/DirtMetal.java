package com.mthu.merchantguide.model;

public class DirtMetal implements Metals{
    private final String name;
    private final String romanNumeral;
    public DirtMetal(String name, String romanNumeral) {
        this.name = name;
        this.romanNumeral = romanNumeral;
    }
    public String getName() {
        return name;
    }



    public String getRomanNumeral() {
        return romanNumeral;
    }
}
