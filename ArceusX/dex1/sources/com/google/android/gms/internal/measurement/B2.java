package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

final class B2 extends ContentObserver {
    B2(C2 c2, Handler handler) {
        super(null);
    }

    @Override
    public final void onChange(boolean z7) {
        P2.e();
    }
}
