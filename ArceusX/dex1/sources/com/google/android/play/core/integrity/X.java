package com.google.android.play.core.integrity;

import android.os.Bundle;
import l3.C2527b;

public final class X implements Y {
    X() {
    }

    @Override
    public final C2527b n0(Bundle bundle) {
        int i7 = bundle.getInt("error");
        if (i7 == 0) {
            return null;
        }
        return new C2319b(i7, null);
    }
}
