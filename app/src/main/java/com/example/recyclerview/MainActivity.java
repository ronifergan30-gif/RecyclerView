package com.example.recyclerview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
 private ArrayList<Item>items;
 private int i=18;
 private RecyclerView recyler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        items= new ArrayList<Item>();
        Item item1= new Item("aa",5,"aaaa");
        items.add(item1);
        Item item2= new Item("bb",6,"bbb");
        items.add(item2);
        Item item3= new Item("cc",7,"ccc");
        items.add(item3);
        Item item4= new Item("dd",8,"ddd");
        items.add(item4);
        Item item5= new Item("ee",9,"eee");
        items.add(item5);

        recyler = findViewById(R.id.recycler);

        MyAdapter adapter = new MyAdapter(items);
        recyler.setAdapter(adapter);
        recyler.setLayoutManager(new LinearLayoutManager(this));
    }
}