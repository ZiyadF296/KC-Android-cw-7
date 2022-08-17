package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    final ArrayList<ItemModel> items = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Change the app bar title to "Products"
        setTitle("Products");

        final ListView list = findViewById(R.id.listView);

        // Add my products
        items.add(new ItemModel(R.drawable.cheese, "Cheese", 2));
        items.add(new ItemModel(R.drawable.chocolate, "Chocolate", 1));
        items.add(new ItemModel(R.drawable.coffee, "Coffee", 0.5));
        items.add(new ItemModel(R.drawable.donut, "Donut", 1));
        items.add(new ItemModel(R.drawable.fries, "Fries", 0.2));
        items.add(new ItemModel(R.drawable.honey, "Honey", 4));

        final ItemAdapter adapter = new ItemAdapter(getApplicationContext(), 0, items);

        list.setAdapter(adapter);
    }
}