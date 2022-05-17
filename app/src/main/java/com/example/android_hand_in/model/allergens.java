package com.example.android_hand_in.model;

public enum allergens {

    Gluten("Gluten"),
    Peanuts("Peanuts"),
    Tree_Nuts("Tree nuts"),
    Celery("Celery"),
    Mustard("Mustard"),
    Eggs("Eggs"),
    Milk("Milk"),
    Sesame("Sesame"),
    Fish("Fish"),
    Crustaceans("Crustaceans"),
    Molluscs("Molluscs"),
    Soya("Soya"),
    Sulphites("Sulphites"),
    Lupin("Lupin");

    private final String allergen;

    allergens(String allergen){
        this.allergen=allergen;
    }

    public String getAllergen() {
        return allergen;
    }
}
