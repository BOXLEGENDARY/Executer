package com.google.android.gms.internal.play_billing;

import java.util.Comparator;
import java.util.SortedSet;

final class M0 {
    public static boolean a(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = C2146t0.f16149d;
            }
        } else {
            if (!(iterable instanceof L0)) {
                return false;
            }
            comparator2 = ((L0) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
