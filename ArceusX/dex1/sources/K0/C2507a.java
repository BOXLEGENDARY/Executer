package k0;

import e2.vb.oyfFwvPUKctyaG;
import java.util.Arrays;
import k0.C2508b;

public class C2507a implements C2508b.a {

    private static float f21157l = 0.001f;

    private final C2508b f21159b;

    protected final C2509c f21160c;

    int f21158a = 0;

    private int f21161d = 8;

    private i f21162e = null;

    private int[] f21163f = new int[8];

    private int[] f21164g = new int[8];

    private float[] f21165h = new float[8];

    private int f21166i = -1;

    private int f21167j = -1;

    private boolean f21168k = false;

    C2507a(C2508b c2508b, C2509c c2509c) {
        this.f21159b = c2508b;
        this.f21160c = c2509c;
    }

    @Override
    public final float a(i iVar, boolean z7) {
        if (this.f21162e == iVar) {
            this.f21162e = null;
        }
        int i7 = this.f21166i;
        if (i7 == -1) {
            return 0.0f;
        }
        int i8 = 0;
        int i9 = -1;
        while (i7 != -1 && i8 < this.f21158a) {
            if (this.f21163f[i7] == iVar.f21220c) {
                if (i7 == this.f21166i) {
                    this.f21166i = this.f21164g[i7];
                } else {
                    int[] iArr = this.f21164g;
                    iArr[i9] = iArr[i7];
                }
                if (z7) {
                    iVar.c(this.f21159b);
                }
                iVar.f21230m--;
                this.f21158a--;
                this.f21163f[i7] = -1;
                if (this.f21168k) {
                    this.f21167j = i7;
                }
                return this.f21165h[i7];
            }
            i8++;
            i9 = i7;
            i7 = this.f21164g[i7];
        }
        return 0.0f;
    }

    @Override
    public boolean b(i iVar) {
        int i7 = this.f21166i;
        if (i7 == -1) {
            return false;
        }
        for (int i8 = 0; i7 != -1 && i8 < this.f21158a; i8++) {
            if (this.f21163f[i7] == iVar.f21220c) {
                return true;
            }
            i7 = this.f21164g[i7];
        }
        return false;
    }

    @Override
    public int c() {
        return this.f21158a;
    }

    @Override
    public final void clear() {
        int i7 = this.f21166i;
        for (int i8 = 0; i7 != -1 && i8 < this.f21158a; i8++) {
            i iVar = this.f21160c.f21178d[this.f21163f[i7]];
            if (iVar != null) {
                iVar.c(this.f21159b);
            }
            i7 = this.f21164g[i7];
        }
        this.f21166i = -1;
        this.f21167j = -1;
        this.f21168k = false;
        this.f21158a = 0;
    }

    @Override
    public i d(int i7) {
        int i8 = this.f21166i;
        for (int i9 = 0; i8 != -1 && i9 < this.f21158a; i9++) {
            if (i9 == i7) {
                return this.f21160c.f21178d[this.f21163f[i8]];
            }
            i8 = this.f21164g[i8];
        }
        return null;
    }

    @Override
    public void e() {
        int i7 = this.f21166i;
        for (int i8 = 0; i7 != -1 && i8 < this.f21158a; i8++) {
            float[] fArr = this.f21165h;
            fArr[i7] = fArr[i7] * (-1.0f);
            i7 = this.f21164g[i7];
        }
    }

    @Override
    public float f(int i7) {
        int i8 = this.f21166i;
        for (int i9 = 0; i8 != -1 && i9 < this.f21158a; i9++) {
            if (i9 == i7) {
                return this.f21165h[i8];
            }
            i8 = this.f21164g[i8];
        }
        return 0.0f;
    }

    @Override
    public void g(i iVar, float f7, boolean z7) {
        float f8 = f21157l;
        if (f7 <= (-f8) || f7 >= f8) {
            int i7 = this.f21166i;
            if (i7 == -1) {
                this.f21166i = 0;
                this.f21165h[0] = f7;
                this.f21163f[0] = iVar.f21220c;
                this.f21164g[0] = -1;
                iVar.f21230m++;
                iVar.a(this.f21159b);
                this.f21158a++;
                if (this.f21168k) {
                    return;
                }
                int i8 = this.f21167j + 1;
                this.f21167j = i8;
                int[] iArr = this.f21163f;
                if (i8 >= iArr.length) {
                    this.f21168k = true;
                    this.f21167j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i9 = -1;
            for (int i10 = 0; i7 != -1 && i10 < this.f21158a; i10++) {
                int i11 = this.f21163f[i7];
                int i12 = iVar.f21220c;
                if (i11 == i12) {
                    float[] fArr = this.f21165h;
                    float f9 = fArr[i7] + f7;
                    float f10 = f21157l;
                    if (f9 > (-f10) && f9 < f10) {
                        f9 = 0.0f;
                    }
                    fArr[i7] = f9;
                    if (f9 == 0.0f) {
                        if (i7 == this.f21166i) {
                            this.f21166i = this.f21164g[i7];
                        } else {
                            int[] iArr2 = this.f21164g;
                            iArr2[i9] = iArr2[i7];
                        }
                        if (z7) {
                            iVar.c(this.f21159b);
                        }
                        if (this.f21168k) {
                            this.f21167j = i7;
                        }
                        iVar.f21230m--;
                        this.f21158a--;
                        return;
                    }
                    return;
                }
                if (i11 < i12) {
                    i9 = i7;
                }
                i7 = this.f21164g[i7];
            }
            int length = this.f21167j;
            int i13 = length + 1;
            if (this.f21168k) {
                int[] iArr3 = this.f21163f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i13;
            }
            int[] iArr4 = this.f21163f;
            if (length >= iArr4.length && this.f21158a < iArr4.length) {
                int i14 = 0;
                while (true) {
                    int[] iArr5 = this.f21163f;
                    if (i14 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i14] == -1) {
                        length = i14;
                        break;
                    }
                    i14++;
                }
            }
            int[] iArr6 = this.f21163f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i15 = this.f21161d * 2;
                this.f21161d = i15;
                this.f21168k = false;
                this.f21167j = length - 1;
                this.f21165h = Arrays.copyOf(this.f21165h, i15);
                this.f21163f = Arrays.copyOf(this.f21163f, this.f21161d);
                this.f21164g = Arrays.copyOf(this.f21164g, this.f21161d);
            }
            this.f21163f[length] = iVar.f21220c;
            this.f21165h[length] = f7;
            if (i9 != -1) {
                int[] iArr7 = this.f21164g;
                iArr7[length] = iArr7[i9];
                iArr7[i9] = length;
            } else {
                this.f21164g[length] = this.f21166i;
                this.f21166i = length;
            }
            iVar.f21230m++;
            iVar.a(this.f21159b);
            this.f21158a++;
            if (!this.f21168k) {
                this.f21167j++;
            }
            int i16 = this.f21167j;
            int[] iArr8 = this.f21163f;
            if (i16 >= iArr8.length) {
                this.f21168k = true;
                this.f21167j = iArr8.length - 1;
            }
        }
    }

    @Override
    public float h(C2508b c2508b, boolean z7) {
        float fI = i(c2508b.f21169a);
        a(c2508b.f21169a, z7);
        C2508b.a aVar = c2508b.f21173e;
        int iC = aVar.c();
        for (int i7 = 0; i7 < iC; i7++) {
            i iVarD = aVar.d(i7);
            g(iVarD, aVar.i(iVarD) * fI, z7);
        }
        return fI;
    }

    @Override
    public final float i(i iVar) {
        int i7 = this.f21166i;
        for (int i8 = 0; i7 != -1 && i8 < this.f21158a; i8++) {
            if (this.f21163f[i7] == iVar.f21220c) {
                return this.f21165h[i7];
            }
            i7 = this.f21164g[i7];
        }
        return 0.0f;
    }

    @Override
    public void j(float f7) {
        int i7 = this.f21166i;
        for (int i8 = 0; i7 != -1 && i8 < this.f21158a; i8++) {
            float[] fArr = this.f21165h;
            fArr[i7] = fArr[i7] / f7;
            i7 = this.f21164g[i7];
        }
    }

    @Override
    public final void k(i iVar, float f7) {
        if (f7 == 0.0f) {
            a(iVar, true);
            return;
        }
        int i7 = this.f21166i;
        if (i7 == -1) {
            this.f21166i = 0;
            this.f21165h[0] = f7;
            this.f21163f[0] = iVar.f21220c;
            this.f21164g[0] = -1;
            iVar.f21230m++;
            iVar.a(this.f21159b);
            this.f21158a++;
            if (this.f21168k) {
                return;
            }
            int i8 = this.f21167j + 1;
            this.f21167j = i8;
            int[] iArr = this.f21163f;
            if (i8 >= iArr.length) {
                this.f21168k = true;
                this.f21167j = iArr.length - 1;
                return;
            }
            return;
        }
        int i9 = -1;
        for (int i10 = 0; i7 != -1 && i10 < this.f21158a; i10++) {
            int i11 = this.f21163f[i7];
            int i12 = iVar.f21220c;
            if (i11 == i12) {
                this.f21165h[i7] = f7;
                return;
            }
            if (i11 < i12) {
                i9 = i7;
            }
            i7 = this.f21164g[i7];
        }
        int length = this.f21167j;
        int i13 = length + 1;
        if (this.f21168k) {
            int[] iArr2 = this.f21163f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i13;
        }
        int[] iArr3 = this.f21163f;
        if (length >= iArr3.length && this.f21158a < iArr3.length) {
            int i14 = 0;
            while (true) {
                int[] iArr4 = this.f21163f;
                if (i14 >= iArr4.length) {
                    break;
                }
                if (iArr4[i14] == -1) {
                    length = i14;
                    break;
                }
                i14++;
            }
        }
        int[] iArr5 = this.f21163f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i15 = this.f21161d * 2;
            this.f21161d = i15;
            this.f21168k = false;
            this.f21167j = length - 1;
            this.f21165h = Arrays.copyOf(this.f21165h, i15);
            this.f21163f = Arrays.copyOf(this.f21163f, this.f21161d);
            this.f21164g = Arrays.copyOf(this.f21164g, this.f21161d);
        }
        this.f21163f[length] = iVar.f21220c;
        this.f21165h[length] = f7;
        if (i9 != -1) {
            int[] iArr6 = this.f21164g;
            iArr6[length] = iArr6[i9];
            iArr6[i9] = length;
        } else {
            this.f21164g[length] = this.f21166i;
            this.f21166i = length;
        }
        iVar.f21230m++;
        iVar.a(this.f21159b);
        int i16 = this.f21158a + 1;
        this.f21158a = i16;
        if (!this.f21168k) {
            this.f21167j++;
        }
        int[] iArr7 = this.f21163f;
        if (i16 >= iArr7.length) {
            this.f21168k = true;
        }
        if (this.f21167j >= iArr7.length) {
            this.f21168k = true;
            this.f21167j = iArr7.length - 1;
        }
    }

    public String toString() {
        int i7 = this.f21166i;
        String str = oyfFwvPUKctyaG.VSW;
        for (int i8 = 0; i7 != -1 && i8 < this.f21158a; i8++) {
            str = ((str + " -> ") + this.f21165h[i7] + " : ") + this.f21160c.f21178d[this.f21163f[i7]];
            i7 = this.f21164g[i7];
        }
        return str;
    }
}
