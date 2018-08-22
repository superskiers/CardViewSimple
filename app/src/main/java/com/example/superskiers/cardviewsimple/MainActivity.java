package com.example.superskiers.cardviewsimple;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<CrossPolo> viewAngles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Set the viewAngles data to the list
        setInitialData();
        RecyclerView recyclerView = findViewById(R.id.list);

        //LayoutManager is used to manage the positioning of items in RecyclerView
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        //Adapter initialization with context and productList
        MyAdapter myAdapter = new MyAdapter(this, viewAngles);
        //Set the adapter on the RecyclerView so the list can be populated
        recyclerView.setAdapter(myAdapter);
    }

    //Defining the data to be used in the RecyclerView
    private void setInitialData() {
        viewAngles.add(new CrossPolo(getString(R.string.front_left_view), getString(R.string.descript_front_left), R.drawable.crosspolo2));
        viewAngles.add(new CrossPolo(getString(R.string.front_right_view), getString(R.string.descript_front_right), R.drawable.crosspolo4));
        viewAngles.add(new CrossPolo(getString(R.string.left_view), getString(R.string.descript_front_left2), R.drawable.crosspolo7));
        viewAngles.add(new CrossPolo(getString(R.string.right_view), getString(R.string.descript_front_right2), R.drawable.crosspolo8));
        viewAngles.add(new CrossPolo(getString(R.string.front_left_view), getString(R.string.descript_front_left), R.drawable.crosspolo2));
        viewAngles.add(new CrossPolo(getString(R.string.front_right_view), getString(R.string.descript_front_right), R.drawable.crosspolo4));
        viewAngles.add(new CrossPolo(getString(R.string.left_view), getString(R.string.descript_front_left2), R.drawable.crosspolo7));
        viewAngles.add(new CrossPolo(getString(R.string.right_view), getString(R.string.descript_front_right2), R.drawable.crosspolo8));
        viewAngles.add(new CrossPolo(getString(R.string.front_left_view), getString(R.string.descript_front_left), R.drawable.crosspolo2));
        viewAngles.add(new CrossPolo(getString(R.string.front_right_view), getString(R.string.descript_front_right), R.drawable.crosspolo8));
    }
}