package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class B2 implements h4 {

    final N2 f16266a;

    B2(N2 n22) {
        this.f16266a = n22;
    }

    @Override
    public final void a(String str, String str2, Bundle bundle) throws IllegalStateException {
        if (TextUtils.isEmpty(str)) {
            this.f16266a.r("auto", "_err", bundle);
        } else {
            this.f16266a.t("auto", "_err", bundle, str);
        }
    }
}
