package com.google.android.gms.tasks;

import a4.InterfaceC1566c;
import a4.InterfaceC1568e;
import a4.InterfaceC1569f;
import a4.InterfaceC1570g;
import a4.InterfaceC1573j;
import java.util.concurrent.Executor;

public abstract class Task<TResult> {
    public Task<TResult> a(Executor executor, InterfaceC1568e interfaceC1568e) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public Task<TResult> addOnCompleteListener(OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public Task<TResult> b(Executor executor, OnCompleteListener<TResult> onCompleteListener) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public abstract Task<TResult> c(InterfaceC1569f interfaceC1569f);

    public abstract Task<TResult> d(Executor executor, InterfaceC1569f interfaceC1569f);

    public abstract Task<TResult> e(InterfaceC1570g<? super TResult> interfaceC1570g);

    public abstract Task<TResult> f(Executor executor, InterfaceC1570g<? super TResult> interfaceC1570g);

    public <TContinuationResult> Task<TContinuationResult> g(Executor executor, InterfaceC1566c<TResult, TContinuationResult> interfaceC1566c) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> h(InterfaceC1566c<TResult, Task<TContinuationResult>> interfaceC1566c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> i(Executor executor, InterfaceC1566c<TResult, Task<TContinuationResult>> interfaceC1566c) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract Exception j();

    public abstract TResult k();

    public abstract <X extends Throwable> TResult l(Class<X> cls) throws Throwable;

    public abstract boolean m();

    public abstract boolean n();

    public abstract boolean o();

    public <TContinuationResult> Task<TContinuationResult> p(InterfaceC1573j<TResult, TContinuationResult> interfaceC1573j) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> Task<TContinuationResult> q(Executor executor, InterfaceC1573j<TResult, TContinuationResult> interfaceC1573j) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
