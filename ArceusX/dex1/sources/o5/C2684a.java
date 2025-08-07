package o5;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class C2684a {

    private final ReferenceQueue f22432a = new ReferenceQueue();

    private final Set f22433b = Collections.synchronizedSet(new HashSet());

    public interface InterfaceC0211a {
        void a();
    }

    private C2684a() {
    }

    public static C2684a a() {
        C2684a c2684a = new C2684a();
        c2684a.b(c2684a, new Runnable() {
            @Override
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = c2684a.f22432a;
        final Set set = c2684a.f22433b;
        Thread thread = new Thread(new Runnable() {
            @Override
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((s) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return c2684a;
    }

    public InterfaceC0211a b(Object obj, Runnable runnable) {
        s sVar = new s(obj, this.f22432a, this.f22433b, runnable, null);
        this.f22433b.add(sVar);
        return sVar;
    }
}
