package Z;

import C.h1;
import X.h0;
import android.os.Build;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import com.github.luben.zstd.BuildConfig;
import z.C3043d0;

public class e {

    private final h0 f8185a;

    private final h1 f8186b;

    private final CameraUseInconsistentTimebaseQuirk f8187c;

    private long f8188d = -1;

    private h1 f8189e;

    static class a {

        static final int[] f8190a;

        static {
            int[] iArr = new int[h1.values().length];
            f8190a = iArr;
            try {
                iArr[h1.REALTIME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8190a[h1.UPTIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public e(h0 h0Var, h1 h1Var, CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk) {
        this.f8185a = h0Var;
        this.f8186b = h1Var;
        this.f8187c = cameraUseInconsistentTimebaseQuirk;
    }

    private long a() {
        long j7 = Long.MAX_VALUE;
        long j8 = 0;
        for (int i7 = 0; i7 < 3; i7++) {
            long jA = this.f8185a.a();
            long jB = this.f8185a.b();
            long jA2 = this.f8185a.a();
            long j9 = jA2 - jA;
            if (i7 == 0 || j9 < j7) {
                j8 = jB - ((jA + jA2) >> 1);
                j7 = j9;
            }
        }
        return Math.max(0L, j8);
    }

    private boolean c() {
        return this.f8185a.b() - this.f8185a.a() > 3000000;
    }

    private boolean d(long j7) {
        return Math.abs(j7 - this.f8185a.b()) < Math.abs(j7 - this.f8185a.a());
    }

    private h1 e(long j7) {
        boolean z7;
        String str;
        if (this.f8187c != null) {
            C3043d0.l("VideoTimebaseConverter", "CameraUseInconsistentTimebaseQuirk is enabled");
            z7 = false;
        } else {
            if (!c()) {
                return this.f8186b;
            }
            z7 = true;
        }
        h1 h1Var = d(j7) ? h1.REALTIME : h1.UPTIME;
        if (!z7 || h1Var == this.f8186b) {
            C3043d0.a("VideoTimebaseConverter", "Detect input timebase = " + h1Var);
        } else {
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 31) {
                str = ", SOC: " + Build.SOC_MODEL;
            } else {
                str = BuildConfig.FLAVOR;
            }
            C3043d0.c("VideoTimebaseConverter", String.format("Detected camera timebase inconsistent. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, Hardware: %s, API Level: %d%s].\nCamera timebase is inconsistent. The timebase reported by the camera is %s, but the actual timebase contained in the frame is detected as %s.", Build.MANUFACTURER, Build.MODEL, Build.HARDWARE, Integer.valueOf(i7), str, this.f8186b, h1Var));
        }
        return h1Var;
    }

    public long b(long j7) {
        if (this.f8189e == null) {
            this.f8189e = e(j7);
        }
        int i7 = a.f8190a[this.f8189e.ordinal()];
        if (i7 != 1) {
            if (i7 == 2) {
                return j7;
            }
            throw new AssertionError("Unknown timebase: " + this.f8189e);
        }
        if (this.f8188d == -1) {
            this.f8188d = a();
            C3043d0.a("VideoTimebaseConverter", "mUptimeToRealtimeOffsetUs = " + this.f8188d);
        }
        return j7 - this.f8188d;
    }
}
