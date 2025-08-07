package ha;

import P7.b;
import com.github.luben.zstd.BuildConfig;
import h7.l;
import j6.d;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J%\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"LL5/q;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "h", "()Z", "e", "j", "l", BuildConfig.FLAVOR, "key", "Lkotlin/Function0;", "defaultValue", "g", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)Z", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q {

    public static final q f2150a = new q();

    private q() {
    }

    public static final boolean e() {
        return f2150a.g("enableMonitoring", new Function0() {
            public final Object invoke() {
                return Boolean.valueOf(q.f());
            }
        });
    }

    public static final boolean f() {
        return d.a().g3();
    }

    private final boolean g(String key, Function0<Boolean> defaultValue) {
        if (d.a().f3()) {
            JSONObject jSONObjectD = b.i().d("Logging.UseRoomDB.Android");
            if (jSONObjectD != null) {
                l.g("UseRoomDBForLoggingExperiment", "Layer Logging.UseRoomDB.Android has key " + key + ": " + jSONObjectD.has(key));
                try {
                    return jSONObjectD.optBoolean(key, ((Boolean) defaultValue.invoke()).booleanValue());
                } catch (JSONException e7) {
                    l.e("UseRoomDBForLoggingExperiment", "Error parsing layer variables", e7);
                }
            } else {
                l.g("UseRoomDBForLoggingExperiment", "Layer Logging.UseRoomDB.Android is not set up. Defaulting key " + key + " to flag value");
            }
        } else {
            l.g("UseRoomDBForLoggingExperiment", "Experiment is not enabled. Defaulting key " + key + " to flag value");
        }
        return ((Boolean) defaultValue.invoke()).booleanValue();
    }

    public static final boolean h() {
        return f2150a.g("enableRoomDB7", new Function0() {
            public final Object invoke() {
                return Boolean.valueOf(q.i());
            }
        });
    }

    public static final boolean i() {
        return d.a().m3();
    }

    public static final boolean j() {
        return f2150a.g("reportNotificationSettings2", new Function0() {
            public final Object invoke() {
                return Boolean.valueOf(q.k());
            }
        });
    }

    public static final boolean k() {
        return d.a().u1();
    }

    public static final boolean l() {
        return f2150a.g("reportNotificationSettingsOnAppBackground", new Function0() {
            public final Object invoke() {
                return Boolean.valueOf(q.m());
            }
        });
    }

    public static final boolean m() {
        return d.a().V();
    }
}
