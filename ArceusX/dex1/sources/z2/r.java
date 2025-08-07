package z2;

import A2.AbstractC0254k;
import A2.InterfaceC0246c;
import A2.InterfaceC0247d;
import B2.b;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import t2.g;
import v2.c;

public class r {

    private final Context f24828a;

    private final t2.e f24829b;

    private final InterfaceC0247d f24830c;

    private final x f24831d;

    private final Executor f24832e;

    private final B2.b f24833f;

    private final C2.a f24834g;

    private final C2.a f24835h;

    private final InterfaceC0246c f24836i;

    public r(Context context, t2.e eVar, InterfaceC0247d interfaceC0247d, x xVar, Executor executor, B2.b bVar, C2.a aVar, C2.a aVar2, InterfaceC0246c interfaceC0246c) {
        this.f24828a = context;
        this.f24829b = eVar;
        this.f24830c = interfaceC0247d;
        this.f24831d = xVar;
        this.f24832e = executor;
        this.f24833f = bVar;
        this.f24834g = aVar;
        this.f24835h = aVar2;
        this.f24836i = interfaceC0246c;
    }

    public Boolean l(s2.o oVar) {
        return Boolean.valueOf(this.f24830c.n(oVar));
    }

    public Iterable m(s2.o oVar) {
        return this.f24830c.y0(oVar);
    }

    public Object n(Iterable iterable, s2.o oVar, long j7) {
        this.f24830c.m1(iterable);
        this.f24830c.h1(oVar, this.f24834g.a() + j7);
        return null;
    }

    public Object o(Iterable iterable) {
        this.f24830c.t(iterable);
        return null;
    }

    public Object p() {
        this.f24836i.b();
        return null;
    }

    public Object q(Map map) {
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            this.f24836i.e(((Integer) r0.getValue()).intValue(), c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public Object r(s2.o oVar, long j7) {
        this.f24830c.h1(oVar, this.f24834g.a() + j7);
        return null;
    }

    public Object s(s2.o oVar, int i7) {
        this.f24831d.a(oVar, i7 + 1);
        return null;
    }

    public void t(final s2.o oVar, final int i7, Runnable runnable) {
        try {
            try {
                B2.b bVar = this.f24833f;
                final InterfaceC0247d interfaceC0247d = this.f24830c;
                Objects.requireNonNull(interfaceC0247d);
                bVar.j(new b.a() {
                    @Override
                    public final Object execute() {
                        return Integer.valueOf(interfaceC0247d.q());
                    }
                });
                if (k()) {
                    u(oVar, i7);
                } else {
                    this.f24833f.j(new b.a() {
                        @Override
                        public final Object execute() {
                            return this.f24809a.s(oVar, i7);
                        }
                    });
                }
            } catch (B2.a unused) {
                this.f24831d.a(oVar, i7 + 1);
            }
            runnable.run();
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public s2.i j(t2.m mVar) {
        B2.b bVar = this.f24833f;
        final InterfaceC0246c interfaceC0246c = this.f24836i;
        Objects.requireNonNull(interfaceC0246c);
        return mVar.a(s2.i.a().i(this.f24834g.a()).k(this.f24835h.a()).j("GDT_CLIENT_METRICS").h(new s2.h(q2.b.b("proto"), ((v2.a) bVar.j(new b.a() {
            @Override
            public final Object execute() {
                return interfaceC0246c.f();
            }
        })).f())).d());
    }

    boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f24828a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public t2.g u(final s2.o oVar, int i7) {
        t2.g gVarB;
        t2.m mVarA = this.f24829b.a(oVar.b());
        long jMax = 0;
        t2.g gVarE = t2.g.e(0L);
        while (true) {
            final long j7 = jMax;
            while (((Boolean) this.f24833f.j(new b.a() {
                @Override
                public final Object execute() {
                    return this.f24812a.l(oVar);
                }
            })).booleanValue()) {
                final Iterable iterable = (Iterable) this.f24833f.j(new b.a() {
                    @Override
                    public final Object execute() {
                        return this.f24814a.m(oVar);
                    }
                });
                if (!iterable.iterator().hasNext()) {
                    return gVarE;
                }
                if (mVarA == null) {
                    w2.a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", oVar);
                    gVarB = t2.g.a();
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = iterable.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((AbstractC0254k) it.next()).b());
                    }
                    if (oVar.e()) {
                        arrayList.add(j(mVarA));
                    }
                    gVarB = mVarA.b(t2.f.a().b(arrayList).c(oVar.c()).a());
                }
                gVarE = gVarB;
                if (gVarE.c() == g.a.TRANSIENT_ERROR) {
                    this.f24833f.j(new b.a() {
                        @Override
                        public final Object execute() {
                            return this.f24816a.n(iterable, oVar, j7);
                        }
                    });
                    this.f24831d.b(oVar, i7 + 1, true);
                    return gVarE;
                }
                this.f24833f.j(new b.a() {
                    @Override
                    public final Object execute() {
                        return this.f24820a.o(iterable);
                    }
                });
                if (gVarE.c() == g.a.OK) {
                    jMax = Math.max(j7, gVarE.b());
                    if (oVar.e()) {
                        this.f24833f.j(new b.a() {
                            @Override
                            public final Object execute() {
                                return this.f24822a.p();
                            }
                        });
                    }
                } else if (gVarE.c() == g.a.f23803v) {
                    final HashMap map = new HashMap();
                    Iterator it2 = iterable.iterator();
                    while (it2.hasNext()) {
                        String strJ = ((AbstractC0254k) it2.next()).b().j();
                        if (map.containsKey(strJ)) {
                            map.put(strJ, Integer.valueOf(((Integer) map.get(strJ)).intValue() + 1));
                        } else {
                            map.put(strJ, 1);
                        }
                    }
                    this.f24833f.j(new b.a() {
                        @Override
                        public final Object execute() {
                            return this.f24823a.q(map);
                        }
                    });
                }
            }
            this.f24833f.j(new b.a() {
                @Override
                public final Object execute() {
                    return this.f24825a.r(oVar, j7);
                }
            });
            return gVarE;
        }
    }

    public void v(final s2.o oVar, final int i7, final Runnable runnable) {
        this.f24832e.execute(new Runnable() {
            @Override
            public final void run() {
                this.f24803d.t(oVar, i7, runnable);
            }
        });
    }
}
