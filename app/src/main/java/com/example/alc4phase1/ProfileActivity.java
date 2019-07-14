package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ImageView imageViewProfile = (ImageView) findViewById(R.id.my_profile_picture);
        imageViewProfile.setImageResource(R.drawable.profilepix);
    }
}
