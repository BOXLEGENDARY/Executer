package com.google.android.gms.common.api.internal;

final class O extends ThreadLocal {
    O() {
    }

    @Override
    protected final Object initialValue() {
        return Boolean.FALSE;
    }
}
