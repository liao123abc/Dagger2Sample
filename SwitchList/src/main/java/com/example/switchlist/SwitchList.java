package com.example.switchlist;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
 * Created by liaodongming on 2016/9/5.
 */
public class SwitchList {
    //param
    private View container;
    private Context context;

    SwitchList(ViewGroup container, Context context) {
        this.container = container;
        this.context = context;
    }

    Context getContext() {
        return context;
    }

    public static SwitchList with(Context context) {
        return new SwitchListBuilder(context).build();
    }

    public ViewCreator load(ArrayList<HashMap> allDataHashMapList) {
        if (allDataHashMapList == null) {

        }
        return new ViewCreator(this, allDataHashMapList);
    }

    public static class SwitchListBuilder {
        /** require parameters */
        private ViewGroup container;
        private final Context context;
        private String name;//ex. 大润发商场
        private String mainTitle;//主标题 ex.可口可乐
        private String subTitle;//副标题

        /** list to store optional parameters */
        private List itemList;


//        public SwitchListBuilder(View container, Context context, String mainTitle, String subTitle) {
//            this.container = container;
//            this.context = context;
//            this.mainTitle = mainTitle;
//            this.subTitle = subTitle;
//        }

        public SwitchListBuilder(Context context) {
            if (context == null) {
                throw new IllegalArgumentException("Context must not be null.");
            }
            this.context = context;
        }

        public SwitchListBuilder addDetailNormalCell() {
            return this;
        }

        public SwitchListBuilder addDetailSpinnerCell() {
            return this;
        }

        public SwitchList build() {
            return new SwitchList(container, context);
        }

    }


}

