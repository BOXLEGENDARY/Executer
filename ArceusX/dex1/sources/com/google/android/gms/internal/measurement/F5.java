package com.google.android.gms.internal.measurement;

import K0.wJ.BtcVLuo;
import Y3.qE.KpBmp;
import backtraceio.library.services.BacktraceMetrics;

public final class F5 implements E5 {

    public static final P2<Long> f14721A;

    public static final P2<Long> f14722B;

    public static final P2<Long> f14723C;

    public static final P2<Long> f14724D;

    public static final P2<Long> f14725E;

    public static final P2<Long> f14726F;

    public static final P2<Long> f14727G;

    public static final P2<Long> f14728H;

    public static final P2<Long> f14729I;

    public static final P2<Long> f14730J;

    public static final P2<String> f14731K;

    public static final P2<Long> f14732L;

    public static final P2<Long> f14733a;

    public static final P2<Long> f14734b;

    public static final P2<Long> f14735c;

    public static final P2<String> f14736d;

    public static final P2<String> f14737e;

    public static final P2<String> f14738f;

    public static final P2<Long> f14739g;

    public static final P2<Long> f14740h;

    public static final P2<Long> f14741i;

    public static final P2<Long> f14742j;

    public static final P2<Long> f14743k;

    public static final P2<Long> f14744l;

    public static final P2<Long> f14745m;

    public static final P2<Long> f14746n;

    public static final P2<Long> f14747o;

    public static final P2<Long> f14748p;

    public static final P2<Long> f14749q;

    public static final P2<Long> f14750r;

    public static final P2<String> f14751s;

    public static final P2<Long> f14752t;

    public static final P2<Long> f14753u;

    public static final P2<Long> f14754v;

    public static final P2<Long> f14755w;

    public static final P2<Long> f14756x;

    public static final P2<Long> f14757y;

    public static final P2<Long> f14758z;

    static {
        M2 m22 = new M2(F2.a("com.google.android.gms.measurement"));
        f14733a = m22.c("measurement.ad_id_cache_time", 10000L);
        f14734b = m22.c("measurement.max_bundles_per_iteration", 100L);
        f14735c = m22.c("measurement.config.cache_time", 86400000L);
        f14736d = m22.d("measurement.log_tag", "FA");
        f14737e = m22.d("measurement.config.url_authority", "app-measurement.com");
        f14738f = m22.d("measurement.config.url_scheme", "https");
        f14739g = m22.c("measurement.upload.debug_upload_interval", 1000L);
        f14740h = m22.c("measurement.lifetimevalue.max_currency_tracked", 4L);
        f14741i = m22.c("measurement.store.max_stored_events_per_app", 100000L);
        f14742j = m22.c("measurement.experiment.max_ids", 50L);
        f14743k = m22.c("measurement.audience.filter_result_max_count", 200L);
        f14744l = m22.c("measurement.alarm_manager.minimum_interval", 60000L);
        f14745m = m22.c("measurement.upload.minimum_delay", 500L);
        f14746n = m22.c("measurement.monitoring.sample_period_millis", 86400000L);
        f14747o = m22.c("measurement.upload.realtime_upload_interval", 10000L);
        f14748p = m22.c(KpBmp.RvtoLWuOj, 604800000L);
        f14749q = m22.c("measurement.config.cache_time.service", 3600000L);
        f14750r = m22.c("measurement.service_client.idle_disconnect_millis", 5000L);
        f14751s = m22.d("measurement.log_tag.service", "FA-SVC");
        f14752t = m22.c("measurement.upload.stale_data_deletion_interval", 86400000L);
        f14753u = m22.c(KpBmp.wbaM, 604800000L);
        f14754v = m22.c("measurement.upload.backoff_period", 43200000L);
        f14755w = m22.c("measurement.upload.initial_upload_delay_time", 15000L);
        f14756x = m22.c(BtcVLuo.WsAKYfINR, 3600000L);
        f14757y = m22.c("measurement.upload.max_bundle_size", 65536L);
        f14758z = m22.c("measurement.upload.max_bundles", 100L);
        f14721A = m22.c("measurement.upload.max_conversions_per_day", 500L);
        f14722B = m22.c("measurement.upload.max_error_events_per_day", 1000L);
        f14723C = m22.c("measurement.upload.max_events_per_bundle", 1000L);
        f14724D = m22.c("measurement.upload.max_events_per_day", 100000L);
        f14725E = m22.c("measurement.upload.max_public_events_per_day", 50000L);
        f14726F = m22.c("measurement.upload.max_queue_time", 2419200000L);
        f14727G = m22.c("measurement.upload.max_realtime_events_per_day", 10L);
        f14728H = m22.c("measurement.upload.max_batch_size", 65536L);
        f14729I = m22.c("measurement.upload.retry_count", 6L);
        f14730J = m22.c("measurement.upload.retry_time", BacktraceMetrics.defaultTimeIntervalMs);
        f14731K = m22.d("measurement.upload.url", "https://app-measurement.com/a");
        f14732L = m22.c("measurement.upload.window_interval", 3600000L);
    }

    @Override
    public final long C() {
        return f14722B.b().longValue();
    }

    @Override
    public final String F() {
        return f14731K.b();
    }

    @Override
    public final long G() {
        return f14732L.b().longValue();
    }

    @Override
    public final long I() {
        return f14726F.b().longValue();
    }

    @Override
    public final long J0() {
        return f14728H.b().longValue();
    }

    @Override
    public final long M() {
        return f14725E.b().longValue();
    }

    @Override
    public final String N() {
        return f14737e.b();
    }

    @Override
    public final long Q() {
        return f14727G.b().longValue();
    }

    @Override
    public final String R() {
        return f14738f.b();
    }

    @Override
    public final long T() {
        return f14724D.b().longValue();
    }

    @Override
    public final long a() {
        return f14735c.b().longValue();
    }

    @Override
    public final long b() {
        return f14740h.b().longValue();
    }

    @Override
    public final long c() {
        return f14741i.b().longValue();
    }

    @Override
    public final long d() {
        return f14739g.b().longValue();
    }

    @Override
    public final long e() {
        return f14744l.b().longValue();
    }

    @Override
    public final long f() {
        return f14743k.b().longValue();
    }

    @Override
    public final long f0() {
        return f14730J.b().longValue();
    }

    @Override
    public final long g() {
        return f14742j.b().longValue();
    }

    @Override
    public final long h() {
        return f14746n.b().longValue();
    }

    @Override
    public final long i() {
        return f14745m.b().longValue();
    }

    @Override
    public final long j() {
        return f14747o.b().longValue();
    }

    @Override
    public final long k() {
        return f14750r.b().longValue();
    }

    @Override
    public final long l() {
        return f14752t.b().longValue();
    }

    @Override
    public final long m() {
        return f14748p.b().longValue();
    }

    @Override
    public final long n() {
        return f14753u.b().longValue();
    }

    @Override
    public final long o() {
        return f14754v.b().longValue();
    }

    @Override
    public final long p() {
        return f14755w.b().longValue();
    }

    @Override
    public final long q() {
        return f14721A.b().longValue();
    }

    @Override
    public final long r() {
        return f14729I.b().longValue();
    }

    @Override
    public final long s() {
        return f14757y.b().longValue();
    }

    @Override
    public final long t() {
        return f14756x.b().longValue();
    }

    @Override
    public final long w() {
        return f14723C.b().longValue();
    }

    @Override
    public final long x() {
        return f14758z.b().longValue();
    }

    @Override
    public final long zza() {
        return f14733a.b().longValue();
    }

    @Override
    public final long zzb() {
        return f14734b.b().longValue();
    }
}
