package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.InterfaceC2320c;
import java.util.Set;

final class U extends InterfaceC2320c.d.a {

    private String f18817a;

    private Set f18818b;

    U() {
    }

    @Override
    public final InterfaceC2320c.d a() {
        Set set = this.f18818b;
        if (set != null) {
            return new V(this.f18817a, set, null);
        }
        throw new IllegalStateException("Missing required properties: verdictOptOut");
    }

    @Override
    public final InterfaceC2320c.d.a b(String str) {
        this.f18817a = str;
        return this;
    }

    public final InterfaceC2320c.d.a c(Set<Integer> set) {
        if (set == null) {
            throw new NullPointerException("Null verdictOptOut");
        }
        this.f18818b = set;
        return this;
    }
}
