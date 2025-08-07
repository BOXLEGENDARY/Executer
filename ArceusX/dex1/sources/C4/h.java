package C4;

import java.io.File;
import java.io.IOException;

final class h implements m {

    final i f833a;

    h(i iVar) {
        this.f833a = iVar;
    }

    @Override
    public final void a(n nVar, File file, boolean z7) throws IOException {
        this.f833a.f835b.add(file);
        if (z7) {
            return;
        }
        this.f833a.f836c.set(false);
    }
}
