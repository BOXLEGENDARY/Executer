package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.AbstractC1733q;
import java.util.ArrayList;
import java.util.Iterator;

public class z extends AbstractC1733q {

    int f12411i0;

    ArrayList<AbstractC1733q> f12409g0 = new ArrayList<>();

    private boolean f12410h0 = true;

    boolean f12412j0 = false;

    private int f12413k0 = 0;

    class a extends w {

        final AbstractC1733q f12414a;

        a(AbstractC1733q abstractC1733q) {
            this.f12414a = abstractC1733q;
        }

        @Override
        public void d(AbstractC1733q abstractC1733q) {
            this.f12414a.e0();
            abstractC1733q.a0(this);
        }
    }

    static class b extends w {

        z f12416a;

        b(z zVar) {
            this.f12416a = zVar;
        }

        @Override
        public void a(AbstractC1733q abstractC1733q) {
            z zVar = this.f12416a;
            if (zVar.f12412j0) {
                return;
            }
            zVar.m0();
            this.f12416a.f12412j0 = true;
        }

        @Override
        public void d(AbstractC1733q abstractC1733q) {
            z zVar = this.f12416a;
            int i7 = zVar.f12411i0 - 1;
            zVar.f12411i0 = i7;
            if (i7 == 0) {
                zVar.f12412j0 = false;
                zVar.q();
            }
            abstractC1733q.a0(this);
        }
    }

    private void A0() {
        b bVar = new b(this);
        Iterator<AbstractC1733q> it = this.f12409g0.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.f12411i0 = this.f12409g0.size();
    }

    private void r0(AbstractC1733q abstractC1733q) {
        this.f12409g0.add(abstractC1733q);
        abstractC1733q.f12363K = this;
    }

    @Override
    public void Y(View view) {
        super.Y(view);
        int size = this.f12409g0.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f12409g0.get(i7).Y(view);
        }
    }

    @Override
    public void c0(View view) {
        super.c0(view);
        int size = this.f12409g0.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f12409g0.get(i7).c0(view);
        }
    }

    @Override
    protected void cancel() {
        super.cancel();
        int size = this.f12409g0.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f12409g0.get(i7).cancel();
        }
    }

    @Override
    protected void e0() {
        if (this.f12409g0.isEmpty()) {
            m0();
            q();
            return;
        }
        A0();
        if (this.f12410h0) {
            Iterator<AbstractC1733q> it = this.f12409g0.iterator();
            while (it.hasNext()) {
                it.next().e0();
            }
            return;
        }
        for (int i7 = 1; i7 < this.f12409g0.size(); i7++) {
            this.f12409g0.get(i7 - 1).a(new a(this.f12409g0.get(i7)));
        }
        AbstractC1733q abstractC1733q = this.f12409g0.get(0);
        if (abstractC1733q != null) {
            abstractC1733q.e0();
        }
    }

    @Override
    void f0(boolean z7) {
        super.f0(z7);
        int size = this.f12409g0.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f12409g0.get(i7).f0(z7);
        }
    }

    @Override
    public void g(B b2) {
        if (O(b2.f12210b)) {
            Iterator<AbstractC1733q> it = this.f12409g0.iterator();
            while (it.hasNext()) {
                AbstractC1733q next = it.next();
                if (next.O(b2.f12210b)) {
                    next.g(b2);
                    b2.f12211c.add(next);
                }
            }
        }
    }

    @Override
    public void h0(AbstractC1733q.e eVar) {
        super.h0(eVar);
        this.f12413k0 |= 8;
        int size = this.f12409g0.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f12409g0.get(i7).h0(eVar);
        }
    }

    @Override
    void i(B b2) {
        super.i(b2);
        int size = this.f12409g0.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f12409g0.get(i7).i(b2);
        }
    }

    @Override
    public void j(B b2) {
        if (O(b2.f12210b)) {
            Iterator<AbstractC1733q> it = this.f12409g0.iterator();
            while (it.hasNext()) {
                AbstractC1733q next = it.next();
                if (next.O(b2.f12210b)) {
                    next.j(b2);
                    b2.f12211c.add(next);
                }
            }
        }
    }

    @Override
    public void j0(AbstractC1727k abstractC1727k) {
        super.j0(abstractC1727k);
        this.f12413k0 |= 4;
        if (this.f12409g0 != null) {
            for (int i7 = 0; i7 < this.f12409g0.size(); i7++) {
                this.f12409g0.get(i7).j0(abstractC1727k);
            }
        }
    }

    @Override
    public void k0(y yVar) {
        super.k0(yVar);
        this.f12413k0 |= 2;
        int size = this.f12409g0.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f12409g0.get(i7).k0(yVar);
        }
    }

    @Override
    public AbstractC1733q clone() {
        z zVar = (z) super.clone();
        zVar.f12409g0 = new ArrayList<>();
        int size = this.f12409g0.size();
        for (int i7 = 0; i7 < size; i7++) {
            zVar.r0(this.f12409g0.get(i7).clone());
        }
        return zVar;
    }

    @Override
    String n0(String str) {
        String strN0 = super.n0(str);
        for (int i7 = 0; i7 < this.f12409g0.size(); i7++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strN0);
            sb.append("\n");
            sb.append(this.f12409g0.get(i7).n0(str + "  "));
            strN0 = sb.toString();
        }
        return strN0;
    }

    @Override
    public z a(AbstractC1733q.f fVar) {
        return (z) super.a(fVar);
    }

    @Override
    void p(ViewGroup viewGroup, C c2, C c3, ArrayList<B> arrayList, ArrayList<B> arrayList2) {
        long jE = E();
        int size = this.f12409g0.size();
        for (int i7 = 0; i7 < size; i7++) {
            AbstractC1733q abstractC1733q = this.f12409g0.get(i7);
            if (jE > 0 && (this.f12410h0 || i7 == 0)) {
                long jE2 = abstractC1733q.E();
                if (jE2 > 0) {
                    abstractC1733q.l0(jE2 + jE);
                } else {
                    abstractC1733q.l0(jE);
                }
            }
            abstractC1733q.p(viewGroup, c2, c3, arrayList, arrayList2);
        }
    }

    @Override
    public z b(View view) {
        for (int i7 = 0; i7 < this.f12409g0.size(); i7++) {
            this.f12409g0.get(i7).b(view);
        }
        return (z) super.b(view);
    }

    public z q0(AbstractC1733q abstractC1733q) {
        r0(abstractC1733q);
        long j7 = this.f12383i;
        if (j7 >= 0) {
            abstractC1733q.g0(j7);
        }
        if ((this.f12413k0 & 1) != 0) {
            abstractC1733q.i0(w());
        }
        if ((this.f12413k0 & 2) != 0) {
            abstractC1733q.k0(B());
        }
        if ((this.f12413k0 & 4) != 0) {
            abstractC1733q.j0(z());
        }
        if ((this.f12413k0 & 8) != 0) {
            abstractC1733q.h0(v());
        }
        return this;
    }

    @Override
    void r(ViewGroup viewGroup) {
        super.r(viewGroup);
        int size = this.f12409g0.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f12409g0.get(i7).r(viewGroup);
        }
    }

    public AbstractC1733q s0(int i7) {
        if (i7 < 0 || i7 >= this.f12409g0.size()) {
            return null;
        }
        return this.f12409g0.get(i7);
    }

    public int t0() {
        return this.f12409g0.size();
    }

    @Override
    public z a0(AbstractC1733q.f fVar) {
        return (z) super.a0(fVar);
    }

    @Override
    public z b0(View view) {
        for (int i7 = 0; i7 < this.f12409g0.size(); i7++) {
            this.f12409g0.get(i7).b0(view);
        }
        return (z) super.b0(view);
    }

    @Override
    public z g0(long j7) {
        ArrayList<AbstractC1733q> arrayList;
        super.g0(j7);
        if (this.f12383i >= 0 && (arrayList = this.f12409g0) != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f12409g0.get(i7).g0(j7);
            }
        }
        return this;
    }

    @Override
    public z i0(TimeInterpolator timeInterpolator) {
        this.f12413k0 |= 1;
        ArrayList<AbstractC1733q> arrayList = this.f12409g0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                this.f12409g0.get(i7).i0(timeInterpolator);
            }
        }
        return (z) super.i0(timeInterpolator);
    }

    public z y0(int i7) {
        if (i7 == 0) {
            this.f12410h0 = true;
        } else {
            if (i7 != 1) {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i7);
            }
            this.f12410h0 = false;
        }
        return this;
    }

    @Override
    public z l0(long j7) {
        return (z) super.l0(j7);
    }
}
