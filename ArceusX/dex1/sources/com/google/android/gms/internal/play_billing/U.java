package com.google.android.gms.internal.play_billing;

import com.github.luben.zstd.BuildConfig;
import java.io.Serializable;

abstract class U implements Comparable, Serializable {

    final Comparable f15947d = BuildConfig.FLAVOR;

    U(Comparable comparable) {
    }

    @Override
    public int compareTo(U u7) {
        if (u7 == T.f15935e) {
            return 1;
        }
        if (u7 == S.f15926e) {
            return -1;
        }
        Comparable comparable = u7.f15947d;
        int i7 = C2176y0.f16188v;
        int iCompareTo = BuildConfig.FLAVOR.compareTo(BuildConfig.FLAVOR);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(false, false);
    }

    abstract void e(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof U) {
            try {
                if (compareTo((U) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    abstract void f(StringBuilder sb);

    public abstract int hashCode();
}
