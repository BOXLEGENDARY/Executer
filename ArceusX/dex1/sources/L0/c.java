package l0;

import java.util.ArrayList;
import l0.e;

public class c {

    protected e f21543a;

    protected e f21544b;

    protected e f21545c;

    protected e f21546d;

    protected e f21547e;

    protected e f21548f;

    protected e f21549g;

    protected ArrayList<e> f21550h;

    protected int f21551i;

    protected int f21552j;

    protected float f21553k = 0.0f;

    int f21554l;

    int f21555m;

    int f21556n;

    boolean f21557o;

    private int f21558p;

    private boolean f21559q;

    protected boolean f21560r;

    protected boolean f21561s;

    protected boolean f21562t;

    protected boolean f21563u;

    private boolean f21564v;

    public c(e eVar, int i7, boolean z7) {
        this.f21543a = eVar;
        this.f21558p = i7;
        this.f21559q = z7;
    }

    private void b() {
        int i7 = this.f21558p * 2;
        e eVar = this.f21543a;
        this.f21557o = true;
        e eVar2 = eVar;
        boolean z7 = false;
        while (!z7) {
            this.f21551i++;
            e[] eVarArr = eVar.f21661x0;
            int i8 = this.f21558p;
            e eVar3 = null;
            eVarArr[i8] = null;
            eVar.f21659w0[i8] = null;
            if (eVar.S() != 8) {
                this.f21554l++;
                e.b bVarU = eVar.u(this.f21558p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar) {
                    this.f21555m += eVar.E(this.f21558p);
                }
                int iF = this.f21555m + eVar.f21603P[i7].f();
                this.f21555m = iF;
                int i9 = i7 + 1;
                this.f21555m = iF + eVar.f21603P[i9].f();
                int iF2 = this.f21556n + eVar.f21603P[i7].f();
                this.f21556n = iF2;
                this.f21556n = iF2 + eVar.f21603P[i9].f();
                if (this.f21544b == null) {
                    this.f21544b = eVar;
                }
                this.f21546d = eVar;
                e.b[] bVarArr = eVar.f21606S;
                int i10 = this.f21558p;
                if (bVarArr[i10] == bVar) {
                    int i11 = eVar.f21648r[i10];
                    if (i11 == 0 || i11 == 3 || i11 == 2) {
                        this.f21552j++;
                        float f7 = eVar.f21657v0[i10];
                        if (f7 > 0.0f) {
                            this.f21553k += f7;
                        }
                        if (c(eVar, i10)) {
                            if (f7 < 0.0f) {
                                this.f21560r = true;
                            } else {
                                this.f21561s = true;
                            }
                            if (this.f21550h == null) {
                                this.f21550h = new ArrayList<>();
                            }
                            this.f21550h.add(eVar);
                        }
                        if (this.f21548f == null) {
                            this.f21548f = eVar;
                        }
                        e eVar4 = this.f21549g;
                        if (eVar4 != null) {
                            eVar4.f21659w0[this.f21558p] = eVar;
                        }
                        this.f21549g = eVar;
                    }
                    if (this.f21558p == 0) {
                        if (eVar.f21644p != 0 || eVar.f21650s != 0 || eVar.f21652t != 0) {
                            this.f21557o = false;
                        }
                    } else if (eVar.f21646q != 0 || eVar.f21656v != 0 || eVar.f21658w != 0) {
                        this.f21557o = false;
                    }
                    if (eVar.f21610W != 0.0f) {
                        this.f21557o = false;
                        this.f21563u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f21661x0[this.f21558p] = eVar;
            }
            d dVar = eVar.f21603P[i7 + 1].f21570f;
            if (dVar != null) {
                e eVar5 = dVar.f21568d;
                d dVar2 = eVar5.f21603P[i7].f21570f;
                if (dVar2 != null && dVar2.f21568d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z7 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f21544b;
        if (eVar6 != null) {
            this.f21555m -= eVar6.f21603P[i7].f();
        }
        e eVar7 = this.f21546d;
        if (eVar7 != null) {
            this.f21555m -= eVar7.f21603P[i7 + 1].f();
        }
        this.f21545c = eVar;
        if (this.f21558p == 0 && this.f21559q) {
            this.f21547e = eVar;
        } else {
            this.f21547e = this.f21543a;
        }
        this.f21562t = this.f21561s && this.f21560r;
    }

    private static boolean c(e eVar, int i7) {
        int i8;
        return eVar.S() != 8 && eVar.f21606S[i7] == e.b.MATCH_CONSTRAINT && ((i8 = eVar.f21648r[i7]) == 0 || i8 == 3);
    }

    public void a() {
        if (!this.f21564v) {
            b();
        }
        this.f21564v = true;
    }
}
