package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class C1940o2 extends ContentObserver {
    C1940o2(Handler handler) {
        super(null);
    }

    @Override
    public final void onChange(boolean z7) {
        C1948p2.f15248e.set(true);
    }
}
