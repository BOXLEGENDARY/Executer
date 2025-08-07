package androidx.emoji2.text;

import android.content.Context;
import android.view.AbstractC1694h;
import android.view.InterfaceC1690d;
import android.view.InterfaceC1701o;
import android.view.ProcessLifecycleInitializer;
import androidx.emoji2.text.f;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer implements f1.a<Boolean> {

    static class a extends f.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    static class b implements f.g {

        private final Context f10804a;

        class a extends f.h {

            final f.h f10805a;

            final ThreadPoolExecutor f10806b;

            a(f.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f10805a = hVar;
                this.f10806b = threadPoolExecutor;
            }

            @Override
            public void a(Throwable th) {
                try {
                    this.f10805a.a(th);
                } finally {
                    this.f10806b.shutdown();
                }
            }

            @Override
            public void b(n nVar) {
                try {
                    this.f10805a.b(nVar);
                } finally {
                    this.f10806b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f10804a = context.getApplicationContext();
        }

        @Override
        public void a(final f.h hVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.c.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() {
                @Override
                public final void run() {
                    this.f10844d.d(hVar, threadPoolExecutorB);
                }
            });
        }

        public void d(f.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k kVarA = d.a(this.f10804a);
                if (kVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                kVarA.c(threadPoolExecutor);
                kVarA.a().a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th) {
                hVar.a(th);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class c implements Runnable {
        c() {
        }

        @Override
        public void run() {
            try {
                u0.m.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.h()) {
                    f.b().k();
                }
            } finally {
                u0.m.b();
            }
        }
    }

    @Override
    public List<Class<? extends f1.a<?>>> b() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override
    public Boolean a(Context context) {
        f.g(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        final AbstractC1694h lifecycle = ((InterfaceC1701o) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.a(new InterfaceC1690d() {
            @Override
            public void onResume(InterfaceC1701o interfaceC1701o) {
                EmojiCompatInitializer.this.e();
                lifecycle.d(this);
            }
        });
    }

    void e() {
        androidx.emoji2.text.c.d().postDelayed(new c(), 500L);
    }
}
