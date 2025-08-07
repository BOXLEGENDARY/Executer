package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

class w {

    final g0.k<RecyclerView.D, a> f12036a = new g0.k<>();

    final g0.h<RecyclerView.D> f12037b = new g0.h<>();

    static class a {

        static x0.d<a> f12038d = new x0.e(20);

        int f12039a;

        RecyclerView.m.c f12040b;

        RecyclerView.m.c f12041c;

        private a() {
        }

        static void a() {
            while (f12038d.b() != null) {
            }
        }

        static a b() {
            a aVarB = f12038d.b();
            return aVarB == null ? new a() : aVarB;
        }

        static void c(a aVar) {
            aVar.f12039a = 0;
            aVar.f12040b = null;
            aVar.f12041c = null;
            f12038d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.D d7);

        void b(RecyclerView.D d7, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void c(RecyclerView.D d7, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);

        void d(RecyclerView.D d7, RecyclerView.m.c cVar, RecyclerView.m.c cVar2);
    }

    w() {
    }

    private RecyclerView.m.c l(RecyclerView.D d7, int i7) {
        a aVarK;
        RecyclerView.m.c cVar;
        int iD = this.f12036a.d(d7);
        if (iD >= 0 && (aVarK = this.f12036a.k(iD)) != null) {
            int i8 = aVarK.f12039a;
            if ((i8 & i7) != 0) {
                int i9 = (~i7) & i8;
                aVarK.f12039a = i9;
                if (i7 == 4) {
                    cVar = aVarK.f12040b;
                } else {
                    if (i7 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    cVar = aVarK.f12041c;
                }
                if ((i9 & 12) == 0) {
                    this.f12036a.i(iD);
                    a.c(aVarK);
                }
                return cVar;
            }
        }
        return null;
    }

    void a(RecyclerView.D d7, RecyclerView.m.c cVar) {
        a aVarB = this.f12036a.get(d7);
        if (aVarB == null) {
            aVarB = a.b();
            this.f12036a.put(d7, aVarB);
        }
        aVarB.f12039a |= 2;
        aVarB.f12040b = cVar;
    }

    void b(RecyclerView.D d7) {
        a aVarB = this.f12036a.get(d7);
        if (aVarB == null) {
            aVarB = a.b();
            this.f12036a.put(d7, aVarB);
        }
        aVarB.f12039a |= 1;
    }

    void c(long j7, RecyclerView.D d7) {
        this.f12037b.h(j7, d7);
    }

    void d(RecyclerView.D d7, RecyclerView.m.c cVar) {
        a aVarB = this.f12036a.get(d7);
        if (aVarB == null) {
            aVarB = a.b();
            this.f12036a.put(d7, aVarB);
        }
        aVarB.f12041c = cVar;
        aVarB.f12039a |= 8;
    }

    void e(RecyclerView.D d7, RecyclerView.m.c cVar) {
        a aVarB = this.f12036a.get(d7);
        if (aVarB == null) {
            aVarB = a.b();
            this.f12036a.put(d7, aVarB);
        }
        aVarB.f12040b = cVar;
        aVarB.f12039a |= 4;
    }

    void f() {
        this.f12036a.clear();
        this.f12037b.a();
    }

    RecyclerView.D g(long j7) {
        return this.f12037b.d(j7);
    }

    boolean h(RecyclerView.D d7) {
        a aVar = this.f12036a.get(d7);
        return (aVar == null || (aVar.f12039a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.D d7) {
        a aVar = this.f12036a.get(d7);
        return (aVar == null || (aVar.f12039a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.D d7) {
        p(d7);
    }

    RecyclerView.m.c m(RecyclerView.D d7) {
        return l(d7, 8);
    }

    RecyclerView.m.c n(RecyclerView.D d7) {
        return l(d7, 4);
    }

    void o(b bVar) {
        for (int size = this.f12036a.getSize() - 1; size >= 0; size--) {
            RecyclerView.D dG = this.f12036a.g(size);
            a aVarI = this.f12036a.i(size);
            int i7 = aVarI.f12039a;
            if ((i7 & 3) == 3) {
                bVar.a(dG);
            } else if ((i7 & 1) != 0) {
                RecyclerView.m.c cVar = aVarI.f12040b;
                if (cVar == null) {
                    bVar.a(dG);
                } else {
                    bVar.c(dG, cVar, aVarI.f12041c);
                }
            } else if ((i7 & 14) == 14) {
                bVar.b(dG, aVarI.f12040b, aVarI.f12041c);
            } else if ((i7 & 12) == 12) {
                bVar.d(dG, aVarI.f12040b, aVarI.f12041c);
            } else if ((i7 & 4) != 0) {
                bVar.c(dG, aVarI.f12040b, null);
            } else if ((i7 & 8) != 0) {
                bVar.b(dG, aVarI.f12040b, aVarI.f12041c);
            }
            a.c(aVarI);
        }
    }

    void p(RecyclerView.D d7) {
        a aVar = this.f12036a.get(d7);
        if (aVar == null) {
            return;
        }
        aVar.f12039a &= -2;
    }

    void q(RecyclerView.D d7) {
        int iK = this.f12037b.k() - 1;
        while (true) {
            if (iK < 0) {
                break;
            }
            if (d7 == this.f12037b.l(iK)) {
                this.f12037b.j(iK);
                break;
            }
            iK--;
        }
        a aVarRemove = this.f12036a.remove(d7);
        if (aVarRemove != null) {
            a.c(aVarRemove);
        }
    }
}
