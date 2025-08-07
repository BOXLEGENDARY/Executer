package w;

import C.R0;
import androidx.camera.camera2.internal.compat.quirk.Preview3AThreadCrashQuirk;

public class u {

    private final boolean f24221a;

    public u(R0 r02) {
        this.f24221a = r02.a(Preview3AThreadCrashQuirk.class);
    }

    public boolean a() {
        return this.f24221a;
    }
}
