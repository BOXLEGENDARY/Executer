package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.Z;
import g.C2450d;
import g.C2453g;
import java.lang.reflect.InvocationTargetException;

final class q extends k implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, m, View.OnKeyListener {

    private static final int f9078O = C2453g.f20691o;

    private final int f9079A;

    final MenuPopupWindow f9080B;

    private PopupWindow.OnDismissListener f9083E;

    private View f9084F;

    View f9085G;

    private m.a f9086H;

    ViewTreeObserver f9087I;

    private boolean f9088J;

    private boolean f9089K;

    private int f9090L;

    private boolean f9092N;

    private final Context f9093e;

    private final g f9094i;

    private final f f9095v;

    private final boolean f9096w;

    private final int f9097y;

    private final int f9098z;

    final ViewTreeObserver.OnGlobalLayoutListener f9081C = new a();

    private final View.OnAttachStateChangeListener f9082D = new b();

    private int f9091M = 0;

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!q.this.isShowing() || q.this.f9080B.isModal()) {
                return;
            }
            View view = q.this.f9085G;
            if (view == null || !view.isShown()) {
                q.this.dismiss();
            } else {
                q.this.f9080B.show();
            }
        }
    }

    class b implements View.OnAttachStateChangeListener {
        b() {
        }

        @Override
        public void onViewAttachedToWindow(View view) {
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = q.this.f9087I;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    q.this.f9087I = view.getViewTreeObserver();
                }
                q qVar = q.this;
                qVar.f9087I.removeGlobalOnLayoutListener(qVar.f9081C);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public q(Context context, g gVar, View view, int i7, int i8, boolean z7) {
        this.f9093e = context;
        this.f9094i = gVar;
        this.f9096w = z7;
        this.f9095v = new f(gVar, LayoutInflater.from(context), z7, f9078O);
        this.f9098z = i7;
        this.f9079A = i8;
        Resources resources = context.getResources();
        this.f9097y = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2450d.f20577d));
        this.f9084F = view;
        this.f9080B = new MenuPopupWindow(context, null, i7, i8);
        gVar.c(this, context);
    }

    private boolean w() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        View view;
        if (isShowing()) {
            return true;
        }
        if (this.f9088J || (view = this.f9084F) == null) {
            return false;
        }
        this.f9085G = view;
        this.f9080B.setOnDismissListener(this);
        this.f9080B.setOnItemClickListener(this);
        this.f9080B.setModal(true);
        View view2 = this.f9085G;
        boolean z7 = this.f9087I == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f9087I = viewTreeObserver;
        if (z7) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f9081C);
        }
        view2.addOnAttachStateChangeListener(this.f9082D);
        this.f9080B.setAnchorView(view2);
        this.f9080B.setDropDownGravity(this.f9091M);
        if (!this.f9089K) {
            this.f9090L = k.l(this.f9095v, null, this.f9093e, this.f9097y);
            this.f9089K = true;
        }
        this.f9080B.setContentWidth(this.f9090L);
        this.f9080B.setInputMethodMode(2);
        this.f9080B.setEpicenterBounds(k());
        this.f9080B.show();
        ListView listView = this.f9080B.getListView();
        listView.setOnKeyListener(this);
        if (this.f9092N && this.f9094i.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f9093e).inflate(C2453g.f20690n, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f9094i.x());
            }
            frameLayout.setEnabled(false);
            listView.addHeaderView(frameLayout, null, false);
        }
        this.f9080B.setAdapter(this.f9095v);
        this.f9080B.show();
        return true;
    }

    @Override
    public void a(g gVar, boolean z7) {
        if (gVar != this.f9094i) {
            return;
        }
        dismiss();
        m.a aVar = this.f9086H;
        if (aVar != null) {
            aVar.a(gVar, z7);
        }
    }

    @Override
    public void b(boolean z7) {
        this.f9089K = false;
        f fVar = this.f9095v;
        if (fVar != null) {
            fVar.notifyDataSetChanged();
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public void dismiss() {
        if (isShowing()) {
            this.f9080B.dismiss();
        }
    }

    @Override
    public void f(m.a aVar) {
        this.f9086H = aVar;
    }

    @Override
    public ListView getListView() {
        return this.f9080B.getListView();
    }

    @Override
    public boolean h(r rVar) {
        if (rVar.hasVisibleItems()) {
            l lVar = new l(this.f9093e, rVar, this.f9085G, this.f9096w, this.f9098z, this.f9079A);
            lVar.l(this.f9086H);
            lVar.i(k.u(rVar));
            lVar.k(this.f9083E);
            this.f9083E = null;
            this.f9094i.e(false);
            int horizontalOffset = this.f9080B.getHorizontalOffset();
            int verticalOffset = this.f9080B.getVerticalOffset();
            if ((Gravity.getAbsoluteGravity(this.f9091M, Z.z(this.f9084F)) & 7) == 5) {
                horizontalOffset += this.f9084F.getWidth();
            }
            if (lVar.p(horizontalOffset, verticalOffset)) {
                m.a aVar = this.f9086H;
                if (aVar == null) {
                    return true;
                }
                aVar.b(rVar);
                return true;
            }
        }
        return false;
    }

    @Override
    public void i(g gVar) {
    }

    @Override
    public boolean isShowing() {
        return !this.f9088J && this.f9080B.isShowing();
    }

    @Override
    public void m(View view) {
        this.f9084F = view;
    }

    @Override
    public void o(boolean z7) {
        this.f9095v.d(z7);
    }

    @Override
    public void onDismiss() {
        this.f9088J = true;
        this.f9094i.close();
        ViewTreeObserver viewTreeObserver = this.f9087I;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f9087I = this.f9085G.getViewTreeObserver();
            }
            this.f9087I.removeGlobalOnLayoutListener(this.f9081C);
            this.f9087I = null;
        }
        this.f9085G.removeOnAttachStateChangeListener(this.f9082D);
        PopupWindow.OnDismissListener onDismissListener = this.f9083E;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    @Override
    public boolean onKey(View view, int i7, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i7 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override
    public void p(int i7) {
        this.f9091M = i7;
    }

    @Override
    public void q(int i7) {
        this.f9080B.setHorizontalOffset(i7);
    }

    @Override
    public void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f9083E = onDismissListener;
    }

    @Override
    public void s(boolean z7) {
        this.f9092N = z7;
    }

    @Override
    public void show() {
        if (!w()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override
    public void t(int i7) {
        this.f9080B.setVerticalOffset(i7);
    }
}
