package C;

import A.a;
import C.J;
import H3.QdLC.QcdySgfdST;
import e2.vb.oyfFwvPUKctyaG;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import z.C3043d0;
import z.InterfaceC3052i;
import z3.AdxZ.bpTQi;

public final class Q implements a.InterfaceC0000a {

    private final StringBuilder f426a = new StringBuilder();

    private final Object f427b;

    private int f428c;

    private final A.a f429d;

    private final Map<InterfaceC3052i, a> f430e;

    private int f431f;

    private static class a {

        private J.a f432a;

        private final Executor f433b;

        private final b f434c;

        private final c f435d;

        a(J.a aVar, Executor executor, b bVar, c cVar) {
            this.f432a = aVar;
            this.f433b = executor;
            this.f434c = bVar;
            this.f435d = cVar;
        }

        J.a a() {
            return this.f432a;
        }

        void b() {
            try {
                Executor executor = this.f433b;
                final b bVar = this.f434c;
                Objects.requireNonNull(bVar);
                executor.execute(new Runnable() {
                    @Override
                    public final void run() {
                        bVar.a();
                    }
                });
            } catch (RejectedExecutionException e7) {
                C3043d0.d("CameraStateRegistry", "Unable to notify camera to configure.", e7);
            }
        }

        void c() {
            try {
                Executor executor = this.f433b;
                final c cVar = this.f435d;
                Objects.requireNonNull(cVar);
                executor.execute(new Runnable() {
                    @Override
                    public final void run() {
                        cVar.a();
                    }
                });
            } catch (RejectedExecutionException e7) {
                C3043d0.d("CameraStateRegistry", "Unable to notify camera to open.", e7);
            }
        }

        J.a d(J.a aVar) {
            J.a aVar2 = this.f432a;
            this.f432a = aVar;
            return aVar2;
        }
    }

    public interface b {
        void a();
    }

    public interface c {
        void a();
    }

    public Q(A.a aVar, int i7) {
        Object obj = new Object();
        this.f427b = obj;
        this.f430e = new HashMap();
        this.f428c = i7;
        synchronized (obj) {
            this.f429d = aVar;
            this.f431f = this.f428c;
        }
    }

    private a b(String str) {
        for (InterfaceC3052i interfaceC3052i : this.f430e.keySet()) {
            if (str.equals(((I) interfaceC3052i.c()).d())) {
                return this.f430e.get(interfaceC3052i);
            }
        }
        return null;
    }

    private static boolean d(J.a aVar) {
        return aVar != null && aVar.e();
    }

    private void f() {
        boolean zF = C3043d0.f("CameraStateRegistry");
        String str = bpTQi.HsWqJsafnYn;
        if (zF) {
            this.f426a.setLength(0);
            this.f426a.append("Recalculating open cameras:\n");
            this.f426a.append(String.format(Locale.US, str, "Camera", QcdySgfdST.rJQ));
            this.f426a.append("-------------------------------------------------------------------\n");
        }
        int i7 = 0;
        for (Map.Entry<InterfaceC3052i, a> entry : this.f430e.entrySet()) {
            if (C3043d0.f("CameraStateRegistry")) {
                this.f426a.append(String.format(Locale.US, str, entry.getKey().toString(), entry.getValue().a() != null ? entry.getValue().a().toString() : "UNKNOWN"));
            }
            if (d(entry.getValue().a())) {
                i7++;
            }
        }
        if (C3043d0.f("CameraStateRegistry")) {
            this.f426a.append("-------------------------------------------------------------------\n");
            this.f426a.append(String.format(Locale.US, "Open count: %d (Max allowed: %d)", Integer.valueOf(i7), Integer.valueOf(this.f428c)));
            C3043d0.a("CameraStateRegistry", this.f426a.toString());
        }
        this.f431f = Math.max(this.f428c - i7, 0);
    }

    private static void h(InterfaceC3052i interfaceC3052i, J.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (h1.a.d()) {
            h1.a.f("CX:State[" + interfaceC3052i + "]", aVar.ordinal());
        }
    }

    private J.a k(InterfaceC3052i interfaceC3052i) {
        a aVarRemove = this.f430e.remove(interfaceC3052i);
        if (aVarRemove == null) {
            return null;
        }
        f();
        return aVarRemove.a();
    }

    private J.a l(InterfaceC3052i interfaceC3052i, J.a aVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        J.a aVarD = ((a) x0.g.h(this.f430e.get(interfaceC3052i), "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()")).d(aVar);
        J.a aVar2 = J.a.OPENING;
        if (aVar == aVar2) {
            x0.g.j(d(aVar) || aVarD == aVar2, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
        }
        if (aVarD != aVar) {
            h(interfaceC3052i, aVar);
            f();
        }
        return aVarD;
    }

    @Override
    public void a(int i7, int i8) {
        synchronized (this.f427b) {
            boolean z7 = true;
            this.f428c = i8 == 2 ? 2 : 1;
            boolean z8 = i7 != 2 && i8 == 2;
            if (i7 != 2 || i8 == 2) {
                z7 = false;
            }
            if (z8 || z7) {
                f();
            }
        }
    }

    public boolean c() {
        synchronized (this.f427b) {
            try {
                Iterator<Map.Entry<InterfaceC3052i, a>> it = this.f430e.entrySet().iterator();
                while (it.hasNext()) {
                    if (it.next().getValue().a() == J.a.CLOSING) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(z.InterfaceC3052i r7, C.J.a r8, boolean r9) {
        throw new UnsupportedOperationException("Method not decompiled: C.Q.e(z.i, C.J$a, boolean):void");
    }

    public void g(InterfaceC3052i interfaceC3052i, Executor executor, b bVar, c cVar) {
        synchronized (this.f427b) {
            x0.g.j(!this.f430e.containsKey(interfaceC3052i), "Camera is already registered: " + interfaceC3052i);
            this.f430e.put(interfaceC3052i, new a(null, executor, bVar, cVar));
        }
    }

    public boolean i(InterfaceC3052i interfaceC3052i) {
        boolean z7;
        synchronized (this.f427b) {
            try {
                a aVar = (a) x0.g.h(this.f430e.get(interfaceC3052i), "Camera must first be registered with registerCamera()");
                z7 = false;
                if (C3043d0.f("CameraStateRegistry")) {
                    this.f426a.setLength(0);
                    this.f426a.append(String.format(Locale.US, "tryOpenCamera(%s) [Available Cameras: %d, Already Open: %b (Previous state: %s)]", interfaceC3052i, Integer.valueOf(this.f431f), Boolean.valueOf(d(aVar.a())), aVar.a()));
                }
                if (this.f431f > 0 || d(aVar.a())) {
                    J.a aVar2 = J.a.OPENING;
                    aVar.d(aVar2);
                    h(interfaceC3052i, aVar2);
                    z7 = true;
                }
                if (C3043d0.f(QcdySgfdST.eYdPPUuLznMY)) {
                    this.f426a.append(String.format(Locale.US, " --> %s", z7 ? "SUCCESS" : "FAIL"));
                    C3043d0.a(oyfFwvPUKctyaG.tVezlJddqYigL, this.f426a.toString());
                }
                if (z7) {
                    f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z7;
    }

    public boolean j(String str, String str2) {
        synchronized (this.f427b) {
            try {
                boolean z7 = true;
                if (this.f429d.b() != 2) {
                    return true;
                }
                a aVarB = b(str);
                J.a aVarA = aVarB != null ? aVarB.a() : null;
                a aVarB2 = str2 != null ? b(str2) : null;
                J.a aVarA2 = aVarB2 != null ? aVarB2.a() : null;
                J.a aVar = J.a.OPEN;
                boolean z8 = aVar.equals(aVarA) || J.a.CONFIGURED.equals(aVarA);
                boolean z9 = aVar.equals(aVarA2) || J.a.CONFIGURED.equals(aVarA2);
                if (!z8 || !z9) {
                    z7 = false;
                }
                return z7;
            } finally {
            }
        }
    }
}
