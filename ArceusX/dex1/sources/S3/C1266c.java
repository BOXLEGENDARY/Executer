package S3;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

final class C1266c extends Z {

    final C1288e f6896d;

    C1266c(C1288e c1288e) {
        this.f6896d = c1288e;
    }

    @Override
    public final boolean contains(Object obj) {
        Set setEntrySet = this.f6896d.f6914i.entrySet();
        setEntrySet.getClass();
        try {
            return setEntrySet.contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override
    final Map d() {
        return this.f6896d;
    }

    @Override
    public final Iterator iterator() {
        return new C1277d(this.f6896d);
    }

    @Override
    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        C1288e c1288e = this.f6896d;
        AbstractC1376m.n(c1288e.f6915v, entry.getKey());
        return true;
    }
}
