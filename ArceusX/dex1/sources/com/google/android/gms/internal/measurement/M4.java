package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class M4 extends T4 {
    M4(int i7) {
        super(i7, null);
    }

    @Override
    public final void a() {
        if (!k()) {
            for (int i7 = 0; i7 < b(); i7++) {
                Map.Entry entryH = h(i7);
                if (((K3) entryH.getKey()).a()) {
                    entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                }
            }
            for (Map.Entry entry : c()) {
                if (((K3) entry.getKey()).a()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
