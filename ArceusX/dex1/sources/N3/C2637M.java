package n3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public final class C2637M {

    private static final Uri f22253f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    private final String f22254a;

    private final String f22255b;

    private final ComponentName f22256c;

    private final int f22257d;

    private final boolean f22258e;

    public C2637M(String str, String str2, int i7, boolean z7) {
        C2651i.f(str);
        this.f22254a = str;
        C2651i.f(str2);
        this.f22255b = str2;
        this.f22256c = null;
        this.f22257d = 4225;
        this.f22258e = z7;
    }

    public final ComponentName a() {
        return this.f22256c;
    }

    public final Intent b(Context context) {
        Bundle bundleCall;
        if (this.f22254a == null) {
            return new Intent().setComponent(this.f22256c);
        }
        if (this.f22258e) {
            Bundle bundle = new Bundle();
            bundle.putString("serviceActionBundleKey", this.f22254a);
            try {
                bundleCall = context.getContentResolver().call(f22253f, "serviceIntentCall", (String) null, bundle);
            } catch (IllegalArgumentException e7) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e7.toString()));
                bundleCall = null;
            }
            intent = bundleCall != null ? (Intent) bundleCall.getParcelable("serviceResponseIntentKey") : null;
            if (intent == null) {
                Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f22254a)));
            }
        }
        return intent == null ? new Intent(this.f22254a).setPackage(this.f22255b) : intent;
    }

    public final String c() {
        return this.f22255b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2637M)) {
            return false;
        }
        C2637M c2637m = (C2637M) obj;
        return C2649g.b(this.f22254a, c2637m.f22254a) && C2649g.b(this.f22255b, c2637m.f22255b) && C2649g.b(this.f22256c, c2637m.f22256c) && this.f22258e == c2637m.f22258e;
    }

    public final int hashCode() {
        return C2649g.c(this.f22254a, this.f22255b, this.f22256c, 4225, Boolean.valueOf(this.f22258e));
    }

    public final String toString() {
        String str = this.f22254a;
        if (str != null) {
            return str;
        }
        C2651i.l(this.f22256c);
        return this.f22256c.flattenToString();
    }
}
