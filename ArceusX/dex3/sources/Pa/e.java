package Pa;

import Sa.w;

public class e {
    public final w a;
    public final int b;
    public final boolean c;
    public final e d;
    public final f e;
    public boolean f = true;
    public boolean g = false;

    private e(w wVar, int i, e eVar, f fVar, boolean z) {
        this.a = wVar;
        this.b = i;
        this.c = z;
        this.d = eVar;
        this.e = fVar;
    }

    public static e a(w wVar, int i, e eVar, f fVar) {
        return new e(wVar, i, eVar, fVar, true);
    }

    public static e b(w wVar, int i, e eVar, f fVar) {
        return new e(wVar, i, eVar, fVar, false);
    }
}
