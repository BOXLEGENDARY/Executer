package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1605a;
import androidx.core.view.Z;
import java.util.Map;
import java.util.WeakHashMap;
import y0.C3019t;
import y0.C3020u;

public class r extends C1605a {

    final RecyclerView f12019d;

    private final a f12020e;

    public static class a extends C1605a {

        final r f12021d;

        private Map<View, C1605a> f12022e = new WeakHashMap();

        public a(r rVar) {
            this.f12021d = rVar;
        }

        @Override
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            C1605a c1605a = this.f12022e.get(view);
            return c1605a != null ? c1605a.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override
        public C3020u b(View view) {
            C1605a c1605a = this.f12022e.get(view);
            return c1605a != null ? c1605a.b(view) : super.b(view);
        }

        @Override
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            C1605a c1605a = this.f12022e.get(view);
            if (c1605a != null) {
                c1605a.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override
        public void g(View view, C3019t c3019t) {
            if (this.f12021d.o() || this.f12021d.f12019d.getLayoutManager() == null) {
                super.g(view, c3019t);
                return;
            }
            this.f12021d.f12019d.getLayoutManager().S0(view, c3019t);
            C1605a c1605a = this.f12022e.get(view);
            if (c1605a != null) {
                c1605a.g(view, c3019t);
            } else {
                super.g(view, c3019t);
            }
        }

        @Override
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            C1605a c1605a = this.f12022e.get(view);
            if (c1605a != null) {
                c1605a.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1605a c1605a = this.f12022e.get(viewGroup);
            return c1605a != null ? c1605a.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override
        public boolean j(View view, int i7, Bundle bundle) {
            if (this.f12021d.o() || this.f12021d.f12019d.getLayoutManager() == null) {
                return super.j(view, i7, bundle);
            }
            C1605a c1605a = this.f12022e.get(view);
            if (c1605a != null) {
                if (c1605a.j(view, i7, bundle)) {
                    return true;
                }
            } else if (super.j(view, i7, bundle)) {
                return true;
            }
            return this.f12021d.f12019d.getLayoutManager().m1(view, i7, bundle);
        }

        @Override
        public void l(View view, int i7) {
            C1605a c1605a = this.f12022e.get(view);
            if (c1605a != null) {
                c1605a.l(view, i7);
            } else {
                super.l(view, i7);
            }
        }

        @Override
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            C1605a c1605a = this.f12022e.get(view);
            if (c1605a != null) {
                c1605a.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        C1605a n(View view) {
            return this.f12022e.remove(view);
        }

        void o(View view) {
            C1605a c1605aL = Z.l(view);
            if (c1605aL == null || c1605aL == this) {
                return;
            }
            this.f12022e.put(view, c1605aL);
        }
    }

    public r(RecyclerView recyclerView) {
        this.f12019d = recyclerView;
        C1605a c1605aN = n();
        if (c1605aN == null || !(c1605aN instanceof a)) {
            this.f12020e = new a(this);
        } else {
            this.f12020e = (a) c1605aN;
        }
    }

    @Override
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().O0(accessibilityEvent);
        }
    }

    @Override
    public void g(View view, C3019t c3019t) {
        super.g(view, c3019t);
        if (o() || this.f12019d.getLayoutManager() == null) {
            return;
        }
        this.f12019d.getLayoutManager().R0(c3019t);
    }

    @Override
    public boolean j(View view, int i7, Bundle bundle) {
        if (super.j(view, i7, bundle)) {
            return true;
        }
        if (o() || this.f12019d.getLayoutManager() == null) {
            return false;
        }
        return this.f12019d.getLayoutManager().k1(i7, bundle);
    }

    public C1605a n() {
        return this.f12020e;
    }

    boolean o() {
        return this.f12019d.l0();
    }
}
