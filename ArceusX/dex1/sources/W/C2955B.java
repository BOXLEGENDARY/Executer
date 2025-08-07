package w;

import C.R0;
import androidx.camera.camera2.internal.compat.quirk.UseTorchAsFlashQuirk;

public class C2955B {

    private final boolean f24193a;

    public C2955B(R0 r02) {
        this.f24193a = r02.a(UseTorchAsFlashQuirk.class);
    }

    public boolean a() {
        return this.f24193a;
    }
}
