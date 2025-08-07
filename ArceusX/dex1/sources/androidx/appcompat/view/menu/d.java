package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.MenuItemHoverListener;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.core.view.C1640s;
import androidx.core.view.Z;
import g.C2450d;
import g.C2453g;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

final class d extends k implements m, View.OnKeyListener, PopupWindow.OnDismissListener {

    private static final int f8935U = C2453g.f20683g;

    private View f8943H;

    View f8944I;

    private boolean f8946K;

    private boolean f8947L;

    private int f8948M;

    private int f8949N;

    private boolean f8951P;

    private m.a f8952Q;

    ViewTreeObserver f8953R;

    private PopupWindow.OnDismissListener f8954S;

    boolean f8955T;

    private final Context f8956e;

    private final int f8957i;

    private final int f8958v;

    private final int f8959w;

    private final boolean f8960y;

    final Handler f8961z;

    private final List<g> f8936A = new ArrayList();

    final List<C0069d> f8937B = new ArrayList();

    final ViewTreeObserver.OnGlobalLayoutListener f8938C = new a();

    private final View.OnAttachStateChangeListener f8939D = new b();

    private final MenuItemHoverListener f8940E = new c();

    private int f8941F = 0;

    private int f8942G = 0;

    private boolean f8950O = false;

    private int f8945J = A();

    class a implements ViewTreeObserver.OnGlobalLayoutListener {
        a() {
        }

        @Override
        public void onGlobalLayout() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (!d.this.isShowing() || d.this.f8937B.size() <= 0 || d.this.f8937B.get(0).f8969a.isModal()) {
                return;
            }
            View view = d.this.f8944I;
            if (view == null || !view.isShown()) {
                d.this.dismiss();
                return;
            }
            Iterator<C0069d> it = d.this.f8937B.iterator();
            while (it.hasNext()) {
                it.next().f8969a.show();
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
            ViewTreeObserver viewTreeObserver = d.this.f8953R;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    d.this.f8953R = view.getViewTreeObserver();
                }
                d dVar = d.this;
                dVar.f8953R.removeGlobalOnLayoutListener(dVar.f8938C);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    class c implements MenuItemHoverListener {

        class a implements Runnable {

            final C0069d f8965d;

            final MenuItem f8966e;

            final g f8967i;

            a(C0069d c0069d, MenuItem menuItem, g gVar) {
                this.f8965d = c0069d;
                this.f8966e = menuItem;
                this.f8967i = gVar;
            }

            @Override
            public void run() {
                C0069d c0069d = this.f8965d;
                if (c0069d != null) {
                    d.this.f8955T = true;
                    c0069d.f8970b.e(false);
                    d.this.f8955T = false;
                }
                if (this.f8966e.isEnabled() && this.f8966e.hasSubMenu()) {
                    this.f8967i.L(this.f8966e, 4);
                }
            }
        }

        c() {
        }

        @Override
        public void onItemHoverEnter(g gVar, MenuItem menuItem) {
            d.this.f8961z.removeCallbacksAndMessages(null);
            int size = d.this.f8937B.size();
            int i7 = 0;
            while (true) {
                if (i7 >= size) {
                    i7 = -1;
                    break;
                } else if (gVar == d.this.f8937B.get(i7).f8970b) {
                    break;
                } else {
                    i7++;
                }
            }
            if (i7 == -1) {
                return;
            }
            int i8 = i7 + 1;
            d.this.f8961z.postAtTime(new a(i8 < d.this.f8937B.size() ? d.this.f8937B.get(i8) : null, menuItem, gVar), gVar, SystemClock.uptimeMillis() + 200);
        }

        @Override
        public void onItemHoverExit(g gVar, MenuItem menuItem) {
            d.this.f8961z.removeCallbacksAndMessages(gVar);
        }
    }

    private static class C0069d {

        public final MenuPopupWindow f8969a;

        public final g f8970b;

        public final int f8971c;

        public C0069d(MenuPopupWindow menuPopupWindow, g gVar, int i7) {
            this.f8969a = menuPopupWindow;
            this.f8970b = gVar;
            this.f8971c = i7;
        }

        public ListView a() {
            return this.f8969a.getListView();
        }
    }

    public d(Context context, View view, int i7, int i8, boolean z7) {
        this.f8956e = context;
        this.f8943H = view;
        this.f8958v = i7;
        this.f8959w = i8;
        this.f8960y = z7;
        Resources resources = context.getResources();
        this.f8957i = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(C2450d.f20577d));
        this.f8961z = new Handler();
    }

    private int A() {
        return Z.z(this.f8943H) == 1 ? 0 : 1;
    }

    private int B(int i7) {
        List<C0069d> list = this.f8937B;
        ListView listViewA = list.get(list.size() - 1).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f8944I.getWindowVisibleDisplayFrame(rect);
        return this.f8945J == 1 ? (iArr[0] + listViewA.getWidth()) + i7 > rect.right ? 0 : 1 : iArr[0] - i7 < 0 ? 1 : 0;
    }

    private void C(g gVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C0069d c0069d;
        View viewZ;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f8956e);
        f fVar = new f(gVar, layoutInflaterFrom, this.f8960y, f8935U);
        if (!isShowing() && this.f8950O) {
            fVar.d(true);
        } else if (isShowing()) {
            fVar.d(k.u(gVar));
        }
        int iL = k.l(fVar, null, this.f8956e, this.f8957i);
        MenuPopupWindow menuPopupWindowW = w();
        menuPopupWindowW.setAdapter(fVar);
        menuPopupWindowW.setContentWidth(iL);
        menuPopupWindowW.setDropDownGravity(this.f8942G);
        if (this.f8937B.size() > 0) {
            List<C0069d> list = this.f8937B;
            c0069d = list.get(list.size() - 1);
            viewZ = z(c0069d, gVar);
        } else {
            c0069d = null;
            viewZ = null;
        }
        if (viewZ != null) {
            menuPopupWindowW.setTouchModal(false);
            menuPopupWindowW.setEnterTransition(null);
            int iB = B(iL);
            boolean z7 = iB == 1;
            this.f8945J = iB;
            menuPopupWindowW.setAnchorView(viewZ);
            if ((this.f8942G & 5) != 5) {
                iL = z7 ? viewZ.getWidth() : 0 - iL;
            } else if (!z7) {
                iL = 0 - viewZ.getWidth();
            }
            menuPopupWindowW.setHorizontalOffset(iL);
            menuPopupWindowW.setOverlapAnchor(true);
            menuPopupWindowW.setVerticalOffset(0);
        } else {
            if (this.f8946K) {
                menuPopupWindowW.setHorizontalOffset(this.f8948M);
            }
            if (this.f8947L) {
                menuPopupWindowW.setVerticalOffset(this.f8949N);
            }
            menuPopupWindowW.setEpicenterBounds(k());
        }
        this.f8937B.add(new C0069d(menuPopupWindowW, gVar, this.f8945J));
        menuPopupWindowW.show();
        ListView listView = menuPopupWindowW.getListView();
        listView.setOnKeyListener(this);
        if (c0069d == null && this.f8951P && gVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(C2453g.f20690n, (ViewGroup) listView, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(gVar.x());
            listView.addHeaderView(frameLayout, null, false);
            menuPopupWindowW.show();
        }
    }

    private MenuPopupWindow w() {
        MenuPopupWindow menuPopupWindow = new MenuPopupWindow(this.f8956e, null, this.f8958v, this.f8959w);
        menuPopupWindow.setHoverListener(this.f8940E);
        menuPopupWindow.setOnItemClickListener(this);
        menuPopupWindow.setOnDismissListener(this);
        menuPopupWindow.setAnchorView(this.f8943H);
        menuPopupWindow.setDropDownGravity(this.f8942G);
        menuPopupWindow.setModal(true);
        menuPopupWindow.setInputMethodMode(2);
        return menuPopupWindow;
    }

    private int x(g gVar) {
        int size = this.f8937B.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (gVar == this.f8937B.get(i7).f8970b) {
                return i7;
            }
        }
        return -1;
    }

    private MenuItem y(g gVar, g gVar2) {
        int size = gVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = gVar.getItem(i7);
            if (item.hasSubMenu() && gVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    private View z(C0069d c0069d, g gVar) {
        f fVar;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemY = y(c0069d.f8970b, gVar);
        if (menuItemY == null) {
            return null;
        }
        ListView listViewA = c0069d.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i7 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            fVar = (f) headerViewListAdapter.getWrappedAdapter();
        } else {
            fVar = (f) adapter;
            headersCount = 0;
        }
        int count = fVar.getCount();
        while (true) {
            if (i7 >= count) {
                i7 = -1;
                break;
            }
            if (menuItemY == fVar.getItem(i7)) {
                break;
            }
            i7++;
        }
        if (i7 != -1 && (firstVisiblePosition = (i7 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    @Override
    public void a(g gVar, boolean z7) {
        int iX = x(gVar);
        if (iX < 0) {
            return;
        }
        int i7 = iX + 1;
        if (i7 < this.f8937B.size()) {
            this.f8937B.get(i7).f8970b.e(false);
        }
        C0069d c0069dRemove = this.f8937B.remove(iX);
        c0069dRemove.f8970b.O(this);
        if (this.f8955T) {
            c0069dRemove.f8969a.setExitTransition(null);
            c0069dRemove.f8969a.setAnimationStyle(0);
        }
        c0069dRemove.f8969a.dismiss();
        int size = this.f8937B.size();
        if (size > 0) {
            this.f8945J = this.f8937B.get(size - 1).f8971c;
        } else {
            this.f8945J = A();
        }
        if (size != 0) {
            if (z7) {
                this.f8937B.get(0).f8970b.e(false);
                return;
            }
            return;
        }
        dismiss();
        m.a aVar = this.f8952Q;
        if (aVar != null) {
            aVar.a(gVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f8953R;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f8953R.removeGlobalOnLayoutListener(this.f8938C);
            }
            this.f8953R = null;
        }
        this.f8944I.removeOnAttachStateChangeListener(this.f8939D);
        this.f8954S.onDismiss();
    }

    @Override
    public void b(boolean z7) {
        Iterator<C0069d> it = this.f8937B.iterator();
        while (it.hasNext()) {
            k.v(it.next().a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public void dismiss() {
        int size = this.f8937B.size();
        if (size > 0) {
            C0069d[] c0069dArr = (C0069d[]) this.f8937B.toArray(new C0069d[size]);
            for (int i7 = size - 1; i7 >= 0; i7--) {
                C0069d c0069d = c0069dArr[i7];
                if (c0069d.f8969a.isShowing()) {
                    c0069d.f8969a.dismiss();
                }
            }
        }
    }

    @Override
    public void f(m.a aVar) {
        this.f8952Q = aVar;
    }

    @Override
    public ListView getListView() {
        if (this.f8937B.isEmpty()) {
            return null;
        }
        return this.f8937B.get(r0.size() - 1).a();
    }

    @Override
    public boolean h(r rVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        for (C0069d c0069d : this.f8937B) {
            if (rVar == c0069d.f8970b) {
                c0069d.a().requestFocus();
                return true;
            }
        }
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        i(rVar);
        m.a aVar = this.f8952Q;
        if (aVar != null) {
            aVar.b(rVar);
        }
        return true;
    }

    @Override
    public void i(g gVar) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        gVar.c(this, this.f8956e);
        if (isShowing()) {
            C(gVar);
        } else {
            this.f8936A.add(gVar);
        }
    }

    @Override
    public boolean isShowing() {
        return this.f8937B.size() > 0 && this.f8937B.get(0).f8969a.isShowing();
    }

    @Override
    protected boolean j() {
        return false;
    }

    @Override
    public void m(View view) {
        if (this.f8943H != view) {
            this.f8943H = view;
            this.f8942G = C1640s.b(this.f8941F, Z.z(view));
        }
    }

    @Override
    public void o(boolean z7) {
        this.f8950O = z7;
    }

    @Override
    public void onDismiss() {
        C0069d c0069d;
        int size = this.f8937B.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size) {
                c0069d = null;
                break;
            }
            c0069d = this.f8937B.get(i7);
            if (!c0069d.f8969a.isShowing()) {
                break;
            } else {
                i7++;
            }
        }
        if (c0069d != null) {
            c0069d.f8970b.e(false);
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
        if (this.f8941F != i7) {
            this.f8941F = i7;
            this.f8942G = C1640s.b(i7, Z.z(this.f8943H));
        }
    }

    @Override
    public void q(int i7) {
        this.f8946K = true;
        this.f8948M = i7;
    }

    @Override
    public void r(PopupWindow.OnDismissListener onDismissListener) {
        this.f8954S = onDismissListener;
    }

    @Override
    public void s(boolean z7) {
        this.f8951P = z7;
    }

    @Override
    public void show() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (isShowing()) {
            return;
        }
        Iterator<g> it = this.f8936A.iterator();
        while (it.hasNext()) {
            C(it.next());
        }
        this.f8936A.clear();
        View view = this.f8943H;
        this.f8944I = view;
        if (view != null) {
            boolean z7 = this.f8953R == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f8953R = viewTreeObserver;
            if (z7) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f8938C);
            }
            this.f8944I.addOnAttachStateChangeListener(this.f8939D);
        }
    }

    @Override
    public void t(int i7) {
        this.f8947L = true;
        this.f8949N = i7;
    }
}
