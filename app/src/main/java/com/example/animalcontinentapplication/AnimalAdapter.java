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



//public class AnimalAdapter extends ArrayAdapter<Animal> {
//
//    private Context context;
//    private ArrayList<Animal> animalList;
//    private HashMap<String, Integer> layoutResourceIdMap;
//
//    public AnimalAdapter(Context context, int resource, ArrayList<Animal> animalList) {
//        super(context, 0, animalList);
//        this.context = context;
//        this.animalList = animalList;
//        layoutResourceIdMap = new HashMap<>();
//        layoutResourceIdMap.put("Africa", R.layout.africa_item);
//        layoutResourceIdMap.put("Asia", R.layout.asia_item);
//        layoutResourceIdMap.put("Americas", R.layout.americas_item);
//        layoutResourceIdMap.put("Australia", R.layout.australia_item);
//        layoutResourceIdMap.put("Europe", R.layout.europa_item);
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        View row = convertView;
//        AnimalHolder holder;
//
//        // Check if convertView is null, inflate a new row layout if it is
//        if (row == null) {
//            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
//            Integer resourceId = layoutResourceIdMap.get(getItemViewType(position));
//            if (resourceId != null) {
//                row = inflater.inflate(resourceId, parent, false);
//            } else {
//                // Handle the case where the layout resource ID is not found
//                return null;
//            }
//
//            // Create a new AnimalHolder object and set the views as tags to the row
//            holder = new AnimalHolder();
//            holder.name = row.findViewById(R.id.animal_name);
//            holder.continent = row.findViewById(R.id.continent_name);
//            row.setTag(holder);
//        } else {
//            // If convertView is not null, reuse the row and get the AnimalHolder object from its tag
//            holder = (AnimalHolder) row.getTag();
//        }
//
//        // Get the Animal object for the current position
//        Animal animal = getItem(position);
//
//        // Set the name and continent of the Animal to the views in the row
//        if (holder.name != null) {
//            holder.name.setText(animal.getName());
//        }
//
//        if (holder.continent != null) {
//            holder.continent.setText(animal.getContinent());
//        }
//
//
//        // Return the row
//        return row;
//    }

//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        View row = convertView;
//        AnimalHolder holder;
//
//        if (row == null) {
//            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
//            Integer resourceId = layoutResourceIdMap.get(getItemViewType(position));
//            if (resourceId != null) {
//                row = inflater.inflate(resourceId, parent, false);
//                // ...
//            } else {
//                // Handle the case where the layout resource ID is not found
//            }
//
//            holder = new AnimalHolder();
//            holder.name = row.findViewById(R.id.animal_name);
//            holder.continent = row.findViewById(R.id.continent_name);
//            row.setTag(holder);
//        } else {
//            holder = (AnimalHolder) row.getTag();
//        }
//        Animal animal = animalList.get(position);
//
//        holder.name.setText(animal.getName());
//        holder.continent.setText(animal.getContinent());
//
//        return row;
//    }

//    @Override
//    public int getItemViewType(int position) {
//        String continent = animalList.get(position).getContinent();
//        return layoutResourceIdMap.get(continent);
//    }
//
//    @Override
//    public int getViewTypeCount() {
//        return layoutResourceIdMap.size();
//    }
//
//    static class AnimalHolder {
//        TextView name;
//        TextView continent;
//    }
//}

//public class AnimalAdapter extends ArrayAdapter<Animal> {
//
//    private Context context;
//    private ArrayList<Animal> animalList;
//    private HashMap<String, Integer> layoutResourceIdMap;
//
//
//    public AnimalAdapter(Context context, int resource, ArrayList<Animal> animalList, HashMap<String, Integer> layoutResourceIdMap) {
//        super(context, 0, animalList);
//        this.context = context;
//        this.animalList = animalList;
//        this.layoutResourceIdMap = layoutResourceIdMap;
//    }
//
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        View row = convertView;
//        AnimalHolder holder;
//
////        if (row == null) {
////            LayoutInflater inflater = LayoutInflater.from(context);
////            row = inflater.inflate(layoutResourceIdMap.get(animalList.get(position).getContinent()), parent, false);
////        }
//
//        if (row == null) {
//            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
//            row = inflater.inflate(layoutResourceIdMap.get(getItemViewType(position)), parent, false);
//
//            holder = new AnimalHolder();
//            holder.name = row.findViewById(R.id.animal_name);
//            holder.continent = row.findViewById(R.id.continent_name);
//            row.setTag(holder);
//        } else {
//            holder = (AnimalHolder) row.getTag();
//        }
//        Animal animal = animalList.get(position);
//        TextView nameTextView = row.findViewById(R.id.nameTextView);
//        TextView continentTextView = row.findViewById(R.id.continentTextView);
//
//        nameTextView.setText(animal.getName());
//        continentTextView.setText(animal.getContinent());
//
//        return row;
//    }
//    static class AnimalHolder {
//        TextView name;
//        TextView continent;
//    }
//}


//public class AnimalAdapter extends ArrayAdapter<Animal> {
//    private Context context;
//    private int layoutResourceId;
//    private ArrayList<Animal> data = null;
//
//    public AnimalAdapter(Context context, int layoutResourceId, ArrayList<Animal> data) {
//        super(context, layoutResourceId, data);
//        this.context = context;
//        this.layoutResourceId = layoutResourceId;
//        this.data = data;
//    }
//
//    @Override
//    public View getView(int position, View convertView, ViewGroup parent) {
//        View row = convertView;
//        AnimalHolder holder = null;
//
//        if (row == null) {
//            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
//            row = inflater.inflate(layoutResourceId, parent, false);
//
//            holder = new AnimalHolder();
//            holder.name = row.findViewById(R.id.animal_name);
//            holder.continent = row.findViewById(R.id.continent_name);
//
//            row.setTag(holder);
//        } else {
//            holder = (AnimalHolder) row.getTag();
//        }
//
//        Animal animal = data.get(position);
//        holder.name.setText(animal.getName());
//        holder.continent.setText(animal.getContinent());
//
//        int layoutResourceId = 0;
//        switch (animal.getContinent()) {
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
//
//        LayoutInflater inflater = LayoutInflater.from(context);
//        View continentView = inflater.inflate(layoutResourceId, null, false);
//        ViewGroup container = row.findViewById(R.id.container);
//        container.removeAllViews();
//        container.addView(continentView);
//
//        return row;
//    }
//
//    static class AnimalHolder {
//        TextView name;
//        TextView continent;
//    }
//}

//public class AnimalAdapter extends ArrayAdapter<Animal> {
//
//    private static final String TAG = AnimalAdapter.class.getSimpleName();
//
//    public AnimalAdapter(Context context, List<Animal> animals) {
//        super(context, 0, animals);
//    }
//
//    @SuppressLint("ResourceAsColor")
//    @NonNull
//    @Override
//    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//
//        View view = convertView;
//
//        if (view == null) {
//            view = LayoutInflater.from(getContext()).inflate(
//                    R.layout.list_item, parent, false);
//        }
//
//        Animal animal = getItem(position);
//        TextView nameContinentTextView = view.findViewById(R.id.list_item_name_and_continent);
//        nameContinentTextView.setVisibility(view.GONE);
//        View line = view.findViewById(R.id.line);
//        int color;
//        switch (animal.getContinent()) {
//            case "Europe":
//                nameContinentTextView.setVisibility(view.GONE);
//                color = ContextCompat.getColor(getContext(), R.color.green);
//                view.setBackgroundColor(color);
//                TextView nameTextView = view.findViewById(R.id.list_item_name);
//                TextView continentTextView = view.findViewById(R.id.list_item_continent);
//                nameTextView.setGravity(Gravity.LEFT);
//                line.setVisibility(View.GONE);
//                nameTextView.setText(animal.getName() + "\n" + animal.getContinent());
//                //continentTextView.setText(animal.getContinent());
//                break;
//            case "Africa":
//                nameContinentTextView.setVisibility(view.GONE);
//                color = ContextCompat.getColor(getContext(), R.color.yellow);
//                view.setBackgroundColor(color);
//                nameTextView = view.findViewById(R.id.list_item_name);
//                continentTextView = view.findViewById(R.id.list_item_continent);
//                line.setVisibility(View.VISIBLE);
//                line.setBackgroundColor(Color.BLACK);
//                line.getLayoutParams().height = 4;
//                line.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT; // adjust width as needed
//                if (nameTextView != null && continentTextView != null) {
//                    ViewGroup.LayoutParams nameParams = nameTextView.getLayoutParams();
//                    ViewGroup.LayoutParams continentParams = continentTextView.getLayoutParams();
//                    ViewGroup.LayoutParams lineParams = line.getLayoutParams();
//
//                    // Set the 'below' rule for the continent TextView to be below the name TextView
//
//                    if (continentParams instanceof LinearLayout.LayoutParams) {
//                        LinearLayout.LayoutParams llParams = (LinearLayout.LayoutParams) continentParams;
//                        //llParams.addRule(RelativeLayout.BELOW, line.getId());
//                        // modify llParams here
//                    }
//
//                    //continentParams.addRule(RelativeLayout.BELOW, line.getId());
//                    //lineParams.addRule(RelativeLayout.BELOW, nameTextView.getId());
//
//                    // Set the margins for the continent TextView to add some space between it and the name TextView
//                    //continentParams.setMargins(0, 5, 0, 0);
//
//                    // Apply the modified layout params to the name and continent TextViews
//                    nameTextView.setLayoutParams(nameParams);
//                    continentTextView.setLayoutParams(continentParams);
//
//                    nameTextView.setGravity(Gravity.CENTER);
//                    nameTextView.setText(animal.getName());
//                    continentTextView.setGravity(Gravity.CENTER);
//                    continentTextView.setText(animal.getContinent());
//                }
//
//
//                break;
//            case "Asia":
//                nameContinentTextView.setVisibility(view.GONE);
//                color = ContextCompat.getColor(getContext(), R.color.red);
//                view.setBackgroundColor(color);
//                nameTextView = view.findViewById(R.id.list_item_name);
//                if (nameTextView != null) {
//                    nameTextView.setGravity(Gravity.CENTER);
//                    nameTextView.setText(animal.getName());
//                }
//                continentTextView = view.findViewById(R.id.list_item_continent);
//                if (continentTextView != null) {
//                    continentTextView.setGravity(Gravity.CENTER);
//                    continentTextView.setText(animal.getContinent());
//                }
//                line.setVisibility(View.VISIBLE);
//                line.setBackgroundColor(Color.BLACK);
//                line.getLayoutParams().height = ViewGroup.LayoutParams.MATCH_PARENT;
//                line.getLayoutParams().width = 4; // adjust width as needed
//                break;
//            case "Americas":
//                nameContinentTextView.setVisibility(view.GONE);
//                color = ContextCompat.getColor(getContext(), R.color.blue);
//                view.setBackgroundColor(color);
//                nameTextView = view.findViewById(R.id.list_item_name);
////                if (nameTextView != null) {
////                    nameTextView.setGravity(Gravity.END);
////                    nameTextView.setText(animal.getName());
////                }
//                continentTextView = view.findViewById(R.id.list_item_continent);
//                if (continentTextView != null) {
//                    continentTextView.setGravity(Gravity.END);
//                    continentTextView.setText(animal.getName() + "\n" + animal.getContinent());
//                }
//                line.setVisibility(View.GONE);
//                break;
//            case "Australia":
//                color = ContextCompat.getColor(getContext(), R.color.orange);
//                view.setBackgroundColor(color);
//                nameContinentTextView.setText(animal.getName() + "\n" + animal.getContinent());
//                nameContinentTextView.setVisibility(view.VISIBLE);
////                nameTextView = view.findViewById(R.id.list_item_name);
////                if (nameTextView != null) {
////                    nameTextView.setGravity(Gravity.CENTER);
////                    nameTextView.setText(animal.getName() + "\n" + animal.getContinent());
////                }
//                continentTextView = view.findViewById(R.id.list_item_continent);
////                if (continentTextView != null) {
////                    continentTextView.setGravity(Gravity.CENTER);
////                    continentTextView.setText(animal.getContinent());
////                }
//                line.setVisibility(View.GONE);
//                break;
//
//
//        }
//        return view;
//    }
//}



