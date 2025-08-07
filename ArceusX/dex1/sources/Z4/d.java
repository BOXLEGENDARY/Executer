package Z4;

import S4.C1529d;
import S4.h;
import S4.q;
import S4.w;
import Z4.f;
import android.content.Context;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class d implements f {

    private static final ThreadFactory f8210d = new ThreadFactory() {
        @Override
        public final Thread newThread(Runnable runnable) {
            return d.h(runnable);
        }
    };

    private c5.b<g> f8211a;

    private final Set<e> f8212b;

    private final Executor f8213c;

    private d(final Context context, Set<e> set) {
        this(new w(new c5.b() {
            @Override
            public final Object get() {
                return g.a(context);
            }
        }), set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f8210d));
    }

    public static C1529d<f> e() {
        return C1529d.c(f.class).b(q.h(Context.class)).b(q.j(e.class)).f(new h() {
            @Override
            public final Object a(S4.e eVar) {
                return d.f(eVar);
            }
        }).d();
    }

    public static f f(S4.e eVar) {
        return new d((Context) eVar.a(Context.class), eVar.d(e.class));
    }

    public static Thread h(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override
    public f.a a(String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zD = this.f8211a.get().d(str, jCurrentTimeMillis);
        boolean zC = this.f8211a.get().c(jCurrentTimeMillis);
        return (zD && zC) ? f.a.COMBINED : zC ? f.a.GLOBAL : zD ? f.a.SDK : f.a.NONE;
    }

    d(c5.b<g> bVar, Set<e> set, Executor executor) {
        this.f8211a = bVar;
        this.f8212b = set;
        this.f8213c = executor;
    }
}
