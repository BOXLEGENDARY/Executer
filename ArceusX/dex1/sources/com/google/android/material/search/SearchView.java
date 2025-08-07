package com.google.android.material.search;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.Z;
import androidx.customview.view.AbsSavedState;
import c4.C1748d;
import c4.C1749e;
import c4.C1754j;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.internal.ClippableRoundedCornerLayout;
import com.google.android.material.internal.TouchObserverFrameLayout;
import com.google.android.material.internal.e;
import com.google.android.material.internal.q;
import i.C2481b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import m4.C2582a;
import p4.c;
import q0.C2731a;
import u4.h;

public class SearchView extends FrameLayout implements CoordinatorLayout.b {

    private static final int f18301P = C1754j.f12959l;

    final TouchObserverFrameLayout f18302A;

    private final boolean f18303B;

    private final boolean f18304C;

    private final C2582a f18305D;

    private final Set<a> f18306E;

    private SearchBar f18307F;

    private int f18308G;

    private boolean f18309H;

    private boolean f18310I;

    private boolean f18311J;

    private final int f18312K;

    private boolean f18313L;

    private boolean f18314M;

    private b f18315N;

    private Map<View, Integer> f18316O;

    final ClippableRoundedCornerLayout f18317d;

    final View f18318e;

    final View f18319i;

    final FrameLayout f18320v;

    final MaterialToolbar f18321w;

    final TextView f18322y;

    final EditText f18323z;

    public static class Behavior extends CoordinatorLayout.c<SearchView> {
        public Behavior() {
        }

        @Override
        public boolean h(CoordinatorLayout coordinatorLayout, SearchView searchView, View view) {
            if (searchView.b() || !(view instanceof SearchBar)) {
                return false;
            }
            searchView.setupWithSearchBar((SearchBar) view);
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        String f18324d;

        int f18325e;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
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
            parcel.writeString(this.f18324d);
            parcel.writeInt(this.f18325e);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f18324d = parcel.readString();
            this.f18325e = parcel.readInt();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface a {
        void a(SearchView searchView, b bVar, b bVar2);
    }

    public enum b {
        HIDING,
        HIDDEN,
        SHOWING,
        SHOWN
    }

    private void c(b bVar, boolean z7) {
        if (this.f18315N.equals(bVar)) {
            return;
        }
        if (z7) {
            if (bVar == b.SHOWN) {
                setModalForAccessibility(true);
            } else if (bVar == b.HIDDEN) {
                setModalForAccessibility(false);
            }
        }
        b bVar2 = this.f18315N;
        this.f18315N = bVar;
        Iterator it = new LinkedHashSet(this.f18306E).iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(this, bVar2, bVar);
        }
        e(bVar);
    }

    private void d(ViewGroup viewGroup, boolean z7) {
        for (int i7 = 0; i7 < viewGroup.getChildCount(); i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt != this) {
                if (childAt.findViewById(this.f18317d.getId()) != null) {
                    d((ViewGroup) childAt, z7);
                } else if (z7) {
                    this.f18316O.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                    Z.x0(childAt, 4);
                } else {
                    Map<View, Integer> map = this.f18316O;
                    if (map != null && map.containsKey(childAt)) {
                        Z.x0(childAt, this.f18316O.get(childAt).intValue());
                    }
                }
            }
        }
    }

    private void e(b bVar) {
        if (this.f18307F == null || !this.f18304C) {
            return;
        }
        if (bVar.equals(b.SHOWN) || bVar.equals(b.HIDDEN)) {
            throw null;
        }
    }

    private void f() {
        ImageButton imageButtonD = q.d(this.f18321w);
        if (imageButtonD == null) {
            return;
        }
        int i7 = this.f18317d.getVisibility() == 0 ? 1 : 0;
        Drawable drawableQ = C2731a.q(imageButtonD.getDrawable());
        if (drawableQ instanceof C2481b) {
            ((C2481b) drawableQ).b(i7);
        }
        if (drawableQ instanceof e) {
            ((e) drawableQ).a(i7);
        }
    }

    private Window getActivityWindow() {
        Activity activityA = com.google.android.material.internal.b.a(getContext());
        if (activityA == null) {
            return null;
        }
        return activityA.getWindow();
    }

    private float getOverlayElevation() {
        SearchBar searchBar = this.f18307F;
        return searchBar != null ? searchBar.getCompatElevation() : getResources().getDimension(C1748d.f12832u);
    }

    private int getStatusBarHeight() {
        int identifier = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private void setStatusBarSpacerEnabledInternal(boolean z7) {
        this.f18319i.setVisibility(z7 ? 0 : 8);
    }

    private void setUpBackgroundViewElevationOverlay(float f7) {
        C2582a c2582a = this.f18305D;
        if (c2582a == null || this.f18318e == null) {
            return;
        }
        this.f18318e.setBackgroundColor(c2582a.c(this.f18312K, f7));
    }

    private void setUpHeaderLayout(int i7) {
        if (i7 != -1) {
            a(LayoutInflater.from(getContext()).inflate(i7, (ViewGroup) this.f18320v, false));
        }
    }

    private void setUpStatusBarSpacer(int i7) {
        if (this.f18319i.getLayoutParams().height != i7) {
            this.f18319i.getLayoutParams().height = i7;
            this.f18319i.requestLayout();
        }
    }

    public void a(View view) {
        this.f18320v.addView(view);
        this.f18320v.setVisibility(0);
    }

    @Override
    public void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        if (this.f18303B) {
            this.f18302A.addView(view, i7, layoutParams);
        } else {
            super.addView(view, i7, layoutParams);
        }
    }

    public boolean b() {
        return this.f18307F != null;
    }

    public void g() {
        Window activityWindow = getActivityWindow();
        if (activityWindow != null) {
            this.f18308G = activityWindow.getAttributes().softInputMode;
        }
    }

    c getBackHelper() {
        throw null;
    }

    @Override
    public CoordinatorLayout.c<SearchView> getBehavior() {
        return new Behavior();
    }

    public b getCurrentTransitionState() {
        return this.f18315N;
    }

    protected int getDefaultNavigationIconResource() {
        return C1749e.f12839b;
    }

    public EditText getEditText() {
        return this.f18323z;
    }

    public CharSequence getHint() {
        return this.f18323z.getHint();
    }

    public TextView getSearchPrefix() {
        return this.f18322y;
    }

    public CharSequence getSearchPrefixText() {
        return this.f18322y.getText();
    }

    public int getSoftInputMode() {
        return this.f18308G;
    }

    public Editable getText() {
        return this.f18323z.getText();
    }

    public Toolbar getToolbar() {
        return this.f18321w;
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.e(this);
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();
        g();
    }

    @Override
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setText(savedState.f18324d);
        setVisible(savedState.f18325e == 0);
    }

    @Override
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Editable text = getText();
        savedState.f18324d = text == null ? null : text.toString();
        savedState.f18325e = this.f18317d.getVisibility();
        return savedState;
    }

    public void setAnimatedNavigationIcon(boolean z7) {
        this.f18309H = z7;
    }

    public void setAutoShowKeyboard(boolean z7) {
        this.f18311J = z7;
    }

    @Override
    public void setElevation(float f7) {
        super.setElevation(f7);
        setUpBackgroundViewElevationOverlay(f7);
    }

    public void setHint(CharSequence charSequence) {
        this.f18323z.setHint(charSequence);
    }

    public void setMenuItemsAnimated(boolean z7) {
        this.f18310I = z7;
    }

    public void setModalForAccessibility(boolean z7) {
        ViewGroup viewGroup = (ViewGroup) getRootView();
        if (z7) {
            this.f18316O = new HashMap(viewGroup.getChildCount());
        }
        d(viewGroup, z7);
        if (z7) {
            return;
        }
        this.f18316O = null;
    }

    public void setOnMenuItemClickListener(Toolbar.OnMenuItemClickListener onMenuItemClickListener) {
        this.f18321w.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void setSearchPrefixText(CharSequence charSequence) {
        this.f18322y.setText(charSequence);
        this.f18322y.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
    }

    public void setStatusBarSpacerEnabled(boolean z7) {
        this.f18314M = true;
        setStatusBarSpacerEnabledInternal(z7);
    }

    public void setText(CharSequence charSequence) {
        this.f18323z.setText(charSequence);
    }

    public void setToolbarTouchscreenBlocksFocus(boolean z7) {
        this.f18321w.setTouchscreenBlocksFocus(z7);
    }

    void setTransitionState(b bVar) {
        c(bVar, true);
    }

    public void setUseWindowInsetsController(boolean z7) {
        this.f18313L = z7;
    }

    public void setVisible(boolean z7) {
        boolean z8 = this.f18317d.getVisibility() == 0;
        this.f18317d.setVisibility(z7 ? 0 : 8);
        f();
        c(z7 ? b.SHOWN : b.HIDDEN, z8 != z7);
    }

    public void setupWithSearchBar(SearchBar searchBar) {
        this.f18307F = searchBar;
        throw null;
    }

    public void setHint(int i7) {
        this.f18323z.setHint(i7);
    }

    public void setText(int i7) {
        this.f18323z.setText(i7);
    }
}
