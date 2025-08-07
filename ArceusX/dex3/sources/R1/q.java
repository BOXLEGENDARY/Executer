package R1;

import S1.a;
import W1.r;
import android.graphics.Path;
import java.util.List;

public class q implements m, a.b {
    private final String b;
    private final boolean c;
    private final com.airbnb.lottie.a d;
    private final S1.a<?, Path> e;
    private boolean f;
    private final Path a = new Path();
    private final b g = new b();

    public q(com.airbnb.lottie.a aVar, X1.b bVar, W1.p pVar) {
        this.b = pVar.b();
        this.c = pVar.d();
        this.d = aVar;
        S1.a<W1.m, Path> aVarA = pVar.c().a();
        this.e = aVarA;
        bVar.h(aVarA);
        aVarA.a(this);
    }

    private void d() {
        this.f = false;
        this.d.invalidateSelf();
    }

    @Override
    public void a() {
        d();
    }

    @Override
    public void b(List<c> list, List<c> list2) {
        for (int i = 0; i < list.size(); i++) {
            c cVar = list.get(i);
            if (cVar instanceof s) {
                s sVar = (s) cVar;
                if (sVar.i() == r.a.SIMULTANEOUSLY) {
                    this.g.a(sVar);
                    sVar.d(this);
                }
            }
        }
    }

    @Override
    public Path getPath() {
        if (this.f) {
            return this.a;
        }
        this.a.reset();
        if (this.c) {
            this.f = true;
            return this.a;
        }
        Path pathH = this.e.h();
        if (pathH == null) {
            return this.a;
        }
        this.a.set(pathH);
        this.a.setFillType(Path.FillType.EVEN_ODD);
        this.g.b(this.a);
        this.f = true;
        return this.a;
    }
}
