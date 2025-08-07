package l0;

import java.util.ArrayList;
import k0.C2509c;

public class m extends e {

    public ArrayList<e> f21755D0 = new ArrayList<>();

    public void a(e eVar) {
        this.f21755D0.add(eVar);
        if (eVar.K() != null) {
            ((m) eVar.K()).f1(eVar);
        }
        eVar.P0(this);
    }

    public ArrayList<e> d1() {
        return this.f21755D0;
    }

    public void e1() {
        ArrayList<e> arrayList = this.f21755D0;
        if (arrayList == null) {
            return;
        }
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            e eVar = this.f21755D0.get(i7);
            if (eVar instanceof m) {
                ((m) eVar).e1();
            }
        }
    }

    public void f1(e eVar) {
        this.f21755D0.remove(eVar);
        eVar.j0();
    }

    public void g1() {
        this.f21755D0.clear();
    }

    @Override
    public void j0() {
        this.f21755D0.clear();
        super.j0();
    }

    @Override
    public void m0(C2509c c2509c) {
        super.m0(c2509c);
        int size = this.f21755D0.size();
        for (int i7 = 0; i7 < size; i7++) {
            this.f21755D0.get(i7).m0(c2509c);
        }
    }
}
