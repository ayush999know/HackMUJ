package com.example.singularity;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Evacuation extends AppCompatActivity {

    private TextView safetyTips;
    private Button locateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evacuation);

        safetyTips = findViewById(R.id.safety_tips);
        locateButton = findViewById(R.id.locate_button);

        // Example safety tips
        String tips = "1. Drop, Cover, and Hold On.\n" +
                "2. Stay indoors and away from windows.\n" +
                "3. If outside, find an open area away from buildings.\n" +
                "4. If driving, pull over and stop in a safe area.";
        safetyTips.setText(tips);

        locateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // This is where you'd integrate location-based services
                Intent intent = new Intent(Evacuation.this, Empty.class);
                startActivity(intent);
            }
        });
    }
}
