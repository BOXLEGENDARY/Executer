package a5;

import android.os.Bundle;

final class k extends i<Bundle> {
    k(int i7, int i8, Bundle bundle) {
        super(i7, 1, bundle);
    }

    @Override
    final void b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        c(bundle2);
    }

    @Override
    final boolean d() {
        return false;
    }
}
