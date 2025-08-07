package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.Z;
import androidx.recyclerview.widget.RecyclerView;
import c4.C1750f;
import c4.C1752h;
import com.google.android.material.datepicker.e;

class k extends RecyclerView.h<b> {

    private final CalendarConstraints f17858d;

    private final DateSelector<?> f17859e;

    private final DayViewDecorator f17860f;

    private final e.m f17861g;

    private final int f17862h;

    class a implements AdapterView.OnItemClickListener {

        final MaterialCalendarGridView f17863d;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f17863d = materialCalendarGridView;
        }

        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
            if (this.f17863d.getAdapter().r(i7)) {
                k.this.f17861g.a(this.f17863d.getAdapter().getItem(i7).longValue());
            }
        }
    }

    public static class b extends RecyclerView.D {

        final TextView f17865u;

        final MaterialCalendarGridView f17866v;

        b(LinearLayout linearLayout, boolean z7) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C1750f.f12891u);
            this.f17865u = textView;
            Z.o0(textView, true);
            this.f17866v = (MaterialCalendarGridView) linearLayout.findViewById(C1750f.f12887q);
            if (z7) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    k(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, e.m mVar) {
        Month monthO = calendarConstraints.o();
        Month monthI = calendarConstraints.i();
        Month monthN = calendarConstraints.n();
        if (monthO.compareTo(monthN) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthN.compareTo(monthI) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f17862h = (j.f17851z * e.H(context)) + (g.H(context) ? e.H(context) : 0);
        this.f17858d = calendarConstraints;
        this.f17859e = dateSelector;
        this.f17860f = dayViewDecorator;
        this.f17861g = mVar;
        A(true);
    }

    Month D(int i7) {
        return this.f17858d.o().p(i7);
    }

    CharSequence E(int i7) {
        return D(i7).n();
    }

    int F(Month month) {
        return this.f17858d.o().q(month);
    }

    @Override
    public void r(b bVar, int i7) {
        Month monthP = this.f17858d.o().p(i7);
        bVar.f17865u.setText(monthP.n());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f17866v.findViewById(C1750f.f12887q);
        if (materialCalendarGridView.getAdapter() == null || !monthP.equals(materialCalendarGridView.getAdapter().f17852d)) {
            j jVar = new j(monthP, this.f17859e, this.f17858d, this.f17860f);
            materialCalendarGridView.setNumColumns(monthP.f17744v);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override
    public b t(ViewGroup viewGroup, int i7) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C1752h.f12915p, viewGroup, false);
        if (!g.H(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f17862h));
        return new b(linearLayout, true);
    }

    @Override
    public int e() {
        return this.f17858d.l();
    }

    @Override
    public long f(int i7) {
        return this.f17858d.o().p(i7).o();
    }
}
