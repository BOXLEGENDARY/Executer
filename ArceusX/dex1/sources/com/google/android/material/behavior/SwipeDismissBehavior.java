package com.google.android.material.behavior;

import H0.c;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Z;
import y0.C3019t;
import y0.InterfaceC3022w;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    H0.c f17283a;

    c f17284b;

    private boolean f17285c;

    private boolean f17286d;

    private boolean f17288f;

    private float f17287e = 0.0f;

    int f17289g = 2;

    float f17290h = 0.5f;

    float f17291i = 0.0f;

    float f17292j = 0.5f;

    private final c.AbstractC0023c f17293k = new a();

    class a extends c.AbstractC0023c {

        private int f17294a;

        private int f17295b = -1;

        a() {
        }

        private boolean n(View view, float f7) {
            if (f7 == 0.0f) {
                return Math.abs(view.getLeft() - this.f17294a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f17290h);
            }
            boolean z7 = Z.z(view) == 1;
            int i7 = SwipeDismissBehavior.this.f17289g;
            if (i7 == 2) {
                return true;
            }
            if (i7 == 0) {
                if (z7) {
                    if (f7 >= 0.0f) {
                        return false;
                    }
                } else if (f7 <= 0.0f) {
                    return false;
                }
                return true;
            }
            if (i7 != 1) {
                return false;
            }
            if (z7) {
                if (f7 <= 0.0f) {
                    return false;
                }
            } else if (f7 >= 0.0f) {
                return false;
            }
            return true;
        }

        @Override
        public int a(View view, int i7, int i8) {
            int width;
            int width2;
            int width3;
            boolean z7 = Z.z(view) == 1;
            int i9 = SwipeDismissBehavior.this.f17289g;
            if (i9 == 0) {
                if (z7) {
                    width = this.f17294a - view.getWidth();
                    width2 = this.f17294a;
                } else {
                    width = this.f17294a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i9 != 1) {
                width = this.f17294a - view.getWidth();
                width2 = view.getWidth() + this.f17294a;
            } else if (z7) {
                width = this.f17294a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f17294a - view.getWidth();
                width2 = this.f17294a;
            }
            return SwipeDismissBehavior.H(width, i7, width2);
        }

        @Override
        public int b(View view, int i7, int i8) {
            return view.getTop();
        }

        @Override
        public int d(View view) {
            return view.getWidth();
        }

        @Override
        public void i(View view, int i7) {
            this.f17295b = i7;
            this.f17294a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                SwipeDismissBehavior.this.f17286d = true;
                parent.requestDisallowInterceptTouchEvent(true);
                SwipeDismissBehavior.this.f17286d = false;
            }
        }

        @Override
        public void j(int i7) {
            c cVar = SwipeDismissBehavior.this.f17284b;
            if (cVar != null) {
                cVar.b(i7);
            }
        }

        @Override
        public void k(View view, int i7, int i8, int i9, int i10) {
            float width = view.getWidth() * SwipeDismissBehavior.this.f17291i;
            float width2 = view.getWidth() * SwipeDismissBehavior.this.f17292j;
            float fAbs = Math.abs(i7 - this.f17294a);
            if (fAbs <= width) {
                view.setAlpha(1.0f);
            } else if (fAbs >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.G(0.0f, 1.0f - SwipeDismissBehavior.J(width, width2, fAbs), 1.0f));
            }
        }

        @Override
        public void l(android.view.View r3, float r4, float r5) {
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.a.l(android.view.View, float, float):void");
        }

        @Override
        public boolean m(View view, int i7) {
            int i8 = this.f17295b;
            return (i8 == -1 || i8 == i7) && SwipeDismissBehavior.this.F(view);
        }
    }

    class b implements InterfaceC3022w {
        b() {
        }

        @Override
        public boolean a(View view, InterfaceC3022w.a aVar) {
            if (!SwipeDismissBehavior.this.F(view)) {
                return false;
            }
            boolean z7 = Z.z(view) == 1;
            int i7 = SwipeDismissBehavior.this.f17289g;
            Z.X(view, (!(i7 == 0 && z7) && (i7 != 1 || z7)) ? view.getWidth() : -view.getWidth());
            view.setAlpha(0.0f);
            c cVar = SwipeDismissBehavior.this.f17284b;
            if (cVar != null) {
                cVar.a(view);
            }
            return true;
        }
    }

    public interface c {
        void a(View view);

        void b(int i7);
    }

    private class d implements Runnable {

        private final View f17298d;

        private final boolean f17299e;

        d(View view, boolean z7) {
            this.f17298d = view;
            this.f17299e = z7;
        }

        @Override
        public void run() {
            c cVar;
            H0.c cVar2 = SwipeDismissBehavior.this.f17283a;
            if (cVar2 != null && cVar2.k(true)) {
                Z.f0(this.f17298d, this);
            } else {
                if (!this.f17299e || (cVar = SwipeDismissBehavior.this.f17284b) == null) {
                    return;
                }
                cVar.a(this.f17298d);
            }
        }
    }

    static float G(float f7, float f8, float f9) {
        return Math.min(Math.max(f7, f8), f9);
    }

    static int H(int i7, int i8, int i9) {
        return Math.min(Math.max(i7, i8), i9);
    }

    private void I(ViewGroup viewGroup) {
        if (this.f17283a == null) {
            this.f17283a = this.f17288f ? H0.c.l(viewGroup, this.f17287e, this.f17293k) : H0.c.m(viewGroup, this.f17293k);
        }
    }

    static float J(float f7, float f8, float f9) {
        return (f9 - f7) / (f8 - f7);
    }

    private void O(View view) {
        Z.h0(view, 1048576);
        if (F(view)) {
            Z.j0(view, C3019t.a.f24405y, null, new b());
        }
    }

    @Override
    public boolean D(CoordinatorLayout coordinatorLayout, V v7, MotionEvent motionEvent) {
        if (this.f17283a == null) {
            return false;
        }
        if (this.f17286d && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.f17283a.z(motionEvent);
        return true;
    }

    public boolean F(View view) {
        return true;
    }

    public void K(float f7) {
        this.f17292j = G(0.0f, f7, 1.0f);
    }

    public void L(c cVar) {
        this.f17284b = cVar;
    }

    public void M(float f7) {
        this.f17291i = G(0.0f, f7, 1.0f);
    }

    public void N(int i7) {
        this.f17289g = i7;
    }

    @Override
    public boolean k(CoordinatorLayout coordinatorLayout, V v7, MotionEvent motionEvent) {
        boolean zV = this.f17285c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            zV = coordinatorLayout.v(v7, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f17285c = zV;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f17285c = false;
        }
        if (!zV) {
            return false;
        }
        I(coordinatorLayout);
        return !this.f17286d && this.f17283a.G(motionEvent);
    }

    @Override
    public boolean l(CoordinatorLayout coordinatorLayout, V v7, int i7) {
        boolean zL = super.l(coordinatorLayout, v7, i7);
        if (Z.x(v7) == 0) {
            Z.x0(v7, 1);
            O(v7);
        }
        return zL;
    }
}
