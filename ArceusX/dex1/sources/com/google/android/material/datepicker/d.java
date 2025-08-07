package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import c4.C1752h;
import c4.C1753i;
import java.util.Calendar;
import java.util.Locale;

class d extends BaseAdapter {

    private static final int f17762v = 4;

    private final Calendar f17763d;

    private final int f17764e;

    private final int f17765i;

    public d() {
        Calendar calendarI = p.i();
        this.f17763d = calendarI;
        this.f17764e = calendarI.getMaximum(7);
        this.f17765i = calendarI.getFirstDayOfWeek();
    }

    private int b(int i7) {
        int i8 = i7 + this.f17765i;
        int i9 = this.f17764e;
        return i8 > i9 ? i8 - i9 : i8;
    }

    @Override
    public Integer getItem(int i7) {
        if (i7 >= this.f17764e) {
            return null;
        }
        return Integer.valueOf(b(i7));
    }

    @Override
    public int getCount() {
        return this.f17764e;
    }

    @Override
    public long getItemId(int i7) {
        return 0L;
    }

    @Override
    public View getView(int i7, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1752h.f12913n, viewGroup, false);
        }
        this.f17763d.set(7, b(i7));
        textView.setText(this.f17763d.getDisplayName(7, f17762v, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(C1753i.f12933l), this.f17763d.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public d(int i7) {
        Calendar calendarI = p.i();
        this.f17763d = calendarI;
        this.f17764e = calendarI.getMaximum(7);
        this.f17765i = i7;
    }
}
