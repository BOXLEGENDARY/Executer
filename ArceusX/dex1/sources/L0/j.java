package l0;

import java.util.ArrayList;
import java.util.Arrays;
import m0.o;

public class j extends e implements i {

    public e[] f21739D0 = new e[4];

    public int f21740E0 = 0;

    @Override
    public void a(e eVar) {
        if (eVar == this || eVar == null) {
            return;
        }
        int i7 = this.f21740E0 + 1;
        e[] eVarArr = this.f21739D0;
        if (i7 > eVarArr.length) {
            this.f21739D0 = (e[]) Arrays.copyOf(eVarArr, eVarArr.length * 2);
        }
        e[] eVarArr2 = this.f21739D0;
        int i8 = this.f21740E0;
        eVarArr2[i8] = eVar;
        this.f21740E0 = i8 + 1;
    }

    @Override
    public void b() {
        this.f21740E0 = 0;
        Arrays.fill(this.f21739D0, (Object) null);
    }

    @Override
    public void c(f fVar) {
    }

    public void d1(ArrayList<o> arrayList, int i7, o oVar) {
        for (int i8 = 0; i8 < this.f21740E0; i8++) {
            oVar.a(this.f21739D0[i8]);
        }
        for (int i9 = 0; i9 < this.f21740E0; i9++) {
            m0.i.a(this.f21739D0[i9], i7, arrayList, oVar);
        }
    }

    public int e1(int i7) {
        int i8;
        int i9;
        for (int i10 = 0; i10 < this.f21740E0; i10++) {
            e eVar = this.f21739D0[i10];
            if (i7 == 0 && (i9 = eVar.f21587A0) != -1) {
                return i9;
            }
            if (i7 == 1 && (i8 = eVar.f21589B0) != -1) {
                return i8;
            }
        }
        return -1;
    }
}
