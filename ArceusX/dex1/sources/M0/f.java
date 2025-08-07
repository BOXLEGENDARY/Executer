package m0;

import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class f implements d {

    p f21921d;

    int f21923f;

    public int f21924g;

    public d f21918a = null;

    public boolean f21919b = false;

    public boolean f21920c = false;

    a f21922e = a.UNKNOWN;

    int f21925h = 1;

    g f21926i = null;

    public boolean f21927j = false;

    List<d> f21928k = new ArrayList();

    List<f> f21929l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f21921d = pVar;
    }

    @Override
    public void a(d dVar) {
        Iterator<f> it = this.f21929l.iterator();
        while (it.hasNext()) {
            if (!it.next().f21927j) {
                return;
            }
        }
        this.f21920c = true;
        d dVar2 = this.f21918a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f21919b) {
            this.f21921d.a(this);
            return;
        }
        f fVar = null;
        int i7 = 0;
        for (f fVar2 : this.f21929l) {
            if (!(fVar2 instanceof g)) {
                i7++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i7 == 1 && fVar.f21927j) {
            g gVar = this.f21926i;
            if (gVar != null) {
                if (!gVar.f21927j) {
                    return;
                } else {
                    this.f21923f = this.f21925h * gVar.f21924g;
                }
            }
            d(fVar.f21924g + this.f21923f);
        }
        d dVar3 = this.f21918a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f21928k.add(dVar);
        if (this.f21927j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f21929l.clear();
        this.f21928k.clear();
        this.f21927j = false;
        this.f21924g = 0;
        this.f21920c = false;
        this.f21919b = false;
    }

    public void d(int i7) {
        if (this.f21927j) {
            return;
        }
        this.f21927j = true;
        this.f21924g = i7;
        for (d dVar : this.f21928k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f21921d.f21970b.t());
        sb.append(":");
        sb.append(this.f21922e);
        sb.append(jUbDmI.jesSawnWWMvzu);
        sb.append(this.f21927j ? Integer.valueOf(this.f21924g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f21929l.size());
        sb.append(":d=");
        sb.append(this.f21928k.size());
        sb.append(">");
        return sb.toString();
    }
}
