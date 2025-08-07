package com.google.android.gms.measurement.internal;

import J2.a;
import android.content.SharedPreferences;
import android.util.Pair;
import androidx.room.kU.HguUe;
import backtraceio.library.services.BacktraceMetrics;
import com.github.luben.zstd.BuildConfig;
import n3.C2651i;

final class C2303x1 extends AbstractC2230i2 {

    static final Pair<String, Long> f17080x = new Pair<>(BuildConfig.FLAVOR, 0L);

    private SharedPreferences f17081c;

    public C2288u1 f17082d;

    public final C2283t1 f17083e;

    public final C2283t1 f17084f;

    public final C2293v1 f17085g;

    private String f17086h;

    private boolean f17087i;

    private long f17088j;

    public final C2283t1 f17089k;

    public final C2273r1 f17090l;

    public final C2293v1 f17091m;

    public final C2273r1 f17092n;

    public final C2283t1 f17093o;

    public boolean f17094p;

    public final C2273r1 f17095q;

    public final C2273r1 f17096r;

    public final C2283t1 f17097s;

    public final C2293v1 f17098t;

    public final C2293v1 f17099u;

    public final C2283t1 f17100v;

    public final C2278s1 f17101w;

    C2303x1(N1 n1) {
        super(n1);
        this.f17089k = new C2283t1(this, "session_timeout", BacktraceMetrics.defaultTimeIntervalMs);
        this.f17090l = new C2273r1(this, "start_new_session", true);
        this.f17093o = new C2283t1(this, "last_pause_time", 0L);
        this.f17091m = new C2293v1(this, "non_personalized_ads", null);
        this.f17092n = new C2273r1(this, "allow_remote_dynamite", false);
        this.f17083e = new C2283t1(this, "first_open_time", 0L);
        this.f17084f = new C2283t1(this, "app_install_time", 0L);
        this.f17085g = new C2293v1(this, "app_instance_id", null);
        this.f17095q = new C2273r1(this, "app_backgrounded", false);
        this.f17096r = new C2273r1(this, "deep_link_retrieval_complete", false);
        this.f17097s = new C2283t1(this, "deep_link_retrieval_attempts", 0L);
        this.f17098t = new C2293v1(this, "firebase_feature_rollouts", null);
        this.f17099u = new C2293v1(this, "deferred_attribution_cache", null);
        this.f17100v = new C2283t1(this, "deferred_attribution_cache_timestamp", 0L);
        this.f17101w = new C2278s1(this, "default_event_parameters", null);
    }

    @Override
    protected final void i() {
        SharedPreferences sharedPreferences = this.f16818a.f().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f17081c = sharedPreferences;
        boolean z7 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f17094p = z7;
        if (!z7) {
            SharedPreferences.Editor editorEdit = this.f17081c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        this.f16818a.z();
        this.f17082d = new C2288u1(this, "health_monitor", Math.max(0L, Y0.f16612d.a(null).longValue()), null);
    }

    @Override
    protected final boolean j() {
        return true;
    }

    protected final SharedPreferences o() {
        h();
        k();
        C2651i.l(this.f17081c);
        return this.f17081c;
    }

    final Pair<String, Boolean> p(String str) {
        h();
        long jB = this.f16818a.c().b();
        String str2 = this.f17086h;
        if (str2 != null && jB < this.f17088j) {
            return new Pair<>(str2, Boolean.valueOf(this.f17087i));
        }
        this.f17088j = jB + this.f16818a.z().r(str, Y0.f16610c);
        J2.a.e(true);
        try {
            a.C0027a c0027aB = J2.a.b(this.f16818a.f());
            this.f17086h = BuildConfig.FLAVOR;
            String strA = c0027aB.a();
            if (strA != null) {
                this.f17086h = strA;
            }
            this.f17087i = c0027aB.b();
        } catch (Exception e7) {
            this.f16818a.b().q().b(HguUe.rZDDJDSui, e7);
            this.f17086h = BuildConfig.FLAVOR;
        }
        J2.a.e(false);
        return new Pair<>(this.f17086h, Boolean.valueOf(this.f17087i));
    }

    final W3.a q() {
        h();
        return W3.a.b(o().getString("consent_settings", "G1"));
    }

    final Boolean r() {
        h();
        if (o().contains("measurement_enabled")) {
            return Boolean.valueOf(o().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final void s(Boolean bool) {
        h();
        SharedPreferences.Editor editorEdit = o().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final void t(boolean z7) {
        h();
        this.f16818a.b().v().b("App measurement setting deferred collection", Boolean.valueOf(z7));
        SharedPreferences.Editor editorEdit = o().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z7);
        editorEdit.apply();
    }

    final boolean u() {
        SharedPreferences sharedPreferences = this.f17081c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final boolean v(long j7) {
        return j7 - this.f17089k.a() > this.f17093o.a();
    }

    final boolean w(int i7) {
        return W3.a.l(i7, o().getInt("consent_source", 100));
    }
}
