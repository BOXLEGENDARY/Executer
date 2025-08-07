package G9;

import G9.i;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class p implements i.a {
    private final List<i> a;
    private final List<i> b;
    private final Set<i> c = new HashSet(3);

    p(@NonNull List<i> list) {
        this.a = list;
        this.b = new ArrayList(list.size());
    }

    private void a(@NonNull i iVar) {
        if (this.b.contains(iVar)) {
            return;
        }
        if (this.c.contains(iVar)) {
            throw new IllegalStateException("Cyclic dependency chain found: " + this.c);
        }
        this.c.add(iVar);
        iVar.f(this);
        this.c.remove(iVar);
        if (this.b.contains(iVar)) {
            return;
        }
        if (H9.a.class.isAssignableFrom(iVar.getClass())) {
            this.b.add(0, iVar);
        } else {
            this.b.add(iVar);
        }
    }

    @NonNull
    List<i> b() {
        Iterator<i> it = this.a.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        return this.b;
    }
}
