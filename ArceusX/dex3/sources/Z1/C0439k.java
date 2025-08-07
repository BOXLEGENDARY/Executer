package Z1;

import a2.c;
import java.io.IOException;

public class C0439k {
    private static final c.a f = c.a.a("ef");
    private static final c.a g = c.a.a("nm", "v");
    private V1.a a;
    private V1.b b;
    private V1.b c;
    private V1.b d;
    private V1.b e;

    private void a(a2.c cVar, P1.d dVar) throws IOException {
        cVar.f();
        String strU = "";
        while (cVar.u()) {
            int iN0 = cVar.n0(g);
            if (iN0 == 0) {
                strU = cVar.U();
            } else if (iN0 == 1) {
                strU.hashCode();
                switch (strU) {
                    case "Distance":
                        this.d = C0432d.e(cVar, dVar);
                        break;
                    case "Opacity":
                        this.b = C0432d.f(cVar, dVar, false);
                        break;
                    case "Direction":
                        this.c = C0432d.f(cVar, dVar, false);
                        break;
                    case "Shadow Color":
                        this.a = C0432d.c(cVar, dVar);
                        break;
                    case "Softness":
                        this.e = C0432d.e(cVar, dVar);
                        break;
                    default:
                        cVar.H0();
                        break;
                }
            } else {
                cVar.t0();
                cVar.H0();
            }
        }
        cVar.m();
    }

    C0438j b(a2.c cVar, P1.d dVar) throws IOException {
        V1.b bVar;
        V1.b bVar2;
        V1.b bVar3;
        V1.b bVar4;
        while (cVar.u()) {
            if (cVar.n0(f) != 0) {
                cVar.t0();
                cVar.H0();
            } else {
                cVar.e();
                while (cVar.u()) {
                    a(cVar, dVar);
                }
                cVar.j();
            }
        }
        V1.a aVar = this.a;
        if (aVar == null || (bVar = this.b) == null || (bVar2 = this.c) == null || (bVar3 = this.d) == null || (bVar4 = this.e) == null) {
            return null;
        }
        return new C0438j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
