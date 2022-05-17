package com.example.android_hand_in.Repo;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.android_hand_in.model.Recipe;

import java.util.ArrayList;

public class RecipeRepo {
    private static RecipeRepo instance;
    private MutableLiveData<ArrayList<Recipe>> recipes;

    public static RecipeRepo getInstance() {
        if (instance == null) {
            instance = new RecipeRepo();
        }
        return instance;
    }

    public RecipeRepo() {
        recipes = new MutableLiveData<>();

    }

    public LiveData<ArrayList<Recipe>> getRecipes() {
        return recipes;
    }


}
