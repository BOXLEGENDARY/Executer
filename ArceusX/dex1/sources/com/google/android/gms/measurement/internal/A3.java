package com.google.android.gms.measurement.internal;

import J2.a;
import android.util.Pair;
import com.github.luben.zstd.BuildConfig;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;

public final class A3 extends T3 {

    private String f16253d;

    private boolean f16254e;

    private long f16255f;

    public final C2283t1 f16256g;

    public final C2283t1 f16257h;

    public final C2283t1 f16258i;

    public final C2283t1 f16259j;

    public final C2283t1 f16260k;

    A3(c4 c4Var) {
        super(c4Var);
        C2303x1 c2303x1F = this.f16818a.F();
        c2303x1F.getClass();
        this.f16256g = new C2283t1(c2303x1F, "last_delete_stale", 0L);
        C2303x1 c2303x1F2 = this.f16818a.F();
        c2303x1F2.getClass();
        this.f16257h = new C2283t1(c2303x1F2, "backoff", 0L);
        C2303x1 c2303x1F3 = this.f16818a.F();
        c2303x1F3.getClass();
        this.f16258i = new C2283t1(c2303x1F3, "last_upload", 0L);
        C2303x1 c2303x1F4 = this.f16818a.F();
        c2303x1F4.getClass();
        this.f16259j = new C2283t1(c2303x1F4, "last_upload_attempt", 0L);
        C2303x1 c2303x1F5 = this.f16818a.F();
        c2303x1F5.getClass();
        this.f16260k = new C2283t1(c2303x1F5, "midnight_offset", 0L);
    }

    @Override
    protected final boolean l() {
        return false;
    }

    @Deprecated
    final Pair<String, Boolean> m(String str) {
        h();
        long jB = this.f16818a.c().b();
        String str2 = this.f16253d;
        if (str2 != null && jB < this.f16255f) {
            return new Pair<>(str2, Boolean.valueOf(this.f16254e));
        }
        this.f16255f = jB + this.f16818a.z().r(str, Y0.f16610c);
        J2.a.e(true);
        try {
            a.C0027a c0027aB = J2.a.b(this.f16818a.f());
            this.f16253d = BuildConfig.FLAVOR;
            String strA = c0027aB.a();
            if (strA != null) {
                this.f16253d = strA;
            }
            this.f16254e = c0027aB.b();
        } catch (Exception e7) {
            this.f16818a.b().q().b("Unable to get advertising id", e7);
            this.f16253d = BuildConfig.FLAVOR;
        }
        J2.a.e(false);
        return new Pair<>(this.f16253d, Boolean.valueOf(this.f16254e));
    }

    final Pair<String, Boolean> n(String str, W3.a aVar) {
        return aVar.j() ? m(str) : new Pair<>(BuildConfig.FLAVOR, Boolean.FALSE);
    }

    @Deprecated
    final String o(String str) throws NoSuchAlgorithmException {
        h();
        String str2 = (String) m(str).first;
        MessageDigest messageDigestS = i4.s();
        if (messageDigestS == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestS.digest(str2.getBytes())));
    }
}
