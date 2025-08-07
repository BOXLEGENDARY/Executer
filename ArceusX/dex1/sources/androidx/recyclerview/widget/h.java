package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class h {

    private static final Comparator<d> f11915a = new a();

    class a implements Comparator<d> {
        a() {
        }

        @Override
        public int compare(d dVar, d dVar2) {
            return dVar.f11918a - dVar2.f11918a;
        }
    }

    public static abstract class b {
        public abstract boolean a(int i7, int i8);

        public abstract boolean b(int i7, int i8);

        public Object c(int i7, int i8) {
            return null;
        }

        public abstract int d();

        public abstract int e();
    }

    static class c {

        private final int[] f11916a;

        private final int f11917b;

        c(int i7) {
            int[] iArr = new int[i7];
            this.f11916a = iArr;
            this.f11917b = iArr.length / 2;
        }

        int[] a() {
            return this.f11916a;
        }

        int b(int i7) {
            return this.f11916a[i7 + this.f11917b];
        }

        void c(int i7, int i8) {
            this.f11916a[i7 + this.f11917b] = i8;
        }
    }

    static class d {

        public final int f11918a;

        public final int f11919b;

        public final int f11920c;

        d(int i7, int i8, int i9) {
            this.f11918a = i7;
            this.f11919b = i8;
            this.f11920c = i9;
        }

        int a() {
            return this.f11918a + this.f11920c;
        }

        int b() {
            return this.f11919b + this.f11920c;
        }
    }

    public static class e {

        private final List<d> f11921a;

        private final int[] f11922b;

        private final int[] f11923c;

        private final b f11924d;

        private final int f11925e;

        private final int f11926f;

        private final boolean f11927g;

        e(b bVar, List<d> list, int[] iArr, int[] iArr2, boolean z7) {
            this.f11921a = list;
            this.f11922b = iArr;
            this.f11923c = iArr2;
            Arrays.fill(iArr, 0);
            Arrays.fill(iArr2, 0);
            this.f11924d = bVar;
            this.f11925e = bVar.e();
            this.f11926f = bVar.d();
            this.f11927g = z7;
            a();
            e();
        }

        private void a() {
            d dVar = this.f11921a.isEmpty() ? null : this.f11921a.get(0);
            if (dVar == null || dVar.f11918a != 0 || dVar.f11919b != 0) {
                this.f11921a.add(0, new d(0, 0, 0));
            }
            this.f11921a.add(new d(this.f11925e, this.f11926f, 0));
        }

        private void d(int i7) {
            int size = this.f11921a.size();
            int iB = 0;
            for (int i8 = 0; i8 < size; i8++) {
                d dVar = this.f11921a.get(i8);
                while (iB < dVar.f11919b) {
                    if (this.f11923c[iB] == 0 && this.f11924d.b(i7, iB)) {
                        int i9 = this.f11924d.a(i7, iB) ? 8 : 4;
                        this.f11922b[i7] = (iB << 4) | i9;
                        this.f11923c[iB] = (i7 << 4) | i9;
                        return;
                    }
                    iB++;
                }
                iB = dVar.b();
            }
        }

        private void e() {
            for (d dVar : this.f11921a) {
                for (int i7 = 0; i7 < dVar.f11920c; i7++) {
                    int i8 = dVar.f11918a + i7;
                    int i9 = dVar.f11919b + i7;
                    int i10 = this.f11924d.a(i8, i9) ? 1 : 2;
                    this.f11922b[i8] = (i9 << 4) | i10;
                    this.f11923c[i9] = (i8 << 4) | i10;
                }
            }
            if (this.f11927g) {
                f();
            }
        }

        private void f() {
            int iA = 0;
            for (d dVar : this.f11921a) {
                while (iA < dVar.f11918a) {
                    if (this.f11922b[iA] == 0) {
                        d(iA);
                    }
                    iA++;
                }
                iA = dVar.a();
            }
        }

        private static g g(Collection<g> collection, int i7, boolean z7) {
            g next;
            Iterator<g> it = collection.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (next.f11928a == i7 && next.f11930c == z7) {
                    it.remove();
                    break;
                }
            }
            while (it.hasNext()) {
                g next2 = it.next();
                if (z7) {
                    next2.f11929b--;
                } else {
                    next2.f11929b++;
                }
            }
            return next;
        }

        public void b(n nVar) {
            int i7;
            androidx.recyclerview.widget.e eVar = nVar instanceof androidx.recyclerview.widget.e ? (androidx.recyclerview.widget.e) nVar : new androidx.recyclerview.widget.e(nVar);
            int i8 = this.f11925e;
            ArrayDeque arrayDeque = new ArrayDeque();
            int i9 = this.f11925e;
            int i10 = this.f11926f;
            for (int size = this.f11921a.size() - 1; size >= 0; size--) {
                d dVar = this.f11921a.get(size);
                int iA = dVar.a();
                int iB = dVar.b();
                while (true) {
                    if (i9 <= iA) {
                        break;
                    }
                    i9--;
                    int i11 = this.f11922b[i9];
                    if ((i11 & 12) != 0) {
                        int i12 = i11 >> 4;
                        g gVarG = g(arrayDeque, i12, false);
                        if (gVarG != null) {
                            int i13 = (i8 - gVarG.f11929b) - 1;
                            eVar.a(i9, i13);
                            if ((i11 & 4) != 0) {
                                eVar.d(i13, 1, this.f11924d.c(i9, i12));
                            }
                        } else {
                            arrayDeque.add(new g(i9, (i8 - i9) - 1, true));
                        }
                    } else {
                        eVar.c(i9, 1);
                        i8--;
                    }
                }
                while (i10 > iB) {
                    i10--;
                    int i14 = this.f11923c[i10];
                    if ((i14 & 12) != 0) {
                        int i15 = i14 >> 4;
                        g gVarG2 = g(arrayDeque, i15, true);
                        if (gVarG2 == null) {
                            arrayDeque.add(new g(i10, i8 - i9, false));
                        } else {
                            eVar.a((i8 - gVarG2.f11929b) - 1, i9);
                            if ((i14 & 4) != 0) {
                                eVar.d(i9, 1, this.f11924d.c(i15, i10));
                            }
                        }
                    } else {
                        eVar.b(i9, 1);
                        i8++;
                    }
                }
                int i16 = dVar.f11918a;
                int i17 = dVar.f11919b;
                for (i7 = 0; i7 < dVar.f11920c; i7++) {
                    if ((this.f11922b[i16] & 15) == 2) {
                        eVar.d(i16, 1, this.f11924d.c(i16, i17));
                    }
                    i16++;
                    i17++;
                }
                i9 = dVar.f11918a;
                i10 = dVar.f11919b;
            }
            eVar.e();
        }

        public void c(RecyclerView.h hVar) {
            b(new androidx.recyclerview.widget.b(hVar));
        }
    }

    public static abstract class f<T> {
        public abstract boolean a(T t7, T t8);

        public abstract boolean b(T t7, T t8);

        public Object c(T t7, T t8) {
            return null;
        }
    }

    private static class g {

        int f11928a;

        int f11929b;

        boolean f11930c;

        g(int i7, int i8, boolean z7) {
            this.f11928a = i7;
            this.f11929b = i8;
            this.f11930c = z7;
        }
    }

    static class C0113h {

        int f11931a;

        int f11932b;

        int f11933c;

        int f11934d;

        public C0113h() {
        }

        int a() {
            return this.f11934d - this.f11933c;
        }

        int b() {
            return this.f11932b - this.f11931a;
        }

        public C0113h(int i7, int i8, int i9, int i10) {
            this.f11931a = i7;
            this.f11932b = i8;
            this.f11933c = i9;
            this.f11934d = i10;
        }
    }

    static class i {

        public int f11935a;

        public int f11936b;

        public int f11937c;

        public int f11938d;

        public boolean f11939e;

        i() {
        }

        int a() {
            return Math.min(this.f11937c - this.f11935a, this.f11938d - this.f11936b);
        }

        boolean b() {
            return this.f11938d - this.f11936b != this.f11937c - this.f11935a;
        }

        boolean c() {
            return this.f11938d - this.f11936b > this.f11937c - this.f11935a;
        }

        d d() {
            if (b()) {
                return this.f11939e ? new d(this.f11935a, this.f11936b, a()) : c() ? new d(this.f11935a, this.f11936b + 1, a()) : new d(this.f11935a + 1, this.f11936b, a());
            }
            int i7 = this.f11935a;
            return new d(i7, this.f11936b, this.f11937c - i7);
        }
    }

    private static i a(C0113h c0113h, b bVar, c cVar, c cVar2, int i7) {
        int iB;
        int i8;
        int i9;
        boolean z7 = (c0113h.b() - c0113h.a()) % 2 == 0;
        int iB2 = c0113h.b() - c0113h.a();
        int i10 = -i7;
        for (int i11 = i10; i11 <= i7; i11 += 2) {
            if (i11 == i10 || (i11 != i7 && cVar2.b(i11 + 1) < cVar2.b(i11 - 1))) {
                iB = cVar2.b(i11 + 1);
                i8 = iB;
            } else {
                iB = cVar2.b(i11 - 1);
                i8 = iB - 1;
            }
            int i12 = c0113h.f11934d - ((c0113h.f11932b - i8) - i11);
            int i13 = (i7 == 0 || i8 != iB) ? i12 : i12 + 1;
            while (i8 > c0113h.f11931a && i12 > c0113h.f11933c && bVar.b(i8 - 1, i12 - 1)) {
                i8--;
                i12--;
            }
            cVar2.c(i11, i8);
            if (z7 && (i9 = iB2 - i11) >= i10 && i9 <= i7 && cVar.b(i9) >= i8) {
                i iVar = new i();
                iVar.f11935a = i8;
                iVar.f11936b = i12;
                iVar.f11937c = iB;
                iVar.f11938d = i13;
                iVar.f11939e = true;
                return iVar;
            }
        }
        return null;
    }

    public static e b(b bVar) {
        return c(bVar, true);
    }

    public static e c(b bVar, boolean z7) {
        int iE = bVar.e();
        int iD = bVar.d();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0113h(0, iE, 0, iD));
        int i7 = ((((iE + iD) + 1) / 2) * 2) + 1;
        c cVar = new c(i7);
        c cVar2 = new c(i7);
        ArrayList arrayList3 = new ArrayList();
        while (!arrayList2.isEmpty()) {
            C0113h c0113h = (C0113h) arrayList2.remove(arrayList2.size() - 1);
            i iVarE = e(c0113h, bVar, cVar, cVar2);
            if (iVarE != null) {
                if (iVarE.a() > 0) {
                    arrayList.add(iVarE.d());
                }
                C0113h c0113h2 = arrayList3.isEmpty() ? new C0113h() : (C0113h) arrayList3.remove(arrayList3.size() - 1);
                c0113h2.f11931a = c0113h.f11931a;
                c0113h2.f11933c = c0113h.f11933c;
                c0113h2.f11932b = iVarE.f11935a;
                c0113h2.f11934d = iVarE.f11936b;
                arrayList2.add(c0113h2);
                c0113h.f11932b = c0113h.f11932b;
                c0113h.f11934d = c0113h.f11934d;
                c0113h.f11931a = iVarE.f11937c;
                c0113h.f11933c = iVarE.f11938d;
                arrayList2.add(c0113h);
            } else {
                arrayList3.add(c0113h);
            }
        }
        Collections.sort(arrayList, f11915a);
        return new e(bVar, arrayList, cVar.a(), cVar2.a(), z7);
    }

    private static i d(C0113h c0113h, b bVar, c cVar, c cVar2, int i7) {
        int iB;
        int i8;
        int i9;
        boolean z7 = Math.abs(c0113h.b() - c0113h.a()) % 2 == 1;
        int iB2 = c0113h.b() - c0113h.a();
        int i10 = -i7;
        for (int i11 = i10; i11 <= i7; i11 += 2) {
            if (i11 == i10 || (i11 != i7 && cVar.b(i11 + 1) > cVar.b(i11 - 1))) {
                iB = cVar.b(i11 + 1);
                i8 = iB;
            } else {
                iB = cVar.b(i11 - 1);
                i8 = iB + 1;
            }
            int i12 = (c0113h.f11933c + (i8 - c0113h.f11931a)) - i11;
            int i13 = (i7 == 0 || i8 != iB) ? i12 : i12 - 1;
            while (i8 < c0113h.f11932b && i12 < c0113h.f11934d && bVar.b(i8, i12)) {
                i8++;
                i12++;
            }
            cVar.c(i11, i8);
            if (z7 && (i9 = iB2 - i11) >= i10 + 1 && i9 <= i7 - 1 && cVar2.b(i9) <= i8) {
                i iVar = new i();
                iVar.f11935a = iB;
                iVar.f11936b = i13;
                iVar.f11937c = i8;
                iVar.f11938d = i12;
                iVar.f11939e = false;
                return iVar;
            }
        }
        return null;
    }

    private static i e(C0113h c0113h, b bVar, c cVar, c cVar2) {
        if (c0113h.b() >= 1 && c0113h.a() >= 1) {
            int iB = ((c0113h.b() + c0113h.a()) + 1) / 2;
            cVar.c(1, c0113h.f11931a);
            cVar2.c(1, c0113h.f11932b);
            for (int i7 = 0; i7 < iB; i7++) {
                i iVarD = d(c0113h, bVar, cVar, cVar2, i7);
                if (iVarD != null) {
                    return iVarD;
                }
                i iVarA = a(c0113h, bVar, cVar, cVar2, i7);
                if (iVarA != null) {
                    return iVarA;
                }
            }
        }
        return null;
    }
}
