package com.google.gson;

import java.util.ArrayList;
import java.util.Iterator;

public final class i extends l implements Iterable<l> {

    private final ArrayList<l> f19217d = new ArrayList<>();

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof i) && ((i) obj).f19217d.equals(this.f19217d));
    }

    public int hashCode() {
        return this.f19217d.hashCode();
    }

    @Override
    public Iterator<l> iterator() {
        return this.f19217d.iterator();
    }

    public void n(l lVar) {
        if (lVar == null) {
            lVar = n.f19218d;
        }
        this.f19217d.add(lVar);
    }
}
