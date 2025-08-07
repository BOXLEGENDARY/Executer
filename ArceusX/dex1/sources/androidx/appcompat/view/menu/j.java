package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.AbstractC1607b;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import r0.InterfaceMenuItemC2741b;

public class j extends androidx.appcompat.view.menu.c implements MenuItem {

    private final InterfaceMenuItemC2741b f9052d;

    private Method f9053e;

    private class a extends AbstractC1607b {

        final ActionProvider f9054a;

        a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f9054a = actionProvider;
        }

        @Override
        public boolean hasSubMenu() {
            return this.f9054a.hasSubMenu();
        }

        @Override
        public View onCreateActionView() {
            return this.f9054a.onCreateActionView();
        }

        @Override
        public boolean onPerformDefaultAction() {
            return this.f9054a.onPerformDefaultAction();
        }

        @Override
        public void onPrepareSubMenu(SubMenu subMenu) {
            this.f9054a.onPrepareSubMenu(j.this.d(subMenu));
        }
    }

    private class b extends a implements ActionProvider.VisibilityListener {

        private AbstractC1607b.InterfaceC0087b f9056c;

        b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override
        public boolean isVisible() {
            return this.f9054a.isVisible();
        }

        @Override
        public void onActionProviderVisibilityChanged(boolean z7) {
            AbstractC1607b.InterfaceC0087b interfaceC0087b = this.f9056c;
            if (interfaceC0087b != null) {
                interfaceC0087b.onActionProviderVisibilityChanged(z7);
            }
        }

        @Override
        public View onCreateActionView(MenuItem menuItem) {
            return this.f9054a.onCreateActionView(menuItem);
        }

        @Override
        public boolean overridesItemVisibility() {
            return this.f9054a.overridesItemVisibility();
        }

        @Override
        public void refreshVisibility() {
            this.f9054a.refreshVisibility();
        }

        @Override
        public void setVisibilityListener(AbstractC1607b.InterfaceC0087b interfaceC0087b) {
            this.f9056c = interfaceC0087b;
            this.f9054a.setVisibilityListener(interfaceC0087b != null ? this : null);
        }
    }

    static class c extends FrameLayout implements androidx.appcompat.view.c {

        final CollapsibleActionView f9058d;

        c(View view) {
            super(view.getContext());
            this.f9058d = (CollapsibleActionView) view;
            addView(view);
        }

        View a() {
            return (View) this.f9058d;
        }

        @Override
        public void onActionViewCollapsed() {
            this.f9058d.onActionViewCollapsed();
        }

        @Override
        public void onActionViewExpanded() {
            this.f9058d.onActionViewExpanded();
        }
    }

    private class d implements MenuItem.OnActionExpandListener {

        private final MenuItem.OnActionExpandListener f9059a;

        d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f9059a = onActionExpandListener;
        }

        @Override
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f9059a.onMenuItemActionCollapse(j.this.c(menuItem));
        }

        @Override
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f9059a.onMenuItemActionExpand(j.this.c(menuItem));
        }
    }

    private class e implements MenuItem.OnMenuItemClickListener {

        private final MenuItem.OnMenuItemClickListener f9061a;

        e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f9061a = onMenuItemClickListener;
        }

        @Override
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f9061a.onMenuItemClick(j.this.c(menuItem));
        }
    }

    public j(Context context, InterfaceMenuItemC2741b interfaceMenuItemC2741b) {
        super(context);
        if (interfaceMenuItemC2741b == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f9052d = interfaceMenuItemC2741b;
    }

    @Override
    public boolean collapseActionView() {
        return this.f9052d.collapseActionView();
    }

    @Override
    public boolean expandActionView() {
        return this.f9052d.expandActionView();
    }

    @Override
    public ActionProvider getActionProvider() {
        AbstractC1607b abstractC1607bB = this.f9052d.b();
        if (abstractC1607bB instanceof a) {
            return ((a) abstractC1607bB).f9054a;
        }
        return null;
    }

    @Override
    public View getActionView() {
        View actionView = this.f9052d.getActionView();
        return actionView instanceof c ? ((c) actionView).a() : actionView;
    }

    @Override
    public int getAlphabeticModifiers() {
        return this.f9052d.getAlphabeticModifiers();
    }

    @Override
    public char getAlphabeticShortcut() {
        return this.f9052d.getAlphabeticShortcut();
    }

    @Override
    public CharSequence getContentDescription() {
        return this.f9052d.getContentDescription();
    }

    @Override
    public int getGroupId() {
        return this.f9052d.getGroupId();
    }

    @Override
    public Drawable getIcon() {
        return this.f9052d.getIcon();
    }

    @Override
    public ColorStateList getIconTintList() {
        return this.f9052d.getIconTintList();
    }

    @Override
    public PorterDuff.Mode getIconTintMode() {
        return this.f9052d.getIconTintMode();
    }

    @Override
    public Intent getIntent() {
        return this.f9052d.getIntent();
    }

    @Override
    public int getItemId() {
        return this.f9052d.getItemId();
    }

    @Override
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f9052d.getMenuInfo();
    }

    @Override
    public int getNumericModifiers() {
        return this.f9052d.getNumericModifiers();
    }

    @Override
    public char getNumericShortcut() {
        return this.f9052d.getNumericShortcut();
    }

    @Override
    public int getOrder() {
        return this.f9052d.getOrder();
    }

    @Override
    public SubMenu getSubMenu() {
        return d(this.f9052d.getSubMenu());
    }

    @Override
    public CharSequence getTitle() {
        return this.f9052d.getTitle();
    }

    @Override
    public CharSequence getTitleCondensed() {
        return this.f9052d.getTitleCondensed();
    }

    @Override
    public CharSequence getTooltipText() {
        return this.f9052d.getTooltipText();
    }

    public void h(boolean z7) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            if (this.f9053e == null) {
                this.f9053e = this.f9052d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f9053e.invoke(this.f9052d, Boolean.valueOf(z7));
        } catch (Exception e7) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e7);
        }
    }

    @Override
    public boolean hasSubMenu() {
        return this.f9052d.hasSubMenu();
    }

    @Override
    public boolean isActionViewExpanded() {
        return this.f9052d.isActionViewExpanded();
    }

    @Override
    public boolean isCheckable() {
        return this.f9052d.isCheckable();
    }

    @Override
    public boolean isChecked() {
        return this.f9052d.isChecked();
    }

    @Override
    public boolean isEnabled() {
        return this.f9052d.isEnabled();
    }

    @Override
    public boolean isVisible() {
        return this.f9052d.isVisible();
    }

    @Override
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f8932a, actionProvider);
        InterfaceMenuItemC2741b interfaceMenuItemC2741b = this.f9052d;
        if (actionProvider == null) {
            bVar = null;
        }
        interfaceMenuItemC2741b.a(bVar);
        return this;
    }

    @Override
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new c(view);
        }
        this.f9052d.setActionView(view);
        return this;
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f9052d.setAlphabeticShortcut(c2);
        return this;
    }

    @Override
    public MenuItem setCheckable(boolean z7) {
        this.f9052d.setCheckable(z7);
        return this;
    }

    @Override
    public MenuItem setChecked(boolean z7) {
        this.f9052d.setChecked(z7);
        return this;
    }

    @Override
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f9052d.setContentDescription(charSequence);
        return this;
    }

    @Override
    public MenuItem setEnabled(boolean z7) {
        this.f9052d.setEnabled(z7);
        return this;
    }

    @Override
    public MenuItem setIcon(Drawable drawable) {
        this.f9052d.setIcon(drawable);
        return this;
    }

    @Override
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9052d.setIconTintList(colorStateList);
        return this;
    }

    @Override
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9052d.setIconTintMode(mode);
        return this;
    }

    @Override
    public MenuItem setIntent(Intent intent) {
        this.f9052d.setIntent(intent);
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c2) {
        this.f9052d.setNumericShortcut(c2);
        return this;
    }

    @Override
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f9052d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9052d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override
    public MenuItem setShortcut(char c2, char c3) {
        this.f9052d.setShortcut(c2, c3);
        return this;
    }

    @Override
    public void setShowAsAction(int i7) {
        this.f9052d.setShowAsAction(i7);
    }

    @Override
    public MenuItem setShowAsActionFlags(int i7) {
        this.f9052d.setShowAsActionFlags(i7);
        return this;
    }

    @Override
    public MenuItem setTitle(CharSequence charSequence) {
        this.f9052d.setTitle(charSequence);
        return this;
    }

    @Override
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9052d.setTitleCondensed(charSequence);
        return this;
    }

    @Override
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f9052d.setTooltipText(charSequence);
        return this;
    }

    @Override
    public MenuItem setVisible(boolean z7) {
        return this.f9052d.setVisible(z7);
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c2, int i7) {
        this.f9052d.setAlphabeticShortcut(c2, i7);
        return this;
    }

    @Override
    public MenuItem setIcon(int i7) {
        this.f9052d.setIcon(i7);
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c2, int i7) {
        this.f9052d.setNumericShortcut(c2, i7);
        return this;
    }

    @Override
    public MenuItem setShortcut(char c2, char c3, int i7, int i8) {
        this.f9052d.setShortcut(c2, c3, i7, i8);
        return this;
    }

    @Override
    public MenuItem setTitle(int i7) {
        this.f9052d.setTitle(i7);
        return this;
    }

    @Override
    public MenuItem setActionView(int i7) {
        this.f9052d.setActionView(i7);
        View actionView = this.f9052d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f9052d.setActionView(new c(actionView));
        }
        return this;
    }
}
