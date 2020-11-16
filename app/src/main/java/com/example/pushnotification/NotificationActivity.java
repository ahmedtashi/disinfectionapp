package com.example.pushnotification;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.pushnotification.adapter.NotificationListAdapter;

import java.util.ArrayList;

public class NotificationActivity extends AppCompatActivity {

    private RecyclerView mNotificationRecyclerView;
    private NotificationListAdapter mNotificationAdapter;
    private ArrayList<String> notificationList;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notification);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);

        initViews();


    }

    private void initViews() {

        mNotificationRecyclerView = findViewById(R.id.recyclerViewNotification);

        notificationList = new ArrayList<>();
        notificationList.add("Push Notification From Server Will Show here ");
        notificationList.add("Push Notification From Server Will Show here ");
        notificationList.add("Push Notification From Server Will Show here ");
        notificationList.add("Push Notification From Server Will Show here ");
        notificationList.add("Push Notification From Server Will Show here ");
        notificationList.add("Push Notification From Server Will Show here ");
        notificationList.add("Push Notification From Server Will Show here ");
        notificationList.add("Push Notification From Server Will Show here ");
        notificationList.add("Push Notification From Server Will Show here ");
        notificationList.add("Push Notification From Server Will Show here ");
        notificationList.add("Push Notification From Server Will Show here ");

        mLayoutManager = new LinearLayoutManager(this);
        mNotificationAdapter = new NotificationListAdapter(NotificationActivity.this, notificationList);
        mNotificationRecyclerView.setAdapter(mNotificationAdapter);
        mNotificationRecyclerView.setLayoutManager(mLayoutManager);
        mNotificationRecyclerView.hasFixedSize();
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                super.onBackPressed();
                overridePendingTransition(R.anim.slide_from_left, R.anim.slide_to_right);

                break;
        }
        return true;
    }
}