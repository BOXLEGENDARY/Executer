package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

public final class c1 {

    private final g f10642a;

    private static class a extends g {

        protected final Window f10643a;

        private final N f10644b;

        a(Window window, N n7) {
            this.f10643a = window;
            this.f10644b = n7;
        }

        private void f(int i7) {
            if (i7 == 1) {
                g(4);
            } else if (i7 == 2) {
                g(2);
            } else {
                if (i7 != 8) {
                    return;
                }
                this.f10644b.a();
            }
        }

        private void i(int i7) {
            if (i7 == 1) {
                j(4);
                k(1024);
            } else if (i7 == 2) {
                j(2);
            } else {
                if (i7 != 8) {
                    return;
                }
                this.f10644b.b();
            }
        }

        @Override
        void a(int i7) {
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    f(i8);
                }
            }
        }

        @Override
        void d(int i7) {
            this.f10643a.getDecorView().setTag(356039078, Integer.valueOf(i7));
            if (i7 == 0) {
                j(6144);
                return;
            }
            if (i7 == 1) {
                j(4096);
                g(2048);
            } else {
                if (i7 != 2) {
                    return;
                }
                j(2048);
                g(4096);
            }
        }

        @Override
        void e(int i7) {
            for (int i8 = 1; i8 <= 256; i8 <<= 1) {
                if ((i7 & i8) != 0) {
                    i(i8);
                }
            }
        }

        protected void g(int i7) {
            View decorView = this.f10643a.getDecorView();
            decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
        }

        protected void h(int i7) {
            this.f10643a.addFlags(i7);
        }

        protected void j(int i7) {
            View decorView = this.f10643a.getDecorView();
            decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
        }

        protected void k(int i7) {
            this.f10643a.clearFlags(i7);
        }
    }

    private static class b extends a {
        b(Window window, N n7) {
            super(window, n7);
        }

        @Override
        public void c(boolean z7) {
            if (!z7) {
                j(8192);
                return;
            }
            k(67108864);
            h(Integer.MIN_VALUE);
            g(8192);
        }
    }

    private static class c extends b {
        c(Window window, N n7) {
            super(window, n7);
        }

        @Override
        public void b(boolean z7) {
            if (!z7) {
                j(16);
                return;
            }
            k(134217728);
            h(Integer.MIN_VALUE);
            g(16);
        }
    }

    private static class e extends d {
        e(Window window, c1 c1Var, N n7) {
            super(window, c1Var, n7);
        }

        @Override
        void d(int i7) {
            this.f10646b.setSystemBarsBehavior(i7);
        }

        e(WindowInsetsController windowInsetsController, c1 c1Var, N n7) {
            super(windowInsetsController, c1Var, n7);
        }
    }

    private static class f extends e {
        f(Window window, c1 c1Var, N n7) {
            super(window, c1Var, n7);
        }

        f(WindowInsetsController windowInsetsController, c1 c1Var, N n7) {
            super(windowInsetsController, c1Var, n7);
        }
    }

    private static class g {
        g() {
        }

        void a(int i7) {
            throw null;
        }

        public void b(boolean z7) {
            throw null;
        }

        public void c(boolean z7) {
            throw null;
        }

        void d(int i7) {
            throw null;
        }

        void e(int i7) {
            throw null;
        }
    }

    @Deprecated
    private c1(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.f10642a = new f(windowInsetsController, this, new N(windowInsetsController));
        } else {
            this.f10642a = new d(windowInsetsController, this, new N(windowInsetsController));
        }
    }

    @Deprecated
    public static c1 f(WindowInsetsController windowInsetsController) {
        return new c1(windowInsetsController);
    }

    public void a(int i7) {
        this.f10642a.a(i7);
    }

    public void b(boolean z7) {
        this.f10642a.b(z7);
    }

    public void c(boolean z7) {
        this.f10642a.c(z7);
    }

    public void d(int i7) {
        this.f10642a.d(i7);
    }

    public void e(int i7) {
        this.f10642a.e(i7);
    }

    private static class d extends g {

        final c1 f10645a;

        final WindowInsetsController f10646b;

        final N f10647c;

        private final g0.k<Object, WindowInsetsController.OnControllableInsetsChangedListener> f10648d;

        protected Window f10649e;

        d(Window window, c1 c1Var, N n7) {
            this(window.getInsetsController(), c1Var, n7);
            this.f10649e = window;
        }

        @Override
        void a(int i7) {
            if ((i7 & 8) != 0) {
                this.f10647c.a();
            }
            this.f10646b.hide(i7 & (-9));
        }

        @Override
        public void b(boolean z7) {
            if (z7) {
                if (this.f10649e != null) {
                    f(16);
                }
                this.f10646b.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f10649e != null) {
                    g(16);
                }
                this.f10646b.setSystemBarsAppearance(0, 16);
            }
        }

        @Override
        public void c(boolean z7) {
            if (z7) {
                if (this.f10649e != null) {
                    f(8192);
                }
                this.f10646b.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f10649e != null) {
                    g(8192);
                }
                this.f10646b.setSystemBarsAppearance(0, 8);
            }
        }

        @Override
        void d(int i7) {
            Window window = this.f10649e;
            if (window == null) {
                this.f10646b.setSystemBarsBehavior(i7);
                return;
            }
            window.getDecorView().setTag(356039078, Integer.valueOf(i7));
            if (i7 == 0) {
                g(6144);
                return;
            }
            if (i7 == 1) {
                g(4096);
                f(2048);
            } else {
                if (i7 != 2) {
                    return;
                }
                g(2048);
                f(4096);
            }
        }

        @Override
        void e(int i7) {
            if ((i7 & 8) != 0) {
                this.f10647c.b();
            }
            this.f10646b.show(i7 & (-9));
        }

        protected void f(int i7) {
            View decorView = this.f10649e.getDecorView();
            decorView.setSystemUiVisibility(i7 | decorView.getSystemUiVisibility());
        }

        protected void g(int i7) {
            View decorView = this.f10649e.getDecorView();
            decorView.setSystemUiVisibility((~i7) & decorView.getSystemUiVisibility());
        }

        d(WindowInsetsController windowInsetsController, c1 c1Var, N n7) {
            this.f10648d = new g0.k<>();
            this.f10646b = windowInsetsController;
            this.f10645a = c1Var;
            this.f10647c = n7;
        }
    }

    public c1(Window window, View view) {
        N n7 = new N(view);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            this.f10642a = new f(window, this, n7);
        } else if (i7 >= 30) {
            this.f10642a = new d(window, this, n7);
        } else {
            this.f10642a = new c(window, n7);
        }
    }
}
