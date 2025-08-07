package C4;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipFile;

final class i implements l {

    final u f834a;

    final Set f835b;

    final AtomicBoolean f836c;

    final o f837d;

    i(o oVar, u uVar, Set set, AtomicBoolean atomicBoolean) {
        this.f837d = oVar;
        this.f834a = uVar;
        this.f835b = set;
        this.f836c = atomicBoolean;
    }

    @Override
    public final void a(ZipFile zipFile, Set set) throws IOException {
        this.f837d.f(this.f834a, set, new h(this));
    }
}
