package com.example.animalcontinentapplication;


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

import com.example.animalcontinentapplication.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    private ListView listView;
    private List<Animal> animalList;
    private ArrayAdapter<Animal> adapter;


    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(R.layout.fragment_first, container, false);

        listView = view.findViewById(R.id.listView);
        animalList = new ArrayList<>();
        animalList.add(new Animal("Lion", "Africa"));
        animalList.add(new Animal("Panda", "Asia"));
        animalList.add(new Animal("Bear", "Americas"));
        animalList.add(new Animal("Kangaroo", "Australia"));

        adapter = new ArrayAdapter<Animal>(getActivity(), R.layout.list_item, animalList) {
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                View view = super.getView(position, convertView, parent);

                Animal animal = animalList.get(position);
                switch (animal.getContinent()) {
                    case "Europe":
                        view.setBackgroundColor(getResources().getColor(R.color.green));
                        TextView nameTextView = view.findViewById(R.id.nameTextView);
                        if(nameTextView!=null)
                        {
                            nameTextView.setGravity(Gravity.END);
                        }
                        TextView continentTextView = view.findViewById(R.id.continentTextView);
                        if(continentTextView!=null)
                        {
                            continentTextView.setGravity(Gravity.END);
                        }
                        break;
                    case "Africa":
                        view.setBackgroundColor(getResources().getColor(R.color.yellow));
                        nameTextView = view.findViewById(R.id.nameTextView);
                        if(nameTextView!=null)
                        {
                            nameTextView.setGravity(Gravity.END);
                        }
                        continentTextView = view.findViewById(R.id.continentTextView);
                        if(continentTextView!=null)
                        {
                            continentTextView.setGravity(Gravity.END);
                        }
                        View divider = view.findViewById(R.id.divider);
                        if(divider==null)
                        {
                            divider = LayoutInflater.from(getContext())
                                    .inflate(R.layout.list_item, parent, false);
                        }
                        else
                        {
                            divider.setBackgroundColor(getResources().getColor(R.color.black));
                        }
                        break;
                    case "Asia":
                        view.setBackgroundColor(getResources().getColor(R.color.red));
                        nameTextView = view.findViewById(R.id.nameTextView);
                        if(nameTextView!=null)
                        {
                            nameTextView.setGravity(Gravity.END);
                        }
                        continentTextView = view.findViewById(R.id.continentTextView);
                        if(continentTextView!=null)
                        {
                            continentTextView.setGravity(Gravity.END);
                        }
                        divider = view.findViewById(R.id.divider);
                        if(divider==null)
                        {
                            divider = LayoutInflater.from(getContext())
                                    .inflate(R.layout.list_item, parent, false);
                        }
                        else
                        {
                            divider.setBackgroundColor(getResources().getColor(R.color.black));
                        }
                        break;
                    case "Americas":
                        view.setBackgroundColor(getResources().getColor(R.color.blue));
                        nameTextView = view.findViewById(R.id.nameTextView);
                        if(nameTextView!=null)
                        {
                            nameTextView.setGravity(Gravity.END);
                        }
                        continentTextView = view.findViewById(R.id.continentTextView);
                        if(continentTextView!=null)
                        {
                            continentTextView.setGravity(Gravity.END);
                        }
                        break;
                    case "Australia":
                        view.setBackgroundColor(getResources().getColor(R.color.orange));
                        nameTextView = view.findViewById(R.id.nameTextView);
                        if(nameTextView!=null)
                        {
                            nameTextView.setGravity(Gravity.END);
                        }
                        continentTextView = view.findViewById(R.id.continentTextView);
                        if(continentTextView!=null)
                        {
                            continentTextView.setGravity(Gravity.END);
                        }
                        break;
                }
//        binding = FragmentFirstBinding.inflate(inflater, container, false);
//        return binding.getRoot();
                return view;
            }

        };

        listView.setAdapter(adapter);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

            @Override
            public void onDestroyView() {
            super.onDestroyView();
            binding = null;
        }
}