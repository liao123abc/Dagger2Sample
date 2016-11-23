package com.example.switchlist;


import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;

import com.example.switchlist.adapter.DetailAdapter;
import com.example.switchlist.adapter.GlanceAdapter;
import com.example.switchlist.decoration.DividerItemDecoration;
import com.example.switchlist.decoration.InsetDecoration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by liaodongming on 2016/9/8.
 */
public class ViewCreator {

    private final SwitchList switchList;

    /**
     * data
     */
    private List itemList;

    private RecyclerView mRecyclerViewGlance;
    private RecyclerView mRecyclerViewDetail;

    private RecyclerView.Adapter mAdapter;
    private RecyclerView.Adapter mAdapter2;
    private RecyclerView.LayoutManager mLayoutManager;
    private RecyclerView.LayoutManager mLayoutManager2;

    private RelativeLayout glanceContainer;
    private RelativeLayout detailContainer;

    /**
     * get the data
     * @param switchList
     * @param allDataHashMapList
     */
    ViewCreator(SwitchList switchList, ArrayList<HashMap> allDataHashMapList) {
        this.switchList = switchList;
    }

    public void into(ViewGroup container) {
        into(container, null);
    }

    public void into(ViewGroup container, Callback callback) {
        Context context = switchList.getContext();
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.orderm_detail, container);
        detailContainer = (RelativeLayout) container.findViewById(R.id.detail_container_layout);
        mRecyclerViewDetail = (RecyclerView)container.findViewById(R.id.orderm_list_detail);

        //dynamically load layout
        inflater.inflate(R.layout.orderm_glance, container);
        glanceContainer = (RelativeLayout) container.findViewById(R.id.glance_container_layout);
        mRecyclerViewGlance = (RecyclerView) container.findViewById(R.id.my_recycler_view);

        detailContainer.setVisibility(View.INVISIBLE);

        Button button = (Button)container.findViewById(R.id.confirmButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailContainer.setVisibility(View.VISIBLE);
                glanceContainer.setVisibility(View.INVISIBLE);
            }
        });

        Button addProduct = (Button)container.findViewById(R.id.buttonAdd);
        addProduct.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                detailContainer.setVisibility(View.INVISIBLE);
                glanceContainer.setVisibility(View.VISIBLE);
            }
        });

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerViewGlance.setHasFixedSize(true);

        // use a linear layout manager
        mLayoutManager = new LinearLayoutManager(context);
        mLayoutManager2 = new LinearLayoutManager(context);
        mRecyclerViewGlance.setLayoutManager(mLayoutManager);
        mRecyclerViewDetail.setLayoutManager(mLayoutManager2);

        String myDataset[] = {"hello",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi",
                "asdf", "adsf", "dkji", "ajkdfjika", "jihhsdi"
        };
        // specify an adapter (see also next example)
        mAdapter = new GlanceAdapter(myDataset);
        mRecyclerViewGlance.setAdapter(mAdapter);
        mRecyclerViewGlance.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL_LIST));

        DetailAdapter detailAdapter = new DetailAdapter();
        mRecyclerViewDetail.setAdapter(detailAdapter);
        mRecyclerViewDetail.addItemDecoration(new InsetDecoration(context));
    }
}