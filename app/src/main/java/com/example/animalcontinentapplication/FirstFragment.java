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

        // Initialize views decomenteaza aici pentru a avea aplicatia functionala
        //listView = view.findViewById(R.id.listView);

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


        // Find the RecyclerView and set the adapter comenteaza aici
        RecyclerView recyclerView = view.findViewById(R.id.listView);
        recyclerView.setAdapter(adapter);

        // Set adapter to list view decomenteaza aici pentru a avea aplicatia functionala
        //listView.setAdapter(adapter);

        return view;
    }
}




//public class FirstFragment extends Fragment {
//
//    private FragmentFirstBinding binding;
//
//    private ListView listView;
//    private ArrayList<Animal> animalList;
//    private AnimalAdapter adapter;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        binding = FragmentFirstBinding.inflate(inflater, container, false);
//        View view = binding.getRoot();
//
//        listView = view.findViewById(R.id.listView);
//
//        animalList = new ArrayList<>();
//        animalList.add(new Animal("Lion", "Africa"));
//        animalList.add(new Animal("Panda", "Asia"));
//        animalList.add(new Animal("Bear", "Americas"));
//        animalList.add(new Animal("Kangaroo", "Australia"));
//        animalList.add(new Animal("Cat", "Europe"));
//        animalList.add(new Animal("Koala", "Australia"));
//        animalList.add(new Animal("Elephant", "Asia"));
//        animalList.add(new Animal("Penguin", "Americas"));
//        animalList.add(new Animal("Kangaroo", "Australia"));
//        animalList.add(new Animal("Bear", "Americas"));
//        animalList.add(new Animal("Tiger", "Asia"));
//        animalList.add(new Animal("Hippopotamus", "Africa"));
//        animalList.add(new Animal("Koala", "Australia"));
//        animalList.add(new Animal("Giraffe", "Africa"));
//        animalList.add(new Animal("Zebra", "Africa"));
//        animalList.add(new Animal("Panda", "Asia"));
//        animalList.add(new Animal("Kangaroo", "Australia"));
//        animalList.add(new Animal("Lion", "Africa"));
//        animalList.add(new Animal("Bear", "Americas"));
//        animalList.add(new Animal("Penguin", "Americas"));
//        animalList.add(new Animal("Koala", "Australia"));
//        animalList.add(new Animal("Elephant", "Asia"));
//        animalList.add(new Animal("Hippopotamus", "Africa"));
//        animalList.add(new Animal("Tiger", "Asia"));
//        animalList.add(new Animal("Leopard", "Africa"));
//
//
//
//        adapter = new AnimalAdapter(this.getContext(), 0, animalList);
//
//        listView.setAdapter(adapter);
//
//        return view;
//    }
//}
//public class FirstFragment extends Fragment {
//
//    private FragmentFirstBinding binding;
//
//    private ListView listView;
//    private ArrayList<Animal> animalList;
//    private AnimalAdapter adapter;
//
//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        binding = FragmentFirstBinding.inflate(inflater, container, false);
//        View view = binding.getRoot();
//
//        listView = view.findViewById(R.id.listView);
//
//        animalList = new ArrayList<>();
//        animalList.add(new Animal("Lion", "Africa"));
//        animalList.add(new Animal("Panda", "Asia"));
//        animalList.add(new Animal("Bear", "Americas"));
//        animalList.add(new Animal("Kangaroo", "Australia"));
//        animalList.add(new Animal("Cat", "Europe"));
//        animalList.add(new Animal("Koala", "Australia"));
//        animalList.add(new Animal("Elephant", "Asia"));
//        animalList.add(new Animal("Penguin", "Americas"));
//        animalList.add(new Animal("Kangaroo", "Australia"));
//        animalList.add(new Animal("Bear", "Americas"));
//        animalList.add(new Animal("Tiger", "Asia"));
//        animalList.add(new Animal("Hippopotamus", "Africa"));
//        animalList.add(new Animal("Koala", "Australia"));
//        animalList.add(new Animal("Giraffe", "Africa"));
//        animalList.add(new Animal("Zebra", "Africa"));
//        animalList.add(new Animal("Panda", "Asia"));
//        animalList.add(new Animal("Kangaroo", "Australia"));
//        animalList.add(new Animal("Lion", "Africa"));
//        animalList.add(new Animal("Bear", "Americas"));
//        animalList.add(new Animal("Penguin", "Americas"));
//        animalList.add(new Animal("Koala", "Australia"));
//        animalList.add(new Animal("Elephant", "Asia"));
//        animalList.add(new Animal("Hippopotamus", "Africa"));
//        animalList.add(new Animal("Tiger", "Asia"));
//        animalList.add(new Animal("Leopard", "Africa"));

//        int layoutResourceId = 0;
//        switch (animalList.get(0).getContinent()) {
//            case "Africa":
//                layoutResourceId = R.layout.africa_item;
//                break;
//            case "Asia":
//                layoutResourceId = R.layout.asia_item;
//                break;
//            case "Americas":
//                layoutResourceId = R.layout.americas_item;
//                break;
//            case "Australia":
//                layoutResourceId = R.layout.australia_item;
//                break;
//            case "Europe":
//                layoutResourceId = R.layout.europa_item;
//                break;
//        }

//        adapter = new AnimalAdapter(this.getContext(), this, layoutResourceId, animalList);
//        adapter = new AnimalAdapter(this.getContext(), this, animalList);
//        listView.setAdapter(adapter);
//
//        return view;
//    }

//    @Override
//    public View onCreateView(
//            LayoutInflater inflater, ViewGroup container,
//            Bundle savedInstanceState
//    ) {
//        View view = inflater.inflate(R.layout.fragment_first, container, false);
//
//        listView = view.findViewById(R.id.listView);
//        animalList = new ArrayList<>();
//        animalList.add(new Animal("Lion", "Africa"));
//        animalList.add(new Animal("Panda", "Asia"));
//        animalList.add(new Animal("Bear", "Americas"));
//        animalList.add(new Animal("Kangaroo", "Australia"));
//        animalList.add(new Animal("Cat", "Europe"));
//        animalList.add(new Animal("Koala", "Australia"));
//        animalList.add(new Animal("Elephant", "Asia"));
//        animalList.add(new Animal("Penguin", "Americas"));
//        animalList.add(new Animal("Kangaroo", "Australia"));
//        animalList.add(new Animal("Bear", "Americas"));
//        animalList.add(new Animal("Tiger", "Asia"));
//        animalList.add(new Animal("Hippopotamus", "Africa"));
//        animalList.add(new Animal("Koala", "Australia"));
//        animalList.add(new Animal("Giraffe", "Africa"));
//        animalList.add(new Animal("Zebra", "Africa"));
//        animalList.add(new Animal("Panda", "Asia"));
//        animalList.add(new Animal("Kangaroo", "Australia"));
//        animalList.add(new Animal("Lion", "Africa"));
//        animalList.add(new Animal("Bear", "Americas"));
//        animalList.add(new Animal("Penguin", "Americas"));
//        animalList.add(new Animal("Koala", "Australia"));
//        animalList.add(new Animal("Elephant", "Asia"));
//        animalList.add(new Animal("Hippopotamus", "Africa"));
//        animalList.add(new Animal("Tiger", "Asia"));
//        animalList.add(new Animal("Leopard", "Africa"));
//
//
//        adapter = new AnimalAdapter(getActivity(), animalList);
////        {
////            @Override
////            public View getView(int position, View convertView, ViewGroup parent) {
////                View view = super.getView(position, convertView, parent);
////                View divider = view.findViewById(R.id.list_ite1m_separator);
////                Animal animal = animalList.get(position);
////                switch (animal.getContinent()) {
////                    case "Europe":
////                        view.setBackgroundColor(getResources().getColor(R.color.green));
////                        TextView nameTextView = view.findViewById(R.id.list_item_name);
////                        TextView continentTextView = view.findViewById(R.id.list_item_continent);
////                        nameTextView.setGravity(Gravity.LEFT);
////                        divider.setVisibility(View.GONE);
////                        break;
////                    case "Africa":
////                        view.setBackgroundColor(getResources().getColor(R.color.yellow));
////                        nameTextView = view.findViewById(R.id.list_item_name);
////                        if(nameTextView!=null)
////                        {
////                            nameTextView.setGravity(Gravity.CENTER);
////                        }
////                        continentTextView = view.findViewById(R.id.list_item_continent);
////                        if(continentTextView!=null)
////                        {
////                            continentTextView.setGravity(Gravity.CENTER);
////                        }
////                        divider = view.findViewById(R.id.list_item_separator);
////                        divider.setVisibility(View.VISIBLE);
////                        divider.setBackgroundColor(Color.BLACK);
////                        divider.getLayoutParams().width = 2;
////
////                        break;
////                    case "Asia":
////                        view.setBackgroundColor(getResources().getColor(R.color.red));
////                        nameTextView = view.findViewById(R.id.list_item_name);
////                        if(nameTextView!=null)
////                        {
////                            nameTextView.setGravity(Gravity.END);
////                        }
////                        continentTextView = view.findViewById(R.id.list_item_continent);
////                        if(continentTextView!=null)
////                        {
////                            continentTextView.setGravity(Gravity.END);
////                        }
////                        divider = view.findViewById(R.id.list_item_separator);
////                        divider.setVisibility(View.VISIBLE);
////                        divider.setBackgroundColor(Color.BLACK);
////                        divider.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
////                        divider.getLayoutParams().width = 2; // adjust width as needed
////                        break;
////                    case "Americas":
////                        view.setBackgroundColor(getResources().getColor(R.color.blue));
////                        nameTextView = view.findViewById(R.id.list_item_name);
////                        if(nameTextView!=null)
////                        {
////                            nameTextView.setGravity(Gravity.END);
////                        }
////                        continentTextView = view.findViewById(R.id.list_item_continent);
////                        if(continentTextView!=null)
////                        {
////                            continentTextView.setGravity(Gravity.END);
////                        }
////                        divider.setVisibility(View.GONE);
////                        break;
////                    case "Australia":
////                        view.setBackgroundColor(getResources().getColor(R.color.orange));
////                        nameTextView = view.findViewById(R.id.list_item_name);
////                        if(nameTextView!=null)
////                        {
////                            nameTextView.setGravity(Gravity.CENTER);
////                        }
////                        continentTextView = view.findViewById(R.id.list_item_continent);
////                        if(continentTextView!=null)
////                        {
////                            continentTextView.setGravity(Gravity.CENTER);
////                        }
////                        divider.setVisibility(View.GONE);
////                        break;
////                }
////                return view;
////            }
////
////        };
//
//        listView.setAdapter(adapter);
//        return view;
//    }
//
//    @Override
//    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
//        super.onViewCreated(view, savedInstanceState);
//    }
//
//            @Override
//            public void onDestroyView() {
//            super.onDestroyView();
//            binding = null;
//        }
//}