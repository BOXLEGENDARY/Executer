package m0;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import k0.C2510d;

public class o {

    static int f21954g;

    int f21956b;

    int f21958d;

    ArrayList<l0.e> f21955a = new ArrayList<>();

    boolean f21957c = false;

    ArrayList<a> f21959e = null;

    private int f21960f = -1;

    class a {

        WeakReference<l0.e> f21961a;

        int f21962b;

        int f21963c;

        int f21964d;

        int f21965e;

        int f21966f;

        int f21967g;

        public a(l0.e eVar, C2510d c2510d, int i7) {
            this.f21961a = new WeakReference<>(eVar);
            this.f21962b = c2510d.y(eVar.f21595H);
            this.f21963c = c2510d.y(eVar.f21596I);
            this.f21964d = c2510d.y(eVar.f21597J);
            this.f21965e = c2510d.y(eVar.f21598K);
            this.f21966f = c2510d.y(eVar.f21599L);
            this.f21967g = i7;
        }
    }

    public o(int i7) {
        int i8 = f21954g;
        f21954g = i8 + 1;
        this.f21956b = i8;
        this.f21958d = i7;
    }

    private String e() {
        int i7 = this.f21958d;
        return i7 == 0 ? "Horizontal" : i7 == 1 ? "Vertical" : i7 == 2 ? "Both" : "Unknown";
    }

    private int j(C2510d c2510d, ArrayList<l0.e> arrayList, int i7) {
        int iY;
        int iY2;
        l0.f fVar = (l0.f) arrayList.get(0).K();
        c2510d.E();
        fVar.g(c2510d, false);
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            arrayList.get(i8).g(c2510d, false);
        }
        if (i7 == 0 && fVar.f21682N0 > 0) {
            l0.b.b(fVar, c2510d, arrayList, 0);
        }
        if (i7 == 1 && fVar.f21683O0 > 0) {
            l0.b.b(fVar, c2510d, arrayList, 1);
        }
        try {
            c2510d.A();
        } catch (Exception e7) {
            e7.printStackTrace();
        }
        this.f21959e = new ArrayList<>();
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            this.f21959e.add(new a(arrayList.get(i9), c2510d, i7));
        }
        if (i7 == 0) {
            iY = c2510d.y(fVar.f21595H);
            iY2 = c2510d.y(fVar.f21597J);
            c2510d.E();
        } else {
            iY = c2510d.y(fVar.f21596I);
            iY2 = c2510d.y(fVar.f21598K);
            c2510d.E();
        }
        return iY2 - iY;
    }

    public boolean a(l0.e eVar) {
        if (this.f21955a.contains(eVar)) {
            return false;
        }
        this.f21955a.add(eVar);
        return true;
    }

    public void b(ArrayList<o> arrayList) {
        int size = this.f21955a.size();
        if (this.f21960f != -1 && size > 0) {
            for (int i7 = 0; i7 < arrayList.size(); i7++) {
                o oVar = arrayList.get(i7);
                if (this.f21960f == oVar.f21956b) {
                    g(this.f21958d, oVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c() {
        return this.f21956b;
    }

    public int d() {
        return this.f21958d;
    }

    public int f(C2510d c2510d, int i7) {
        if (this.f21955a.size() == 0) {
            return 0;
        }
        return j(c2510d, this.f21955a, i7);
    }

    public void g(int i7, o oVar) {
        Iterator<l0.e> it = this.f21955a.iterator();
        while (it.hasNext()) {
            l0.e next = it.next();
            oVar.a(next);
            if (i7 == 0) {
                next.f21587A0 = oVar.c();
            } else {
                next.f21589B0 = oVar.c();
            }
        }
        this.f21960f = oVar.f21956b;
    }

    public void h(boolean z7) {
        this.f21957c = z7;
    }

    public void i(int i7) {
        this.f21958d = i7;
    }

    public String toString() {
        String str = e() + " [" + this.f21956b + "] <";
        Iterator<l0.e> it = this.f21955a.iterator();
        while (it.hasNext()) {
            str = str + " " + it.next().t();
        }
        return str + " >";
    }
}
