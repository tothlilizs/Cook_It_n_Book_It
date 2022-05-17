package com.example.android_hand_in.ViewModel;


import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;


import com.google.firebase.auth.FirebaseUser;

import com.example.android_hand_in.login.UserRepo;

public class LoginViewModel extends AndroidViewModel {
    private final UserRepo userRepository;

    public LoginViewModel(Application app) {
        super(app);
        userRepository = UserRepo.getInstance(app);
    }

    public LiveData<FirebaseUser> getCurrentUser() {
        return userRepository.getCurrentUser();
    }
}
