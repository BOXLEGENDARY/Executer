package t3;

import J3.h;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import t3.C2910a;

final class b implements C2910a.InterfaceC0228a {
    b() {
    }

    @Override
    public final ScheduledExecutorService a() {
        h.a();
        return Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }
}
