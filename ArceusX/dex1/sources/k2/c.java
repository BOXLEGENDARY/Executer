package k2;

import j2.C2491a;
import java.util.Arrays;

public class c {

    b[] f21260a;

    int[] f21261b;

    public c() {
        b[] bVarArr = new b[g.values().length];
        this.f21260a = bVarArr;
        int[] iArr = new int[bVarArr.length];
        this.f21261b = iArr;
        Arrays.fill(iArr, 0);
    }

    public <T extends b> T a(Class<T> cls) {
        g gVar = g.f21281G.get(cls);
        synchronized (gVar) {
            T t7 = (T) this.f21260a[gVar.ordinal()];
            if (t7 != null) {
                this.f21260a[gVar.ordinal()] = t7.f21258b;
                this.f21261b[gVar.ordinal()] = r7[r3] - 1;
                t7.f21258b = null;
                return t7;
            }
            try {
                try {
                    return cls.newInstance();
                } catch (InstantiationException e7) {
                    C2491a.d(e7, "Cannot create an instance of " + cls + ". Make sure it has a empty constructor.", new Object[0]);
                    return null;
                }
            } catch (IllegalAccessException e8) {
                C2491a.d(e8, "Cannot create an instance of " + cls + ". Make sure it has a public empty constructor.", new Object[0]);
                return null;
            }
        }
    }

    public void b(b bVar) {
        g gVar = bVar.f21257a;
        bVar.b();
        synchronized (gVar) {
            try {
                if (this.f21261b[gVar.ordinal()] < 20) {
                    bVar.f21258b = this.f21260a[gVar.ordinal()];
                    this.f21260a[gVar.ordinal()] = bVar;
                    int[] iArr = this.f21261b;
                    int iOrdinal = gVar.ordinal();
                    iArr[iOrdinal] = iArr[iOrdinal] + 1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
