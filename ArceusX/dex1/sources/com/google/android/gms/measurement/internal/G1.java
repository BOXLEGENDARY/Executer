package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.Y5;
import java.util.Map;

final class G1 implements Y5 {

    final String f16303a;

    final H1 f16304b;

    G1(H1 h12, String str) {
        this.f16304b = h12;
        this.f16303a = str;
    }

    @Override
    public final String n(String str) {
        Map map = (Map) this.f16304b.f16311d.get(this.f16303a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
