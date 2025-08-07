package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class C1979t2 extends ContentObserver {

    final C1995v2 f15324a;

    C1979t2(C1995v2 c1995v2, Handler handler) {
        super(null);
        this.f15324a = c1995v2;
    }

    @Override
    public final void onChange(boolean z7) {
        this.f15324a.e();
    }
}
