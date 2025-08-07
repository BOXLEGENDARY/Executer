package com.google.android.gms.common.api.internal;

import a4.C1574k;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

final class C1811k implements OnCompleteListener {

    final C1574k f14158a;

    final C1812l f14159b;

    C1811k(C1812l c1812l, C1574k c1574k) {
        this.f14159b = c1812l;
        this.f14158a = c1574k;
    }

    @Override
    public final void onComplete(Task task) {
        this.f14159b.f14161b.remove(this.f14158a);
    }
}
