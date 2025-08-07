package l3;

import com.google.android.gms.common.api.Status;
import m3.C2581l;
import n3.C2651i;

public final class C2536k {
    public static <R extends InterfaceC2540o> AbstractC2535j<R> a(R r7, AbstractC2532g abstractC2532g) {
        C2651i.m(r7, "Result must not be null");
        C2651i.b(!r7.d().r(), "Status code must not be SUCCESS");
        t tVar = new t(abstractC2532g, r7);
        tVar.f(r7);
        return tVar;
    }

    public static AbstractC2535j<Status> b(Status status, AbstractC2532g abstractC2532g) {
        C2651i.m(status, "Result must not be null");
        C2581l c2581l = new C2581l(abstractC2532g);
        c2581l.f(status);
        return c2581l;
    }
}
