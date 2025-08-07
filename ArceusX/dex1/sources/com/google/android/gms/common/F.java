package com.google.android.gms.common;

import java.util.concurrent.Callable;

final class F extends H {

    private final Callable f14039f;

    F(Callable callable, E e7) {
        super();
        this.f14039f = callable;
    }

    @Override
    final String a() {
        try {
            return (String) this.f14039f.call();
        } catch (Exception e7) {
            throw new RuntimeException(e7);
        }
    }
}
