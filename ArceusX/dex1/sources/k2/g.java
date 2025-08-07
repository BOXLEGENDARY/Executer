package k2;

import java.util.HashMap;
import java.util.Map;
import l2.i;
import l2.j;
import l2.k;

public enum g {
    CALLBACK(l2.b.class, 0),
    CANCEL_RESULT_CALLBACK(l2.d.class, 0),
    RUN_JOB(i.class, 0),
    COMMAND(l2.e.class, 0),
    f21288z(l2.h.class, 0),
    JOB_CONSUMER_IDLE(l2.g.class, 0),
    ADD_JOB(l2.a.class, 1),
    CANCEL(l2.c.class, 1),
    CONSTRAINT_CHANGE(l2.f.class, 2),
    RUN_JOB_RESULT(j.class, 3),
    SCHEDULER(k.class, 4);


    static final Map<Class<? extends b>, g> f21281G = new HashMap();

    static final int f21282H;

    final Class<? extends b> f21289d;

    final int f21290e;

    static {
        int i7 = 0;
        for (g gVar : values()) {
            f21281G.put(gVar.f21289d, gVar);
            int i8 = gVar.f21290e;
            if (i8 > i7) {
                i7 = i8;
            }
        }
        f21282H = i7;
    }

    g(Class cls, int i7) {
        this.f21289d = cls;
        this.f21290e = i7;
    }
}
