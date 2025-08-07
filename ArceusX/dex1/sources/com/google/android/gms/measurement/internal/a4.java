package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

final class a4 implements h4 {

    final c4 f16697a;

    a4(c4 c4Var) {
        this.f16697a = c4Var;
    }

    @Override
    public final void a(String str, String str2, Bundle bundle) throws IllegalStateException {
        if (!TextUtils.isEmpty(str)) {
            this.f16697a.a().z(new Z3(this, str, "_err", bundle));
        } else if (this.f16697a.f16744l != null) {
            this.f16697a.f16744l.b().r().b("AppId not known when logging event", "_err");
        }
    }
}
