package com.roblox.client;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.SurfaceView;

public class RBXSurfaceView extends SurfaceView {

    private Context f19820d;

    protected V5.j f19821e;

    public RBXSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19820d = null;
        a();
        this.f19820d = context;
    }

    protected void a() {
        V5.j jVar = new V5.j();
        this.f19821e = jVar;
        jVar.a(j6.d.a().O1());
    }

    @Override
    public boolean onFilterTouchEventForSecurity(MotionEvent motionEvent) {
        return this.f19821e.b(motionEvent) && super.onFilterTouchEventForSecurity(motionEvent);
    }

    @Override
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i7) {
        return PointerIcon.getSystemIcon(this.f19820d, 0);
    }

    @Override
    protected void onSizeChanged(int i7, int i8, int i9, int i10) {
        super.onSizeChanged(i7, i8, i9, i10);
        h7.l.g("RBXSurfaceView", "SurfaceView size has changed: old width " + i9 + " new width " + i7 + " old height " + i10 + " new height " + i8);
    }
}
