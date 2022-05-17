package com.example.android_hand_in.ViewModel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import com.example.android_hand_in.login.UserRepo;
import com.google.firebase.auth.FirebaseUser;

public class MainActivityViewModel extends AndroidViewModel {
    private final UserRepo userRepo;

    public MainActivityViewModel(Application app) {
        super(app);
        userRepo = UserRepo.getInstance(app);
    }

    public LiveData<FirebaseUser> getCurrentUser() {
        return userRepo.getCurrentUser();
    }

    public void signOut() {
        userRepo.signOut();
    }
}
