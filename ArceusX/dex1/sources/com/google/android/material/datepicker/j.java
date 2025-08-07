package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
import x0.C2986c;

class j extends BaseAdapter {

    final Month f17852d;

    final DateSelector<?> f17853e;

    private Collection<Long> f17854i;

    b f17855v;

    final CalendarConstraints f17856w;

    final DayViewDecorator f17857y;

    static final int f17851z = p.i().getMaximum(4);

    private static final int f17850A = (p.i().getMaximum(5) + p.i().getMaximum(7)) - 1;

    j(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f17852d = month;
        this.f17853e = dateSelector;
        this.f17856w = calendarConstraints;
        this.f17857y = dayViewDecorator;
        this.f17854i = dateSelector.L0();
    }

    private String c(Context context, long j7) {
        return c.a(context, j7, l(j7), k(j7), g(j7));
    }

    private void f(Context context) {
        if (this.f17855v == null) {
            this.f17855v = new b(context);
        }
    }

    private boolean j(long j7) {
        Iterator<Long> it = this.f17853e.L0().iterator();
        while (it.hasNext()) {
            if (p.a(j7) == p.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(long j7) {
        return p.g().getTimeInMillis() == j7;
    }

    private void o(TextView textView, long j7, int i7) {
        boolean z7;
        a aVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strC = c(context, j7);
        textView.setContentDescription(strC);
        boolean zN0 = this.f17856w.h().n0(j7);
        if (zN0) {
            textView.setEnabled(true);
            boolean zJ = j(j7);
            textView.setSelected(zJ);
            aVar = zJ ? this.f17855v.f17755b : l(j7) ? this.f17855v.f17756c : this.f17855v.f17754a;
            z7 = zJ;
        } else {
            textView.setEnabled(false);
            z7 = false;
            aVar = this.f17855v.f17760g;
        }
        DayViewDecorator dayViewDecorator = this.f17857y;
        if (dayViewDecorator == null || i7 == -1) {
            aVar.d(textView);
            return;
        }
        Month month = this.f17852d;
        int i8 = month.f17743i;
        int i9 = month.f17742e;
        ColorStateList colorStateListA = dayViewDecorator.a(context, i8, i9, i7, zN0, z7);
        boolean z8 = z7;
        aVar.e(textView, colorStateListA, this.f17857y.h(context, i8, i9, i7, zN0, z8));
        Drawable drawableC = this.f17857y.c(context, i8, i9, i7, zN0, z8);
        Drawable drawableF = this.f17857y.f(context, i8, i9, i7, zN0, z8);
        Drawable drawableD = this.f17857y.d(context, i8, i9, i7, zN0, z8);
        boolean z9 = z7;
        textView.setCompoundDrawables(drawableC, drawableF, drawableD, this.f17857y.b(context, i8, i9, i7, zN0, z9));
        textView.setContentDescription(this.f17857y.g(context, i8, i9, i7, zN0, z9, strC));
    }

    private void p(MaterialCalendarGridView materialCalendarGridView, long j7) {
        if (Month.g(j7).equals(this.f17852d)) {
            int iL = this.f17852d.l(j7);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iL) - materialCalendarGridView.getFirstVisiblePosition()), j7, iL);
        }
    }

    int a(int i7) {
        return b() + (i7 - 1);
    }

    int b() {
        return this.f17852d.i(this.f17856w.k());
    }

    @Override
    public Long getItem(int i7) {
        if (i7 < b() || i7 > m()) {
            return null;
        }
        return Long.valueOf(this.f17852d.k(n(i7)));
    }

    @Override
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.j.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    boolean g(long j7) {
        Iterator<C2986c<Long, Long>> it = this.f17853e.A().iterator();
        while (it.hasNext()) {
            Long l7 = it.next().f24318b;
            if (l7 != null && l7.longValue() == j7) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int getCount() {
        return f17850A;
    }

    @Override
    public long getItemId(int i7) {
        return i7 / this.f17852d.f17744v;
    }

    boolean h(int i7) {
        return i7 % this.f17852d.f17744v == 0;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    boolean i(int i7) {
        return (i7 + 1) % this.f17852d.f17744v == 0;
    }

    boolean k(long j7) {
        Iterator<C2986c<Long, Long>> it = this.f17853e.A().iterator();
        while (it.hasNext()) {
            Long l7 = it.next().f24317a;
            if (l7 != null && l7.longValue() == j7) {
                return true;
            }
        }
        return false;
    }

    int m() {
        return (b() + this.f17852d.f17745w) - 1;
    }

    int n(int i7) {
        return (i7 - b()) + 1;
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator<Long> it = this.f17854i.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, it.next().longValue());
        }
        DateSelector<?> dateSelector = this.f17853e;
        if (dateSelector != null) {
            Iterator<Long> it2 = dateSelector.L0().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, it2.next().longValue());
            }
            this.f17854i = this.f17853e.L0();
        }
    }

    boolean r(int i7) {
        return i7 >= b() && i7 <= m();
    }
}
