package ha;

import C9.d;
import C9.g;
import android.view.Window;

public final class l implements d<Window> {
    private final i a;

    public l(i iVar) {
        this.a = iVar;
    }

    public static l a(i iVar) {
        return new l(iVar);
    }

    public static Window c(i iVar) {
        return (Window) g.d(iVar.c());
    }

    public Window get() {
        return c(this.a);
    }
}
