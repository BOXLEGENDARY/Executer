package a5;

import android.os.Bundle;
import t4.gYZ.uCYQMIHsy;

final class C1583f extends i<Void> {
    C1583f(int i7, int i8, Bundle bundle) {
        super(i7, 2, bundle);
    }

    @Override
    final void b(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            c(null);
        } else {
            a(new h(4, uCYQMIHsy.KpDcdIPI));
        }
    }

    @Override
    final boolean d() {
        return true;
    }
}
