package androidx.core.view;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.N;
import f6.ck.ZJZXBWla;
import java.util.concurrent.atomic.AtomicBoolean;

public final class N {

    private final c f10607a;

    static class a extends c {

        private final View f10608a;

        a(View view) {
            this.f10608a = view;
        }

        public static void d(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        @Override
        void a() {
            View view = this.f10608a;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f10608a.getWindowToken(), 0);
            }
        }

        @Override
        void b() {
            final View viewFindViewById = this.f10608a;
            if (viewFindViewById == null) {
                return;
            }
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = viewFindViewById.getRootView().findFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f10608a.getRootView().findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() {
                @Override
                public final void run() {
                    N.a.d(viewFindViewById);
                }
            });
        }
    }

    private static class c {
        c() {
        }

        void a() {
            throw null;
        }

        void b() {
            throw null;
        }
    }

    public N(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f10607a = new b(view);
        } else {
            this.f10607a = new a(view);
        }
    }

    public void a() {
        this.f10607a.a();
    }

    public void b() {
        this.f10607a.b();
    }

    static class b extends a {

        private View f10609b;

        private WindowInsetsController f10610c;

        b(View view) {
            super(view);
            this.f10609b = view;
        }

        public static void f(AtomicBoolean atomicBoolean, WindowInsetsController windowInsetsController, int i7) {
            atomicBoolean.set((i7 & 8) != 0);
        }

        @Override
        void a() {
            View view;
            WindowInsetsController windowInsetsController = this.f10610c;
            if (windowInsetsController == null) {
                View view2 = this.f10609b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController == null) {
                super.a();
                return;
            }
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() {
                @Override
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i7) {
                    N.b.f(atomicBoolean, windowInsetsController2, i7);
                }
            };
            windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            if (!atomicBoolean.get() && (view = this.f10609b) != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f10609b.getWindowToken(), 0);
            }
            windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
            windowInsetsController.hide(WindowInsets.Type.ime());
        }

        @Override
        void b() {
            View view = this.f10609b;
            if (view != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) view.getContext().getSystemService(ZJZXBWla.vmyEaUzuNFAe)).isActive();
            }
            WindowInsetsController windowInsetsController = this.f10610c;
            if (windowInsetsController == null) {
                View view2 = this.f10609b;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.b();
        }

        b(WindowInsetsController windowInsetsController) {
            super(null);
            this.f10610c = windowInsetsController;
        }
    }

    @Deprecated
    N(WindowInsetsController windowInsetsController) {
        this.f10607a = new b(windowInsetsController);
    }
}
