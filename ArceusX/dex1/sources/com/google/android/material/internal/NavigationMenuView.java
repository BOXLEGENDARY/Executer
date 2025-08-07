package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class NavigationMenuView extends RecyclerView implements androidx.appcompat.view.menu.n {
    public NavigationMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override
    public void initialize(androidx.appcompat.view.menu.g gVar) {
    }

    public NavigationMenuView(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        setLayoutManager(new LinearLayoutManager(context, 1, false));
    }
}
