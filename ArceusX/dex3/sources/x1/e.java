package X1;

import V1.j;
import V1.k;
import V1.l;
import Z1.C0438j;
import java.util.List;
import java.util.Locale;

public class e {
    private final List<W1.c> a;
    private final P1.d b;
    private final String c;
    private final long d;
    private final a e;
    private final long f;
    private final String g;
    private final List<W1.h> h;
    private final l i;
    private final int j;
    private final int k;
    private final int l;
    private final float m;
    private final float n;
    private final int o;
    private final int p;
    private final j q;
    private final k r;
    private final V1.b s;
    private final List<c2.a<Float>> t;
    private final b u;
    private final boolean v;
    private final W1.a w;
    private final C0438j x;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<W1.c> list, P1.d dVar, String str, long j, a aVar, long j2, String str2, List<W1.h> list2, l lVar, int i, int i2, int i3, float f, float f2, int i4, int i5, j jVar, k kVar, List<c2.a<Float>> list3, b bVar, V1.b bVar2, boolean z, W1.a aVar2, C0438j c0438j) {
        this.a = list;
        this.b = dVar;
        this.c = str;
        this.d = j;
        this.e = aVar;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = lVar;
        this.j = i;
        this.k = i2;
        this.l = i3;
        this.m = f;
        this.n = f2;
        this.o = i4;
        this.p = i5;
        this.q = jVar;
        this.r = kVar;
        this.t = list3;
        this.u = bVar;
        this.s = bVar2;
        this.v = z;
        this.w = aVar2;
        this.x = c0438j;
    }

    public W1.a a() {
        return this.w;
    }

    P1.d b() {
        return this.b;
    }

    public C0438j c() {
        return this.x;
    }

    public long d() {
        return this.d;
    }

    List<c2.a<Float>> e() {
        return this.t;
    }

    public a f() {
        return this.e;
    }

    List<W1.h> g() {
        return this.h;
    }

    b h() {
        return this.u;
    }

    String i() {
        return this.c;
    }

    long j() {
        return this.f;
    }

    int k() {
        return this.p;
    }

    int l() {
        return this.o;
    }

    String m() {
        return this.g;
    }

    List<W1.c> n() {
        return this.a;
    }

    int o() {
        return this.l;
    }

    int p() {
        return this.k;
    }

    int q() {
        return this.j;
    }

    float r() {
        return this.n / this.b.e();
    }

    j s() {
        return this.q;
    }

    k t() {
        return this.r;
    }

    public String toString() {
        return y("");
    }

    V1.b u() {
        return this.s;
    }

    float v() {
        return this.m;
    }

    l w() {
        return this.i;
    }

    public boolean x() {
        return this.v;
    }

    public String y(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(i());
        sb.append("\n");
        e eVarT = this.b.t(j());
        if (eVarT != null) {
            sb.append("\t\tParents: ");
            sb.append(eVarT.i());
            e eVarT2 = this.b.t(eVarT.j());
            while (eVarT2 != null) {
                sb.append("->");
                sb.append(eVarT2.i());
                eVarT2 = this.b.t(eVarT2.j());
            }
            sb.append(str);
            sb.append("\n");
        }
        if (!g().isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(g().size());
            sb.append("\n");
        }
        if (q() != 0 && p() != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(q()), Integer.valueOf(p()), Integer.valueOf(o())));
        }
        if (!this.a.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (W1.c cVar : this.a) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(cVar);
                sb.append("\n");
            }
        }
        return sb.toString();
    }
}
