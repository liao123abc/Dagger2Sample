package com.example.switchlist.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.switchlist.R;

/**
 * Created by liaodongming on 2016/9/5.
 */

public class DetailAdapter extends RecyclerView.Adapter<GlanceAdapter.ViewHolder> {

    @Override
    public GlanceAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // create a new view
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.orderm_detail_item, parent, false);
        // set the view's size, margins, paddings and layout parameters
        GlanceAdapter.ViewHolder vh = new GlanceAdapter.ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(GlanceAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 20;
    }
}
