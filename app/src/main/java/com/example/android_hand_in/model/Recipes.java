package com.example.android_hand_in.model;

import java.util.ArrayList;

public class Recipes {

   private ArrayList<Recipe> recipes;

   public Recipes(){
       this.recipes=new ArrayList<>();
   }

    public ArrayList<Recipe> getRecipes() {
        return recipes;
    }

    public void Remove(int id){
       recipes.remove(id);
    }

    public void Add(Recipe recipe){
       recipes.add(recipe);
    }

}
