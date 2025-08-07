package o5;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;
import o5.C2684a;

final class s extends PhantomReference implements C2684a.InterfaceC0211a {

    private final Set f22495a;

    private final Runnable f22496b;

    s(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, r rVar) {
        super(obj, referenceQueue);
        this.f22495a = set;
        this.f22496b = runnable;
    }

    @Override
    public final void a() {
        if (this.f22495a.remove(this)) {
            clear();
            this.f22496b.run();
        }
    }
}
