package com.google.android.material.snackbar;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

class c {

    private static c f18444e;

    private final Object f18445a = new Object();

    private final Handler f18446b = new Handler(Looper.getMainLooper(), new a());

    private C0163c f18447c;

    private C0163c f18448d;

    class a implements Handler.Callback {
        a() {
        }

        @Override
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            c.this.d((C0163c) message.obj);
            return true;
        }
    }

    interface b {
        void a(int i7);

        void show();
    }

    private static class C0163c {

        final WeakReference<b> f18450a;

        int f18451b;

        boolean f18452c;

        C0163c(int i7, b bVar) {
            this.f18450a = new WeakReference<>(bVar);
            this.f18451b = i7;
        }

        boolean a(b bVar) {
            return bVar != null && this.f18450a.get() == bVar;
        }
    }

    private c() {
    }

    private boolean a(C0163c c0163c, int i7) {
        b bVar = c0163c.f18450a.get();
        if (bVar == null) {
            return false;
        }
        this.f18446b.removeCallbacksAndMessages(c0163c);
        bVar.a(i7);
        return true;
    }

    static c c() {
        if (f18444e == null) {
            f18444e = new c();
        }
        return f18444e;
    }

    private boolean f(b bVar) {
        C0163c c0163c = this.f18447c;
        return c0163c != null && c0163c.a(bVar);
    }

    private boolean g(b bVar) {
        C0163c c0163c = this.f18448d;
        return c0163c != null && c0163c.a(bVar);
    }

    private void l(C0163c c0163c) {
        int i7 = c0163c.f18451b;
        if (i7 == -2) {
            return;
        }
        if (i7 <= 0) {
            i7 = i7 == -1 ? 1500 : 2750;
        }
        this.f18446b.removeCallbacksAndMessages(c0163c);
        Handler handler = this.f18446b;
        handler.sendMessageDelayed(Message.obtain(handler, 0, c0163c), i7);
    }

    private void n() {
        C0163c c0163c = this.f18448d;
        if (c0163c != null) {
            this.f18447c = c0163c;
            this.f18448d = null;
            b bVar = c0163c.f18450a.get();
            if (bVar != null) {
                bVar.show();
            } else {
                this.f18447c = null;
            }
        }
    }

    public void b(b bVar, int i7) {
        synchronized (this.f18445a) {
            try {
                if (f(bVar)) {
                    a(this.f18447c, i7);
                } else if (g(bVar)) {
                    a(this.f18448d, i7);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void d(C0163c c0163c) {
        synchronized (this.f18445a) {
            try {
                if (this.f18447c == c0163c || this.f18448d == c0163c) {
                    a(c0163c, 2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean e(b bVar) {
        boolean z7;
        synchronized (this.f18445a) {
            try {
                z7 = f(bVar) || g(bVar);
            } finally {
            }
        }
        return z7;
    }

    public void h(b bVar) {
        synchronized (this.f18445a) {
            try {
                if (f(bVar)) {
                    this.f18447c = null;
                    if (this.f18448d != null) {
                        n();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(b bVar) {
        synchronized (this.f18445a) {
            try {
                if (f(bVar)) {
                    l(this.f18447c);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j(b bVar) {
        synchronized (this.f18445a) {
            try {
                if (f(bVar)) {
                    C0163c c0163c = this.f18447c;
                    if (!c0163c.f18452c) {
                        c0163c.f18452c = true;
                        this.f18446b.removeCallbacksAndMessages(c0163c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(b bVar) {
        synchronized (this.f18445a) {
            try {
                if (f(bVar)) {
                    C0163c c0163c = this.f18447c;
                    if (c0163c.f18452c) {
                        c0163c.f18452c = false;
                        l(c0163c);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(int i7, b bVar) {
        synchronized (this.f18445a) {
            try {
                if (f(bVar)) {
                    C0163c c0163c = this.f18447c;
                    c0163c.f18451b = i7;
                    this.f18446b.removeCallbacksAndMessages(c0163c);
                    l(this.f18447c);
                    return;
                }
                if (g(bVar)) {
                    this.f18448d.f18451b = i7;
                } else {
                    this.f18448d = new C0163c(i7, bVar);
                }
                C0163c c0163c2 = this.f18447c;
                if (c0163c2 == null || !a(c0163c2, 4)) {
                    this.f18447c = null;
                    n();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
