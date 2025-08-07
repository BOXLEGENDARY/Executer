package com.roblox.client.flags;

import j6.InterfaceC2504b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class b implements InterfaceC2504b {

    private HashMap<String, a> f19996a = new HashMap<>();

    @Override
    public Set<Map.Entry<String, a>> G1() {
        return this.f19996a.entrySet();
    }

    protected void R3(String str, a aVar) {
        this.f19996a.put(str, aVar);
    }

    @Override
    public a c2(String str) {
        return this.f19996a.get(str);
    }
}
