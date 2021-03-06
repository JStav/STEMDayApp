package edu.acmatucf.stemdayapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by Ryan on 7/20/2015.
 */
public class ScheduleDividerItemDecoration extends RecyclerView.ItemDecoration {

    Drawable mDivider;

    public ScheduleDividerItemDecoration(Context context) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1){
            mDivider = context.getResources().getDrawable(R.drawable.schedule_divider, context.getTheme());
        }
        else {
            mDivider = context.getResources().getDrawable(R.drawable.schedule_divider);
        }

    }

    @Override
    public void onDrawOver(Canvas c, RecyclerView parent, RecyclerView.State state) {
        int left = parent.getPaddingLeft();
        int right = parent.getWidth() - parent.getPaddingRight();

        int childCount = parent.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = parent.getChildAt(i);

            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

            int top = child.getBottom() + params.bottomMargin;
            int bottom = top + mDivider.getIntrinsicHeight();

            mDivider.setBounds(left, top, right, bottom);
            mDivider.draw(c);
        }
    }
}
