package com.google.android.gms.common.api.internal;

import Q6.QtA.QXojhh;
import android.os.Looper;
import com.google.android.gms.common.api.internal.C1804d;
import java.util.concurrent.Executor;
import n3.C2651i;

public class C1805e {
    public static <L> C1804d<L> a(L l7, Looper looper, String str) {
        C2651i.m(l7, "Listener must not be null");
        C2651i.m(looper, "Looper must not be null");
        C2651i.m(str, "Listener type must not be null");
        return new C1804d<>(looper, l7, str);
    }

    public static <L> C1804d<L> b(L l7, Executor executor, String str) {
        C2651i.m(l7, "Listener must not be null");
        C2651i.m(executor, "Executor must not be null");
        C2651i.m(str, "Listener type must not be null");
        return new C1804d<>(executor, l7, str);
    }

    public static <L> C1804d.a<L> c(L l7, String str) {
        C2651i.m(l7, "Listener must not be null");
        C2651i.m(str, "Listener type must not be null");
        C2651i.g(str, QXojhh.lKyEkgZUSUhjRK);
        return new C1804d.a<>(l7, str);
    }
}
