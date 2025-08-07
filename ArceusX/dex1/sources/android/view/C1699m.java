package android.view;

import a0.g;
import ha.V0;
import ha.c0;
import ha.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/h;", "Landroidx/lifecycle/i;", "a", "(Landroidx/lifecycle/h;)Landroidx/lifecycle/i;", "coroutineScope", "lifecycle-common"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class C1699m {
    public static final AbstractC1695i a(AbstractC1694h abstractC1694h) {
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl;
        Intrinsics.checkNotNullParameter(abstractC1694h, "<this>");
        do {
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl2 = (LifecycleCoroutineScopeImpl) abstractC1694h.c().get();
            if (lifecycleCoroutineScopeImpl2 != null) {
                return lifecycleCoroutineScopeImpl2;
            }
            lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(abstractC1694h, V0.b((z0) null, 1, (Object) null).K(c0.c().B1()));
        } while (!g.a(abstractC1694h.c(), null, lifecycleCoroutineScopeImpl));
        lifecycleCoroutineScopeImpl.b();
        return lifecycleCoroutineScopeImpl;
    }
}
