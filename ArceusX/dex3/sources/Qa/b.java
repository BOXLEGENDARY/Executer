package Qa;

import Sa.f;
import Sa.r;
import Sa.v;
import Sa.w;

public abstract class b implements Va.a {
    private final char a;

    protected b(char c) {
        this.a = c;
    }

    @Override
    public char a() {
        return this.a;
    }

    @Override
    public void b(w wVar, w wVar2, int i) {
        r vVar;
        String strValueOf = String.valueOf(e());
        if (i == 1) {
            vVar = new f(strValueOf);
        } else {
            vVar = new v(strValueOf + strValueOf);
        }
        r rVarE = wVar.e();
        while (rVarE != null && rVarE != wVar2) {
            r rVarE2 = rVarE.e();
            vVar.b(rVarE);
            rVarE = rVarE2;
        }
        wVar.h(vVar);
    }

    @Override
    public int c(Va.b bVar, Va.b bVar2) {
        if ((bVar.c() || bVar2.b()) && bVar2.a() % 3 != 0 && (bVar.a() + bVar2.a()) % 3 == 0) {
            return 0;
        }
        return (bVar.length() < 2 || bVar2.length() < 2) ? 1 : 2;
    }

    @Override
    public int d() {
        return 1;
    }

    @Override
    public char e() {
        return this.a;
    }
}
