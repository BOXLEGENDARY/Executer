package com.google.android.gms.internal.play_billing;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;

public final class C2122p {

    private final String f16114a;

    private final C2110n f16115b;

    private C2110n f16116c;

    C2122p(String str, C2128q c2128q) {
        C2110n c2110n = new C2110n();
        this.f16115b = c2110n;
        this.f16116c = c2110n;
        str.getClass();
        this.f16114a = str;
    }

    public final C2122p a(Object obj) {
        C2110n c2110n = new C2110n();
        this.f16116c.f16094b = c2110n;
        this.f16116c = c2110n;
        c2110n.f16093a = obj;
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f16114a);
        sb.append('{');
        C2110n c2110n = this.f16115b.f16094b;
        String str = BuildConfig.FLAVOR;
        while (c2110n != null) {
            Object obj = c2110n.f16093a;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            c2110n = c2110n.f16094b;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }
}
