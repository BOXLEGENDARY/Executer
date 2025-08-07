package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.List;
import java.util.Map;

final class J3 extends O3 {
    J3() {
        super(null);
    }

    @Override
    public final void a() {
        if (!k()) {
            for (int i7 = 0; i7 < c(); i7++) {
                Map.Entry entryH = h(i7);
                if (((H2) ((K3) entryH).c()).b()) {
                    entryH.setValue(Collections.unmodifiableList((List) entryH.getValue()));
                }
            }
            for (Map.Entry entry : d()) {
                if (((H2) entry.getKey()).b()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.a();
    }
}
