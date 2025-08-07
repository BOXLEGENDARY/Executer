package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbstractC1694h;
import android.view.ContextThemeWrapper;
import android.view.InterfaceC1701o;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.C1640s;
import androidx.core.view.C1646v;
import androidx.core.view.C1654z;
import androidx.core.view.InterfaceC1648w;
import androidx.core.view.Z;
import androidx.customview.view.AbsSavedState;
import com.appsflyer.R;
import g.C2447a;
import g.C2456j;
import h.C2473a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Toolbar extends ViewGroup implements InterfaceC1648w {
    private static final String TAG = "Toolbar";
    private m.a mActionMenuPresenterCallback;
    private OnBackInvokedCallback mBackInvokedCallback;
    private boolean mBackInvokedCallbackEnabled;
    private OnBackInvokedDispatcher mBackInvokedDispatcher;
    int mButtonGravity;
    ImageButton mCollapseButtonView;
    private CharSequence mCollapseDescription;
    private Drawable mCollapseIcon;
    private boolean mCollapsible;
    private int mContentInsetEndWithActions;
    private int mContentInsetStartWithNavigation;
    private x mContentInsets;
    private boolean mEatingHover;
    private boolean mEatingTouch;
    View mExpandedActionView;
    private f mExpandedMenuPresenter;
    private int mGravity;
    private final ArrayList<View> mHiddenViews;
    private ImageView mLogoView;
    private int mMaxButtonHeight;
    g.a mMenuBuilderCallback;
    final C1654z mMenuHostHelper;
    ActionMenuView mMenuView;
    private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
    private ImageButton mNavButtonView;
    OnMenuItemClickListener mOnMenuItemClickListener;
    private C1597b mOuterActionMenuPresenter;
    private Context mPopupContext;
    private int mPopupTheme;
    private ArrayList<MenuItem> mProvidedMenuItems;
    private final Runnable mShowOverflowMenuRunnable;
    private CharSequence mSubtitleText;
    private int mSubtitleTextAppearance;
    private ColorStateList mSubtitleTextColor;
    private TextView mSubtitleTextView;
    private final int[] mTempMargins;
    private final ArrayList<View> mTempViews;
    private int mTitleMarginBottom;
    private int mTitleMarginEnd;
    private int mTitleMarginStart;
    private int mTitleMarginTop;
    private CharSequence mTitleText;
    private int mTitleTextAppearance;
    private ColorStateList mTitleTextColor;
    private TextView mTitleTextView;
    private ToolbarWidgetWrapper mWrapper;

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int expandedMenuItemId;
        boolean isOverflowOpen;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override
            public SavedState[] newArray(int i7) {
                return new SavedState[i7];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override
        public void writeToParcel(Parcel parcel, int i7) {
            super.writeToParcel(parcel, i7);
            parcel.writeInt(this.expandedMenuItemId);
            parcel.writeInt(this.isOverflowOpen ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.expandedMenuItemId = parcel.readInt();
            this.isOverflowOpen = parcel.readInt() != 0;
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    class a implements ActionMenuView.OnMenuItemClickListener {
        a() {
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.mMenuHostHelper.j(menuItem)) {
                return true;
            }
            OnMenuItemClickListener onMenuItemClickListener = Toolbar.this.mOnMenuItemClickListener;
            if (onMenuItemClickListener != null) {
                return onMenuItemClickListener.onMenuItemClick(menuItem);
            }
            return false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override
        public void run() {
            Toolbar.this.showOverflowMenu();
        }
    }

    class c implements g.a {
        c() {
        }

        @Override
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            g.a aVar = Toolbar.this.mMenuBuilderCallback;
            return aVar != null && aVar.a(gVar, menuItem);
        }

        @Override
        public void b(androidx.appcompat.view.menu.g gVar) {
            if (!Toolbar.this.mMenuView.isOverflowMenuShowing()) {
                Toolbar.this.mMenuHostHelper.k(gVar);
            }
            g.a aVar = Toolbar.this.mMenuBuilderCallback;
            if (aVar != null) {
                aVar.b(gVar);
            }
        }
    }

    class d implements View.OnClickListener {
        d() {
        }

        @Override
        public void onClick(View view) {
            Toolbar.this.collapseActionView();
        }
    }

    static class e {
        static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() {
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj2);
        }

        static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    private class f implements androidx.appcompat.view.menu.m {

        androidx.appcompat.view.menu.g f9230d;

        androidx.appcompat.view.menu.i f9231e;

        f() {
        }

        @Override
        public void a(androidx.appcompat.view.menu.g gVar, boolean z7) {
        }

        @Override
        public void b(boolean z7) {
            if (this.f9231e != null) {
                androidx.appcompat.view.menu.g gVar = this.f9230d;
                if (gVar != null) {
                    int size = gVar.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        if (this.f9230d.getItem(i7) == this.f9231e) {
                            return;
                        }
                    }
                }
                d(this.f9230d, this.f9231e);
            }
        }

        @Override
        public boolean c() {
            return false;
        }

        @Override
        public boolean d(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.mExpandedActionView);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.mCollapseButtonView);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.mExpandedActionView = null;
            toolbar3.addChildrenForExpandedActionView();
            this.f9231e = null;
            Toolbar.this.requestLayout();
            iVar.r(false);
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override
        public boolean e(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.i iVar) {
            Toolbar.this.ensureCollapseButtonView();
            ViewParent parent = Toolbar.this.mCollapseButtonView.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.mCollapseButtonView);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.mCollapseButtonView);
            }
            Toolbar.this.mExpandedActionView = iVar.getActionView();
            this.f9231e = iVar;
            ViewParent parent2 = Toolbar.this.mExpandedActionView.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.mExpandedActionView);
                }
                LayoutParams layoutParamsGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                layoutParamsGenerateDefaultLayoutParams.gravity = (toolbar4.mButtonGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388611;
                layoutParamsGenerateDefaultLayoutParams.mViewType = 2;
                toolbar4.mExpandedActionView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.mExpandedActionView);
            }
            Toolbar.this.removeChildrenForExpandedActionView();
            Toolbar.this.requestLayout();
            iVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.mExpandedActionView;
            if (callback instanceof androidx.appcompat.view.c) {
                ((androidx.appcompat.view.c) callback).onActionViewExpanded();
            }
            Toolbar.this.updateBackInvokedCallbackState();
            return true;
        }

        @Override
        public void g(Context context, androidx.appcompat.view.menu.g gVar) {
            androidx.appcompat.view.menu.i iVar;
            androidx.appcompat.view.menu.g gVar2 = this.f9230d;
            if (gVar2 != null && (iVar = this.f9231e) != null) {
                gVar2.f(iVar);
            }
            this.f9230d = gVar;
        }

        @Override
        public boolean h(androidx.appcompat.view.menu.r rVar) {
            return false;
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private void addCustomViewsWithGravity(List<View> list, int i7) {
        boolean z7 = Z.z(this) == 1;
        int childCount = getChildCount();
        int iB = C1640s.b(i7, Z.z(this));
        list.clear();
        if (!z7) {
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = getChildAt(i8);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.mViewType == 0 && shouldLayout(childAt) && getChildHorizontalGravity(layoutParams.gravity) == iB) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i9 = childCount - 1; i9 >= 0; i9--) {
            View childAt2 = getChildAt(i9);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            if (layoutParams2.mViewType == 0 && shouldLayout(childAt2) && getChildHorizontalGravity(layoutParams2.gravity) == iB) {
                list.add(childAt2);
            }
        }
    }

    private void addSystemView(View view, boolean z7) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        LayoutParams layoutParamsGenerateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (LayoutParams) layoutParams;
        layoutParamsGenerateDefaultLayoutParams.mViewType = 1;
        if (!z7 || this.mExpandedActionView == null) {
            addView(view, layoutParamsGenerateDefaultLayoutParams);
        } else {
            view.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.mHiddenViews.add(view);
        }
    }

    private void ensureContentInsets() {
        if (this.mContentInsets == null) {
            this.mContentInsets = new x();
        }
    }

    private void ensureLogoView() {
        if (this.mLogoView == null) {
            this.mLogoView = new AppCompatImageView(getContext());
        }
    }

    private void ensureMenu() {
        ensureMenuView();
        if (this.mMenuView.peekMenu() == null) {
            androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) this.mMenuView.getMenu();
            if (this.mExpandedMenuPresenter == null) {
                this.mExpandedMenuPresenter = new f();
            }
            this.mMenuView.setExpandedActionViewsExclusive(true);
            gVar.c(this.mExpandedMenuPresenter, this.mPopupContext);
            updateBackInvokedCallbackState();
        }
    }

    private void ensureMenuView() {
        if (this.mMenuView == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.mMenuView = actionMenuView;
            actionMenuView.setPopupTheme(this.mPopupTheme);
            this.mMenuView.setOnMenuItemClickListener(this.mMenuViewItemClickListener);
            this.mMenuView.setMenuCallbacks(this.mActionMenuPresenterCallback, new c());
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.gravity = (this.mButtonGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388613;
            this.mMenuView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            addSystemView(this.mMenuView, false);
        }
    }

    private void ensureNavButtonView() {
        if (this.mNavButtonView == null) {
            this.mNavButtonView = new AppCompatImageButton(getContext(), null, C2447a.f20537R);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.gravity = (this.mButtonGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388611;
            this.mNavButtonView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
        }
    }

    private int getChildHorizontalGravity(int i7) {
        int iZ = Z.z(this);
        int iB = C1640s.b(i7, iZ) & 7;
        return (iB == 1 || iB == 3 || iB == 5) ? iB : iZ == 1 ? 5 : 3;
    }

    private int getChildTop(View view, int i7) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i8 = i7 > 0 ? (measuredHeight - i7) / 2 : 0;
        int childVerticalGravity = getChildVerticalGravity(layoutParams.gravity);
        if (childVerticalGravity == 48) {
            return getPaddingTop() - i8;
        }
        if (childVerticalGravity == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i8;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        if (iMax < i9) {
            iMax = i9;
        } else {
            int i10 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            if (i10 < i11) {
                iMax = Math.max(0, iMax - (i11 - i10));
            }
        }
        return paddingTop + iMax;
    }

    private int getChildVerticalGravity(int i7) {
        int i8 = i7 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        return (i8 == 16 || i8 == 48 || i8 == 80) ? i8 : this.mGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i7 = 0; i7 < menu.size(); i7++) {
            arrayList.add(menu.getItem(i7));
        }
        return arrayList;
    }

    private int getHorizontalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return C1646v.b(marginLayoutParams) + C1646v.a(marginLayoutParams);
    }

    private MenuInflater getMenuInflater() {
        return new androidx.appcompat.view.g(getContext());
    }

    private int getVerticalMargins(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int getViewListMeasuredWidth(List<View> list, int[] iArr) {
        int i7 = iArr[0];
        int i8 = iArr[1];
        int size = list.size();
        int i9 = 0;
        int measuredWidth = 0;
        while (i9 < size) {
            View view = list.get(i9);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - i7;
            int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - i8;
            int iMax = Math.max(0, i10);
            int iMax2 = Math.max(0, i11);
            int iMax3 = Math.max(0, -i10);
            int iMax4 = Math.max(0, -i11);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i9++;
            i8 = iMax4;
            i7 = iMax3;
        }
        return measuredWidth;
    }

    private boolean isChildOrHidden(View view) {
        return view.getParent() == this || this.mHiddenViews.contains(view);
    }

    private int layoutChildLeft(View view, int i7, int[] iArr, int i8) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin - iArr[0];
        int iMax = i7 + Math.max(0, i9);
        iArr[0] = Math.max(0, -i9);
        int childTop = getChildTop(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, childTop, iMax + measuredWidth, view.getMeasuredHeight() + childTop);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
    }

    private int layoutChildRight(View view, int i7, int[] iArr, int i8) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin - iArr[1];
        int iMax = i7 - Math.max(0, i9);
        iArr[1] = Math.max(0, -i9);
        int childTop = getChildTop(view, i8);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, childTop, iMax, view.getMeasuredHeight() + childTop);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
    }

    private int measureChildCollapseMargins(View view, int i7, int i8, int i9, int i10, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i11 = marginLayoutParams.leftMargin - iArr[0];
        int i12 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i11) + Math.max(0, i12);
        iArr[0] = Math.max(0, -i11);
        iArr[1] = Math.max(0, -i12);
        view.measure(ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + iMax + i8, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    private void measureChildConstrained(View view, int i7, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i7, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i8, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i10, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i11 >= 0) {
            if (mode != 0) {
                i11 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i11);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void onCreateMenu() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.mMenuHostHelper.h(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.mProvidedMenuItems = currentMenuItems2;
    }

    private void postShowOverflowMenu() {
        removeCallbacks(this.mShowOverflowMenuRunnable);
        post(this.mShowOverflowMenuRunnable);
    }

    private boolean shouldCollapse() {
        if (!this.mCollapsible) {
            return false;
        }
        int childCount = getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (shouldLayout(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean shouldLayout(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    void addChildrenForExpandedActionView() {
        for (int size = this.mHiddenViews.size() - 1; size >= 0; size--) {
            addView(this.mHiddenViews.get(size));
        }
        this.mHiddenViews.clear();
    }

    @Override
    public void addMenuProvider(androidx.core.view.B b2) {
        this.mMenuHostHelper.c(b2);
    }

    public boolean canShowOverflowMenu() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.mMenuView) != null && actionMenuView.isOverflowReserved();
    }

    @Override
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    public void collapseActionView() {
        f fVar = this.mExpandedMenuPresenter;
        androidx.appcompat.view.menu.i iVar = fVar == null ? null : fVar.f9231e;
        if (iVar != null) {
            iVar.collapseActionView();
        }
    }

    public void dismissPopupMenus() {
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.dismissPopupMenus();
        }
    }

    void ensureCollapseButtonView() {
        if (this.mCollapseButtonView == null) {
            AppCompatImageButton appCompatImageButton = new AppCompatImageButton(getContext(), null, C2447a.f20537R);
            this.mCollapseButtonView = appCompatImageButton;
            appCompatImageButton.setImageDrawable(this.mCollapseIcon);
            this.mCollapseButtonView.setContentDescription(this.mCollapseDescription);
            LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            layoutParamsGenerateDefaultLayoutParams.gravity = (this.mButtonGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) | 8388611;
            layoutParamsGenerateDefaultLayoutParams.mViewType = 2;
            this.mCollapseButtonView.setLayoutParams(layoutParamsGenerateDefaultLayoutParams);
            this.mCollapseButtonView.setOnClickListener(new d());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        x xVar = this.mContentInsets;
        if (xVar != null) {
            return xVar.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i7 = this.mContentInsetEndWithActions;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        x xVar = this.mContentInsets;
        if (xVar != null) {
            return xVar.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        x xVar = this.mContentInsets;
        if (xVar != null) {
            return xVar.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        x xVar = this.mContentInsets;
        if (xVar != null) {
            return xVar.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i7 = this.mContentInsetStartWithNavigation;
        return i7 != Integer.MIN_VALUE ? i7 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.g gVarPeekMenu;
        ActionMenuView actionMenuView = this.mMenuView;
        return (actionMenuView == null || (gVarPeekMenu = actionMenuView.peekMenu()) == null || !gVarPeekMenu.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.mContentInsetEndWithActions, 0));
    }

    public int getCurrentContentInsetLeft() {
        return Z.z(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return Z.z(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.mContentInsetStartWithNavigation, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        ensureMenu();
        return this.mMenuView.getMenu();
    }

    View getNavButtonView() {
        return this.mNavButtonView;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    C1597b getOuterActionMenuPresenter() {
        return this.mOuterActionMenuPresenter;
    }

    public Drawable getOverflowIcon() {
        ensureMenu();
        return this.mMenuView.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.mPopupContext;
    }

    public int getPopupTheme() {
        return this.mPopupTheme;
    }

    public CharSequence getSubtitle() {
        return this.mSubtitleText;
    }

    final TextView getSubtitleTextView() {
        return this.mSubtitleTextView;
    }

    public CharSequence getTitle() {
        return this.mTitleText;
    }

    public int getTitleMarginBottom() {
        return this.mTitleMarginBottom;
    }

    public int getTitleMarginEnd() {
        return this.mTitleMarginEnd;
    }

    public int getTitleMarginStart() {
        return this.mTitleMarginStart;
    }

    public int getTitleMarginTop() {
        return this.mTitleMarginTop;
    }

    final TextView getTitleTextView() {
        return this.mTitleTextView;
    }

    public DecorToolbar getWrapper() {
        if (this.mWrapper == null) {
            this.mWrapper = new ToolbarWidgetWrapper(this, true);
        }
        return this.mWrapper;
    }

    public boolean hasExpandedActionView() {
        f fVar = this.mExpandedMenuPresenter;
        return (fVar == null || fVar.f9231e == null) ? false : true;
    }

    public boolean hideOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.hideOverflowMenu();
    }

    public void inflateMenu(int i7) {
        getMenuInflater().inflate(i7, getMenu());
    }

    public void invalidateMenu() {
        Iterator<MenuItem> it = this.mProvidedMenuItems.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        onCreateMenu();
    }

    public boolean isBackInvokedCallbackEnabled() {
        return this.mBackInvokedCallbackEnabled;
    }

    public boolean isOverflowMenuShowPending() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowPending();
    }

    public boolean isOverflowMenuShowing() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.isOverflowMenuShowing();
    }

    public boolean isTitleTruncated() {
        Layout layout;
        TextView textView = this.mTitleTextView;
        if (textView == null || (layout = textView.getLayout()) == null) {
            return false;
        }
        int lineCount = layout.getLineCount();
        for (int i7 = 0; i7 < lineCount; i7++) {
            if (layout.getEllipsisCount(i7) > 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateBackInvokedCallbackState();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.mShowOverflowMenuRunnable);
        updateBackInvokedCallbackState();
    }

    @Override
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.mEatingHover = false;
        }
        if (!this.mEatingHover) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.mEatingHover = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.mEatingHover = false;
        }
        return true;
    }

    @Override
    protected void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override
    protected void onMeasure(int i7, int i8) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int measuredHeight;
        int iCombineMeasuredStates2;
        int iMax2;
        int[] iArr = this.mTempMargins;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int i9 = !zIsLayoutRtl ? 1 : 0;
        if (shouldLayout(this.mNavButtonView)) {
            measureChildConstrained(this.mNavButtonView, i7, 0, i8, 0, this.mMaxButtonHeight);
            measuredWidth = this.mNavButtonView.getMeasuredWidth() + getHorizontalMargins(this.mNavButtonView);
            iMax = Math.max(0, this.mNavButtonView.getMeasuredHeight() + getVerticalMargins(this.mNavButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.mNavButtonView.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (shouldLayout(this.mCollapseButtonView)) {
            measureChildConstrained(this.mCollapseButtonView, i7, 0, i8, 0, this.mMaxButtonHeight);
            measuredWidth = this.mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(this.mCollapseButtonView);
            iMax = Math.max(iMax, this.mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(this.mCollapseButtonView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mCollapseButtonView.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr[zIsLayoutRtl ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (shouldLayout(this.mMenuView)) {
            measureChildConstrained(this.mMenuView, i7, iMax3, i8, 0, this.mMaxButtonHeight);
            measuredWidth2 = this.mMenuView.getMeasuredWidth() + getHorizontalMargins(this.mMenuView);
            iMax = Math.max(iMax, this.mMenuView.getMeasuredHeight() + getVerticalMargins(this.mMenuView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mMenuView.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr[i9] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (shouldLayout(this.mExpandedActionView)) {
            iMax4 += measureChildCollapseMargins(this.mExpandedActionView, i7, iMax4, i8, 0, iArr);
            iMax = Math.max(iMax, this.mExpandedActionView.getMeasuredHeight() + getVerticalMargins(this.mExpandedActionView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mExpandedActionView.getMeasuredState());
        }
        if (shouldLayout(this.mLogoView)) {
            iMax4 += measureChildCollapseMargins(this.mLogoView, i7, iMax4, i8, 0, iArr);
            iMax = Math.max(iMax, this.mLogoView.getMeasuredHeight() + getVerticalMargins(this.mLogoView));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.mLogoView.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (((LayoutParams) childAt.getLayoutParams()).mViewType == 0 && shouldLayout(childAt)) {
                iMax4 += measureChildCollapseMargins(childAt, i7, iMax4, i8, 0, iArr);
                iMax = Math.max(iMax, childAt.getMeasuredHeight() + getVerticalMargins(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
            }
        }
        int i11 = this.mTitleMarginTop + this.mTitleMarginBottom;
        int i12 = this.mTitleMarginStart + this.mTitleMarginEnd;
        if (shouldLayout(this.mTitleTextView)) {
            measureChildCollapseMargins(this.mTitleTextView, i7, iMax4 + i12, i8, i11, iArr);
            int measuredWidth3 = this.mTitleTextView.getMeasuredWidth() + getHorizontalMargins(this.mTitleTextView);
            measuredHeight = this.mTitleTextView.getMeasuredHeight() + getVerticalMargins(this.mTitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.mTitleTextView.getMeasuredState());
            iMax2 = measuredWidth3;
        } else {
            measuredHeight = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (shouldLayout(this.mSubtitleTextView)) {
            iMax2 = Math.max(iMax2, measureChildCollapseMargins(this.mSubtitleTextView, i7, iMax4 + i12, i8, measuredHeight + i11, iArr));
            measuredHeight += this.mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(this.mSubtitleTextView);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.mSubtitleTextView.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax4 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i7, (-16777216) & iCombineMeasuredStates2), shouldCollapse() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i8, iCombineMeasuredStates2 << 16));
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        ActionMenuView actionMenuView = this.mMenuView;
        androidx.appcompat.view.menu.g gVarPeekMenu = actionMenuView != null ? actionMenuView.peekMenu() : null;
        int i7 = savedState.expandedMenuItemId;
        if (i7 != 0 && this.mExpandedMenuPresenter != null && gVarPeekMenu != null && (menuItemFindItem = gVarPeekMenu.findItem(i7)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (savedState.isOverflowOpen) {
            postShowOverflowMenu();
        }
    }

    @Override
    public void onRtlPropertiesChanged(int i7) {
        super.onRtlPropertiesChanged(i7);
        ensureContentInsets();
        this.mContentInsets.f(i7 == 1);
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.i iVar;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        f fVar = this.mExpandedMenuPresenter;
        if (fVar != null && (iVar = fVar.f9231e) != null) {
            savedState.expandedMenuItemId = iVar.getItemId();
        }
        savedState.isOverflowOpen = isOverflowMenuShowing();
        return savedState;
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mEatingTouch = false;
        }
        if (!this.mEatingTouch) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.mEatingTouch = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.mEatingTouch = false;
        }
        return true;
    }

    void removeChildrenForExpandedActionView() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((LayoutParams) childAt.getLayoutParams()).mViewType != 2 && childAt != this.mMenuView) {
                removeViewAt(childCount);
                this.mHiddenViews.add(childAt);
            }
        }
    }

    @Override
    public void removeMenuProvider(androidx.core.view.B b2) {
        this.mMenuHostHelper.l(b2);
    }

    public void setBackInvokedCallbackEnabled(boolean z7) {
        if (this.mBackInvokedCallbackEnabled != z7) {
            this.mBackInvokedCallbackEnabled = z7;
            updateBackInvokedCallbackState();
        }
    }

    public void setCollapseContentDescription(int i7) {
        setCollapseContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setCollapseIcon(int i7) {
        setCollapseIcon(C2473a.b(getContext(), i7));
    }

    public void setCollapsible(boolean z7) {
        this.mCollapsible = z7;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.mContentInsetEndWithActions) {
            this.mContentInsetEndWithActions = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i7) {
        if (i7 < 0) {
            i7 = Integer.MIN_VALUE;
        }
        if (i7 != this.mContentInsetStartWithNavigation) {
            this.mContentInsetStartWithNavigation = i7;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetsAbsolute(int i7, int i8) {
        ensureContentInsets();
        this.mContentInsets.e(i7, i8);
    }

    public void setContentInsetsRelative(int i7, int i8) {
        ensureContentInsets();
        this.mContentInsets.g(i7, i8);
    }

    public void setLogo(int i7) {
        setLogo(C2473a.b(getContext(), i7));
    }

    public void setLogoDescription(int i7) {
        setLogoDescription(getContext().getText(i7));
    }

    public void setMenu(androidx.appcompat.view.menu.g gVar, C1597b c1597b) {
        if (gVar == null && this.mMenuView == null) {
            return;
        }
        ensureMenuView();
        androidx.appcompat.view.menu.g gVarPeekMenu = this.mMenuView.peekMenu();
        if (gVarPeekMenu == gVar) {
            return;
        }
        if (gVarPeekMenu != null) {
            gVarPeekMenu.O(this.mOuterActionMenuPresenter);
            gVarPeekMenu.O(this.mExpandedMenuPresenter);
        }
        if (this.mExpandedMenuPresenter == null) {
            this.mExpandedMenuPresenter = new f();
        }
        c1597b.I(true);
        if (gVar != null) {
            gVar.c(c1597b, this.mPopupContext);
            gVar.c(this.mExpandedMenuPresenter, this.mPopupContext);
        } else {
            c1597b.g(this.mPopupContext, null);
            this.mExpandedMenuPresenter.g(this.mPopupContext, null);
            c1597b.b(true);
            this.mExpandedMenuPresenter.b(true);
        }
        this.mMenuView.setPopupTheme(this.mPopupTheme);
        this.mMenuView.setPresenter(c1597b);
        this.mOuterActionMenuPresenter = c1597b;
        updateBackInvokedCallbackState();
    }

    public void setMenuCallbacks(m.a aVar, g.a aVar2) {
        this.mActionMenuPresenterCallback = aVar;
        this.mMenuBuilderCallback = aVar2;
        ActionMenuView actionMenuView = this.mMenuView;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(aVar, aVar2);
        }
    }

    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 != 0 ? getContext().getText(i7) : null);
    }

    public void setNavigationIcon(int i7) {
        setNavigationIcon(C2473a.b(getContext(), i7));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        ensureNavButtonView();
        this.mNavButtonView.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.mOnMenuItemClickListener = onMenuItemClickListener;
    }

    public void setOverflowIcon(Drawable drawable) {
        ensureMenu();
        this.mMenuView.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i7) {
        if (this.mPopupTheme != i7) {
            this.mPopupTheme = i7;
            if (i7 == 0) {
                this.mPopupContext = getContext();
            } else {
                this.mPopupContext = new ContextThemeWrapper(getContext(), i7);
            }
        }
    }

    public void setSubtitle(int i7) {
        setSubtitle(getContext().getText(i7));
    }

    public void setSubtitleTextAppearance(Context context, int i7) {
        this.mSubtitleTextAppearance = i7;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    public void setSubtitleTextColor(int i7) {
        setSubtitleTextColor(ColorStateList.valueOf(i7));
    }

    public void setTitle(int i7) {
        setTitle(getContext().getText(i7));
    }

    public void setTitleMargin(int i7, int i8, int i9, int i10) {
        this.mTitleMarginStart = i7;
        this.mTitleMarginTop = i8;
        this.mTitleMarginEnd = i9;
        this.mTitleMarginBottom = i10;
        requestLayout();
    }

    public void setTitleMarginBottom(int i7) {
        this.mTitleMarginBottom = i7;
        requestLayout();
    }

    public void setTitleMarginEnd(int i7) {
        this.mTitleMarginEnd = i7;
        requestLayout();
    }

    public void setTitleMarginStart(int i7) {
        this.mTitleMarginStart = i7;
        requestLayout();
    }

    public void setTitleMarginTop(int i7) {
        this.mTitleMarginTop = i7;
        requestLayout();
    }

    public void setTitleTextAppearance(Context context, int i7) {
        this.mTitleTextAppearance = i7;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextAppearance(context, i7);
        }
    }

    public void setTitleTextColor(int i7) {
        setTitleTextColor(ColorStateList.valueOf(i7));
    }

    public boolean showOverflowMenu() {
        ActionMenuView actionMenuView = this.mMenuView;
        return actionMenuView != null && actionMenuView.showOverflowMenu();
    }

    void updateBackInvokedCallbackState() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z7 = hasExpandedActionView() && onBackInvokedDispatcherA != null && Z.Q(this) && this.mBackInvokedCallbackEnabled;
            if (z7 && this.mBackInvokedDispatcher == null) {
                if (this.mBackInvokedCallback == null) {
                    this.mBackInvokedCallback = e.b(new Runnable() {
                        @Override
                        public final void run() {
                            this.f9104d.collapseActionView();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.mBackInvokedCallback);
                this.mBackInvokedDispatcher = onBackInvokedDispatcherA;
                return;
            }
            if (z7 || (onBackInvokedDispatcher = this.mBackInvokedDispatcher) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.mBackInvokedCallback);
            this.mBackInvokedDispatcher = null;
        }
    }

    public static class LayoutParams extends a.C0067a {
        static final int CUSTOM = 0;
        static final int EXPANDED = 2;
        static final int SYSTEM = 1;
        int mViewType;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mViewType = 0;
        }

        void copyMarginsFromCompat(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public LayoutParams(int i7, int i8) {
            super(i7, i8);
            this.mViewType = 0;
            this.gravity = 8388627;
        }

        public LayoutParams(int i7, int i8, int i9) {
            super(i7, i8);
            this.mViewType = 0;
            this.gravity = i9;
        }

        public LayoutParams(int i7) {
            this(-2, -1, i7);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((a.C0067a) layoutParams);
            this.mViewType = 0;
            this.mViewType = layoutParams.mViewType;
        }

        public LayoutParams(a.C0067a c0067a) {
            super(c0067a);
            this.mViewType = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mViewType = 0;
            copyMarginsFromCompat(marginLayoutParams);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mViewType = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2447a.f20538S);
    }

    public void addMenuProvider(androidx.core.view.B b2, InterfaceC1701o interfaceC1701o) {
        this.mMenuHostHelper.d(b2, interfaceC1701o);
    }

    @Override
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureCollapseButtonView();
        }
        ImageButton imageButton = this.mCollapseButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            ensureCollapseButtonView();
            this.mCollapseButtonView.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.mCollapseButtonView;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.mCollapseIcon);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ensureLogoView();
            if (!isChildOrHidden(this.mLogoView)) {
                addSystemView(this.mLogoView, true);
            }
        } else {
            ImageView imageView = this.mLogoView;
            if (imageView != null && isChildOrHidden(imageView)) {
                removeView(this.mLogoView);
                this.mHiddenViews.remove(this.mLogoView);
            }
        }
        ImageView imageView2 = this.mLogoView;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureLogoView();
        }
        ImageView imageView = this.mLogoView;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            ensureNavButtonView();
        }
        ImageButton imageButton = this.mNavButtonView;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            TooltipCompat.setTooltipText(this.mNavButtonView, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            ensureNavButtonView();
            if (!isChildOrHidden(this.mNavButtonView)) {
                addSystemView(this.mNavButtonView, true);
            }
        } else {
            ImageButton imageButton = this.mNavButtonView;
            if (imageButton != null && isChildOrHidden(imageButton)) {
                removeView(this.mNavButtonView);
                this.mHiddenViews.remove(this.mNavButtonView);
            }
        }
        ImageButton imageButton2 = this.mNavButtonView;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mSubtitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mSubtitleTextView);
                this.mHiddenViews.remove(this.mSubtitleTextView);
            }
        } else {
            if (this.mSubtitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mSubtitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.mSubtitleTextAppearance;
                if (i7 != 0) {
                    this.mSubtitleTextView.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.mSubtitleTextColor;
                if (colorStateList != null) {
                    this.mSubtitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mSubtitleTextView)) {
                addSystemView(this.mSubtitleTextView, true);
            }
        }
        TextView textView2 = this.mSubtitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mSubtitleText = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.mSubtitleTextColor = colorStateList;
        TextView textView = this.mSubtitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.mTitleTextView;
            if (textView != null && isChildOrHidden(textView)) {
                removeView(this.mTitleTextView);
                this.mHiddenViews.remove(this.mTitleTextView);
            }
        } else {
            if (this.mTitleTextView == null) {
                Context context = getContext();
                AppCompatTextView appCompatTextView = new AppCompatTextView(context);
                this.mTitleTextView = appCompatTextView;
                appCompatTextView.setSingleLine();
                this.mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
                int i7 = this.mTitleTextAppearance;
                if (i7 != 0) {
                    this.mTitleTextView.setTextAppearance(context, i7);
                }
                ColorStateList colorStateList = this.mTitleTextColor;
                if (colorStateList != null) {
                    this.mTitleTextView.setTextColor(colorStateList);
                }
            }
            if (!isChildOrHidden(this.mTitleTextView)) {
                addSystemView(this.mTitleTextView, true);
            }
        }
        TextView textView2 = this.mTitleTextView;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.mTitleText = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.mTitleTextColor = colorStateList;
        TextView textView = this.mTitleTextView;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i7) {
        super(context, attributeSet, i7);
        this.mGravity = 8388627;
        this.mTempViews = new ArrayList<>();
        this.mHiddenViews = new ArrayList<>();
        this.mTempMargins = new int[2];
        this.mMenuHostHelper = new C1654z(new Runnable() {
            @Override
            public final void run() {
                this.f9171d.invalidateMenu();
            }
        });
        this.mProvidedMenuItems = new ArrayList<>();
        this.mMenuViewItemClickListener = new a();
        this.mShowOverflowMenuRunnable = new b();
        Context context2 = getContext();
        int[] iArr = C2456j.f20817f3;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context2, attributeSet, iArr, i7, 0);
        Z.l0(this, context, iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i7, 0);
        this.mTitleTextAppearance = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20747H3, 0);
        this.mSubtitleTextAppearance = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20897y3, 0);
        this.mGravity = tintTypedArrayObtainStyledAttributes.getInteger(C2456j.f20822g3, this.mGravity);
        this.mButtonGravity = tintTypedArrayObtainStyledAttributes.getInteger(C2456j.f20827h3, 48);
        int dimensionPixelOffset = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.f20726B3, 0);
        int i8 = C2456j.f20744G3;
        dimensionPixelOffset = tintTypedArrayObtainStyledAttributes.hasValue(i8) ? tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(i8, dimensionPixelOffset) : dimensionPixelOffset;
        this.mTitleMarginBottom = dimensionPixelOffset;
        this.mTitleMarginTop = dimensionPixelOffset;
        this.mTitleMarginEnd = dimensionPixelOffset;
        this.mTitleMarginStart = dimensionPixelOffset;
        int dimensionPixelOffset2 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.f20738E3, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.mTitleMarginStart = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.f20734D3, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.mTitleMarginEnd = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.f20741F3, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.mTitleMarginTop = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.f20730C3, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.mTitleMarginBottom = dimensionPixelOffset5;
        }
        this.mMaxButtonHeight = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(C2456j.f20872s3, -1);
        int dimensionPixelOffset6 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.f20856o3, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.f20841k3, Integer.MIN_VALUE);
        int dimensionPixelSize = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(C2456j.f20849m3, 0);
        int dimensionPixelSize2 = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(C2456j.f20853n3, 0);
        ensureContentInsets();
        this.mContentInsets.e(dimensionPixelSize, dimensionPixelSize2);
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            this.mContentInsets.g(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.mContentInsetStartWithNavigation = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.f20860p3, Integer.MIN_VALUE);
        this.mContentInsetEndWithActions = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.f20845l3, Integer.MIN_VALUE);
        this.mCollapseIcon = tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20837j3);
        this.mCollapseDescription = tintTypedArrayObtainStyledAttributes.getText(C2456j.f20832i3);
        CharSequence text = tintTypedArrayObtainStyledAttributes.getText(C2456j.f20722A3);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = tintTypedArrayObtainStyledAttributes.getText(C2456j.f20892x3);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.mPopupContext = getContext();
        setPopupTheme(tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20888w3, 0));
        Drawable drawable = tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20884v3);
        if (drawable != null) {
            setNavigationIcon(drawable);
        }
        CharSequence text3 = tintTypedArrayObtainStyledAttributes.getText(C2456j.f20880u3);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawable2 = tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20864q3);
        if (drawable2 != null) {
            setLogo(drawable2);
        }
        CharSequence text4 = tintTypedArrayObtainStyledAttributes.getText(C2456j.f20868r3);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        int i9 = C2456j.f20750I3;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i9)) {
            setTitleTextColor(tintTypedArrayObtainStyledAttributes.getColorStateList(i9));
        }
        int i10 = C2456j.f20901z3;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i10)) {
            setSubtitleTextColor(tintTypedArrayObtainStyledAttributes.getColorStateList(i10));
        }
        int i11 = C2456j.f20876t3;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
            inflateMenu(tintTypedArrayObtainStyledAttributes.getResourceId(i11, 0));
        }
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    public void addMenuProvider(androidx.core.view.B b2, InterfaceC1701o interfaceC1701o, AbstractC1694h.b bVar) {
        this.mMenuHostHelper.e(b2, interfaceC1701o, bVar);
    }

    @Override
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        if (layoutParams instanceof a.C0067a) {
            return new LayoutParams((a.C0067a) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
