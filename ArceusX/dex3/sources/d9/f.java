package d9;

import android.content.Context;

public final class f implements C9.d<e> {
    private final C9.h<Context> a;

    public f(C9.h<Context> hVar) {
        this.a = hVar;
    }

    public static f a(C9.h<Context> hVar) {
        return new f(hVar);
    }

    public static e c(Context context) {
        return new e(context);
    }

    public e get() {
        return c((Context) this.a.get());
    }
}
