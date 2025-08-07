package M;

import kotlin.jvm.internal.Intrinsics;
import x0.InterfaceC2984a;

public class C0524u<T> implements InterfaceC2984a<T> {

    private InterfaceC2984a<T> f2314a;

    public void a(InterfaceC2984a<T> interfaceC2984a) {
        this.f2314a = interfaceC2984a;
    }

    @Override
    public void accept(T t7) {
        Intrinsics.e(this.f2314a, "Listener is not set.");
        this.f2314a.accept(t7);
    }
}
