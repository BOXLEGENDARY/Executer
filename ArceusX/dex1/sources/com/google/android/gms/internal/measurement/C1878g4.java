package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class C1878g4 extends AbstractC1861e3<String> implements RandomAccess, InterfaceC1886h4 {

    private static final C1878g4 f15167i;

    public static final InterfaceC1886h4 f15168v;

    private final List<Object> f15169e;

    static {
        C1878g4 c1878g4 = new C1878g4(10);
        f15167i = c1878g4;
        c1878g4.zzb();
        f15168v = c1878g4;
    }

    public C1878g4() {
        this(10);
    }

    private static String g(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof AbstractC1980t3 ? ((AbstractC1980t3) obj).s(C1838b4.f15100b) : C1838b4.h((byte[]) obj);
    }

    @Override
    public final void add(int i7, Object obj) {
        d();
        this.f15169e.add(i7, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final boolean addAll(int i7, Collection<? extends String> collection) {
        d();
        if (collection instanceof InterfaceC1886h4) {
            collection = ((InterfaceC1886h4) collection).f();
        }
        boolean zAddAll = this.f15169e.addAll(i7, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override
    public final InterfaceC1886h4 b() {
        return a() ? new C1855d5(this) : this;
    }

    @Override
    public final Object c(int i7) {
        return this.f15169e.get(i7);
    }

    @Override
    public final void clear() {
        d();
        this.f15169e.clear();
        ((AbstractList) this).modCount++;
    }

    @Override
    public final String get(int i7) {
        Object obj = this.f15169e.get(i7);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC1980t3) {
            AbstractC1980t3 abstractC1980t3 = (AbstractC1980t3) obj;
            String strS = abstractC1980t3.s(C1838b4.f15100b);
            if (abstractC1980t3.n()) {
                this.f15169e.set(i7, strS);
            }
            return strS;
        }
        byte[] bArr = (byte[]) obj;
        String strH = C1838b4.h(bArr);
        if (C1838b4.i(bArr)) {
            this.f15169e.set(i7, strH);
        }
        return strH;
    }

    @Override
    public final List<?> f() {
        return Collections.unmodifiableList(this.f15169e);
    }

    @Override
    public final InterfaceC1830a4 h(int i7) {
        if (i7 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i7);
        arrayList.addAll(this.f15169e);
        return new C1878g4((ArrayList<Object>) arrayList);
    }

    @Override
    public final void i(AbstractC1980t3 abstractC1980t3) {
        d();
        this.f15169e.add(abstractC1980t3);
        ((AbstractList) this).modCount++;
    }

    @Override
    public final Object remove(int i7) {
        d();
        Object objRemove = this.f15169e.remove(i7);
        ((AbstractList) this).modCount++;
        return g(objRemove);
    }

    @Override
    public final Object set(int i7, Object obj) {
        d();
        return g(this.f15169e.set(i7, (String) obj));
    }

    @Override
    public final int size() {
        return this.f15169e.size();
    }

    public C1878g4(int i7) {
        this.f15169e = new ArrayList(i7);
    }

    private C1878g4(ArrayList<Object> arrayList) {
        this.f15169e = arrayList;
    }

    @Override
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
