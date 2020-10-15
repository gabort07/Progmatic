package com.company.Feladatok;

public class Pokemon {
    private String name;
    private String type;
    private String effectiveAgainst;

    public Pokemon() {
    }

    public Pokemon(String name, String type, String effectiveAgainst) {
        this.name = name;
        this.type = type;
        this.effectiveAgainst = effectiveAgainst;
    }

    public String isEffectiveAgainst(Pokemon otherTich) {
        if (otherTich.type.equals(this.effectiveAgainst)){
            return this.name;
        }
        return "nincs";
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getEffectiveAgainst() {
        return effectiveAgainst;
    }
}
