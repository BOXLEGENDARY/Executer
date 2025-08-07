package o8;

import C9.d;
import C9.h;
import android.content.Context;

public final class c implements d<b> {
    private final h<Context> a;

    public c(h<Context> hVar) {
        this.a = hVar;
    }

    public static c a(h<Context> hVar) {
        return new c(hVar);
    }

    public static b c(Context context) {
        return new b(context);
    }

    public b get() {
        return c((Context) this.a.get());
    }
}
