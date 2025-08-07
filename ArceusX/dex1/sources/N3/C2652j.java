package n3;

import com.google.android.gms.common.internal.RootTelemetryConfiguration;

public final class C2652j {

    private static C2652j f22282b;

    private static final RootTelemetryConfiguration f22283c = new RootTelemetryConfiguration(0, false, false, 0, 0);

    private RootTelemetryConfiguration f22284a;

    private C2652j() {
    }

    public static synchronized C2652j b() {
        try {
            if (f22282b == null) {
                f22282b = new C2652j();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f22282b;
    }

    public RootTelemetryConfiguration a() {
        return this.f22284a;
    }

    public final synchronized void c(RootTelemetryConfiguration rootTelemetryConfiguration) {
        if (rootTelemetryConfiguration == null) {
            this.f22284a = f22283c;
            return;
        }
        RootTelemetryConfiguration rootTelemetryConfiguration2 = this.f22284a;
        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.q() < rootTelemetryConfiguration.q()) {
            this.f22284a = rootTelemetryConfiguration;
        }
    }
}
