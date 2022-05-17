package com.example.android_hand_in.model;

public enum dietary {
    Vegan("Vegan"),
    Vegetarian("Vegetarian"),
    Paleo("Paleo"),
    Blood_type("Blood type"),
    South_Beach("South Beach"),
    Mediterranean("Mediterranean"),
    Raw_Food("Raw food"),
    None("None");

    private final String diet;

    dietary(String diet){
        this.diet=diet;
    }

    public String getDiet() {
        return diet;
    }
}
