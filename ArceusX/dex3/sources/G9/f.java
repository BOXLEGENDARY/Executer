package G9;

import G9.e;
import G9.g;
import G9.k;
import G9.n;
import H9.c;
import Ta.d;
import android.content.Context;
import android.widget.TextView;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class f implements e.a {
    private final Context a;
    private final List<i> b = new ArrayList(3);
    private TextView.BufferType c = TextView.BufferType.SPANNABLE;
    private boolean d = true;

    f(@NonNull Context context) {
        this.a = context;
    }

    @NonNull
    private static List<i> c(@NonNull List<i> list) {
        return new p(list).b();
    }

    @Override
    @NonNull
    public e a() {
        if (this.b.isEmpty()) {
            throw new IllegalStateException("No plugins were added to this builder. Use #usePlugin method to add them");
        }
        List<i> listC = c(this.b);
        d.b bVar = new d.b();
        c.a aVarI = H9.c.i(this.a);
        g.b bVar2 = new g.b();
        n.a aVar = new n.a();
        k.a aVar2 = new k.a();
        for (i iVar : listC) {
            iVar.j(bVar);
            iVar.a(aVarI);
            iVar.k(bVar2);
            iVar.g(aVar);
            iVar.d(aVar2);
        }
        g gVarH = bVar2.h(aVarI.z(), aVar2.a());
        return new h(this.c, null, bVar.f(), m.b(aVar, gVarH), gVarH, Collections.unmodifiableList(listC), this.d);
    }

    @Override
    @NonNull
    public e.a b(@NonNull i iVar) {
        this.b.add(iVar);
        return this;
    }
}
