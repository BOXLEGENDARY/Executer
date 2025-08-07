package G4;

import D4.K;
import java.util.List;

final class r implements K {

    final List f1423a;

    final List f1424b;

    final long f1425c;

    final boolean f1426d;

    final List f1427e;

    final a f1428f;

    r(a aVar, List list, List list2, long j7, boolean z7, List list3) {
        this.f1428f = aVar;
        this.f1423a = list;
        this.f1424b = list2;
        this.f1425c = j7;
        this.f1426d = z7;
        this.f1427e = list3;
    }

    @Override
    public final void A(int i7) {
        this.f1428f.w(6, i7, null, null, null, null, null);
    }

    @Override
    public final void a() {
        if (this.f1426d) {
            return;
        }
        this.f1428f.t(this.f1427e, this.f1423a, this.f1424b, this.f1425c, true);
    }

    @Override
    public final void zza() {
        this.f1428f.v(this.f1423a, this.f1424b, this.f1425c);
    }
}
