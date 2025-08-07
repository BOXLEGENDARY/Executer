package P1;

import android.graphics.Rect;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class d {
    private Map<String, List<X1.e>> c;
    private Map<String, f> d;
    private Map<String, U1.c> e;
    private List<U1.h> f;
    private g0.l<U1.d> g;
    private g0.h<X1.e> h;
    private List<X1.e> i;
    private Rect j;
    private float k;
    private float l;
    private float m;
    private boolean n;
    private final l a = new l();
    private final HashSet<String> b = new HashSet<>();
    private int o = 0;

    public void a(String str) {
        b2.d.c(str);
        this.b.add(str);
    }

    public Rect b() {
        return this.j;
    }

    public g0.l<U1.d> c() {
        return this.g;
    }

    public float d() {
        return (long) ((e() / this.m) * 1000.0f);
    }

    public float e() {
        return this.l - this.k;
    }

    public float f() {
        return this.l;
    }

    public Map<String, U1.c> g() {
        return this.e;
    }

    public float h(float f) {
        return b2.g.k(this.k, this.l, f);
    }

    public float i() {
        return this.m;
    }

    public Map<String, f> j() {
        return this.d;
    }

    public List<X1.e> k() {
        return this.i;
    }

    public U1.h l(String str) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            U1.h hVar = this.f.get(i);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.o;
    }

    public l n() {
        return this.a;
    }

    public List<X1.e> o(String str) {
        return this.c.get(str);
    }

    public float p() {
        return this.k;
    }

    public boolean q() {
        return this.n;
    }

    public void r(int i) {
        this.o += i;
    }

    public void s(Rect rect, float f, float f2, float f3, List<X1.e> list, g0.h<X1.e> hVar, Map<String, List<X1.e>> map, Map<String, f> map2, g0.l<U1.d> lVar, Map<String, U1.c> map3, List<U1.h> list2) {
        this.j = rect;
        this.k = f;
        this.l = f2;
        this.m = f3;
        this.i = list;
        this.h = hVar;
        this.c = map;
        this.d = map2;
        this.g = lVar;
        this.e = map3;
        this.f = list2;
    }

    public X1.e t(long j) {
        return (X1.e) this.h.d(j);
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("LottieComposition:\n");
        Iterator<X1.e> it = this.i.iterator();
        while (it.hasNext()) {
            sb.append(it.next().y("\t"));
        }
        return sb.toString();
    }

    public void u(boolean z) {
        this.n = z;
    }

    public void v(boolean z) {
        this.a.b(z);
    }
}
