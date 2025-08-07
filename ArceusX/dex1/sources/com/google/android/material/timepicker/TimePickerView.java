package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import c4.C1750f;
import c4.C1752h;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;

class TimePickerView extends ConstraintLayout {

    private final Chip f18727d;

    private final Chip f18728e;

    private final ClockHandView f18729i;

    private final ClockFaceView f18730v;

    private final MaterialButtonToggleGroup f18731w;

    private final View.OnClickListener f18732y;

    class a implements View.OnClickListener {
        a() {
        }

        @Override
        public void onClick(View view) {
            TimePickerView.c(TimePickerView.this);
        }
    }

    class b extends GestureDetector.SimpleOnGestureListener {
        b() {
        }

        @Override
        public boolean onDoubleTap(MotionEvent motionEvent) {
            TimePickerView.d(TimePickerView.this);
            return false;
        }
    }

    class c implements View.OnTouchListener {

        final GestureDetector f18735d;

        c(GestureDetector gestureDetector) {
            this.f18735d = gestureDetector;
        }

        @Override
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f18735d.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    interface d {
    }

    interface e {
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    static e c(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    static d d(TimePickerView timePickerView) {
        timePickerView.getClass();
        return null;
    }

    public void e(MaterialButtonToggleGroup materialButtonToggleGroup, int i7, boolean z7) {
    }

    private void f() {
        Chip chip = this.f18727d;
        int i7 = C1750f.f12859I;
        chip.setTag(i7, 12);
        this.f18728e.setTag(i7, 10);
        this.f18727d.setOnClickListener(this.f18732y);
        this.f18728e.setOnClickListener(this.f18732y);
        this.f18727d.setAccessibilityClassName("android.view.View");
        this.f18728e.setAccessibilityClassName("android.view.View");
    }

    private void g() {
        c cVar = new c(new GestureDetector(getContext(), new b()));
        this.f18727d.setOnTouchListener(cVar);
        this.f18728e.setOnTouchListener(cVar);
    }

    @Override
    protected void onVisibilityChanged(View view, int i7) {
        super.onVisibilityChanged(view, i7);
        if (view == this && i7 == 0) {
            this.f18728e.sendAccessibilityEvent(8);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f18732y = new a();
        LayoutInflater.from(context).inflate(C1752h.f12910k, this);
        this.f18730v = (ClockFaceView) findViewById(C1750f.f12879i);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(C1750f.f12882l);
        this.f18731w = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new MaterialButtonToggleGroup.d() {
            @Override
            public final void a(MaterialButtonToggleGroup materialButtonToggleGroup2, int i8, boolean z7) {
                this.f18743a.e(materialButtonToggleGroup2, i8, z7);
            }
        });
        this.f18727d = (Chip) findViewById(C1750f.f12885o);
        this.f18728e = (Chip) findViewById(C1750f.f12883m);
        this.f18729i = (ClockHandView) findViewById(C1750f.f12880j);
        g();
        f();
    }
}
