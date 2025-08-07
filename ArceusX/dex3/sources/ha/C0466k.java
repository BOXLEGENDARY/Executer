package ha;

import C9.d;
import C9.h;
import android.content.Context;

public final class C0466k implements d<C0462j> {
    private final h<Context> a;

    public C0466k(h<Context> hVar) {
        this.a = hVar;
    }

    public static C0466k a(h<Context> hVar) {
        return new C0466k(hVar);
    }

    public static C0462j c(Context context) {
        return new C0462j(context);
    }

    public C0462j get() {
        return c((Context) this.a.get());
    }
}
