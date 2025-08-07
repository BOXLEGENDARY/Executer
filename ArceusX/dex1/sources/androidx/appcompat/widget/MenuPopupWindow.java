package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

public class MenuPopupWindow extends ListPopupWindow implements MenuItemHoverListener {
    private static final String TAG = "MenuPopupWindow";
    private static Method sSetTouchModalMethod;
    private MenuItemHoverListener mHoverListener;

    public static class MenuDropDownListView extends v {
        final int mAdvanceKey;
        private MenuItemHoverListener mHoverListener;
        private MenuItem mHoveredMenuItem;
        final int mRetreatKey;

        static class a {
            static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public MenuDropDownListView(Context context, boolean z7) {
            super(context, z7);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.mAdvanceKey = 21;
                this.mRetreatKey = 22;
            } else {
                this.mAdvanceKey = 22;
                this.mRetreatKey = 21;
            }
        }

        public void clearSelection() {
            setSelection(-1);
        }

        @Override
        public boolean hasFocus() {
            return super.hasFocus();
        }

        @Override
        public boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override
        public boolean isFocused() {
            return super.isFocused();
        }

        @Override
        public boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override
        public int lookForSelectablePosition(int i7, boolean z7) {
            return super.lookForSelectablePosition(i7, z7);
        }

        @Override
        public int measureHeightOfChildrenCompat(int i7, int i8, int i9, int i10, int i11) {
            return super.measureHeightOfChildrenCompat(i7, i8, i9, i10, i11);
        }

        @Override
        public boolean onForwardedEvent(MotionEvent motionEvent, int i7) {
            return super.onForwardedEvent(motionEvent, i7);
        }

        @Override
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.f fVar;
            int headersCount;
            int iPointToPosition;
            int i7;
            if (this.mHoverListener != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    fVar = (androidx.appcompat.view.menu.f) headerViewListAdapter.getWrappedAdapter();
                } else {
                    fVar = (androidx.appcompat.view.menu.f) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.i item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i7 = iPointToPosition - headersCount) < 0 || i7 >= fVar.getCount()) ? null : fVar.getItem(i7);
                MenuItem menuItem = this.mHoveredMenuItem;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.g gVarB = fVar.b();
                    if (menuItem != null) {
                        this.mHoverListener.onItemHoverExit(gVarB, menuItem);
                    }
                    this.mHoveredMenuItem = item;
                    if (item != null) {
                        this.mHoverListener.onItemHoverEnter(gVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override
        public boolean onKeyDown(int i7, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i7 == this.mAdvanceKey) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i7 != this.mRetreatKey) {
                return super.onKeyDown(i7, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (androidx.appcompat.view.menu.f) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (androidx.appcompat.view.menu.f) adapter).b().e(false);
            return true;
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
            this.mHoverListener = menuItemHoverListener;
        }

        @Override
        public void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static class a {
        static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    static class b {
        static void a(PopupWindow popupWindow, boolean z7) {
            popupWindow.setTouchModal(z7);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                sSetTouchModalMethod = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i(TAG, "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(Context context, AttributeSet attributeSet, int i7, int i8) {
        super(context, attributeSet, i7, i8);
    }

    @Override
    v createDropDownListView(Context context, boolean z7) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z7);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    @Override
    public void onItemHoverEnter(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        MenuItemHoverListener menuItemHoverListener = this.mHoverListener;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.onItemHoverEnter(gVar, menuItem);
        }
    }

    @Override
    public void onItemHoverExit(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
        MenuItemHoverListener menuItemHoverListener = this.mHoverListener;
        if (menuItemHoverListener != null) {
            menuItemHoverListener.onItemHoverExit(gVar, menuItem);
        }
    }

    public void setEnterTransition(Object obj) {
        a.a(this.mPopup, (Transition) obj);
    }

    public void setExitTransition(Object obj) {
        a.b(this.mPopup, (Transition) obj);
    }

    public void setHoverListener(MenuItemHoverListener menuItemHoverListener) {
        this.mHoverListener = menuItemHoverListener;
    }

    public void setTouchModal(boolean z7) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.mPopup, z7);
            return;
        }
        Method method = sSetTouchModalMethod;
        if (method != null) {
            try {
                method.invoke(this.mPopup, Boolean.valueOf(z7));
            } catch (Exception unused) {
                Log.i(TAG, "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }
}
