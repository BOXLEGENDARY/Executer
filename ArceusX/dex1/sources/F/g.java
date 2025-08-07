package F;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

final class g implements Executor {

    private final Executor f1244e;

    final Deque<Runnable> f1243d = new ArrayDeque();

    private final b f1245i = new b();

    c f1246v = c.IDLE;

    long f1247w = 0;

    class a implements Runnable {

        final Runnable f1248d;

        a(Runnable runnable) {
            this.f1248d = runnable;
        }

        @Override
        public void run() {
            this.f1248d.run();
        }
    }

    final class b implements Runnable {
        b() {
        }

        private void a() {
            throw new UnsupportedOperationException("Method not decompiled: F.g.b.a():void");
        }

        @Override
        public void run() {
            try {
                a();
            } catch (Error e7) {
                synchronized (g.this.f1243d) {
                    g.this.f1246v = c.IDLE;
                    throw e7;
                }
            }
        }
    }

    enum c {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    g(Executor executor) {
        this.f1244e = (Executor) x0.g.g(executor);
    }

    @Override
    public void execute(java.lang.Runnable r8) {
        throw new UnsupportedOperationException("Method not decompiled: F.g.execute(java.lang.Runnable):void");
    }
}
