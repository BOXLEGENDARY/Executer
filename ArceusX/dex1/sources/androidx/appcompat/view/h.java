package androidx.appcompat.view;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.C1620h0;
import androidx.core.view.C1624j0;
import androidx.core.view.InterfaceC1622i0;
import java.util.ArrayList;
import java.util.Iterator;

public class h {

    private Interpolator f8862c;

    InterfaceC1622i0 f8863d;

    private boolean f8864e;

    private long f8861b = -1;

    private final C1624j0 f8865f = new a();

    final ArrayList<C1620h0> f8860a = new ArrayList<>();

    class a extends C1624j0 {

        private boolean f8866a = false;

        private int f8867b = 0;

        a() {
        }

        void a() {
            this.f8867b = 0;
            this.f8866a = false;
            h.this.b();
        }

        @Override
        public void onAnimationEnd(View view) {
            int i7 = this.f8867b + 1;
            this.f8867b = i7;
            if (i7 == h.this.f8860a.size()) {
                InterfaceC1622i0 interfaceC1622i0 = h.this.f8863d;
                if (interfaceC1622i0 != null) {
                    interfaceC1622i0.onAnimationEnd(null);
                }
                a();
            }
        }

        @Override
        public void onAnimationStart(View view) {
            if (this.f8866a) {
                return;
            }
            this.f8866a = true;
            InterfaceC1622i0 interfaceC1622i0 = h.this.f8863d;
            if (interfaceC1622i0 != null) {
                interfaceC1622i0.onAnimationStart(null);
            }
        }
    }

    public void a() {
        if (this.f8864e) {
            Iterator<C1620h0> it = this.f8860a.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f8864e = false;
        }
    }

    void b() {
        this.f8864e = false;
    }

    public h c(C1620h0 c1620h0) {
        if (!this.f8864e) {
            this.f8860a.add(c1620h0);
        }
        return this;
    }

    public h d(C1620h0 c1620h0, C1620h0 c1620h02) {
        this.f8860a.add(c1620h0);
        c1620h02.j(c1620h0.d());
        this.f8860a.add(c1620h02);
        return this;
    }

    public h e(long j7) {
        if (!this.f8864e) {
            this.f8861b = j7;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f8864e) {
            this.f8862c = interpolator;
        }
        return this;
    }

    public h g(InterfaceC1622i0 interfaceC1622i0) {
        if (!this.f8864e) {
            this.f8863d = interfaceC1622i0;
        }
        return this;
    }

    public void h() {
        if (this.f8864e) {
            return;
        }
        Iterator<C1620h0> it = this.f8860a.iterator();
        while (it.hasNext()) {
            C1620h0 next = it.next();
            long j7 = this.f8861b;
            if (j7 >= 0) {
                next.f(j7);
            }
            Interpolator interpolator = this.f8862c;
            if (interpolator != null) {
                next.g(interpolator);
            }
            if (this.f8863d != null) {
                next.h(this.f8865f);
            }
            next.l();
        }
        this.f8864e = true;
    }
}
