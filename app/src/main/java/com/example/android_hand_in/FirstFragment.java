package com.example.android_hand_in;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.android_hand_in.ViewModel.RecipesViewModel;
import com.example.android_hand_in.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;
    private NavController navController;
    private RecyclerView roomList;

    private RecipesViewModel recipesViewModel;
    private Fragment send;
    private TextView name;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        RecipesViewModel recipesViewModel =
                new ViewModelProvider(this).get(RecipesViewModel.class);


        binding = FragmentFirstBinding.inflate(inflater, container, false);
        View root = binding.getRoot();




       /* ConfigureRecyclerView();




            Navigation.findNavController(getView()).navigate();
        });*/


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }


    private void ConfigureRecyclerView() {


        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.getContext(), 99);


    }
}