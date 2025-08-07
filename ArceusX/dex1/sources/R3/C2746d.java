package r3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import l3.InterfaceC2534i;
import n3.C2651i;

public final class C2746d {

    private final List f22888a;

    private final InterfaceC2743a f22889b;

    private final Executor f22890c;

    public static class a {

        private final List f22891a = new ArrayList();

        private InterfaceC2743a f22892b;

        private Executor f22893c;

        public a a(InterfaceC2534i interfaceC2534i) {
            this.f22891a.add(interfaceC2534i);
            return this;
        }

        public C2746d b() {
            return new C2746d(this.f22891a, this.f22892b, this.f22893c, true, null);
        }
    }

    C2746d(List list, InterfaceC2743a interfaceC2743a, Executor executor, boolean z7, C2749g c2749g) {
        C2651i.m(list, "APIs must not be null.");
        C2651i.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            C2651i.m(interfaceC2743a, "Listener must not be null when listener executor is set.");
        }
        this.f22888a = list;
        this.f22889b = interfaceC2743a;
        this.f22890c = executor;
    }

    public static a d() {
        return new a();
    }

    public List<InterfaceC2534i> a() {
        return this.f22888a;
    }

    public InterfaceC2743a b() {
        return this.f22889b;
    }

    public Executor c() {
        return this.f22890c;
    }
}
