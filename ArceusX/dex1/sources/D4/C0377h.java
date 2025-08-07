package D4;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

final class C0377h implements InterfaceC0371b {

    private final C f958a;

    private final d0 f959b;

    private final Y f960c;

    private final E f961d;

    private final Handler f962e = new Handler(Looper.getMainLooper());

    C0377h(C c2, d0 d0Var, Y y7, E e7) {
        this.f958a = c2;
        this.f959b = d0Var;
        this.f960c = y7;
        this.f961d = e7;
    }

    public static List j(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Locale) it.next()).toLanguageTag());
        }
        return arrayList;
    }

    @Override
    public final Task<Void> a(List<String> list) {
        this.f961d.c(list);
        return this.f958a.e(list);
    }

    @Override
    public final synchronized void b(InterfaceC0375f interfaceC0375f) {
        this.f959b.b(interfaceC0375f);
    }

    @Override
    public final Set<String> c() {
        return this.f960c.c();
    }

    @Override
    public final Task<Void> d(int i7) {
        return this.f958a.c(i7);
    }

    @Override
    public final com.google.android.gms.tasks.Task<java.lang.Integer> e(D4.C0373d r6) {
        throw new UnsupportedOperationException("Method not decompiled: D4.C0377h.e(D4.d):com.google.android.gms.tasks.Task");
    }

    @Override
    public final Task<Void> f(List<String> list) {
        return this.f958a.d(list);
    }

    @Override
    public final synchronized void g(InterfaceC0375f interfaceC0375f) {
        this.f959b.d(interfaceC0375f);
    }
}
