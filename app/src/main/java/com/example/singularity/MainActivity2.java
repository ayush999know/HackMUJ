package com.example.singularity; // Adjust the package name as needed

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Get references to the buttons, image view, and warning sections
        Button level1Button = findViewById(R.id.level_1);
        Button level2Button = findViewById(R.id.level_2);
        Button level3Button = findViewById(R.id.level_3);
        ImageView circularImage = findViewById(R.id.circular_image);

        LinearLayout earthquakeWarning = findViewById(R.id.warning_earthquake);
        LinearLayout floodWarning = findViewById(R.id.warning_flood);
        LinearLayout fireWarning = findViewById(R.id.warning_fire);
        LinearLayout heavyRainWarning = findViewById(R.id.warning_heavy_rain);

        // Bottom Buttons
        Button bottomButton1 = findViewById(R.id.bottom_button_1);
        Button bottomButton2 = findViewById(R.id.bottom_button_2);
        Button bottomButton3 = findViewById(R.id.bottom_button_3);
        Button bottomButton4 = findViewById(R.id.bottom_button_4);

        // Send Location Button
        Button sendLocationButton = findViewById(R.id.send_location_button);

        // Set up click listeners for level buttons
        level1Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, MainActivity2.class); // Adjust to the correct activity
                startActivity(intent);
            }
        });

        level2Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Level2.class); // Adjust to the correct activity
                startActivity(intent);
            }
        });

        level3Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Level3.class); // Adjust to the correct activity
                startActivity(intent);
            }
        });

        // Set up click listener for circular image
        circularImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Profile.class); // Adjust to the correct activity
                startActivity(intent);
            }
        });

        // Set up click listeners for warning sections
        earthquakeWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Earthquake.class); // Adjust to the correct activity
                startActivity(intent);
            }
        });

        floodWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Empty.class); // Adjust to the correct activity
                startActivity(intent);
            }
        });

        fireWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Empty.class); // Adjust to the correct activity
                startActivity(intent);
            }
        });

        heavyRainWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Empty.class); // Adjust to the correct activity
                startActivity(intent);
            }
        });

        // Set up click listeners for bottom buttons
        bottomButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Empty.class); // Adjust to the correct activity
                startActivity(intent);
            }
        });

        bottomButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Empty.class); // Adjust to the correct activity
                startActivity(intent);
            }
        });

        bottomButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Empty.class); // Adjust to the correct activity
                startActivity(intent);
            }
        });

        bottomButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Empty.class); // Adjust to the correct activity
                startActivity(intent);
            }
        });

        // Set up click listener for "Send Location" button
        sendLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, Empty.class); // Adjust to the correct activity
                startActivity(intent);
            }
        });
    }
}
