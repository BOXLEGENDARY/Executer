package k0;

import java.util.Arrays;
import k0.C2508b;

public class j implements C2508b.a {

    private static float f21241n = 0.001f;

    private final int f21242a = -1;

    private int f21243b = 16;

    private int f21244c = 16;

    int[] f21245d = new int[16];

    int[] f21246e = new int[16];

    int[] f21247f = new int[16];

    float[] f21248g = new float[16];

    int[] f21249h = new int[16];

    int[] f21250i = new int[16];

    int f21251j = 0;

    int f21252k = -1;

    private final C2508b f21253l;

    protected final C2509c f21254m;

    j(C2508b c2508b, C2509c c2509c) {
        this.f21253l = c2508b;
        this.f21254m = c2509c;
        clear();
    }

    private void l(i iVar, int i7) {
        int[] iArr;
        int i8 = iVar.f21220c % this.f21244c;
        int[] iArr2 = this.f21245d;
        int i9 = iArr2[i8];
        if (i9 == -1) {
            iArr2[i8] = i7;
        } else {
            while (true) {
                iArr = this.f21246e;
                int i10 = iArr[i9];
                if (i10 == -1) {
                    break;
                } else {
                    i9 = i10;
                }
            }
            iArr[i9] = i7;
        }
        this.f21246e[i7] = -1;
    }

    private void m(int i7, i iVar, float f7) {
        this.f21247f[i7] = iVar.f21220c;
        this.f21248g[i7] = f7;
        this.f21249h[i7] = -1;
        this.f21250i[i7] = -1;
        iVar.a(this.f21253l);
        iVar.f21230m++;
        this.f21251j++;
    }

    private int n() {
        for (int i7 = 0; i7 < this.f21243b; i7++) {
            if (this.f21247f[i7] == -1) {
                return i7;
            }
        }
        return -1;
    }

    private void o() {
        int i7 = this.f21243b * 2;
        this.f21247f = Arrays.copyOf(this.f21247f, i7);
        this.f21248g = Arrays.copyOf(this.f21248g, i7);
        this.f21249h = Arrays.copyOf(this.f21249h, i7);
        this.f21250i = Arrays.copyOf(this.f21250i, i7);
        this.f21246e = Arrays.copyOf(this.f21246e, i7);
        for (int i8 = this.f21243b; i8 < i7; i8++) {
            this.f21247f[i8] = -1;
            this.f21246e[i8] = -1;
        }
        this.f21243b = i7;
    }

    private void q(int i7, i iVar, float f7) {
        int iN = n();
        m(iN, iVar, f7);
        if (i7 != -1) {
            this.f21249h[iN] = i7;
            int[] iArr = this.f21250i;
            iArr[iN] = iArr[i7];
            iArr[i7] = iN;
        } else {
            this.f21249h[iN] = -1;
            if (this.f21251j > 0) {
                this.f21250i[iN] = this.f21252k;
                this.f21252k = iN;
            } else {
                this.f21250i[iN] = -1;
            }
        }
        int i8 = this.f21250i[iN];
        if (i8 != -1) {
            this.f21249h[i8] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i7;
        int i8 = iVar.f21220c;
        int i9 = i8 % this.f21244c;
        int[] iArr2 = this.f21245d;
        int i10 = iArr2[i9];
        if (i10 == -1) {
            return;
        }
        if (this.f21247f[i10] == i8) {
            int[] iArr3 = this.f21246e;
            iArr2[i9] = iArr3[i10];
            iArr3[i10] = -1;
            return;
        }
        while (true) {
            iArr = this.f21246e;
            i7 = iArr[i10];
            if (i7 == -1 || this.f21247f[i7] == i8) {
                break;
            } else {
                i10 = i7;
            }
        }
        if (i7 == -1 || this.f21247f[i7] != i8) {
            return;
        }
        iArr[i10] = iArr[i7];
        iArr[i7] = -1;
    }

    @Override
    public float a(i iVar, boolean z7) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f7 = this.f21248g[iP];
        if (this.f21252k == iP) {
            this.f21252k = this.f21250i[iP];
        }
        this.f21247f[iP] = -1;
        int[] iArr = this.f21249h;
        int i7 = iArr[iP];
        if (i7 != -1) {
            int[] iArr2 = this.f21250i;
            iArr2[i7] = iArr2[iP];
        }
        int i8 = this.f21250i[iP];
        if (i8 != -1) {
            iArr[i8] = iArr[iP];
        }
        this.f21251j--;
        iVar.f21230m--;
        if (z7) {
            iVar.c(this.f21253l);
        }
        return f7;
    }

    @Override
    public boolean b(i iVar) {
        return p(iVar) != -1;
    }

    @Override
    public int c() {
        return this.f21251j;
    }

    @Override
    public void clear() {
        int i7 = this.f21251j;
        for (int i8 = 0; i8 < i7; i8++) {
            i iVarD = d(i8);
            if (iVarD != null) {
                iVarD.c(this.f21253l);
            }
        }
        for (int i9 = 0; i9 < this.f21243b; i9++) {
            this.f21247f[i9] = -1;
            this.f21246e[i9] = -1;
        }
        for (int i10 = 0; i10 < this.f21244c; i10++) {
            this.f21245d[i10] = -1;
        }
        this.f21251j = 0;
        this.f21252k = -1;
    }

    @Override
    public i d(int i7) {
        int i8 = this.f21251j;
        if (i8 == 0) {
            return null;
        }
        int i9 = this.f21252k;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7 && i9 != -1) {
                return this.f21254m.f21178d[this.f21247f[i9]];
            }
            i9 = this.f21250i[i9];
            if (i9 == -1) {
                break;
            }
        }
        return null;
    }

    @Override
    public void e() {
        int i7 = this.f21251j;
        int i8 = this.f21252k;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f21248g;
            fArr[i8] = fArr[i8] * (-1.0f);
            i8 = this.f21250i[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    @Override
    public float f(int i7) {
        int i8 = this.f21251j;
        int i9 = this.f21252k;
        for (int i10 = 0; i10 < i8; i10++) {
            if (i10 == i7) {
                return this.f21248g[i9];
            }
            i9 = this.f21250i[i9];
            if (i9 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override
    public void g(i iVar, float f7, boolean z7) {
        float f8 = f21241n;
        if (f7 <= (-f8) || f7 >= f8) {
            int iP = p(iVar);
            if (iP == -1) {
                k(iVar, f7);
                return;
            }
            float[] fArr = this.f21248g;
            float f9 = fArr[iP] + f7;
            fArr[iP] = f9;
            float f10 = f21241n;
            if (f9 <= (-f10) || f9 >= f10) {
                return;
            }
            fArr[iP] = 0.0f;
            a(iVar, z7);
        }
    }

    @Override
    public float h(C2508b c2508b, boolean z7) {
        float fI = i(c2508b.f21169a);
        a(c2508b.f21169a, z7);
        j jVar = (j) c2508b.f21173e;
        int iC = jVar.c();
        int i7 = 0;
        int i8 = 0;
        while (i7 < iC) {
            int i9 = jVar.f21247f[i8];
            if (i9 != -1) {
                g(this.f21254m.f21178d[i9], jVar.f21248g[i8] * fI, z7);
                i7++;
            }
            i8++;
        }
        return fI;
    }

    @Override
    public float i(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f21248g[iP];
        }
        return 0.0f;
    }

    @Override
    public void j(float f7) {
        int i7 = this.f21251j;
        int i8 = this.f21252k;
        for (int i9 = 0; i9 < i7; i9++) {
            float[] fArr = this.f21248g;
            fArr[i8] = fArr[i8] / f7;
            i8 = this.f21250i[i8];
            if (i8 == -1) {
                return;
            }
        }
    }

    @Override
    public void k(i iVar, float f7) {
        float f8 = f21241n;
        if (f7 > (-f8) && f7 < f8) {
            a(iVar, true);
            return;
        }
        if (this.f21251j == 0) {
            m(0, iVar, f7);
            l(iVar, 0);
            this.f21252k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f21248g[iP] = f7;
            return;
        }
        if (this.f21251j + 1 >= this.f21243b) {
            o();
        }
        int i7 = this.f21251j;
        int i8 = this.f21252k;
        int i9 = -1;
        for (int i10 = 0; i10 < i7; i10++) {
            int i11 = this.f21247f[i8];
            int i12 = iVar.f21220c;
            if (i11 == i12) {
                this.f21248g[i8] = f7;
                return;
            }
            if (i11 < i12) {
                i9 = i8;
            }
            i8 = this.f21250i[i8];
            if (i8 == -1) {
                break;
            }
        }
        q(i9, iVar, f7);
    }

    public int p(i iVar) {
        if (this.f21251j != 0 && iVar != null) {
            int i7 = iVar.f21220c;
            int i8 = this.f21245d[i7 % this.f21244c];
            if (i8 == -1) {
                return -1;
            }
            if (this.f21247f[i8] == i7) {
                return i8;
            }
            do {
                i8 = this.f21246e[i8];
                if (i8 == -1) {
                    break;
                }
            } while (this.f21247f[i8] != i7);
            if (i8 != -1 && this.f21247f[i8] == i7) {
                return i8;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i7 = this.f21251j;
        for (int i8 = 0; i8 < i7; i8++) {
            i iVarD = d(i8);
            if (iVarD != null) {
                String str2 = str + iVarD + " = " + f(i8) + " ";
                int iP = p(iVarD);
                String str3 = str2 + "[p: ";
                String str4 = (this.f21249h[iP] != -1 ? str3 + this.f21254m.f21178d[this.f21247f[this.f21249h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f21250i[iP] != -1 ? str4 + this.f21254m.f21178d[this.f21247f[this.f21250i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
