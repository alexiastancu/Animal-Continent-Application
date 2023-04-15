package com.example.animalcontinentapplication;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

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
        adapter.setOnAnimalClickListener(animal -> {
            Bundle bundle = new Bundle();
            bundle.putString("animal_name", animal.getName());
            bundle.putString("animal_continent", animal.getContinent());

            SecondFragment animalDetailsFragment = new SecondFragment();
            animalDetailsFragment.setArguments(bundle);

            FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
            transaction.replace(R.id.nav_host_fragment_content_main, animalDetailsFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });

        RecyclerView recyclerView = view.findViewById(R.id.listView);
        recyclerView.setAdapter(adapter);

        return view;
    }
}


