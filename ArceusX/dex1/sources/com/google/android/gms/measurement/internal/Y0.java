package com.google.android.gms.measurement.internal;

import K0.wJ.BtcVLuo;
import S9.Gvmm.CAqKeu;
import U.Gw.oeVkjmfPcLbWm;
import android.content.Context;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import backtraceio.library.services.BacktraceMetrics;
import com.google.android.gms.internal.measurement.A5;
import com.google.android.gms.internal.measurement.B6;
import com.google.android.gms.internal.measurement.C1848c6;
import com.google.android.gms.internal.measurement.C1872f6;
import com.google.android.gms.internal.measurement.C1896i6;
import com.google.android.gms.internal.measurement.C1920l6;
import com.google.android.gms.internal.measurement.C1944o6;
import com.google.android.gms.internal.measurement.C1959q5;
import com.google.android.gms.internal.measurement.C1967r6;
import com.google.android.gms.internal.measurement.C1982t5;
import com.google.android.gms.internal.measurement.C1991u6;
import com.google.android.gms.internal.measurement.C1995v2;
import com.google.android.gms.internal.measurement.C2006w5;
import com.google.android.gms.internal.measurement.C2015x6;
import com.google.android.gms.internal.measurement.D5;
import com.google.android.gms.internal.measurement.E6;
import com.google.android.gms.internal.measurement.G5;
import com.google.android.gms.internal.measurement.H6;
import com.google.android.gms.internal.measurement.J5;
import com.google.android.gms.internal.measurement.K6;
import com.google.android.gms.internal.measurement.M5;
import com.google.android.gms.internal.measurement.N6;
import com.google.android.gms.internal.measurement.P5;
import com.google.android.gms.internal.measurement.Q6;
import com.google.android.gms.internal.measurement.S5;
import com.google.android.gms.internal.measurement.T6;
import com.google.android.gms.internal.measurement.V5;
import com.google.android.gms.internal.measurement.W6;
import com.google.android.gms.internal.measurement.Z5;
import com.google.android.gms.internal.measurement.Z6;
import com.roblox.client.realtime.WEmv.tAjeAKSIqDqzNP;
import e2.vb.oyfFwvPUKctyaG;
import f6.ck.ZJZXBWla;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class Y0 {

    public static final X0<Boolean> f16576A0;

    public static final X0<Boolean> f16578B0;

    public static final X0<Long> f16579C;

    public static final X0<Boolean> f16580C0;

    public static final X0<Integer> f16581D;

    public static final X0<Boolean> f16582D0;

    public static final X0<Long> f16583E;

    public static final X0<Boolean> f16584E0;

    public static final X0<Integer> f16585F;

    public static final X0<Integer> f16586G;

    public static final X0<Integer> f16587H;

    public static final X0<Integer> f16588I;

    public static final X0<Integer> f16589J;

    public static final X0<Long> f16590K;

    public static final X0<Boolean> f16591L;

    public static final X0<String> f16592M;

    public static final X0<Long> f16593N;

    public static final X0<Integer> f16594O;

    public static final X0<Double> f16595P;

    public static final X0<Integer> f16596Q;

    public static final X0<Integer> f16597R;

    public static final X0<Long> f16598S;

    public static final X0<Boolean> f16599T;

    public static final X0<Boolean> f16600U;

    public static final X0<Boolean> f16601V;

    public static final X0<Boolean> f16602W;

    public static final X0<Boolean> f16603X;

    public static final X0<Boolean> f16604Y;

    public static final X0<Boolean> f16605Z;

    public static final X0<Boolean> f16607a0;

    public static final X0<Boolean> f16609b0;

    public static final X0<Boolean> f16611c0;

    public static final X0<Boolean> f16613d0;

    public static final X0<Boolean> f16615e0;

    public static final X0<Boolean> f16617f0;

    public static final X0<Boolean> f16619g0;

    public static final X0<Boolean> f16621h0;

    public static final X0<Boolean> f16623i0;

    public static final X0<Boolean> f16625j0;

    public static final X0<Boolean> f16627k0;

    public static final X0<Boolean> f16629l0;

    public static final X0<Boolean> f16631m0;

    public static final X0<Boolean> f16633n0;

    public static final X0<Boolean> f16635o0;

    public static final X0<Integer> f16637p0;

    public static final X0<Boolean> f16639q0;

    public static final X0<Boolean> f16641r0;

    public static final X0<Boolean> f16643s0;

    public static final X0<Boolean> f16645t0;

    public static final X0<Boolean> f16647u0;

    public static final X0<Boolean> f16649v0;

    public static final X0<Boolean> f16651w0;

    public static final X0<Boolean> f16653x0;

    public static final X0<Boolean> f16655y0;

    public static final X0<Boolean> f16657z0;

    private static final List<X0<?>> f16606a = Collections.synchronizedList(new ArrayList());

    private static final Set<X0<?>> f16608b = Collections.synchronizedSet(new HashSet());

    public static final X0<Long> f16610c = a("measurement.ad_id_cache_time", 10000L, 10000L, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Long.valueOf(D5.l());
        }
    });

    public static final X0<Long> f16612d = a("measurement.monitoring.sample_period_millis", 86400000L, 86400000L, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Long.valueOf(D5.v());
        }
    });

    public static final X0<Long> f16614e = a("measurement.config.cache_time", 86400000L, 3600000L, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Long.valueOf(D5.n());
        }
    });

    public static final X0<String> f16616f = a("measurement.config.url_scheme", "https", "https", new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return D5.j();
        }
    });

    public static final X0<String> f16618g = a("measurement.config.url_authority", "app-measurement.com", "app-measurement.com", new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return D5.i();
        }
    });

    public static final X0<Integer> f16620h = a("measurement.upload.max_bundles", 100, 100, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Integer.valueOf((int) D5.F());
        }
    });

    public static final X0<Integer> f16622i = a(ZJZXBWla.ukVlmCIOYiYlj, 65536, 65536, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Integer.valueOf((int) D5.d());
        }
    });

    public static final X0<Integer> f16624j = a("measurement.upload.max_bundle_size", 65536, 65536, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Integer.valueOf((int) D5.E());
        }
    });

    public static final X0<Integer> f16626k = a(oyfFwvPUKctyaG.OLeOeUkJjIggKzz, 1000, 1000, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Integer.valueOf((int) D5.I());
        }
    });

    public static final X0<Integer> f16628l = a("measurement.upload.max_events_per_day", 100000, 100000, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Integer.valueOf((int) D5.J());
        }
    });

    public static final X0<Integer> f16630m = a("measurement.upload.max_error_events_per_day", 1000, 1000, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Integer.valueOf((int) D5.H());
        }
    });

    public static final X0<Integer> f16632n = a("measurement.upload.max_public_events_per_day", 50000, 50000, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Integer.valueOf((int) D5.a());
        }
    });

    public static final X0<Integer> f16634o = a("measurement.upload.max_conversions_per_day", 10000, 10000, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Integer.valueOf((int) D5.G());
        }
    });

    public static final X0<Integer> f16636p = a("measurement.upload.max_realtime_events_per_day", 10, 10, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Integer.valueOf((int) D5.c());
        }
    });

    public static final X0<Integer> f16638q = a("measurement.store.max_stored_events_per_app", 100000, 100000, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Integer.valueOf((int) D5.q());
        }
    });

    public static final X0<String> f16640r = a("measurement.upload.url", "https://app-measurement.com/a", "https://app-measurement.com/a", new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return D5.k();
        }
    });

    public static final X0<Long> f16642s = a("measurement.upload.backoff_period", 43200000L, 43200000L, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Long.valueOf(D5.B());
        }
    });

    public static final X0<Long> f16644t = a("measurement.upload.window_interval", 3600000L, 3600000L, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Long.valueOf(D5.g());
        }
    });

    public static final X0<Long> f16646u = a("measurement.upload.interval", 3600000L, 3600000L, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Long.valueOf(D5.D());
        }
    });

    public static final X0<Long> f16648v = a("measurement.upload.realtime_upload_interval", 10000L, 10000L, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Long.valueOf(D5.w());
        }
    });

    public static final X0<Long> f16650w = a("measurement.upload.debug_upload_interval", 1000L, 1000L, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Long.valueOf(D5.o());
        }
    });

    public static final X0<Long> f16652x = a(vxbbqXNtzfMxs.XofeILJXYM, 500L, 500L, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Long.valueOf(D5.u());
        }
    });

    public static final X0<Long> f16654y = a(tAjeAKSIqDqzNP.sFpgvWMCFM, 60000L, 60000L, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Long.valueOf(D5.t());
        }
    });

    public static final X0<Long> f16656z = a("measurement.upload.stale_data_deletion_interval", 86400000L, 86400000L, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Long.valueOf(D5.z());
        }
    });

    public static final X0<Long> f16575A = a("measurement.upload.refresh_blacklisted_config_interval", 604800000L, 604800000L, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Long.valueOf(D5.x());
        }
    });

    public static final X0<Long> f16577B = a("measurement.upload.initial_upload_delay_time", 15000L, 15000L, new V0() {
        @Override
        public final Object zza() {
            X0<Long> x02 = Y0.f16610c;
            return Long.valueOf(D5.C());
        }
    });

    static {
        Long lValueOf = Long.valueOf(BacktraceMetrics.defaultTimeIntervalMs);
        f16579C = a("measurement.upload.retry_time", lValueOf, lValueOf, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Long.valueOf(D5.f());
            }
        });
        f16581D = a("measurement.upload.retry_count", 6, 6, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Integer.valueOf((int) D5.e());
            }
        });
        f16583E = a("measurement.upload.max_queue_time", 2419200000L, 2419200000L, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Long.valueOf(D5.b());
            }
        });
        f16585F = a("measurement.lifetimevalue.max_currency_tracked", 4, 4, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Integer.valueOf((int) D5.p());
            }
        });
        f16586G = a("measurement.audience.filter_result_max_count", 200, 200, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Integer.valueOf((int) D5.s());
            }
        });
        f16587H = a("measurement.upload.max_public_user_properties", 25, 25, null);
        f16588I = a("measurement.upload.max_event_name_cardinality", 500, 500, null);
        f16589J = a("measurement.upload.max_public_event_params", 25, 25, null);
        f16590K = a("measurement.service_client.idle_disconnect_millis", 5000L, 5000L, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Long.valueOf(D5.y());
            }
        });
        Boolean bool = Boolean.FALSE;
        f16591L = a("measurement.test.boolean_flag", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(B6.f());
            }
        });
        f16592M = a("measurement.test.string_flag", "---", "---", new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return B6.e();
            }
        });
        f16593N = a("measurement.test.long_flag", -1L, -1L, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Long.valueOf(B6.c());
            }
        });
        f16594O = a("measurement.test.int_flag", -2, -2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Integer.valueOf((int) B6.b());
            }
        });
        Double dValueOf = Double.valueOf(-3.0d);
        f16595P = a("measurement.test.double_flag", dValueOf, dValueOf, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Double.valueOf(B6.a());
            }
        });
        f16596Q = a("measurement.experiment.max_ids", 50, 50, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Integer.valueOf((int) D5.r());
            }
        });
        f16597R = a(oeVkjmfPcLbWm.yPLUMW, 100, 100, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Integer.valueOf((int) D5.m());
            }
        });
        f16598S = a("measurement.sdk.attribution.cache.ttl", 604800000L, 604800000L, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Long.valueOf(D5.A());
            }
        });
        f16599T = a("measurement.validation.internal_limits_internal_event_params", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1991u6.b());
            }
        });
        Boolean bool2 = Boolean.TRUE;
        f16600U = a("measurement.collection.firebase_global_collection_flag_enabled", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1896i6.b());
            }
        });
        f16601V = a("measurement.collection.redundant_engagement_removal_enabled", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1872f6.b());
            }
        });
        f16602W = a("measurement.collection.log_event_and_bundle_v2", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(H6.b());
            }
        });
        f16603X = a("measurement.quality.checksum", bool, bool, null);
        f16604Y = a("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(Z5.d());
            }
        });
        f16605Z = a("measurement.audience.refresh_event_count_filters_timestamp", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(Z5.c());
            }
        });
        f16607a0 = a("measurement.audience.use_bundle_timestamp_for_event_count_filters", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(Z5.e());
            }
        });
        f16609b0 = a("measurement.sdk.collection.retrieve_deeplink_from_bow_2", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(W6.b());
            }
        });
        f16611c0 = a("measurement.sdk.collection.last_deep_link_referrer_campaign2", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1944o6.c());
            }
        });
        f16613d0 = a("measurement.sdk.collection.enable_extend_user_property_size", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1944o6.b());
            }
        });
        f16615e0 = a("measurement.ga.ga_app_id", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1920l6.c());
            }
        });
        f16617f0 = a("measurement.lifecycle.app_in_background_parameter", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1967r6.c());
            }
        });
        f16619g0 = a("measurement.integration.disable_firebase_instance_id", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(T6.c());
            }
        });
        f16621h0 = a("measurement.lifecycle.app_backgrounded_engagement", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1967r6.b());
            }
        });
        f16623i0 = a("measurement.collection.service.update_with_analytics_fix", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(Z6.b());
            }
        });
        f16625j0 = a("measurement.client.firebase_feature_rollout.v1.enable", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(S5.c());
            }
        });
        f16627k0 = a("measurement.client.sessions.check_on_reset_and_enable2", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1848c6.c());
            }
        });
        f16629l0 = a("measurement.scheduler.task_thread.cleanup_on_exit", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(K6.b());
            }
        });
        f16631m0 = a("measurement.upload.file_truncate_fix", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(P5.b());
            }
        });
        f16633n0 = a("measurement.collection.synthetic_data_mitigation", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(Q6.b());
            }
        });
        f16635o0 = a("measurement.androidId.delete_feature", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1982t5.b());
            }
        });
        f16637p0 = a("measurement.service.storage_consent_support_version", 203600, 203600, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Integer.valueOf((int) G5.a());
            }
        });
        f16639q0 = a("measurement.client.click_identifier_control.dev", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C2006w5.b());
            }
        });
        f16641r0 = a("measurement.service.click_identifier_control", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(A5.b());
            }
        });
        f16643s0 = a("measurement.config.persist_last_modified", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C2015x6.c());
            }
        });
        f16645t0 = a("measurement.client.consent.suppress_1p_in_ga4f_install", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(V5.c());
            }
        });
        f16647u0 = a("measurement.client.consent.gmpappid_worker_thread_fix", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(V5.d());
            }
        });
        f16649v0 = a("measurement.module.pixie.ees", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(E6.c());
            }
        });
        f16651w0 = a("measurement.module.pixie.fix_array", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(E6.d());
            }
        });
        f16653x0 = a("measurement.adid_zero.service", bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1959q5.d());
            }
        });
        f16655y0 = a("measurement.adid_zero.remove_lair_if_adidzero_false", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1959q5.f());
            }
        });
        f16657z0 = a(CAqKeu.oBEwrELIBZC, bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1959q5.g());
            }
        });
        f16576A0 = a(oeVkjmfPcLbWm.aaftJfKMfKz, bool, bool, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1959q5.e());
            }
        });
        f16578B0 = a("measurement.adid_zero.app_instance_id_fix", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(C1959q5.c());
            }
        });
        f16580C0 = a("measurement.service.refactor.package_side_screen", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(N6.c());
            }
        });
        f16582D0 = a("measurement.config.fix_feature_flags_from_config", bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(M5.b());
            }
        });
        f16584E0 = a(vxbbqXNtzfMxs.nMdvxWB, bool2, bool2, new V0() {
            @Override
            public final Object zza() {
                X0<Long> x02 = Y0.f16610c;
                return Boolean.valueOf(J5.c());
            }
        });
    }

    static <V> X0<V> a(String str, V v7, V v8, V0<V> v02) {
        X0<V> x02 = new X0<>(str, v7, v8, v02, null);
        f16606a.add(x02);
        return x02;
    }

    public static Map<String, String> c(Context context) {
        C1995v2 c1995v2A = C1995v2.a(context.getContentResolver(), com.google.android.gms.internal.measurement.F2.a(BtcVLuo.lZgxNi));
        return c1995v2A == null ? Collections.emptyMap() : c1995v2A.b();
    }
}
