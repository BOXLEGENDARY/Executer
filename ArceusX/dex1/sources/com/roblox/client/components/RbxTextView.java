package com.roblox.client.components;

import V5.e;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class RbxTextView extends TextView {
    public RbxTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e.c(this, context, attributeSet);
    }
}
