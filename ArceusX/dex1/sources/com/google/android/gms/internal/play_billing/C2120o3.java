package com.google.android.gms.internal.play_billing;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class C2120o3 extends LinkedHashMap {

    private static final C2120o3 f16108e;

    private boolean f16109d;

    static {
        C2120o3 c2120o3 = new C2120o3();
        f16108e = c2120o3;
        c2120o3.f16109d = false;
    }

    private C2120o3() {
        this.f16109d = true;
    }

    public static C2120o3 a() {
        return f16108e;
    }

    private static int h(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof EnumC2174x4) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = W2.f15951b;
        int length = bArr.length;
        int iB = W2.b(length, bArr, 0, length);
        if (iB == 0) {
            return 1;
        }
        return iB;
    }

    private final void i() {
        if (!this.f16109d) {
            throw new UnsupportedOperationException();
        }
    }

    public final C2120o3 b() {
        return isEmpty() ? new C2120o3() : new C2120o3(this);
    }

    public final void c() {
        this.f16109d = false;
    }

    @Override
    public final void clear() {
        i();
        super.clear();
    }

    public final void d(C2120o3 c2120o3) {
        i();
        if (c2120o3.isEmpty()) {
            return;
        }
        putAll(c2120o3);
    }

    @Override
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        Iterator it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        return this.f16109d;
    }

    @Override
    public final int hashCode() {
        Iterator it = entrySet().iterator();
        int iH = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            iH += h(entry.getValue()) ^ h(entry.getKey());
        }
        return iH;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        i();
        byte[] bArr = W2.f15951b;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        i();
        for (Object obj : map.keySet()) {
            byte[] bArr = W2.f15951b;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        i();
        return super.remove(obj);
    }

    private C2120o3(Map map) {
        super(map);
        this.f16109d = true;
    }
}
