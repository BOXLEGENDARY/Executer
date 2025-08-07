package C4;

import java.io.IOException;
import java.util.Set;
import java.util.zip.ZipFile;

final class j implements l {

    final Set f838a;

    final u f839b;

    final o f840c;

    j(o oVar, Set set, u uVar) {
        this.f840c = oVar;
        this.f838a = set;
        this.f839b = uVar;
    }

    @Override
    public final void a(ZipFile zipFile, Set set) throws IOException {
        this.f838a.addAll(o.a(this.f840c, set, this.f839b, zipFile));
    }
}
