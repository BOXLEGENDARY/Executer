package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
import com.github.luben.zstd.BuildConfig;
import n3.C2651i;

public final class C2288u1 {

    final String f17043a;

    private final String f17044b;

    private final String f17045c;

    private final long f17046d;

    final C2303x1 f17047e;

    C2288u1(C2303x1 c2303x1, String str, long j7, W3.g gVar) {
        this.f17047e = c2303x1;
        C2651i.f("health_monitor");
        C2651i.a(j7 > 0);
        this.f17043a = "health_monitor:start";
        this.f17044b = "health_monitor:count";
        this.f17045c = "health_monitor:value";
        this.f17046d = j7;
    }

    private final long c() {
        return this.f17047e.o().getLong(this.f17043a, 0L);
    }

    private final void d() {
        this.f17047e.h();
        long jA = this.f17047e.f16818a.c().a();
        SharedPreferences.Editor editorEdit = this.f17047e.o().edit();
        editorEdit.remove(this.f17044b);
        editorEdit.remove(this.f17045c);
        editorEdit.putLong(this.f17043a, jA);
        editorEdit.apply();
    }

    public final Pair<String, Long> a() {
        long jAbs;
        this.f17047e.h();
        this.f17047e.h();
        long jC = c();
        if (jC == 0) {
            d();
            jAbs = 0;
        } else {
            jAbs = Math.abs(jC - this.f17047e.f16818a.c().a());
        }
        long j7 = this.f17046d;
        if (jAbs < j7) {
            return null;
        }
        if (jAbs > j7 + j7) {
            d();
            return null;
        }
        String string = this.f17047e.o().getString(this.f17045c, null);
        long j8 = this.f17047e.o().getLong(this.f17044b, 0L);
        d();
        return (string == null || j8 <= 0) ? C2303x1.f17080x : new Pair<>(string, Long.valueOf(j8));
    }

    public final void b(String str, long j7) {
        this.f17047e.h();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        long j8 = this.f17047e.o().getLong(this.f17044b, 0L);
        if (j8 <= 0) {
            SharedPreferences.Editor editorEdit = this.f17047e.o().edit();
            editorEdit.putString(this.f17045c, str);
            editorEdit.putLong(this.f17044b, 1L);
            editorEdit.apply();
            return;
        }
        long jNextLong = this.f17047e.f16818a.N().t().nextLong();
        long j9 = j8 + 1;
        long j10 = Long.MAX_VALUE / j9;
        SharedPreferences.Editor editorEdit2 = this.f17047e.o().edit();
        if ((Long.MAX_VALUE & jNextLong) < j10) {
            editorEdit2.putString(this.f17045c, str);
        }
        editorEdit2.putLong(this.f17044b, j9);
        editorEdit2.apply();
    }
}
