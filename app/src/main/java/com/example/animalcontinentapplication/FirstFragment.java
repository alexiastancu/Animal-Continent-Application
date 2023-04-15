package com.example.animalcontinentapplication;


import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import com.example.animalcontinentapplication.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FirstFragment extends Fragment {
    private ListView listView;
    private AnimalAdapter adapter;
    private ArrayList<Animal> animalList;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);


        // Initialize data
        animalList = new ArrayList<>();
        animalList.add(new Animal("Lion", "Africa"));
        animalList.add(new Animal("Panda", "Asia"));
        animalList.add(new Animal("Bear", "Americas"));
        animalList.add(new Animal("Kangaroo", "Australia"));
        animalList.add(new Animal("Cat", "Europa"));
        animalList.add(new Animal("Koala", "Australia"));
        animalList.add(new Animal("Elephant", "Asia"));
        animalList.add(new Animal("Penguin", "Americas"));
        animalList.add(new Animal("Kangaroo", "Australia"));
        animalList.add(new Animal("Bear", "Americas"));
        animalList.add(new Animal("Tiger", "Asia"));
        animalList.add(new Animal("Hippopotamus", "Africa"));
        animalList.add(new Animal("Koala", "Australia"));
        animalList.add(new Animal("Giraffe", "Africa"));
        animalList.add(new Animal("Zebra", "Africa"));
        animalList.add(new Animal("Panda", "Asia"));
        animalList.add(new Animal("Kangaroo", "Australia"));
        animalList.add(new Animal("Lion", "Africa"));
        animalList.add(new Animal("Bear", "Americas"));
        animalList.add(new Animal("Penguin", "Americas"));
        animalList.add(new Animal("Koala", "Australia"));
        animalList.add(new Animal("Elephant", "Asia"));
        animalList.add(new Animal("Hippopotamus", "Africa"));
        animalList.add(new Animal("Tiger", "Asia"));
        animalList.add(new Animal("Leopard", "Africa"));

        // Initialize adapter
        adapter = new AnimalAdapter(this.getContext(), animalList);

        RecyclerView recyclerView = view.findViewById(R.id.listView);
        recyclerView.setAdapter(adapter);

        return view;
    }
}


