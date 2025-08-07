package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Map;
import java.util.Set;

public abstract class AbstractC2075h0 implements Map, Serializable {

    private transient AbstractC2099l0 f16059d;

    private transient AbstractC2099l0 f16060e;

    private transient Z f16061i;

    AbstractC2075h0() {
    }

    public static AbstractC2075h0 c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        L.b("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        L.b("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        L.b("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return G0.h(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
    }

    abstract Z a();

    @Override
    public final Z values() {
        Z z7 = this.f16061i;
        if (z7 != null) {
            return z7;
        }
        Z zA = a();
        this.f16061i = zA;
        return zA;
    }

    @Override
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    abstract AbstractC2099l0 d();

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    abstract AbstractC2099l0 f();

    @Override
    public final AbstractC2099l0 entrySet() {
        AbstractC2099l0 abstractC2099l0 = this.f16059d;
        if (abstractC2099l0 != null) {
            return abstractC2099l0;
        }
        AbstractC2099l0 abstractC2099l0D = d();
        this.f16059d = abstractC2099l0D;
        return abstractC2099l0D;
    }

    @Override
    public abstract Object get(Object obj);

    @Override
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override
    public final int hashCode() {
        return J0.a(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public final Set keySet() {
        AbstractC2099l0 abstractC2099l0 = this.f16060e;
        if (abstractC2099l0 != null) {
            return abstractC2099l0;
        }
        AbstractC2099l0 abstractC2099l0F = f();
        this.f16060e = abstractC2099l0F;
        return abstractC2099l0F;
    }

    @Override
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        int size = size();
        L.a(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append('{');
        boolean z7 = true;
        for (Map.Entry entry : entrySet()) {
            if (!z7) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z7 = false;
        }
        sb.append('}');
        return sb.toString();
    }
}
