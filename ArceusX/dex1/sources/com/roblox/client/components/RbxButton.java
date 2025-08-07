package com.roblox.client.components;

import V5.e;
import V5.f;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class RbxButton extends Button {

    RbxButton f19927d;

    f f19928e;

    private View.OnClickListener f19929i;

    public RbxButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19927d = null;
        this.f19928e = null;
        e.c(this, context, attributeSet);
        a(attributeSet);
    }

    private void a(AttributeSet attributeSet) {
        this.f19927d = this;
        this.f19928e = new f(this, attributeSet);
    }

    @Override
    public void draw(Canvas canvas) {
        super.draw(canvas);
        this.f19928e.i(canvas);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f19928e.l(motionEvent);
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f19929i = onClickListener;
    }
}
