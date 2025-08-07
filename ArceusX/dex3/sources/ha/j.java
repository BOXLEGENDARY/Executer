package ha;

import C9.d;
import C9.g;
import android.content.Context;

public final class j implements d<Context> {
    private final i a;

    public j(i iVar) {
        this.a = iVar;
    }

    public static Context a(i iVar) {
        return (Context) g.d(iVar.a());
    }

    public static j b(i iVar) {
        return new j(iVar);
    }

    public Context get() {
        return a(this.a);
    }
}
