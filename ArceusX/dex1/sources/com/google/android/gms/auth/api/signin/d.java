package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

final class d implements Comparator {
    d() {
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return ((Scope) obj).l().compareTo(((Scope) obj2).l());
    }
}
