package com.google.android.gms.internal.play_billing;

import com.github.luben.zstd.BuildConfig;

final class T extends U {

    private static final T f15935e = new T();

    private T() {
        super(BuildConfig.FLAVOR);
    }

    @Override
    public final int c(U u7) {
        return u7 == this ? 0 : -1;
    }

    @Override
    public final int compareTo(Object obj) {
        return c((U) obj);
    }

    @Override
    final void e(StringBuilder sb) {
        sb.append("(-∞");
    }

    @Override
    final void f(StringBuilder sb) {
        throw new AssertionError();
    }

    @Override
    public final int hashCode() {
        return System.identityHashCode(this);
    }

    public final String toString() {
        return "-∞";
    }
}
