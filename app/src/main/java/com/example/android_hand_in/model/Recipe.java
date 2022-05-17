package com.example.android_hand_in.model;

import java.util.List;


public class Recipe {
    private int time;
    private String name;
    private String procedure;
    private String ingredients;
    private List<allergens> allergens;
    private List<dietary> diet;

    public Recipe(String name) {
        this.name = name;
    }

    public int getTime() {
        return time;
    }

    public List<allergens> getAllergens() {
        return allergens;
    }

    public List<dietary> getDiet() {
        return diet;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getName() {
        return name;
    }

    public String getProcedure() {
        return procedure;
    }

    public void setAllergens(List<allergens> allergens) {
        this.allergens = allergens;
    }

    public void setDiet(List<dietary> diet) {
        this.diet = diet;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Recipes{"+
                "name='" + name + '\'' +
                ", time=" + time +
                ", allergens=" + allergens +
                ", diet=" + diet +
                '}';
    }
}
