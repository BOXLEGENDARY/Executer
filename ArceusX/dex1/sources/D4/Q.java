package D4;

import com.google.android.gms.tasks.Task;
import java.util.List;
import java.util.Set;

final class Q implements InterfaceC0371b {

    private final E4.V f915a;

    private final E4.V f916b;

    private final E4.V f917c;

    Q(E4.V v7, E4.V v8, E4.V v9) {
        this.f915a = v7;
        this.f916b = v8;
        this.f917c = v9;
    }

    private final InterfaceC0371b h() {
        return this.f917c.zza() != null ? (InterfaceC0371b) this.f916b.zza() : (InterfaceC0371b) this.f915a.zza();
    }

    @Override
    public final Task<Void> a(List<String> list) {
        return h().a(list);
    }

    @Override
    public final void b(InterfaceC0375f interfaceC0375f) {
        h().b(interfaceC0375f);
    }

    @Override
    public final Set<String> c() {
        return h().c();
    }

    @Override
    public final Task<Void> d(int i7) {
        return h().d(i7);
    }

    @Override
    public final Task<Integer> e(C0373d c0373d) {
        return h().e(c0373d);
    }

    @Override
    public final Task<Void> f(List<String> list) {
        return h().f(list);
    }

    @Override
    public final void g(InterfaceC0375f interfaceC0375f) {
        h().g(interfaceC0375f);
    }
}
