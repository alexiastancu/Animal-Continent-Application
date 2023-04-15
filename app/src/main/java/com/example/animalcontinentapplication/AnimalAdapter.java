package com.example.animalcontinentapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

//public class AnimalAdapter extends BaseAdapter {
//    private Context context;
//    private ArrayList<Animal> animalList;
//    private LayoutInflater inflater;
//
//    public AnimalAdapter(Context context, ArrayList<Animal> animalList) {
//        this.context = context;
//        this.animalList = animalList;
//        inflater = LayoutInflater.from(context);
//    }
//
//    @Override
//    public int getCount() {
//        return animalList.size();
//    }
//
//    @Override
//    public Animal getItem(int position) {
//        return animalList.get(position);
//    }
//
//    @Override
//    public long getItemId(int position) {
//        return position;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        ViewHolder holder;
//        if (convertView == null) {
//            // Inflate layout based on continent
//            String continent = getItem(position).getContinent();
//            if (continent.equals("Africa")) {
//                convertView = inflater.inflate(R.layout.africa_item, parent, false);
//            } else if (continent.equals("Australia")) {
//                convertView = inflater.inflate(R.layout.australia_item, parent, false);
//            } else if (continent.equals("Americas")) {
//                convertView = inflater.inflate(R.layout.americas_item, parent, false);
//            } else if (continent.equals("Europa")) {
//                convertView = inflater.inflate(R.layout.europa_item, parent, false);
//            } else if (continent.equals("Asia")) {
//                convertView = inflater.inflate(R.layout.asia_item, parent, false);
//            }
//
//            // Initialize holder
//            holder = new ViewHolder();
//            holder.nameTextView = convertView.findViewById(R.id.animal_name);
//            holder.continentTextView = convertView.findViewById(R.id.continent_name);
//            convertView.setTag(holder);
//        } else {
//            holder = (ViewHolder) convertView.getTag();
//        }
//
//        // Set data to views
//        Animal animal = getItem(position);
//        holder.nameTextView.setText(animal.getName());
//        holder.continentTextView.setText(animal.getContinent());
//
//        return convertView;
//    }
//
//
//    @Override
//    public void onBindViewHolder(ViewHolder holder, int position, ArrayList<Object> payloads) {
//        // Get the data for the current position
//        Animal animal = animalList.get(position);
//
//        // Check if the view is already bound to this data
//        if (!holder.nameTextView.getText().equals(animal.getName())) {
//            // Update the view's data
//            holder.nameTextView.setText(animal.getName());
//            holder.continentTextView.setText(animal.getContinent());
//        }
//    }
//
//    static class ViewHolder {
//        TextView nameTextView;
//        TextView continentTextView;
//    }
//}


public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.ViewHolder> {
    private Context context;
    private ArrayList<Animal> animalList;
    private LayoutInflater inflater;

    public AnimalAdapter(Context context, ArrayList<Animal> animalList) {
        this.context = context;
        this.animalList = animalList;
        inflater = LayoutInflater.from(context);
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

