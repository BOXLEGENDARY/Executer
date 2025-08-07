package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.C1818c;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import l3.AbstractC2532g;
import l3.C2526a;
import m3.InterfaceC2572c;
import m3.InterfaceC2577h;
import n3.C2644b;
import n3.C2651i;

public abstract class c<T extends IInterface> extends b<T> implements C2526a.f {

    private final C2644b f14297Y;

    private final Set f14298Z;

    private final Account f14299a0;

    @Deprecated
    protected c(Context context, Looper looper, int i7, C2644b c2644b, AbstractC2532g.a aVar, AbstractC2532g.b bVar) {
        this(context, looper, i7, c2644b, (InterfaceC2572c) aVar, (InterfaceC2577h) bVar);
    }

    private final Set l0(Set set) {
        Set<Scope> setK0 = k0(set);
        Iterator<Scope> it = setK0.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setK0;
    }

    @Override
    protected final Set<Scope> C() {
        return this.f14298Z;
    }

    @Override
    public Set<Scope> c() {
        return o() ? this.f14298Z : Collections.emptySet();
    }

    protected final C2644b j0() {
        return this.f14297Y;
    }

    protected Set<Scope> k0(Set<Scope> set) {
        return set;
    }

    @Override
    public final Account u() {
        return this.f14299a0;
    }

    @Override
    protected Executor w() {
        return null;
    }

    protected c(Context context, Looper looper, int i7, C2644b c2644b, InterfaceC2572c interfaceC2572c, InterfaceC2577h interfaceC2577h) {
        this(context, looper, d.b(context), C1818c.n(), i7, c2644b, (InterfaceC2572c) C2651i.l(interfaceC2572c), (InterfaceC2577h) C2651i.l(interfaceC2577h));
    }

    protected c(Context context, Looper looper, d dVar, C1818c c1818c, int i7, C2644b c2644b, InterfaceC2572c interfaceC2572c, InterfaceC2577h interfaceC2577h) {
        super(context, looper, dVar, c1818c, i7, interfaceC2572c == null ? null : new f(interfaceC2572c), interfaceC2577h == null ? null : new g(interfaceC2577h), c2644b.j());
        this.f14297Y = c2644b;
        this.f14299a0 = c2644b.a();
        this.f14298Z = l0(c2644b.d());
    }
}
