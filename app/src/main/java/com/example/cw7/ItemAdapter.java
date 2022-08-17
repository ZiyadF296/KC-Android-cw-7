package com.example.cw7;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class ItemAdapter extends ArrayAdapter<ItemModel> {
    List<ItemModel> items;

    public ItemAdapter(@NonNull Context context, int resource, @NonNull ArrayList<ItemModel> objects) {
        super(context, resource, objects);
        items = objects;
    }

    // Override the `getView` method to return a custom view for each item in the list.
    public @NonNull View getView(int position, View convertView, @NonNull ViewGroup parent) {
        // Get the item at the given position in the list.
        final ItemModel item = items.get(position);

        // Check if an existing view is being reused, otherwise inflate the view.
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_component, parent, false);
        }

        // Get the ImageView and set the image to the item's image.
        final ImageView image = convertView.findViewById(R.id.imageView);
        image.setImageResource(item.getImage());

        // Get the TextView and set the text to the item's name.
        final TextView nameTextView = convertView.findViewById(R.id.k_title);
        nameTextView.setText(item.getName());

        // Get the TextView and set the text to the item's price.
        final TextView priceTextView = convertView.findViewById(R.id.product_price);
        priceTextView.setText(String.format("Price: %s", item.getPrice()));

        return convertView;
    }
}
