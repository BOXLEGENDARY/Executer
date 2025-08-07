package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.m;
import androidx.core.view.C1640s;
import androidx.core.view.Z;
import g.C2450d;

public class l {

    private final Context f9064a;

    private final g f9065b;

    private final boolean f9066c;

    private final int f9067d;

    private final int f9068e;

    private View f9069f;

    private int f9070g;

    private boolean f9071h;

    private m.a f9072i;

    private k f9073j;

    private PopupWindow.OnDismissListener f9074k;

    private final PopupWindow.OnDismissListener f9075l;

    class a implements PopupWindow.OnDismissListener {
        a() {
        }

        @Override
        public void onDismiss() {
            l.this.g();
        }
    }

    static class b {
        static void a(Display display, Point point) {
            display.getRealSize(point);
        }
    }

    public l(Context context, g gVar, View view, boolean z7, int i7) {
        this(context, gVar, view, z7, i7, 0);
    }

    private k a() {
        Display defaultDisplay = ((WindowManager) this.f9064a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        b.a(defaultDisplay, point);
        k dVar = Math.min(point.x, point.y) >= this.f9064a.getResources().getDimensionPixelSize(C2450d.f20576c) ? new d(this.f9064a, this.f9069f, this.f9067d, this.f9068e, this.f9066c) : new q(this.f9064a, this.f9065b, this.f9069f, this.f9067d, this.f9068e, this.f9066c);
        dVar.i(this.f9065b);
        dVar.r(this.f9075l);
        dVar.m(this.f9069f);
        dVar.f(this.f9072i);
        dVar.o(this.f9071h);
        dVar.p(this.f9070g);
        return dVar;
    }

    private void n(int i7, int i8, boolean z7, boolean z8) {
        k kVarE = e();
        kVarE.s(z8);
        if (z7) {
            if ((C1640s.b(this.f9070g, Z.z(this.f9069f)) & 7) == 5) {
                i7 -= this.f9069f.getWidth();
            }
            kVarE.q(i7);
            kVarE.t(i8);
            int i9 = (int) ((this.f9064a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            kVarE.n(new Rect(i7 - i9, i8 - i9, i7 + i9, i8 + i9));
        }
        kVarE.show();
    }

    public void b() {
        if (f()) {
            this.f9073j.dismiss();
        }
    }

    public int c() {
        return this.f9070g;
    }

    public ListView d() {
        return e().getListView();
    }

    public k e() {
        if (this.f9073j == null) {
            this.f9073j = a();
        }
        return this.f9073j;
    }

    public boolean f() {
        k kVar = this.f9073j;
        return kVar != null && kVar.isShowing();
    }

    protected void g() {
        this.f9073j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f9074k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void h(View view) {
        this.f9069f = view;
    }

    public void i(boolean z7) {
        this.f9071h = z7;
        k kVar = this.f9073j;
        if (kVar != null) {
            kVar.o(z7);
        }
    }

    public void j(int i7) {
        this.f9070g = i7;
    }

    public void k(PopupWindow.OnDismissListener onDismissListener) {
        this.f9074k = onDismissListener;
    }

    public void l(m.a aVar) {
        this.f9072i = aVar;
        k kVar = this.f9073j;
        if (kVar != null) {
            kVar.f(aVar);
        }
    }

    public void m() {
        if (!o()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public boolean o() {
        if (f()) {
            return true;
        }
        if (this.f9069f == null) {
            return false;
        }
        n(0, 0, false, false);
        return true;
    }

    public boolean p(int i7, int i8) {
        if (f()) {
            return true;
        }
        if (this.f9069f == null) {
            return false;
        }
        n(i7, i8, true, true);
        return true;
    }

    public l(Context context, g gVar, View view, boolean z7, int i7, int i8) {
        this.f9070g = 8388611;
        this.f9075l = new a();
        this.f9064a = context;
        this.f9065b = gVar;
        this.f9069f = view;
        this.f9066c = z7;
        this.f9067d = i7;
        this.f9068e = i8;
    }
}
