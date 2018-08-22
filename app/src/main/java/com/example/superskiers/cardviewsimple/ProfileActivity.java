package com.example.superskiers.cardviewsimple;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity{
    //Log for debugging
    private static final String TAG = "ProfileActivity";
    public TextView setmTextViewAngle, setTextDescription;
    public ImageView setImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Log.d(TAG, "onCreate: started.");

        //Navigation back to home screen
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //View components
        ImageView setImage = findViewById(R.id.main_image);
        TextView setmTextViewAngle = findViewById(R.id.image_angle);
        TextView setTextDescription = findViewById(R.id.image_description);

        //Get intent and populate layout
        Intent intent = getIntent();
        Bundle extras = getIntent().getExtras();
        String angle = intent.getStringExtra("textAngle");
        String description = intent.getStringExtra("textDescription");
        int photoAngle = extras.getInt("image");

        //Set elements; photo angle, text of view, and text description
        setmTextViewAngle.setText(angle);
        setTextDescription.setText(description);
        setImage.setImageResource(photoAngle);
    }

  }