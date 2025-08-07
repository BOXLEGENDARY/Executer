package d9;

import android.content.Context;

public final class k implements C9.d<j> {
    private final C9.h<Context> a;

    public k(C9.h<Context> hVar) {
        this.a = hVar;
    }

    public static k a(C9.h<Context> hVar) {
        return new k(hVar);
    }

    public static j c(Context context) {
        return new j(context);
    }

    public j get() {
        return c((Context) this.a.get());
    }
}
