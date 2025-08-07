package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.Map;

public final class C1833b {

    private String f15094a;

    private final long f15095b;

    private final Map<String, Object> f15096c;

    public C1833b(String str, long j7, Map<String, Object> map) {
        this.f15094a = str;
        this.f15095b = j7;
        HashMap map2 = new HashMap();
        this.f15096c = map2;
        if (map != null) {
            map2.putAll(map);
        }
    }

    public final long a() {
        return this.f15095b;
    }

    public final C1833b clone() {
        return new C1833b(this.f15094a, this.f15095b, new HashMap(this.f15096c));
    }

    public final Object c(String str) {
        if (this.f15096c.containsKey(str)) {
            return this.f15096c.get(str);
        }
        return null;
    }

    public final String d() {
        return this.f15094a;
    }

    public final Map<String, Object> e() {
        return this.f15096c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1833b)) {
            return false;
        }
        C1833b c1833b = (C1833b) obj;
        if (this.f15095b == c1833b.f15095b && this.f15094a.equals(c1833b.f15094a)) {
            return this.f15096c.equals(c1833b.f15096c);
        }
        return false;
    }

    public final void f(String str) {
        this.f15094a = str;
    }

    public final void g(String str, Object obj) {
        if (obj == null) {
            this.f15096c.remove(str);
        } else {
            this.f15096c.put(str, obj);
        }
    }

    public final int hashCode() {
        int iHashCode = this.f15094a.hashCode();
        long j7 = this.f15095b;
        return (((iHashCode * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + this.f15096c.hashCode();
    }

    public final String toString() {
        String str = this.f15094a;
        long j7 = this.f15095b;
        String string = this.f15096c.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + string.length());
        sb.append("Event{name='");
        sb.append(str);
        sb.append("', timestamp=");
        sb.append(j7);
        sb.append(", params=");
        sb.append(string);
        sb.append('}');
        return sb.toString();
    }
}
