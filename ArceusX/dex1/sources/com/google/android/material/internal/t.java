package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class t extends ImageButton {

    private int f18183d;

    public t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void b(int i7, boolean z7) {
        super.setVisibility(i7);
        if (z7) {
            this.f18183d = i7;
        }
    }

    public final int getUserSetVisibility() {
        return this.f18183d;
    }

    @Override
    public void setVisibility(int i7) {
        b(i7, true);
    }

    public t(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.f18183d = getVisibility();
    }
}
