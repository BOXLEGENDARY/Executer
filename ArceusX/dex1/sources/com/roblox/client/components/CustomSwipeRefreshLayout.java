package com.roblox.client.components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class CustomSwipeRefreshLayout extends SwipeRefreshLayout {

    private int f19917n0;

    private float f19918o0;

    public CustomSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19917n0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f19918o0 = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.f19918o0) > this.f19917n0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }
}
