package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import c4.C1752h;
import com.google.android.material.datepicker.e;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

class q extends RecyclerView.h<b> {

    private final e<?> f17873d;

    class a implements View.OnClickListener {

        final int f17874d;

        a(int i7) {
            this.f17874d = i7;
        }

        @Override
        public void onClick(View view) {
            q.this.f17873d.M(q.this.f17873d.D().g(Month.f(this.f17874d, q.this.f17873d.F().f17742e)));
            q.this.f17873d.N(e.l.DAY);
        }
    }

    public static class b extends RecyclerView.D {

        final TextView f17876u;

        b(TextView textView) {
            super(textView);
            this.f17876u = textView;
        }
    }

    q(e<?> eVar) {
        this.f17873d = eVar;
    }

    private View.OnClickListener D(int i7) {
        return new a(i7);
    }

    int E(int i7) {
        return i7 - this.f17873d.D().o().f17743i;
    }

    int F(int i7) {
        return this.f17873d.D().o().f17743i + i7;
    }

    @Override
    public void r(b bVar, int i7) {
        int iF = F(i7);
        bVar.f17876u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iF)));
        TextView textView = bVar.f17876u;
        textView.setContentDescription(c.e(textView.getContext(), iF));
        com.google.android.material.datepicker.b bVarE = this.f17873d.E();
        Calendar calendarG = p.g();
        com.google.android.material.datepicker.a aVar = calendarG.get(1) == iF ? bVarE.f17759f : bVarE.f17757d;
        Iterator<Long> it = this.f17873d.G().L0().iterator();
        while (it.hasNext()) {
            calendarG.setTimeInMillis(it.next().longValue());
            if (calendarG.get(1) == iF) {
                aVar = bVarE.f17758e;
            }
        }
        aVar.d(bVar.f17876u);
        bVar.f17876u.setOnClickListener(D(iF));
    }

    @Override
    public b t(ViewGroup viewGroup, int i7) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C1752h.f12917r, viewGroup, false));
    }

    @Override
    public int e() {
        return this.f17873d.D().p();
    }
}
