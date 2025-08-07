package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

class n extends LinearLayoutManager {

    class a extends androidx.recyclerview.widget.m {
        a(Context context) {
            super(context);
        }

        @Override
        protected float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    n(Context context, int i7, boolean z7) {
        super(context, i7, z7);
    }

    @Override
    public void M1(RecyclerView recyclerView, RecyclerView.A a2, int i7) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i7);
        N1(aVar);
    }
}
