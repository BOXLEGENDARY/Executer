package D4;

import java.io.File;

public final class C0381l implements E4.Z {

    private final E4.Z f969a;

    public C0381l(E4.Z z7) {
        this.f969a = z7;
    }

    @Override
    public final Object zza() {
        File file = (File) this.f969a.zza();
        if (file == null) {
            return null;
        }
        return G4.c.a(file);
    }
}
