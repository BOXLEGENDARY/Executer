package com.google.android.gms.measurement.internal;

import n3.C2651i;

final class C2257o {

    final String f16931a;

    final String f16932b;

    final long f16933c;

    final long f16934d;

    final long f16935e;

    final long f16936f;

    final long f16937g;

    final Long f16938h;

    final Long f16939i;

    final Long f16940j;

    final Boolean f16941k;

    C2257o(String str, String str2, long j7, long j8, long j9, long j10, long j11, Long l7, Long l8, Long l9, Boolean bool) {
        C2651i.f(str);
        C2651i.f(str2);
        C2651i.a(j7 >= 0);
        C2651i.a(j8 >= 0);
        C2651i.a(j9 >= 0);
        C2651i.a(j11 >= 0);
        this.f16931a = str;
        this.f16932b = str2;
        this.f16933c = j7;
        this.f16934d = j8;
        this.f16935e = j9;
        this.f16936f = j10;
        this.f16937g = j11;
        this.f16938h = l7;
        this.f16939i = l8;
        this.f16940j = l9;
        this.f16941k = bool;
    }

    final C2257o a(Long l7, Long l8, Boolean bool) {
        return new C2257o(this.f16931a, this.f16932b, this.f16933c, this.f16934d, this.f16935e, this.f16936f, this.f16937g, this.f16938h, l7, l8, (bool == null || bool.booleanValue()) ? bool : null);
    }

    final C2257o b(long j7, long j8) {
        return new C2257o(this.f16931a, this.f16932b, this.f16933c, this.f16934d, this.f16935e, this.f16936f, j7, Long.valueOf(j8), this.f16939i, this.f16940j, this.f16941k);
    }

    final C2257o c(long j7) {
        return new C2257o(this.f16931a, this.f16932b, this.f16933c, this.f16934d, this.f16935e, j7, this.f16937g, this.f16938h, this.f16939i, this.f16940j, this.f16941k);
    }
}
