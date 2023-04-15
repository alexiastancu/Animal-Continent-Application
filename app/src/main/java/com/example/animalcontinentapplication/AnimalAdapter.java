package com.example.animalcontinentapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Animal> animalList;
    private LayoutInflater inflater;

    private OnAnimalClickListener listener;

    public AnimalAdapter(Context context, ArrayList<Animal> animalList) {
        this.context = context;
        this.animalList = animalList;
        inflater = LayoutInflater.from(context);
    }

    public void setOnAnimalClickListener(OnAnimalClickListener listener) {
        this.listener = listener;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = null;
        switch (viewType) {
            case 0:
                view = inflater.inflate(R.layout.africa_item, parent, false);
                break;
            case 1:
                view = inflater.inflate(R.layout.australia_item, parent, false);
                break;
            case 2:
                view = inflater.inflate(R.layout.americas_item, parent, false);
                break;
            case 3:
                view = inflater.inflate(R.layout.europa_item, parent, false);
                break;
            case 4:
                view = inflater.inflate(R.layout.asia_item, parent, false);
                break;
        }
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Get the data for the current position
        Animal animal = animalList.get(position);

        // Set data to views
        holder.nameTextView.setText(animal.getName());
        holder.continentTextView.setText(animal.getContinent());
    }



    @Override
    public int getItemCount() {
        return animalList.size();
    }

    @Override
    public int getItemViewType(int position) {
        String continent = animalList.get(position).getContinent();
        switch (continent) {
            case "Africa":
                return 0;
            case "Australia":
                return 1;
            case "Americas":
                return 2;
            case "Europa":
                return 3;
            case "Asia":
                return 4;
            default:
                return 0;
        }
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameTextView;
        TextView continentTextView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameTextView = itemView.findViewById(R.id.animal_name);
            continentTextView = itemView.findViewById(R.id.continent_name);
        }
    }
}

