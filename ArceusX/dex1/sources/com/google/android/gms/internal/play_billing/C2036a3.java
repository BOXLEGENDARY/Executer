package com.google.android.gms.internal.play_billing;

import java.util.Map;

final class C2036a3 implements Map.Entry {

    private final Map.Entry f15994d;

    public final C2054d3 a() {
        return (C2054d3) this.f15994d.getValue();
    }

    @Override
    public final Object getKey() {
        return this.f15994d.getKey();
    }

    @Override
    public final Object getValue() {
        if (((C2054d3) this.f15994d.getValue()) == null) {
            return null;
        }
        throw null;
    }

    @Override
    public final Object setValue(Object obj) {
        if (obj instanceof InterfaceC2155u3) {
            return ((C2054d3) this.f15994d.getValue()).c((InterfaceC2155u3) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
