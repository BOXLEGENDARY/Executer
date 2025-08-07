package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.f;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import v0.k;

public class k extends f.c {

    private static final a f10869j = new a();

    public static class a {
        public Typeface a(Context context, k.b bVar) throws PackageManager.NameNotFoundException {
            return v0.k.a(context, null, new k.b[]{bVar});
        }

        public k.a b(Context context, v0.e eVar) throws PackageManager.NameNotFoundException {
            return v0.k.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    static class b implements f.g {

        private final Context f10870a;

        private final v0.e f10871b;

        private final a f10872c;

        private final Object f10873d = new Object();

        private Handler f10874e;

        private Executor f10875f;

        private ThreadPoolExecutor f10876g;

        f.h f10877h;

        private ContentObserver f10878i;

        private Runnable f10879j;

        b(Context context, v0.e eVar, a aVar) {
            x0.g.h(context, "Context cannot be null");
            x0.g.h(eVar, "FontRequest cannot be null");
            this.f10870a = context.getApplicationContext();
            this.f10871b = eVar;
            this.f10872c = aVar;
        }

        private void b() {
            synchronized (this.f10873d) {
                try {
                    this.f10877h = null;
                    ContentObserver contentObserver = this.f10878i;
                    if (contentObserver != null) {
                        this.f10872c.c(this.f10870a, contentObserver);
                        this.f10878i = null;
                    }
                    Handler handler = this.f10874e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f10879j);
                    }
                    this.f10874e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f10876g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f10875f = null;
                    this.f10876g = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        private k.b e() {
            try {
                k.a aVarB = this.f10872c.b(this.f10870a, this.f10871b);
                if (aVarB.e() == 0) {
                    k.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e7) {
                throw new RuntimeException("provider not found", e7);
            }
        }

        @Override
        public void a(f.h hVar) {
            x0.g.h(hVar, "LoaderCallback cannot be null");
            synchronized (this.f10873d) {
                this.f10877h = hVar;
            }
            d();
        }

        void c() {
            synchronized (this.f10873d) {
                try {
                    if (this.f10877h == null) {
                        return;
                    }
                    try {
                        k.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f10873d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            u0.m.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f10872c.a(this.f10870a, bVarE);
                            ByteBuffer byteBufferE = androidx.core.graphics.l.e(this.f10870a, null, bVarE.d());
                            if (byteBufferE == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            n nVarB = n.b(typefaceA, byteBufferE);
                            u0.m.b();
                            synchronized (this.f10873d) {
                                try {
                                    f.h hVar = this.f10877h;
                                    if (hVar != null) {
                                        hVar.b(nVarB);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th) {
                            u0.m.b();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f10873d) {
                            try {
                                f.h hVar2 = this.f10877h;
                                if (hVar2 != null) {
                                    hVar2.a(th2);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.f10873d) {
                try {
                    if (this.f10877h == null) {
                        return;
                    }
                    if (this.f10875f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = c.b("emojiCompat");
                        this.f10876g = threadPoolExecutorB;
                        this.f10875f = threadPoolExecutorB;
                    }
                    this.f10875f.execute(new Runnable() {
                        @Override
                        public final void run() {
                            this.f10880d.c();
                        }
                    });
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f10873d) {
                this.f10875f = executor;
            }
        }
    }

    public k(Context context, v0.e eVar) {
        super(new b(context, eVar, f10869j));
    }

    public k c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
