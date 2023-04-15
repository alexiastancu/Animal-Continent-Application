package com.example.animalcontinentapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.animalcontinentapplication.databinding.FragmentSecondBinding;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        String animal = getArguments().getString("animal_name");
        String continent = getArguments().getString("animal_continent");

        TextView animalNameTextView = view.findViewById(R.id.animal_name);
        animalNameTextView.setText(animal);

        TextView continentNameTextView = view.findViewById(R.id.continent_name);
        continentNameTextView.setText(continent);

        int color;
        switch (continent.toLowerCase()) {
            case "europa":
                color = Color.parseColor("#008000");
                break;
            case "africa":
                color = getResources().getColor(R.color.yellow);
                break;
            case "asia":
                color = getResources().getColor(R.color.red);
                break;
            case "americas":
                color = getResources().getColor(R.color.blue);
                break;
            case "australia":
                color = getResources().getColor(R.color.orange);
                break;
            default:
                color = getResources().getColor(R.color.white);
                break;
        }
        binding.getRoot().setBackgroundColor(color);

        binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                NavHostFragment.findNavController(SecondFragment.this)
//                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
                FirstFragment firstFragment = new FirstFragment();

                FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
                transaction.replace(R.id.nav_host_fragment_content_main, firstFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}