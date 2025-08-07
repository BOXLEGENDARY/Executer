package com.google.gson;

import com.google.gson.internal.LinkedTreeMap;
import java.util.Map;
import java.util.Set;

public final class o extends l {

    private final LinkedTreeMap<String, l> f19219d = new LinkedTreeMap<>(false);

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof o) && ((o) obj).f19219d.equals(this.f19219d));
    }

    public int hashCode() {
        return this.f19219d.hashCode();
    }

    public void n(String str, l lVar) {
        LinkedTreeMap<String, l> linkedTreeMap = this.f19219d;
        if (lVar == null) {
            lVar = n.f19218d;
        }
        linkedTreeMap.put(str, lVar);
    }

    public Set<Map.Entry<String, l>> o() {
        return this.f19219d.entrySet();
    }
}
