package android.view;

import java.util.Iterator;
import java.util.Map;
import m.C2556b;

public class C1707u<T> extends C1709w<T> {

    private C2556b<LiveData<?>, a<?>> f11420l = new C2556b<>();

    private static class a<V> implements InterfaceC1710x<V> {

        final LiveData<V> f11421a;

        final InterfaceC1710x<? super V> f11422b;

        int f11423c = -1;

        a(LiveData<V> liveData, InterfaceC1710x<? super V> interfaceC1710x) {
            this.f11421a = liveData;
            this.f11422b = interfaceC1710x;
        }

        @Override
        public void a(V v7) {
            if (this.f11423c != this.f11421a.g()) {
                this.f11423c = this.f11421a.g();
                this.f11422b.a(v7);
            }
        }

        void b() {
            this.f11421a.j(this);
        }

        void c() {
            this.f11421a.n(this);
        }
    }

    @Override
    protected void k() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f11420l.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @Override
    protected void l() {
        Iterator<Map.Entry<LiveData<?>, a<?>>> it = this.f11420l.iterator();
        while (it.hasNext()) {
            it.next().getValue().c();
        }
    }

    public <S> void p(LiveData<S> liveData, InterfaceC1710x<? super S> interfaceC1710x) {
        if (liveData == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(liveData, interfaceC1710x);
        a<?> aVarL = this.f11420l.l(liveData, aVar);
        if (aVarL != null && aVarL.f11422b != interfaceC1710x) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarL == null && h()) {
            aVar.b();
        }
    }

    public <S> void q(LiveData<S> liveData) {
        a<?> aVarM = this.f11420l.m(liveData);
        if (aVarM != null) {
            aVarM.c();
        }
    }
}
