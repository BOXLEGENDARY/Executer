package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class TouchObserverFrameLayout extends FrameLayout {

    private View.OnTouchListener f18052d;

    public TouchObserverFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        View.OnTouchListener onTouchListener = this.f18052d;
        if (onTouchListener != null) {
            onTouchListener.onTouch(this, motionEvent);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public void setOnTouchListener(View.OnTouchListener onTouchListener) {
        this.f18052d = onTouchListener;
    }
}
