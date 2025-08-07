package k0;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import java.util.Comparator;
import k0.C2508b;

public class C2514h extends C2508b {

    private int f21207g;

    private i[] f21208h;

    private i[] f21209i;

    private int f21210j;

    b f21211k;

    C2509c f21212l;

    class a implements Comparator<i> {
        a() {
        }

        @Override
        public int compare(i iVar, i iVar2) {
            return iVar.f21220c - iVar2.f21220c;
        }
    }

    class b implements Comparable {

        i f21214d;

        C2514h f21215e;

        public b(C2514h c2514h) {
            this.f21215e = c2514h;
        }

        public boolean c(i iVar, float f7) {
            boolean z7 = true;
            if (!this.f21214d.f21218a) {
                for (int i7 = 0; i7 < 9; i7++) {
                    float f8 = iVar.f21226i[i7];
                    if (f8 != 0.0f) {
                        float f9 = f8 * f7;
                        if (Math.abs(f9) < 1.0E-4f) {
                            f9 = 0.0f;
                        }
                        this.f21214d.f21226i[i7] = f9;
                    } else {
                        this.f21214d.f21226i[i7] = 0.0f;
                    }
                }
                return true;
            }
            for (int i8 = 0; i8 < 9; i8++) {
                float[] fArr = this.f21214d.f21226i;
                float f10 = fArr[i8] + (iVar.f21226i[i8] * f7);
                fArr[i8] = f10;
                if (Math.abs(f10) < 1.0E-4f) {
                    this.f21214d.f21226i[i8] = 0.0f;
                } else {
                    z7 = false;
                }
            }
            if (z7) {
                C2514h.this.G(this.f21214d);
            }
            return false;
        }

        @Override
        public int compareTo(Object obj) {
            return this.f21214d.f21220c - ((i) obj).f21220c;
        }

        public void e(i iVar) {
            this.f21214d = iVar;
        }

        public final boolean f() {
            for (int i7 = 8; i7 >= 0; i7--) {
                float f7 = this.f21214d.f21226i[i7];
                if (f7 > 0.0f) {
                    return false;
                }
                if (f7 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean g(i iVar) {
            int i7 = 8;
            while (true) {
                if (i7 < 0) {
                    break;
                }
                float f7 = iVar.f21226i[i7];
                float f8 = this.f21214d.f21226i[i7];
                if (f8 == f7) {
                    i7--;
                } else if (f8 < f7) {
                    return true;
                }
            }
            return false;
        }

        public void h() {
            Arrays.fill(this.f21214d.f21226i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f21214d != null) {
                for (int i7 = 0; i7 < 9; i7++) {
                    str = str + this.f21214d.f21226i[i7] + " ";
                }
            }
            return str + "] " + this.f21214d;
        }
    }

    public C2514h(C2509c c2509c) {
        super(c2509c);
        this.f21207g = 128;
        this.f21208h = new i[128];
        this.f21209i = new i[128];
        this.f21210j = 0;
        this.f21211k = new b(this);
        this.f21212l = c2509c;
    }

    private final void F(i iVar) {
        int i7;
        int i8 = this.f21210j + 1;
        i[] iVarArr = this.f21208h;
        if (i8 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f21208h = iVarArr2;
            this.f21209i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f21208h;
        int i9 = this.f21210j;
        iVarArr3[i9] = iVar;
        int i10 = i9 + 1;
        this.f21210j = i10;
        if (i10 > 1 && iVarArr3[i9].f21220c > iVar.f21220c) {
            int i11 = 0;
            while (true) {
                i7 = this.f21210j;
                if (i11 >= i7) {
                    break;
                }
                this.f21209i[i11] = this.f21208h[i11];
                i11++;
            }
            Arrays.sort(this.f21209i, 0, i7, new a());
            for (int i12 = 0; i12 < this.f21210j; i12++) {
                this.f21208h[i12] = this.f21209i[i12];
            }
        }
        iVar.f21218a = true;
        iVar.a(this);
    }

    public final void G(i iVar) {
        int i7 = 0;
        while (i7 < this.f21210j) {
            if (this.f21208h[i7] == iVar) {
                while (true) {
                    int i8 = this.f21210j;
                    if (i7 >= i8 - 1) {
                        this.f21210j = i8 - 1;
                        iVar.f21218a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f21208h;
                        int i9 = i7 + 1;
                        iVarArr[i7] = iVarArr[i9];
                        i7 = i9;
                    }
                }
            } else {
                i7++;
            }
        }
    }

    @Override
    public void B(C2510d c2510d, C2508b c2508b, boolean z7) {
        i iVar = c2508b.f21169a;
        if (iVar == null) {
            return;
        }
        C2508b.a aVar = c2508b.f21173e;
        int iC = aVar.c();
        for (int i7 = 0; i7 < iC; i7++) {
            i iVarD = aVar.d(i7);
            float f7 = aVar.f(i7);
            this.f21211k.e(iVarD);
            if (this.f21211k.c(iVar, f7)) {
                F(iVarD);
            }
            this.f21170b += c2508b.f21170b * f7;
        }
        G(iVar);
    }

    @Override
    public k0.i a(k0.C2510d r5, boolean[] r6) {
        throw new UnsupportedOperationException("Method not decompiled: k0.C2514h.a(k0.d, boolean[]):k0.i");
    }

    @Override
    public void c(i iVar) {
        this.f21211k.e(iVar);
        this.f21211k.h();
        iVar.f21226i[iVar.f21222e] = 1.0f;
        F(iVar);
    }

    @Override
    public void clear() {
        this.f21210j = 0;
        this.f21170b = 0.0f;
    }

    @Override
    public boolean isEmpty() {
        return this.f21210j == 0;
    }

    @Override
    public String toString() {
        String str = BuildConfig.FLAVOR + " goal -> (" + this.f21170b + ") : ";
        for (int i7 = 0; i7 < this.f21210j; i7++) {
            this.f21211k.e(this.f21208h[i7]);
            str = str + this.f21211k + " ";
        }
        return str;
    }
}
