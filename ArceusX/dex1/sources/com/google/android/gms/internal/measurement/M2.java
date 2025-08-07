package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import com.github.luben.zstd.BuildConfig;

public final class M2 {

    final String f14832a;

    final Uri f14833b;

    final String f14834c;

    final String f14835d;

    final boolean f14836e;

    final boolean f14837f;

    final boolean f14838g;

    final boolean f14839h;

    private M2(String str, Uri uri, String str2, String str3, boolean z7, boolean z8, boolean z9, boolean z10, T2<Context, Boolean> t22) {
        this.f14832a = null;
        this.f14833b = uri;
        this.f14834c = BuildConfig.FLAVOR;
        this.f14835d = BuildConfig.FLAVOR;
        this.f14836e = z7;
        this.f14837f = false;
        this.f14838g = false;
        this.f14839h = false;
    }

    public final M2 a() {
        if (this.f14834c.isEmpty()) {
            return new M2(null, this.f14833b, this.f14834c, this.f14835d, true, false, false, false, null);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    public final P2<Double> b(String str, double d7) {
        return new K2(this, "measurement.test.double_flag", Double.valueOf(-3.0d), true);
    }

    public final P2<Long> c(String str, long j7) {
        return new I2(this, str, Long.valueOf(j7), true);
    }

    public final P2<String> d(String str, String str2) {
        return new L2(this, str, str2, true);
    }

    public final P2<Boolean> e(String str, boolean z7) {
        return new J2(this, str, Boolean.valueOf(z7), true);
    }

    public M2(Uri uri) {
        this(null, uri, BuildConfig.FLAVOR, BuildConfig.FLAVOR, false, false, false, false, null);
    }
}
