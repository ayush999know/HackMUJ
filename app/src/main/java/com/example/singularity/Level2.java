package com.example.singularity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import java.util.logging.Level;

public class Level2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2);

        // Initialize the buttons
        Button familyFriendStatusButton = findViewById(R.id.button_family_friend_status);
        Button bluetoothButton = findViewById(R.id.button_bluetooth);

        // Set click listeners for the buttons
        familyFriendStatusButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start FamilyFriendStatusActivity
                Intent intent = new Intent(Level2.this, Status.class);
                startActivity(intent);
            }
        });

        bluetoothButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start BluetoothActivity
                Intent intent = new Intent(Level2.this, Empty.class);
                startActivity(intent);
            }
        });
    }
}
