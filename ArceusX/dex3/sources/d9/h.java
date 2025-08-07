package d9;

import android.content.Context;

public final class h implements C9.d<g> {
    private final C9.h<Context> a;

    public h(C9.h<Context> hVar) {
        this.a = hVar;
    }

    public static h a(C9.h<Context> hVar) {
        return new h(hVar);
    }

    public static g c(Context context) {
        return new g(context);
    }

    public g get() {
        return c((Context) this.a.get());
    }
}
