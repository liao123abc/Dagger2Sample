package com.example.switchlist.decoration;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.switchlist.R;

/**
 * ItemDecoration implementation that applies an inset margin
 * around each child of the RecyclerView. The inset value is controlled
 * by a dimension resource.
 */
public class InsetDecoration extends RecyclerView.ItemDecoration {

    private int mInsets;

    public InsetDecoration(Context context) {
        mInsets = context.getResources().getDimensionPixelSize(R.dimen.vertical_insets);
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        //We can supply forced insets for each item view here in the Rect
        //int left, int top, int right, int bottom
        outRect.set(0, mInsets, 0, mInsets);
    }
}
