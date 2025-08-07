package com.google.android.play.core.integrity;

import android.os.Bundle;
import l3.C2527b;

public final class W implements Y {
    W() {
    }

    @Override
    public final C2527b n0(Bundle bundle) {
        int i7 = bundle.getInt("error");
        if (i7 == 0) {
            return null;
        }
        return new C2318a(i7, null);
    }
}
