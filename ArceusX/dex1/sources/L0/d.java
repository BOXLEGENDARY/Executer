package l0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import k0.C2509c;
import k0.i;
import m0.o;

public class d {

    private int f21566b;

    private boolean f21567c;

    public final e f21568d;

    public final b f21569e;

    public d f21570f;

    k0.i f21573i;

    private HashSet<d> f21565a = null;

    public int f21571g = 0;

    int f21572h = -1;

    static class a {

        static final int[] f21574a;

        static {
            int[] iArr = new int[b.values().length];
            f21574a = iArr;
            try {
                iArr[b.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f21574a[b.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f21574a[b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f21574a[b.TOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f21574a[b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f21574a[b.BASELINE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f21574a[b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f21574a[b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f21574a[b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public enum b {
        NONE,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        BASELINE,
        CENTER,
        CENTER_X,
        CENTER_Y
    }

    public d(e eVar, b bVar) {
        this.f21568d = eVar;
        this.f21569e = bVar;
    }

    public boolean a(d dVar, int i7) {
        return b(dVar, i7, -1, false);
    }

    public boolean b(d dVar, int i7, int i8, boolean z7) {
        if (dVar == null) {
            q();
            return true;
        }
        if (!z7 && !p(dVar)) {
            return false;
        }
        this.f21570f = dVar;
        if (dVar.f21565a == null) {
            dVar.f21565a = new HashSet<>();
        }
        HashSet<d> hashSet = this.f21570f.f21565a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        if (i7 > 0) {
            this.f21571g = i7;
        } else {
            this.f21571g = 0;
        }
        this.f21572h = i8;
        return true;
    }

    public void c(int i7, ArrayList<o> arrayList, o oVar) {
        HashSet<d> hashSet = this.f21565a;
        if (hashSet != null) {
            Iterator<d> it = hashSet.iterator();
            while (it.hasNext()) {
                m0.i.a(it.next().f21568d, i7, arrayList, oVar);
            }
        }
    }

    public HashSet<d> d() {
        return this.f21565a;
    }

    public int e() {
        if (this.f21567c) {
            return this.f21566b;
        }
        return 0;
    }

    public int f() {
        d dVar;
        if (this.f21568d.S() == 8) {
            return 0;
        }
        return (this.f21572h <= -1 || (dVar = this.f21570f) == null || dVar.f21568d.S() != 8) ? this.f21571g : this.f21572h;
    }

    public final d g() {
        switch (a.f21574a[this.f21569e.ordinal()]) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
            case 2:
                return this.f21568d.f21597J;
            case 3:
                return this.f21568d.f21595H;
            case 4:
                return this.f21568d.f21598K;
            case 5:
                return this.f21568d.f21596I;
            default:
                throw new AssertionError(this.f21569e.name());
        }
    }

    public e h() {
        return this.f21568d;
    }

    public k0.i i() {
        return this.f21573i;
    }

    public d j() {
        return this.f21570f;
    }

    public b k() {
        return this.f21569e;
    }

    public boolean l() {
        HashSet<d> hashSet = this.f21565a;
        if (hashSet == null) {
            return false;
        }
        Iterator<d> it = hashSet.iterator();
        while (it.hasNext()) {
            if (it.next().g().o()) {
                return true;
            }
        }
        return false;
    }

    public boolean m() {
        HashSet<d> hashSet = this.f21565a;
        return hashSet != null && hashSet.size() > 0;
    }

    public boolean n() {
        return this.f21567c;
    }

    public boolean o() {
        return this.f21570f != null;
    }

    public boolean p(d dVar) {
        if (dVar == null) {
            return false;
        }
        b bVarK = dVar.k();
        b bVar = this.f21569e;
        if (bVarK == bVar) {
            return bVar != b.BASELINE || (dVar.h().W() && h().W());
        }
        switch (a.f21574a[bVar.ordinal()]) {
            case 1:
                return (bVarK == b.BASELINE || bVarK == b.CENTER_X || bVarK == b.CENTER_Y) ? false : true;
            case 2:
            case 3:
                boolean z7 = bVarK == b.LEFT || bVarK == b.RIGHT;
                if (dVar.h() instanceof h) {
                    return z7 || bVarK == b.CENTER_X;
                }
                return z7;
            case 4:
            case 5:
                boolean z8 = bVarK == b.TOP || bVarK == b.BOTTOM;
                if (dVar.h() instanceof h) {
                    return z8 || bVarK == b.CENTER_Y;
                }
                return z8;
            case 6:
            case 7:
            case 8:
            case 9:
                return false;
            default:
                throw new AssertionError(this.f21569e.name());
        }
    }

    public void q() {
        HashSet<d> hashSet;
        d dVar = this.f21570f;
        if (dVar != null && (hashSet = dVar.f21565a) != null) {
            hashSet.remove(this);
            if (this.f21570f.f21565a.size() == 0) {
                this.f21570f.f21565a = null;
            }
        }
        this.f21565a = null;
        this.f21570f = null;
        this.f21571g = 0;
        this.f21572h = -1;
        this.f21567c = false;
        this.f21566b = 0;
    }

    public void r() {
        this.f21567c = false;
        this.f21566b = 0;
    }

    public void s(C2509c c2509c) {
        k0.i iVar = this.f21573i;
        if (iVar == null) {
            this.f21573i = new k0.i(i.a.UNRESTRICTED, null);
        } else {
            iVar.d();
        }
    }

    public void t(int i7) {
        this.f21566b = i7;
        this.f21567c = true;
    }

    public String toString() {
        return this.f21568d.t() + ":" + this.f21569e.toString();
    }

    public void u(int i7) {
        if (o()) {
            this.f21572h = i7;
        }
    }
}
