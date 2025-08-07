package m3;

import a4.C1574k;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.tasks.Task;
import g0.C2457a;
import java.util.Iterator;
import java.util.Set;
import l3.C2528c;
import l3.InterfaceC2533h;

public final class C2566G {

    private int f22004d;

    private final C2457a f22002b = new C2457a();

    private final C1574k f22003c = new C1574k();

    private boolean f22005e = false;

    private final C2457a f22001a = new C2457a();

    public C2566G(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.f22001a.put(((InterfaceC2533h) it.next()).l(), null);
        }
        this.f22004d = this.f22001a.keySet().size();
    }

    public final Task a() {
        return this.f22003c.a();
    }

    public final Set b() {
        return this.f22001a.keySet();
    }

    public final void c(C2571b c2571b, ConnectionResult connectionResult, String str) {
        this.f22001a.put(c2571b, connectionResult);
        this.f22002b.put(c2571b, str);
        this.f22004d--;
        if (!connectionResult.q()) {
            this.f22005e = true;
        }
        if (this.f22004d == 0) {
            if (!this.f22005e) {
                this.f22003c.c(this.f22002b);
            } else {
                this.f22003c.b(new C2528c(this.f22001a));
            }
        }
    }
}
