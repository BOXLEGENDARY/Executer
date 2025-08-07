package e3;

import android.os.Bundle;
import l3.C2526a;
import n3.C2649g;

public final class C2421c implements C2526a.d {

    public static final C2421c f20419e = new C2421c(new Bundle(), null);

    private final Bundle f20420d;

    C2421c(Bundle bundle, C2427i c2427i) {
        this.f20420d = bundle;
    }

    public final Bundle a() {
        return new Bundle(this.f20420d);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2421c) {
            return C2649g.a(this.f20420d, ((C2421c) obj).f20420d);
        }
        return false;
    }

    public final int hashCode() {
        return C2649g.c(this.f20420d);
    }
}
