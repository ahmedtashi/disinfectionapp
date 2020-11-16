package com.example.pushnotification;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView notificationButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        settingUpOnClickListener();
    }



    private void initViews() {
        notificationButton = findViewById(R.id.imageViewNotification);
    }


    private void settingUpOnClickListener() {

        notificationButton.setOnClickListener(v -> {

         //   Toast.makeText(this, "Notification Button Clicked", Toast.LENGTH_SHORT).show();

            Intent startNotificationActivity = new Intent(MainActivity.this , NotificationActivity.class);
            startActivity(startNotificationActivity);
            overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
        });
    }
}