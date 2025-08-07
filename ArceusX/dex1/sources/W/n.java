package w;

import C.R0;
import androidx.camera.camera2.internal.compat.quirk.AutoFlashUnderExposedQuirk;

public class n {

    private final boolean f24209a;

    private boolean f24210b = false;

    public n(R0 r02) {
        this.f24209a = r02.b(AutoFlashUnderExposedQuirk.class) != null;
    }

    public void a() {
        this.f24210b = false;
    }

    public void b() {
        this.f24210b = true;
    }

    public boolean c(int i7) {
        return this.f24210b && i7 == 0 && this.f24209a;
    }
}
