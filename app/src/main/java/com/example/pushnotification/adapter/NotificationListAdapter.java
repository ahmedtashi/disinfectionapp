package com.example.pushnotification.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pushnotification.R;

import java.util.ArrayList;

public class NotificationListAdapter extends RecyclerView.Adapter<NotificationListAdapter.ViewHolder> {

    private Context mContext;
    private ArrayList<String> mNotificationList;

    public NotificationListAdapter(Context mContext, ArrayList<String> mNotificationList) {
        this.mContext = mContext;
        this.mNotificationList = mNotificationList;
    }

    @NonNull
    @Override
    public NotificationListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View rootView = LayoutInflater.from(mContext).inflate(R.layout.list_item_view, parent , false);
        return new ViewHolder(rootView);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationListAdapter.ViewHolder holder, int position) {



    }

    @Override
    public int getItemCount() {
        return mNotificationList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder  implements View.OnClickListener {

        private TextView mNotificationText;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mNotificationText = itemView.findViewById(R.id.textNotification);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

        }
    }
}
