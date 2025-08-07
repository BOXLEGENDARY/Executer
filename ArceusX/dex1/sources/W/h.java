package w;

import C.R0;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import s.P1;

public class h {

    private final CaptureSessionOnClosedNotCalledQuirk f24200a;

    @FunctionalInterface
    public interface a {
        void a(P1 p1);
    }

    public h(R0 r02) {
        this.f24200a = (CaptureSessionOnClosedNotCalledQuirk) r02.b(CaptureSessionOnClosedNotCalledQuirk.class);
    }

    private void a(Set<P1> set) {
        for (P1 p1 : set) {
            p1.c().q(p1);
        }
    }

    private void b(Set<P1> set) {
        for (P1 p1 : set) {
            p1.c().r(p1);
        }
    }

    public void c(P1 p1, List<P1> list, List<P1> list2, a aVar) {
        P1 next;
        P1 next2;
        if (d()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Iterator<P1> it = list.iterator();
            while (it.hasNext() && (next2 = it.next()) != p1) {
                linkedHashSet.add(next2);
            }
            b(linkedHashSet);
        }
        aVar.a(p1);
        if (d()) {
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            Iterator<P1> it2 = list2.iterator();
            while (it2.hasNext() && (next = it2.next()) != p1) {
                linkedHashSet2.add(next);
            }
            a(linkedHashSet2);
        }
    }

    public boolean d() {
        return this.f24200a != null;
    }
}
