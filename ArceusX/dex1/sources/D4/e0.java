package D4;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import w7.Jld.EZYiRMRTxKdo;

final class e0 implements Runnable {

    final C0373d f947d;

    final C0377h f948e;

    e0(C0377h c0377h, C0373d c0373d) {
        this.f948e = c0377h;
        this.f947d = c0373d;
    }

    @Override
    public final void run() {
        d0 d0Var = this.f948e.f959b;
        List<String> listB = this.f947d.b();
        List listJ = C0377h.j(this.f947d.a());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!listB.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(listB));
        }
        if (!listJ.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(listJ));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong(EZYiRMRTxKdo.uWEyupqHN, 0L);
        d0Var.j(AbstractC0374e.n(bundle));
    }
}
