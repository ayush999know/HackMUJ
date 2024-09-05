package com.example.singularity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout mainLayout;
    private TextView waitTextView;
    private TextView alert;
    private Handler handler;
    private Runnable runnable;
    private boolean isActivityRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find views by ID
        mainLayout = findViewById(R.id.main);
        waitTextView = findViewById(R.id.wait);
        alert = findViewById(R.id.alert);

        // Set onClickListener for the alert TextView
        alert.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            startActivity(intent);
            // Mark the activity as no longer active to prevent the toast
            isActivityRunning = false;
            finish(); // Finish current activity to prevent going back to it
        });

        // Initialize the Handler and Runnable
        handler = new Handler();
        runnable = new Runnable() {
            @Override
            public void run() {
                if (isActivityRunning) {
                    // Change the background color to red
                    mainLayout.setBackgroundColor(Color.RED);

                    // Show a toast message
                    Toast.makeText(MainActivity.this, "Your location and emergency message has been sent", Toast.LENGTH_SHORT).show();
                }
            }
        };

        // Post the runnable with a delay of 5000 milliseconds (5 seconds)
        handler.postDelayed(runnable, 5000);
    }

    @Override
    protected void onStart() {
        super.onStart();
        isActivityRunning = true;
    }

    @Override
    protected void onStop() {
        super.onStop();
        isActivityRunning = false;
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Remove any pending callbacks to the runnable to prevent the toast from appearing
        handler.removeCallbacks(runnable);
    }
}

