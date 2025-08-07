package androidx.appcompat.widget;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.g;
import g.C2447a;

public class PopupMenu {
    private final View mAnchor;
    private final Context mContext;
    private View.OnTouchListener mDragListener;
    private final androidx.appcompat.view.menu.g mMenu;
    OnMenuItemClickListener mMenuItemClickListener;
    OnDismissListener mOnDismissListener;
    final androidx.appcompat.view.menu.l mPopup;

    public interface OnDismissListener {
        void onDismiss(PopupMenu popupMenu);
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    class a implements g.a {
        a() {
        }

        @Override
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = PopupMenu.this.mMenuItemClickListener;
            if (onMenuItemClickListener != null) {
                return onMenuItemClickListener.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override
        public void b(androidx.appcompat.view.menu.g gVar) {
        }
    }

    class b implements PopupWindow.OnDismissListener {
        b() {
        }

        @Override
        public void onDismiss() {
            PopupMenu popupMenu = PopupMenu.this;
            OnDismissListener onDismissListener = popupMenu.mOnDismissListener;
            if (onDismissListener != null) {
                onDismissListener.onDismiss(popupMenu);
            }
        }
    }

    class c extends ForwardingListener {
        c(View view) {
            super(view);
        }

        @Override
        public androidx.appcompat.view.menu.p getPopup() {
            return PopupMenu.this.mPopup.e();
        }

        @Override
        protected boolean onForwardingStarted() {
            PopupMenu.this.show();
            return true;
        }

        @Override
        protected boolean onForwardingStopped() {
            PopupMenu.this.dismiss();
            return true;
        }
    }

    public PopupMenu(Context context, View view) {
        this(context, view, 0);
    }

    public void dismiss() {
        this.mPopup.b();
    }

    public View.OnTouchListener getDragToOpenListener() {
        if (this.mDragListener == null) {
            this.mDragListener = new c(this.mAnchor);
        }
        return this.mDragListener;
    }

    public int getGravity() {
        return this.mPopup.c();
    }

    public Menu getMenu() {
        return this.mMenu;
    }

    public MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(this.mContext);
    }

    ListView getMenuListView() {
        if (this.mPopup.f()) {
            return this.mPopup.d();
        }
        return null;
    }

    public void inflate(int i7) {
        getMenuInflater().inflate(i7, this.mMenu);
    }

    public void setForceShowIcon(boolean z7) {
        this.mPopup.i(z7);
    }

    public void setGravity(int i7) {
        this.mPopup.j(i7);
    }

    public void setOnDismissListener(OnDismissListener onDismissListener) {
        this.mOnDismissListener = onDismissListener;
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mMenuItemClickListener = onMenuItemClickListener;
    }

    public void show() {
        this.mPopup.m();
    }

    public PopupMenu(Context context, View view, int i7) {
        this(context, view, i7, C2447a.f20529J, 0);
    }

    public PopupMenu(Context context, View view, int i7, int i8, int i9) {
        this.mContext = context;
        this.mAnchor = view;
        androidx.appcompat.view.menu.g gVar = new androidx.appcompat.view.menu.g(context);
        this.mMenu = gVar;
        gVar.R(new a());
        androidx.appcompat.view.menu.l lVar = new androidx.appcompat.view.menu.l(context, gVar, view, false, i8, i9);
        this.mPopup = lVar;
        lVar.j(i7);
        lVar.k(new b());
    }
}
