package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

public abstract class k implements p, m, AdapterView.OnItemClickListener {

    private Rect f9063d;

    k() {
    }

    protected static int l(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i7) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i8 = 0;
        int i9 = 0;
        View view = null;
        for (int i10 = 0; i10 < count; i10++) {
            int itemViewType = listAdapter.getItemViewType(i10);
            if (itemViewType != i9) {
                view = null;
                i9 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i10, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i7) {
                return i7;
            }
            if (measuredWidth > i8) {
                i8 = measuredWidth;
            }
        }
        return i8;
    }

    protected static boolean u(g gVar) {
        int size = gVar.size();
        for (int i7 = 0; i7 < size; i7++) {
            MenuItem item = gVar.getItem(i7);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static f v(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (f) listAdapter;
    }

    @Override
    public boolean d(g gVar, i iVar) {
        return false;
    }

    @Override
    public boolean e(g gVar, i iVar) {
        return false;
    }

    @Override
    public void g(Context context, g gVar) {
    }

    public abstract void i(g gVar);

    protected boolean j() {
        return true;
    }

    public Rect k() {
        return this.f9063d;
    }

    public abstract void m(View view);

    public void n(Rect rect) {
        this.f9063d = rect;
    }

    public abstract void o(boolean z7);

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i7, long j7) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        v(listAdapter).f8983d.M((MenuItem) listAdapter.getItem(i7), this, j() ? 0 : 4);
    }

    public abstract void p(int i7);

    public abstract void q(int i7);

    public abstract void r(PopupWindow.OnDismissListener onDismissListener);

    public abstract void s(boolean z7);

    public abstract void t(int i7);
}
