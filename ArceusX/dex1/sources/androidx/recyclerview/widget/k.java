package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class k implements Runnable {

    static final ThreadLocal<k> f11980w = new ThreadLocal<>();

    static Comparator<c> f11981y = new a();

    long f11983e;

    long f11984i;

    ArrayList<RecyclerView> f11982d = new ArrayList<>();

    private ArrayList<c> f11985v = new ArrayList<>();

    class a implements Comparator<c> {
        a() {
        }

        @Override
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f11993d;
            if ((recyclerView == null) != (cVar2.f11993d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z7 = cVar.f11990a;
            if (z7 != cVar2.f11990a) {
                return z7 ? -1 : 1;
            }
            int i7 = cVar2.f11991b - cVar.f11991b;
            if (i7 != 0) {
                return i7;
            }
            int i8 = cVar.f11992c - cVar2.f11992c;
            if (i8 != 0) {
                return i8;
            }
            return 0;
        }
    }

    static class b implements RecyclerView.p.c {

        int f11986a;

        int f11987b;

        int[] f11988c;

        int f11989d;

        b() {
        }

        @Override
        public void a(int i7, int i8) {
            if (i7 < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i8 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i9 = this.f11989d;
            int i10 = i9 * 2;
            int[] iArr = this.f11988c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f11988c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 >= iArr.length) {
                int[] iArr3 = new int[i9 * 4];
                this.f11988c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f11988c;
            iArr4[i10] = i7;
            iArr4[i10 + 1] = i8;
            this.f11989d++;
        }

        void b() {
            int[] iArr = this.f11988c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f11989d = 0;
        }

        void c(RecyclerView recyclerView, boolean z7) {
            this.f11989d = 0;
            int[] iArr = this.f11988c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.p pVar = recyclerView.f11568F;
            if (recyclerView.f11566E == null || pVar == null || !pVar.y0()) {
                return;
            }
            if (z7) {
                if (!recyclerView.f11624v.p()) {
                    pVar.u(recyclerView.f11566E.e(), this);
                }
            } else if (!recyclerView.l0()) {
                pVar.t(this.f11986a, this.f11987b, recyclerView.f11561B0, this);
            }
            int i7 = this.f11989d;
            if (i7 > pVar.f11714m) {
                pVar.f11714m = i7;
                pVar.f11715n = z7;
                recyclerView.f11605e.K();
            }
        }

        boolean d(int i7) {
            if (this.f11988c != null) {
                int i8 = this.f11989d * 2;
                for (int i9 = 0; i9 < i8; i9 += 2) {
                    if (this.f11988c[i9] == i7) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i7, int i8) {
            this.f11986a = i7;
            this.f11987b = i8;
        }
    }

    static class c {

        public boolean f11990a;

        public int f11991b;

        public int f11992c;

        public RecyclerView f11993d;

        public int f11994e;

        c() {
        }

        public void a() {
            this.f11990a = false;
            this.f11991b = 0;
            this.f11992c = 0;
            this.f11993d = null;
            this.f11994e = 0;
        }
    }

    k() {
    }

    private void b() {
        c cVar;
        int size = this.f11982d.size();
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            RecyclerView recyclerView = this.f11982d.get(i8);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f11559A0.c(recyclerView, false);
                i7 += recyclerView.f11559A0.f11989d;
            }
        }
        this.f11985v.ensureCapacity(i7);
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            RecyclerView recyclerView2 = this.f11982d.get(i10);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.f11559A0;
                int iAbs = Math.abs(bVar.f11986a) + Math.abs(bVar.f11987b);
                for (int i11 = 0; i11 < bVar.f11989d * 2; i11 += 2) {
                    if (i9 >= this.f11985v.size()) {
                        cVar = new c();
                        this.f11985v.add(cVar);
                    } else {
                        cVar = this.f11985v.get(i9);
                    }
                    int[] iArr = bVar.f11988c;
                    int i12 = iArr[i11 + 1];
                    cVar.f11990a = i12 <= iAbs;
                    cVar.f11991b = iAbs;
                    cVar.f11992c = i12;
                    cVar.f11993d = recyclerView2;
                    cVar.f11994e = iArr[i11];
                    i9++;
                }
            }
        }
        Collections.sort(this.f11985v, f11981y);
    }

    private void c(c cVar, long j7) {
        RecyclerView.D dI = i(cVar.f11993d, cVar.f11994e, cVar.f11990a ? Long.MAX_VALUE : j7);
        if (dI == null || dI.f11659b == null || !dI.u() || dI.v()) {
            return;
        }
        h(dI.f11659b.get(), j7);
    }

    private void d(long j7) {
        for (int i7 = 0; i7 < this.f11985v.size(); i7++) {
            c cVar = this.f11985v.get(i7);
            if (cVar.f11993d == null) {
                return;
            }
            c(cVar, j7);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i7) {
        int iJ = recyclerView.f11626w.j();
        for (int i8 = 0; i8 < iJ; i8++) {
            RecyclerView.D dE0 = RecyclerView.e0(recyclerView.f11626w.i(i8));
            if (dE0.f11660c == i7 && !dE0.v()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j7) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f11600a0 && recyclerView.f11626w.j() != 0) {
            recyclerView.U0();
        }
        b bVar = recyclerView.f11559A0;
        bVar.c(recyclerView, true);
        if (bVar.f11989d != 0) {
            try {
                u0.m.a("RV Nested Prefetch");
                recyclerView.f11561B0.f(recyclerView.f11566E);
                for (int i7 = 0; i7 < bVar.f11989d * 2; i7 += 2) {
                    i(recyclerView, bVar.f11988c[i7], j7);
                }
            } finally {
                u0.m.b();
            }
        }
    }

    private RecyclerView.D i(RecyclerView recyclerView, int i7, long j7) {
        if (e(recyclerView, i7)) {
            return null;
        }
        RecyclerView.w wVar = recyclerView.f11605e;
        try {
            recyclerView.G0();
            RecyclerView.D dI = wVar.I(i7, false, j7);
            if (dI != null) {
                if (!dI.u() || dI.v()) {
                    wVar.a(dI, false);
                } else {
                    wVar.B(dI.f11658a);
                }
            }
            recyclerView.I0(false);
            return dI;
        } catch (Throwable th) {
            recyclerView.I0(false);
            throw th;
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f11982d.add(recyclerView);
    }

    void f(RecyclerView recyclerView, int i7, int i8) {
        if (recyclerView.isAttachedToWindow() && this.f11983e == 0) {
            this.f11983e = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f11559A0.e(i7, i8);
    }

    void g(long j7) {
        b();
        d(j7);
    }

    public void j(RecyclerView recyclerView) {
        this.f11982d.remove(recyclerView);
    }

    @Override
    public void run() {
        try {
            u0.m.a("RV Prefetch");
            if (!this.f11982d.isEmpty()) {
                int size = this.f11982d.size();
                long jMax = 0;
                for (int i7 = 0; i7 < size; i7++) {
                    RecyclerView recyclerView = this.f11982d.get(i7);
                    if (recyclerView.getWindowVisibility() == 0) {
                        jMax = Math.max(recyclerView.getDrawingTime(), jMax);
                    }
                }
                if (jMax != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(jMax) + this.f11984i);
                    this.f11983e = 0L;
                    u0.m.b();
                }
            }
        } finally {
            this.f11983e = 0L;
            u0.m.b();
        }
    }
}
