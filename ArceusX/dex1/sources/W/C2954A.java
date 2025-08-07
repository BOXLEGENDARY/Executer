package w;

import C.R0;
import androidx.camera.camera2.internal.compat.quirk.TorchFlashRequiredFor3aUpdateQuirk;
import z.C3043d0;

public class C2954A {

    private final TorchFlashRequiredFor3aUpdateQuirk f24192a;

    public C2954A(R0 r02) {
        this.f24192a = (TorchFlashRequiredFor3aUpdateQuirk) r02.b(TorchFlashRequiredFor3aUpdateQuirk.class);
    }

    public boolean a() {
        TorchFlashRequiredFor3aUpdateQuirk torchFlashRequiredFor3aUpdateQuirk = this.f24192a;
        boolean z7 = torchFlashRequiredFor3aUpdateQuirk != null && torchFlashRequiredFor3aUpdateQuirk.i();
        C3043d0.a("UseFlashModeTorchFor3aUpdate", "shouldUseFlashModeTorch: " + z7);
        return z7;
    }
}
