package com.example.android_hand_in.ViewModel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.android_hand_in.Repo.RecipeRepo;
import com.example.android_hand_in.model.Recipe;
import com.example.android_hand_in.model.Recipes;

import java.util.ArrayList;

public class RecipesViewModel extends ViewModel {

    private final MutableLiveData<String> mText;
    private Recipe recipes;

   RecipeRepo repository;

    public RecipesViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is the recipe fragment");
        repository = RecipeRepo.getInstance();
    }

    public Recipes getRecipe() {
        return null;
    }

    public void setRooms(Recipe recipes) {
        this.recipes = recipes;
    }

    public LiveData<String> getText() {
        return mText;
    }

    public LiveData<ArrayList<Recipe>> getRecipes() {
        return repository.getRecipes();
    }



}





