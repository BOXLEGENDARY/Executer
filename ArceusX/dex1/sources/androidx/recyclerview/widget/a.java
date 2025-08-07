package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.o;
import j0.tkB.pkcpMQSgx;
import java.util.ArrayList;
import java.util.List;

final class a implements o.a {

    private x0.d<b> f11816a;

    final ArrayList<b> f11817b;

    final ArrayList<b> f11818c;

    final InterfaceC0110a f11819d;

    Runnable f11820e;

    final boolean f11821f;

    final o f11822g;

    private int f11823h;

    interface InterfaceC0110a {
        void a(int i7, int i8);

        void b(b bVar);

        void c(int i7, int i8, Object obj);

        void d(b bVar);

        RecyclerView.D e(int i7);

        void f(int i7, int i8);

        void g(int i7, int i8);

        void h(int i7, int i8);
    }

    static final class b {

        int f11824a;

        int f11825b;

        Object f11826c;

        int f11827d;

        b(int i7, int i8, int i9, Object obj) {
            this.f11824a = i7;
            this.f11825b = i8;
            this.f11827d = i9;
            this.f11826c = obj;
        }

        String a() {
            int i7 = this.f11824a;
            return i7 != 1 ? i7 != 2 ? i7 != 4 ? i7 != 8 ? "??" : "mv" : pkcpMQSgx.wEaBKuYjVkaeAJJ : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            int i7 = this.f11824a;
            if (i7 != bVar.f11824a) {
                return false;
            }
            if (i7 == 8 && Math.abs(this.f11827d - this.f11825b) == 1 && this.f11827d == bVar.f11825b && this.f11825b == bVar.f11827d) {
                return true;
            }
            if (this.f11827d != bVar.f11827d || this.f11825b != bVar.f11825b) {
                return false;
            }
            Object obj2 = this.f11826c;
            if (obj2 != null) {
                if (!obj2.equals(bVar.f11826c)) {
                    return false;
                }
            } else if (bVar.f11826c != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f11824a * 31) + this.f11825b) * 31) + this.f11827d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f11825b + "c:" + this.f11827d + ",p:" + this.f11826c + "]";
        }
    }

    a(InterfaceC0110a interfaceC0110a) {
        this(interfaceC0110a, false);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        boolean z7;
        char c2;
        int i7 = bVar.f11825b;
        int i8 = bVar.f11827d + i7;
        char c3 = 65535;
        int i9 = i7;
        int i10 = 0;
        while (i9 < i8) {
            if (this.f11819d.e(i9) != null || h(i9)) {
                if (c3 == 0) {
                    k(b(2, i7, i10, null));
                    z7 = true;
                } else {
                    z7 = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    v(b(2, i7, i10, null));
                    z7 = true;
                } else {
                    z7 = false;
                }
                c2 = 0;
            }
            if (z7) {
                i9 -= i10;
                i8 -= i10;
                i10 = 1;
            } else {
                i10++;
            }
            i9++;
            c3 = c2;
        }
        if (i10 != bVar.f11827d) {
            a(bVar);
            bVar = b(2, i7, i10, null);
        }
        if (c3 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i7 = bVar.f11825b;
        int i8 = bVar.f11827d + i7;
        int i9 = 0;
        boolean z7 = -1;
        int i10 = i7;
        while (i7 < i8) {
            if (this.f11819d.e(i7) != null || h(i7)) {
                if (!z7) {
                    k(b(4, i10, i9, bVar.f11826c));
                    i10 = i7;
                    i9 = 0;
                }
                z7 = true;
            } else {
                if (z7) {
                    v(b(4, i10, i9, bVar.f11826c));
                    i10 = i7;
                    i9 = 0;
                }
                z7 = false;
            }
            i9++;
            i7++;
        }
        if (i9 != bVar.f11827d) {
            Object obj = bVar.f11826c;
            a(bVar);
            bVar = b(4, i10, i9, obj);
        }
        if (z7) {
            v(bVar);
        } else {
            k(bVar);
        }
    }

    private boolean h(int i7) {
        int size = this.f11818c.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = this.f11818c.get(i8);
            int i9 = bVar.f11824a;
            if (i9 == 8) {
                if (n(bVar.f11827d, i8 + 1) == i7) {
                    return true;
                }
            } else if (i9 == 1) {
                int i10 = bVar.f11825b;
                int i11 = bVar.f11827d + i10;
                while (i10 < i11) {
                    if (n(i10, i8 + 1) == i7) {
                        return true;
                    }
                    i10++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i7;
        int i8 = bVar.f11824a;
        if (i8 == 1 || i8 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iZ = z(bVar.f11825b, i8);
        int i9 = bVar.f11825b;
        int i10 = bVar.f11824a;
        if (i10 == 2) {
            i7 = 0;
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i7 = 1;
        }
        int i11 = 1;
        for (int i12 = 1; i12 < bVar.f11827d; i12++) {
            int iZ2 = z(bVar.f11825b + (i7 * i12), bVar.f11824a);
            int i13 = bVar.f11824a;
            if (i13 == 2 ? iZ2 != iZ : !(i13 == 4 && iZ2 == iZ + 1)) {
                b bVarB = b(i13, iZ, i11, bVar.f11826c);
                l(bVarB, i9);
                a(bVarB);
                if (bVar.f11824a == 4) {
                    i9 += i11;
                }
                i11 = 1;
                iZ = iZ2;
            } else {
                i11++;
            }
        }
        Object obj = bVar.f11826c;
        a(bVar);
        if (i11 > 0) {
            b bVarB2 = b(bVar.f11824a, iZ, i11, obj);
            l(bVarB2, i9);
            a(bVarB2);
        }
    }

    private void v(b bVar) {
        this.f11818c.add(bVar);
        int i7 = bVar.f11824a;
        if (i7 == 1) {
            this.f11819d.g(bVar.f11825b, bVar.f11827d);
            return;
        }
        if (i7 == 2) {
            this.f11819d.f(bVar.f11825b, bVar.f11827d);
            return;
        }
        if (i7 == 4) {
            this.f11819d.c(bVar.f11825b, bVar.f11827d, bVar.f11826c);
        } else {
            if (i7 == 8) {
                this.f11819d.a(bVar.f11825b, bVar.f11827d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i7, int i8) {
        int i9;
        int i10;
        for (int size = this.f11818c.size() - 1; size >= 0; size--) {
            b bVar = this.f11818c.get(size);
            int i11 = bVar.f11824a;
            if (i11 == 8) {
                int i12 = bVar.f11825b;
                int i13 = bVar.f11827d;
                if (i12 < i13) {
                    i10 = i12;
                    i9 = i13;
                } else {
                    i9 = i12;
                    i10 = i13;
                }
                if (i7 < i10 || i7 > i9) {
                    if (i7 < i12) {
                        if (i8 == 1) {
                            bVar.f11825b = i12 + 1;
                            bVar.f11827d = i13 + 1;
                        } else if (i8 == 2) {
                            bVar.f11825b = i12 - 1;
                            bVar.f11827d = i13 - 1;
                        }
                    }
                } else if (i10 == i12) {
                    if (i8 == 1) {
                        bVar.f11827d = i13 + 1;
                    } else if (i8 == 2) {
                        bVar.f11827d = i13 - 1;
                    }
                    i7++;
                } else {
                    if (i8 == 1) {
                        bVar.f11825b = i12 + 1;
                    } else if (i8 == 2) {
                        bVar.f11825b = i12 - 1;
                    }
                    i7--;
                }
            } else {
                int i14 = bVar.f11825b;
                if (i14 <= i7) {
                    if (i11 == 1) {
                        i7 -= bVar.f11827d;
                    } else if (i11 == 2) {
                        i7 += bVar.f11827d;
                    }
                } else if (i8 == 1) {
                    bVar.f11825b = i14 + 1;
                } else if (i8 == 2) {
                    bVar.f11825b = i14 - 1;
                }
            }
        }
        for (int size2 = this.f11818c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f11818c.get(size2);
            if (bVar2.f11824a == 8) {
                int i15 = bVar2.f11827d;
                if (i15 == bVar2.f11825b || i15 < 0) {
                    this.f11818c.remove(size2);
                    a(bVar2);
                }
            } else if (bVar2.f11827d <= 0) {
                this.f11818c.remove(size2);
                a(bVar2);
            }
        }
        return i7;
    }

    @Override
    public void a(b bVar) {
        if (this.f11821f) {
            return;
        }
        bVar.f11826c = null;
        this.f11816a.a(bVar);
    }

    @Override
    public b b(int i7, int i8, int i9, Object obj) {
        b bVarB = this.f11816a.b();
        if (bVarB == null) {
            return new b(i7, i8, i9, obj);
        }
        bVarB.f11824a = i7;
        bVarB.f11825b = i8;
        bVarB.f11827d = i9;
        bVarB.f11826c = obj;
        return bVarB;
    }

    public int e(int i7) {
        int size = this.f11817b.size();
        for (int i8 = 0; i8 < size; i8++) {
            b bVar = this.f11817b.get(i8);
            int i9 = bVar.f11824a;
            if (i9 != 1) {
                if (i9 == 2) {
                    int i10 = bVar.f11825b;
                    if (i10 <= i7) {
                        int i11 = bVar.f11827d;
                        if (i10 + i11 > i7) {
                            return -1;
                        }
                        i7 -= i11;
                    } else {
                        continue;
                    }
                } else if (i9 == 8) {
                    int i12 = bVar.f11825b;
                    if (i12 == i7) {
                        i7 = bVar.f11827d;
                    } else {
                        if (i12 < i7) {
                            i7--;
                        }
                        if (bVar.f11827d <= i7) {
                            i7++;
                        }
                    }
                }
            } else if (bVar.f11825b <= i7) {
                i7 += bVar.f11827d;
            }
        }
        return i7;
    }

    void i() {
        int size = this.f11818c.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f11819d.d(this.f11818c.get(i7));
        }
        x(this.f11818c);
        this.f11823h = 0;
    }

    void j() {
        i();
        int size = this.f11817b.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = this.f11817b.get(i7);
            int i8 = bVar.f11824a;
            if (i8 == 1) {
                this.f11819d.d(bVar);
                this.f11819d.g(bVar.f11825b, bVar.f11827d);
            } else if (i8 == 2) {
                this.f11819d.d(bVar);
                this.f11819d.h(bVar.f11825b, bVar.f11827d);
            } else if (i8 == 4) {
                this.f11819d.d(bVar);
                this.f11819d.c(bVar.f11825b, bVar.f11827d, bVar.f11826c);
            } else if (i8 == 8) {
                this.f11819d.d(bVar);
                this.f11819d.a(bVar.f11825b, bVar.f11827d);
            }
            Runnable runnable = this.f11820e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f11817b);
        this.f11823h = 0;
    }

    void l(b bVar, int i7) {
        this.f11819d.b(bVar);
        int i8 = bVar.f11824a;
        if (i8 == 2) {
            this.f11819d.h(i7, bVar.f11827d);
        } else {
            if (i8 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f11819d.c(i7, bVar.f11827d, bVar.f11826c);
        }
    }

    int m(int i7) {
        return n(i7, 0);
    }

    int n(int i7, int i8) {
        int size = this.f11818c.size();
        while (i8 < size) {
            b bVar = this.f11818c.get(i8);
            int i9 = bVar.f11824a;
            if (i9 == 8) {
                int i10 = bVar.f11825b;
                if (i10 == i7) {
                    i7 = bVar.f11827d;
                } else {
                    if (i10 < i7) {
                        i7--;
                    }
                    if (bVar.f11827d <= i7) {
                        i7++;
                    }
                }
            } else {
                int i11 = bVar.f11825b;
                if (i11 > i7) {
                    continue;
                } else if (i9 == 2) {
                    int i12 = bVar.f11827d;
                    if (i7 < i11 + i12) {
                        return -1;
                    }
                    i7 -= i12;
                } else if (i9 == 1) {
                    i7 += bVar.f11827d;
                }
            }
            i8++;
        }
        return i7;
    }

    boolean o(int i7) {
        return (i7 & this.f11823h) != 0;
    }

    boolean p() {
        return this.f11817b.size() > 0;
    }

    boolean q() {
        return (this.f11818c.isEmpty() || this.f11817b.isEmpty()) ? false : true;
    }

    boolean r(int i7, int i8, Object obj) {
        if (i8 < 1) {
            return false;
        }
        this.f11817b.add(b(4, i7, i8, obj));
        this.f11823h |= 4;
        return this.f11817b.size() == 1;
    }

    boolean s(int i7, int i8) {
        if (i8 < 1) {
            return false;
        }
        this.f11817b.add(b(1, i7, i8, null));
        this.f11823h |= 1;
        return this.f11817b.size() == 1;
    }

    boolean t(int i7, int i8, int i9) {
        if (i7 == i8) {
            return false;
        }
        if (i9 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f11817b.add(b(8, i7, i8, null));
        this.f11823h |= 8;
        return this.f11817b.size() == 1;
    }

    boolean u(int i7, int i8) {
        if (i8 < 1) {
            return false;
        }
        this.f11817b.add(b(2, i7, i8, null));
        this.f11823h |= 2;
        return this.f11817b.size() == 1;
    }

    void w() {
        this.f11822g.b(this.f11817b);
        int size = this.f11817b.size();
        for (int i7 = 0; i7 < size; i7++) {
            b bVar = this.f11817b.get(i7);
            int i8 = bVar.f11824a;
            if (i8 == 1) {
                c(bVar);
            } else if (i8 == 2) {
                f(bVar);
            } else if (i8 == 4) {
                g(bVar);
            } else if (i8 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f11820e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f11817b.clear();
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            a(list.get(i7));
        }
        list.clear();
    }

    void y() {
        x(this.f11817b);
        x(this.f11818c);
        this.f11823h = 0;
    }

    a(InterfaceC0110a interfaceC0110a, boolean z7) {
        this.f11816a = new x0.e(30);
        this.f11817b = new ArrayList<>();
        this.f11818c = new ArrayList<>();
        this.f11823h = 0;
        this.f11819d = interfaceC0110a;
        this.f11821f = z7;
        this.f11822g = new o(this);
    }
}
