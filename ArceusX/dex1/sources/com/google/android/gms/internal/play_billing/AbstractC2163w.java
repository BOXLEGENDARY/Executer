package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

abstract class AbstractC2163w extends O0 {

    private final int f16155d;

    private int f16156e;

    protected AbstractC2163w(int i7, int i8) {
        C2145t.b(i8, i7, "index");
        this.f16155d = i7;
        this.f16156e = i8;
    }

    protected abstract Object a(int i7);

    @Override
    public final boolean hasNext() {
        return this.f16156e < this.f16155d;
    }

    @Override
    public final boolean hasPrevious() {
        return this.f16156e > 0;
    }

    @Override
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f16156e;
        this.f16156e = i7 + 1;
        return a(i7);
    }

    @Override
    public final int nextIndex() {
        return this.f16156e;
    }

    @Override
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i7 = this.f16156e - 1;
        this.f16156e = i7;
        return a(i7);
    }

    @Override
    public final int previousIndex() {
        return this.f16156e - 1;
    }
}
