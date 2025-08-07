package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.SpinnerAdapter;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.m;
import androidx.core.view.C1620h0;

public interface DecorToolbar {
    void animateToVisibility(int i7);

    boolean canShowOverflowMenu();

    void collapseActionView();

    void dismissPopupMenus();

    Context getContext();

    View getCustomView();

    int getDisplayOptions();

    int getDropdownItemCount();

    int getDropdownSelectedPosition();

    int getHeight();

    Menu getMenu();

    int getNavigationMode();

    CharSequence getSubtitle();

    CharSequence getTitle();

    ViewGroup getViewGroup();

    int getVisibility();

    boolean hasEmbeddedTabs();

    boolean hasExpandedActionView();

    boolean hasIcon();

    boolean hasLogo();

    boolean hideOverflowMenu();

    void initIndeterminateProgress();

    void initProgress();

    boolean isOverflowMenuShowPending();

    boolean isOverflowMenuShowing();

    boolean isTitleTruncated();

    void restoreHierarchyState(SparseArray<Parcelable> sparseArray);

    void saveHierarchyState(SparseArray<Parcelable> sparseArray);

    void setBackgroundDrawable(Drawable drawable);

    void setCollapsible(boolean z7);

    void setCustomView(View view);

    void setDefaultNavigationContentDescription(int i7);

    void setDefaultNavigationIcon(Drawable drawable);

    void setDisplayOptions(int i7);

    void setDropdownParams(SpinnerAdapter spinnerAdapter, AdapterView.OnItemSelectedListener onItemSelectedListener);

    void setDropdownSelectedPosition(int i7);

    void setEmbeddedTabView(ScrollingTabContainerView scrollingTabContainerView);

    void setHomeButtonEnabled(boolean z7);

    void setIcon(int i7);

    void setIcon(Drawable drawable);

    void setLogo(int i7);

    void setLogo(Drawable drawable);

    void setMenu(Menu menu, m.a aVar);

    void setMenuCallbacks(m.a aVar, g.a aVar2);

    void setMenuPrepared();

    void setNavigationContentDescription(int i7);

    void setNavigationContentDescription(CharSequence charSequence);

    void setNavigationIcon(int i7);

    void setNavigationIcon(Drawable drawable);

    void setNavigationMode(int i7);

    void setSubtitle(CharSequence charSequence);

    void setTitle(CharSequence charSequence);

    void setVisibility(int i7);

    void setWindowCallback(Window.Callback callback);

    void setWindowTitle(CharSequence charSequence);

    C1620h0 setupAnimatorToVisibility(int i7, long j7);

    boolean showOverflowMenu();
}
