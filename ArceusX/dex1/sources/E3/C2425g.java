package e3;

import android.os.Bundle;
import l3.C2526a;
import n3.C2649g;

@Deprecated
public final class C2425g implements C2526a.d {

    public static final C2425g f20423v = new C2425g(new C2424f());

    private final String f20424d = null;

    private final boolean f20425e;

    private final String f20426i;

    public C2425g(C2424f c2424f) {
        this.f20425e = c2424f.f20421a.booleanValue();
        this.f20426i = c2424f.f20422b;
    }

    static String b(C2425g c2425g) {
        String str = c2425g.f20424d;
        return null;
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", this.f20425e);
        bundle.putString("log_session_id", this.f20426i);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2425g)) {
            return false;
        }
        C2425g c2425g = (C2425g) obj;
        String str = c2425g.f20424d;
        return C2649g.b(null, null) && this.f20425e == c2425g.f20425e && C2649g.b(this.f20426i, c2425g.f20426i);
    }

    public final int hashCode() {
        return C2649g.c(null, Boolean.valueOf(this.f20425e), this.f20426i);
    }
}
