package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.d7;
import java.util.List;

final class F1 implements d7 {

    final H1 f16296a;

    F1(H1 h12) {
        this.f16296a = h12;
    }

    @Override
    public final void a(int i7, String str, List<String> list, boolean z7, boolean z8) {
        int i8 = i7 - 1;
        C2224h1 c2224h1U = i8 != 0 ? i8 != 1 ? i8 != 3 ? i8 != 4 ? this.f16296a.f16818a.b().u() : z7 ? this.f16296a.f16818a.b().y() : !z8 ? this.f16296a.f16818a.b().x() : this.f16296a.f16818a.b().w() : this.f16296a.f16818a.b().v() : z7 ? this.f16296a.f16818a.b().t() : !z8 ? this.f16296a.f16818a.b().s() : this.f16296a.f16818a.b().r() : this.f16296a.f16818a.b().q();
        int size = list.size();
        if (size == 1) {
            c2224h1U.b(str, list.get(0));
            return;
        }
        if (size == 2) {
            c2224h1U.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            c2224h1U.a(str);
        } else {
            c2224h1U.d(str, list.get(0), list.get(1), list.get(2));
        }
    }
}
