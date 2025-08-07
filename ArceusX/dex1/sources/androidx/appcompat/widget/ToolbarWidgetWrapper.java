package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C1620h0;
import androidx.core.view.C1624j0;
import androidx.core.view.Z;
import g.C2447a;
import g.C2451e;
import g.C2452f;
import g.C2454h;
import g.C2456j;
import h.C2473a;

public class ToolbarWidgetWrapper implements DecorToolbar {
    private static final int AFFECTS_LOGO_MASK = 3;
    private static final long DEFAULT_FADE_DURATION_MS = 200;
    private static final String TAG = "ToolbarWidgetWrapper";
    private C1597b mActionMenuPresenter;
    private View mCustomView;
    private int mDefaultNavigationContentDescription;
    private Drawable mDefaultNavigationIcon;
    private int mDisplayOpts;
    private CharSequence mHomeDescription;
    private Drawable mIcon;
    private Drawable mLogo;
    boolean mMenuPrepared;
    private Drawable mNavIcon;
    private int mNavigationMode;
    private Spinner mSpinner;
    private CharSequence mSubtitle;
    private View mTabView;
    CharSequence mTitle;
    private boolean mTitleSet;
    Toolbar mToolbar;
    Window.Callback mWindowCallback;

    class a implements View.OnClickListener {

        final androidx.appcompat.view.menu.a f9233d;

        a() {
            this.f9233d = new androidx.appcompat.view.menu.a(ToolbarWidgetWrapper.this.mToolbar.getContext(), 0, R.id.home, 0, 0, ToolbarWidgetWrapper.this.mTitle);
        }

        @Override
        public void onClick(View view) {
            ToolbarWidgetWrapper toolbarWidgetWrapper = ToolbarWidgetWrapper.this;
            Window.Callback callback = toolbarWidgetWrapper.mWindowCallback;
            if (callback == null || !toolbarWidgetWrapper.mMenuPrepared) {
                return;
            }
            callback.onMenuItemSelected(0, this.f9233d);
        }
    }

    class b extends C1624j0 {

        private boolean f9235a = false;

        final int f9236b;

        b(int i7) {
            this.f9236b = i7;
        }

        @Override
        public void onAnimationCancel(View view) {
            this.f9235a = true;
        }

        @Override
        public void onAnimationEnd(View view) {
            if (this.f9235a) {
                return;
            }
            ToolbarWidgetWrapper.this.mToolbar.setVisibility(this.f9236b);
        }

        @Override
        public void onAnimationStart(View view) {
            ToolbarWidgetWrapper.this.mToolbar.setVisibility(0);
        }
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z7) {
        this(toolbar, z7, C2454h.f20698a, C2451e.f20617n);
    }

    private int detectDisplayOptions() {
        if (this.mToolbar.getNavigationIcon() == null) {
            return 11;
        }
        this.mDefaultNavigationIcon = this.mToolbar.getNavigationIcon();
        return 15;
    }

    private void ensureSpinner() {
        if (this.mSpinner == null) {
            this.mSpinner = new AppCompatSpinner(getContext(), null, C2447a.f20547i);
            this.mSpinner.setLayoutParams(new Toolbar.LayoutParams(-2, -2, 8388627));
        }
    }

    private void setTitleInt(CharSequence charSequence) {
        this.mTitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setTitle(charSequence);
            if (this.mTitleSet) {
                Z.q0(this.mToolbar.getRootView(), charSequence);
            }
        }
    }

    private void updateHomeAccessibility() {
        if ((this.mDisplayOpts & 4) != 0) {
            if (TextUtils.isEmpty(this.mHomeDescription)) {
                this.mToolbar.setNavigationContentDescription(this.mDefaultNavigationContentDescription);
            } else {
                this.mToolbar.setNavigationContentDescription(this.mHomeDescription);
            }
        }
    }

    private void updateNavigationIcon() {
        if ((this.mDisplayOpts & 4) == 0) {
            this.mToolbar.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.mToolbar;
        Drawable drawable = this.mNavIcon;
        if (drawable == null) {
            drawable = this.mDefaultNavigationIcon;
        }
        toolbar.setNavigationIcon(drawable);
    }

    private void updateToolbarLogo() {
        Drawable drawable;
        int i7 = this.mDisplayOpts;
        if ((i7 & 2) == 0) {
            drawable = null;
        } else if ((i7 & 1) == 0 || (drawable = this.mLogo) == null) {
            drawable = this.mIcon;
        }
        this.mToolbar.setLogo(drawable);
    }

    @Override
    public void animateToVisibility(int i7) {
        C1620h0 c1620h0 = setupAnimatorToVisibility(i7, DEFAULT_FADE_DURATION_MS);
        if (c1620h0 != null) {
            c1620h0.l();
        }
    }

    @Override
    public boolean canShowOverflowMenu() {
        return this.mToolbar.canShowOverflowMenu();
    }

    @Override
    public void collapseActionView() {
        this.mToolbar.collapseActionView();
    }

    @Override
    public void dismissPopupMenus() {
        this.mToolbar.dismissPopupMenus();
    }

    @Override
    public Context getContext() {
        return this.mToolbar.getContext();
    }

    @Override
    public View getCustomView() {
        return this.mCustomView;
    }

    @Override
    public int getDisplayOptions() {
        return this.mDisplayOpts;
    }

    @Override
    public int getDropdownItemCount() {
        Spinner spinner = this.mSpinner;
        if (spinner != null) {
            return spinner.getCount();
        }
        return 0;
    }

    @Override
    public int getDropdownSelectedPosition() {
        Spinner spinner = this.mSpinner;
        if (spinner != null) {
            return spinner.getSelectedItemPosition();
        }
        return 0;
    }

    @Override
    public int getHeight() {
        return this.mToolbar.getHeight();
    }

    @Override
    public Menu getMenu() {
        return this.mToolbar.getMenu();
    }

    @Override
    public int getNavigationMode() {
        return this.mNavigationMode;
    }

    @Override
    public CharSequence getSubtitle() {
        return this.mToolbar.getSubtitle();
    }

    @Override
    public CharSequence getTitle() {
        return this.mToolbar.getTitle();
    }

    @Override
    public ViewGroup getViewGroup() {
        return this.mToolbar;
    }

    @Override
    public int getVisibility() {
        return this.mToolbar.getVisibility();
    }

    @Override
    public boolean hasEmbeddedTabs() {
        return this.mTabView != null;
    }

    @Override
    public boolean hasExpandedActionView() {
        return this.mToolbar.hasExpandedActionView();
    }

    @Override
    public boolean hasIcon() {
        return this.mIcon != null;
    }

    @Override
    public boolean hasLogo() {
        return this.mLogo != null;
    }

    @Override
    public boolean hideOverflowMenu() {
        return this.mToolbar.hideOverflowMenu();
    }

    @Override
    public void initIndeterminateProgress() {
        Log.i(TAG, "Progress display unsupported");
    }

    @Override
    public void initProgress() {
        Log.i(TAG, "Progress display unsupported");
    }

    @Override
    public boolean isOverflowMenuShowPending() {
        return this.mToolbar.isOverflowMenuShowPending();
    }

    @Override
    public boolean isOverflowMenuShowing() {
        return this.mToolbar.isOverflowMenuShowing();
    }

    @Override
    public boolean isTitleTruncated() {
        return this.mToolbar.isTitleTruncated();
    }

    @Override
    public void restoreHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.mToolbar.restoreHierarchyState(sparseArray);
    }

    @Override
    public void saveHierarchyState(SparseArray<Parcelable> sparseArray) {
        this.mToolbar.saveHierarchyState(sparseArray);
    }

    @Override
    public void setBackgroundDrawable(Drawable drawable) {
        Z.r0(this.mToolbar, drawable);
    }

    @Override
    public void setCollapsible(boolean z7) {
        this.mToolbar.setCollapsible(z7);
    }

    @Override
    public void setCustomView(View view) {
        View view2 = this.mCustomView;
        if (view2 != null && (this.mDisplayOpts & 16) != 0) {
            this.mToolbar.removeView(view2);
        }
        this.mCustomView = view;
        if (view == null || (this.mDisplayOpts & 16) == 0) {
            return;
        }
        this.mToolbar.addView(view);
    }

    @Override
    public void setDefaultNavigationContentDescription(int i7) {
        if (i7 == this.mDefaultNavigationContentDescription) {
            return;
        }
        this.mDefaultNavigationContentDescription = i7;
        if (TextUtils.isEmpty(this.mToolbar.getNavigationContentDescription())) {
            setNavigationContentDescription(this.mDefaultNavigationContentDescription);
        }
    }

    @Override
    public void setDefaultNavigationIcon(Drawable drawable) {
        if (this.mDefaultNavigationIcon != drawable) {
            this.mDefaultNavigationIcon = drawable;
            updateNavigationIcon();
        }
    }

    @Override
    public void setDisplayOptions(int i7) {
        View view;
        int i8 = this.mDisplayOpts ^ i7;
        this.mDisplayOpts = i7;
        if (i8 != 0) {
            if ((i8 & 4) != 0) {
                if ((i7 & 4) != 0) {
                    updateHomeAccessibility();
                }
                updateNavigationIcon();
            }
            if ((i8 & 3) != 0) {
                updateToolbarLogo();
            }
            if ((i8 & 8) != 0) {
                if ((i7 & 8) != 0) {
                    this.mToolbar.setTitle(this.mTitle);
                    this.mToolbar.setSubtitle(this.mSubtitle);
                } else {
                    this.mToolbar.setTitle((CharSequence) null);
                    this.mToolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i8 & 16) == 0 || (view = this.mCustomView) == null) {
                return;
            }
            if ((i7 & 16) != 0) {
                this.mToolbar.addView(view);
            } else {
                this.mToolbar.removeView(view);
            }
        }
    }

    @Override
    public void setDropdownParams(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener) {
        ensureSpinner();
        this.mSpinner.setAdapter(spinnerAdapter);
        this.mSpinner.setOnItemSelectedListener(onItemSelectedListener);
    }

    @Override
    public void setDropdownSelectedPosition(int i7) {
        Spinner spinner = this.mSpinner;
        if (spinner == null) {
            throw new IllegalStateException("Can't set dropdown selected position without an adapter");
        }
        spinner.setSelection(i7);
    }

    @Override
    public void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.mTabView;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.mToolbar;
            if (parent == toolbar) {
                toolbar.removeView(this.mTabView);
            }
        }
        this.mTabView = scrollingTabContainerView;
        if (scrollingTabContainerView == null || this.mNavigationMode != 2) {
            return;
        }
        this.mToolbar.addView(scrollingTabContainerView, 0);
        Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.mTabView.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
        ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
        layoutParams.gravity = 8388691;
        scrollingTabContainerView.setAllowCollapse(true);
    }

    @Override
    public void setHomeButtonEnabled(boolean z7) {
    }

    @Override
    public void setIcon(int i7) {
        setIcon(i7 != 0 ? C2473a.b(getContext(), i7) : null);
    }

    @Override
    public void setLogo(int i7) {
        setLogo(i7 != 0 ? C2473a.b(getContext(), i7) : null);
    }

    @Override
    public void setMenu(Menu menu, m.a aVar) {
        if (this.mActionMenuPresenter == null) {
            C1597b c1597b = new C1597b(this.mToolbar.getContext());
            this.mActionMenuPresenter = c1597b;
            c1597b.q(C2452f.f20657g);
        }
        this.mActionMenuPresenter.f(aVar);
        this.mToolbar.setMenu((androidx.appcompat.view.menu.g) menu, this.mActionMenuPresenter);
    }

    @Override
    public void setMenuCallbacks(m.a aVar, g.a aVar2) {
        this.mToolbar.setMenuCallbacks(aVar, aVar2);
    }

    @Override
    public void setMenuPrepared() {
        this.mMenuPrepared = true;
    }

    @Override
    public void setNavigationContentDescription(CharSequence charSequence) {
        this.mHomeDescription = charSequence;
        updateHomeAccessibility();
    }

    @Override
    public void setNavigationIcon(Drawable drawable) {
        this.mNavIcon = drawable;
        updateNavigationIcon();
    }

    @Override
    public void setNavigationMode(int i7) {
        View view;
        int i8 = this.mNavigationMode;
        if (i7 != i8) {
            if (i8 == 1) {
                Spinner spinner = this.mSpinner;
                if (spinner != null) {
                    ViewParent parent = spinner.getParent();
                    Toolbar toolbar = this.mToolbar;
                    if (parent == toolbar) {
                        toolbar.removeView(this.mSpinner);
                    }
                }
            } else if (i8 == 2 && (view = this.mTabView) != null) {
                ViewParent parent2 = view.getParent();
                Toolbar toolbar2 = this.mToolbar;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(this.mTabView);
                }
            }
            this.mNavigationMode = i7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ensureSpinner();
                    this.mToolbar.addView(this.mSpinner, 0);
                    return;
                }
                if (i7 != 2) {
                    throw new IllegalArgumentException("Invalid navigation mode " + i7);
                }
                View view2 = this.mTabView;
                if (view2 != null) {
                    this.mToolbar.addView(view2, 0);
                    Toolbar.LayoutParams layoutParams = (Toolbar.LayoutParams) this.mTabView.getLayoutParams();
                    ((ViewGroup.MarginLayoutParams) layoutParams).width = -2;
                    ((ViewGroup.MarginLayoutParams) layoutParams).height = -2;
                    layoutParams.gravity = 8388691;
                }
            }
        }
    }

    @Override
    public void setSubtitle(CharSequence charSequence) {
        this.mSubtitle = charSequence;
        if ((this.mDisplayOpts & 8) != 0) {
            this.mToolbar.setSubtitle(charSequence);
        }
    }

    @Override
    public void setTitle(CharSequence charSequence) {
        this.mTitleSet = true;
        setTitleInt(charSequence);
    }

    @Override
    public void setVisibility(int i7) {
        this.mToolbar.setVisibility(i7);
    }

    @Override
    public void setWindowCallback(Window.Callback callback) {
        this.mWindowCallback = callback;
    }

    @Override
    public void setWindowTitle(CharSequence charSequence) {
        if (this.mTitleSet) {
            return;
        }
        setTitleInt(charSequence);
    }

    @Override
    public C1620h0 setupAnimatorToVisibility(int i7, long j7) {
        return Z.e(this.mToolbar).b(i7 == 0 ? 1.0f : 0.0f).f(j7).h(new b(i7));
    }

    @Override
    public boolean showOverflowMenu() {
        return this.mToolbar.showOverflowMenu();
    }

    public ToolbarWidgetWrapper(Toolbar toolbar, boolean z7, int i7, int i8) {
        Drawable drawable;
        this.mNavigationMode = 0;
        this.mDefaultNavigationContentDescription = 0;
        this.mToolbar = toolbar;
        this.mTitle = toolbar.getTitle();
        this.mSubtitle = toolbar.getSubtitle();
        this.mTitleSet = this.mTitle != null;
        this.mNavIcon = toolbar.getNavigationIcon();
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(toolbar.getContext(), null, C2456j.f20794a, C2447a.f20541c, 0);
        this.mDefaultNavigationIcon = tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20842l);
        if (z7) {
            CharSequence text = tintTypedArrayObtainStyledAttributes.getText(C2456j.f20865r);
            if (!TextUtils.isEmpty(text)) {
                setTitle(text);
            }
            CharSequence text2 = tintTypedArrayObtainStyledAttributes.getText(C2456j.f20857p);
            if (!TextUtils.isEmpty(text2)) {
                setSubtitle(text2);
            }
            Drawable drawable2 = tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20850n);
            if (drawable2 != null) {
                setLogo(drawable2);
            }
            Drawable drawable3 = tintTypedArrayObtainStyledAttributes.getDrawable(C2456j.f20846m);
            if (drawable3 != null) {
                setIcon(drawable3);
            }
            if (this.mNavIcon == null && (drawable = this.mDefaultNavigationIcon) != null) {
                setNavigationIcon(drawable);
            }
            setDisplayOptions(tintTypedArrayObtainStyledAttributes.getInt(C2456j.f20823h, 0));
            int resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20818g, 0);
            if (resourceId != 0) {
                setCustomView(LayoutInflater.from(this.mToolbar.getContext()).inflate(resourceId, (ViewGroup) this.mToolbar, false));
                setDisplayOptions(this.mDisplayOpts | 16);
            }
            int layoutDimension = tintTypedArrayObtainStyledAttributes.getLayoutDimension(C2456j.f20833j, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = this.mToolbar.getLayoutParams();
                layoutParams.height = layoutDimension;
                this.mToolbar.setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.f20813f, -1);
            int dimensionPixelOffset2 = tintTypedArrayObtainStyledAttributes.getDimensionPixelOffset(C2456j.f20808e, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                this.mToolbar.setContentInsetsRelative(Math.max(dimensionPixelOffset, 0), Math.max(dimensionPixelOffset2, 0));
            }
            int resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20869s, 0);
            if (resourceId2 != 0) {
                Toolbar toolbar2 = this.mToolbar;
                toolbar2.setTitleTextAppearance(toolbar2.getContext(), resourceId2);
            }
            int resourceId3 = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20861q, 0);
            if (resourceId3 != 0) {
                Toolbar toolbar3 = this.mToolbar;
                toolbar3.setSubtitleTextAppearance(toolbar3.getContext(), resourceId3);
            }
            int resourceId4 = tintTypedArrayObtainStyledAttributes.getResourceId(C2456j.f20854o, 0);
            if (resourceId4 != 0) {
                this.mToolbar.setPopupTheme(resourceId4);
            }
        } else {
            this.mDisplayOpts = detectDisplayOptions();
        }
        tintTypedArrayObtainStyledAttributes.recycle();
        setDefaultNavigationContentDescription(i7);
        this.mHomeDescription = this.mToolbar.getNavigationContentDescription();
        this.mToolbar.setNavigationOnClickListener(new a());
    }

    @Override
    public void setIcon(Drawable drawable) {
        this.mIcon = drawable;
        updateToolbarLogo();
    }

    @Override
    public void setLogo(Drawable drawable) {
        this.mLogo = drawable;
        updateToolbarLogo();
    }

    @Override
    public void setNavigationContentDescription(int i7) {
        setNavigationContentDescription(i7 == 0 ? null : getContext().getString(i7));
    }

    @Override
    public void setNavigationIcon(int i7) {
        setNavigationIcon(i7 != 0 ? C2473a.b(getContext(), i7) : null);
    }
}
