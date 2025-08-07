package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.view.AbstractC1607b;
import q0.C2731a;
import r0.InterfaceMenuItemC2741b;

public class a implements InterfaceMenuItemC2741b {

    private final int f8902a;

    private final int f8903b;

    private final int f8904c;

    private CharSequence f8905d;

    private CharSequence f8906e;

    private Intent f8907f;

    private char f8908g;

    private char f8910i;

    private Drawable f8912k;

    private Context f8913l;

    private MenuItem.OnMenuItemClickListener f8914m;

    private CharSequence f8915n;

    private CharSequence f8916o;

    private int f8909h = 4096;

    private int f8911j = 4096;

    private ColorStateList f8917p = null;

    private PorterDuff.Mode f8918q = null;

    private boolean f8919r = false;

    private boolean f8920s = false;

    private int f8921t = 16;

    public a(Context context, int i7, int i8, int i9, int i10, CharSequence charSequence) {
        this.f8913l = context;
        this.f8902a = i8;
        this.f8903b = i7;
        this.f8904c = i10;
        this.f8905d = charSequence;
    }

    private void c() {
        Drawable drawable = this.f8912k;
        if (drawable != null) {
            if (this.f8919r || this.f8920s) {
                Drawable drawableR = C2731a.r(drawable);
                this.f8912k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f8912k = drawableMutate;
                if (this.f8919r) {
                    C2731a.o(drawableMutate, this.f8917p);
                }
                if (this.f8920s) {
                    C2731a.p(this.f8912k, this.f8918q);
                }
            }
        }
    }

    @Override
    public InterfaceMenuItemC2741b a(AbstractC1607b abstractC1607b) {
        throw new UnsupportedOperationException();
    }

    @Override
    public AbstractC1607b b() {
        return null;
    }

    @Override
    public boolean collapseActionView() {
        return false;
    }

    @Override
    public InterfaceMenuItemC2741b setActionView(int i7) {
        throw new UnsupportedOperationException();
    }

    @Override
    public InterfaceMenuItemC2741b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean expandActionView() {
        return false;
    }

    @Override
    public InterfaceMenuItemC2741b setShowAsActionFlags(int i7) {
        setShowAsAction(i7);
        return this;
    }

    @Override
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override
    public View getActionView() {
        return null;
    }

    @Override
    public int getAlphabeticModifiers() {
        return this.f8911j;
    }

    @Override
    public char getAlphabeticShortcut() {
        return this.f8910i;
    }

    @Override
    public CharSequence getContentDescription() {
        return this.f8915n;
    }

    @Override
    public int getGroupId() {
        return this.f8903b;
    }

    @Override
    public Drawable getIcon() {
        return this.f8912k;
    }

    @Override
    public ColorStateList getIconTintList() {
        return this.f8917p;
    }

    @Override
    public PorterDuff.Mode getIconTintMode() {
        return this.f8918q;
    }

    @Override
    public Intent getIntent() {
        return this.f8907f;
    }

    @Override
    public int getItemId() {
        return this.f8902a;
    }

    @Override
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override
    public int getNumericModifiers() {
        return this.f8909h;
    }

    @Override
    public char getNumericShortcut() {
        return this.f8908g;
    }

    @Override
    public int getOrder() {
        return this.f8904c;
    }

    @Override
    public SubMenu getSubMenu() {
        return null;
    }

    @Override
    public CharSequence getTitle() {
        return this.f8905d;
    }

    @Override
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f8906e;
        return charSequence != null ? charSequence : this.f8905d;
    }

    @Override
    public CharSequence getTooltipText() {
        return this.f8916o;
    }

    @Override
    public boolean hasSubMenu() {
        return false;
    }

    @Override
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override
    public boolean isCheckable() {
        return (this.f8921t & 1) != 0;
    }

    @Override
    public boolean isChecked() {
        return (this.f8921t & 2) != 0;
    }

    @Override
    public boolean isEnabled() {
        return (this.f8921t & 16) != 0;
    }

    @Override
    public boolean isVisible() {
        return (this.f8921t & 8) == 0;
    }

    @Override
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c2) {
        this.f8910i = Character.toLowerCase(c2);
        return this;
    }

    @Override
    public MenuItem setCheckable(boolean z7) {
        this.f8921t = (z7 ? 1 : 0) | (this.f8921t & (-2));
        return this;
    }

    @Override
    public MenuItem setChecked(boolean z7) {
        this.f8921t = (z7 ? 2 : 0) | (this.f8921t & (-3));
        return this;
    }

    @Override
    public MenuItem setEnabled(boolean z7) {
        this.f8921t = (z7 ? 16 : 0) | (this.f8921t & (-17));
        return this;
    }

    @Override
    public MenuItem setIcon(Drawable drawable) {
        this.f8912k = drawable;
        c();
        return this;
    }

    @Override
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f8917p = colorStateList;
        this.f8919r = true;
        c();
        return this;
    }

    @Override
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f8918q = mode;
        this.f8920s = true;
        c();
        return this;
    }

    @Override
    public MenuItem setIntent(Intent intent) {
        this.f8907f = intent;
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c2) {
        this.f8908g = c2;
        return this;
    }

    @Override
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f8914m = onMenuItemClickListener;
        return this;
    }

    @Override
    public MenuItem setShortcut(char c2, char c3) {
        this.f8908g = c2;
        this.f8910i = Character.toLowerCase(c3);
        return this;
    }

    @Override
    public void setShowAsAction(int i7) {
    }

    @Override
    public MenuItem setTitle(CharSequence charSequence) {
        this.f8905d = charSequence;
        return this;
    }

    @Override
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f8906e = charSequence;
        return this;
    }

    @Override
    public MenuItem setVisible(boolean z7) {
        this.f8921t = (this.f8921t & 8) | (z7 ? 0 : 8);
        return this;
    }

    @Override
    public MenuItem setAlphabeticShortcut(char c2, int i7) {
        this.f8910i = Character.toLowerCase(c2);
        this.f8911j = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override
    public InterfaceMenuItemC2741b setContentDescription(CharSequence charSequence) {
        this.f8915n = charSequence;
        return this;
    }

    @Override
    public MenuItem setNumericShortcut(char c2, int i7) {
        this.f8908g = c2;
        this.f8909h = KeyEvent.normalizeMetaState(i7);
        return this;
    }

    @Override
    public MenuItem setTitle(int i7) {
        this.f8905d = this.f8913l.getResources().getString(i7);
        return this;
    }

    @Override
    public InterfaceMenuItemC2741b setTooltipText(CharSequence charSequence) {
        this.f8916o = charSequence;
        return this;
    }

    @Override
    public MenuItem setIcon(int i7) {
        this.f8912k = androidx.core.content.a.e(this.f8913l, i7);
        c();
        return this;
    }

    @Override
    public MenuItem setShortcut(char c2, char c3, int i7, int i8) {
        this.f8908g = c2;
        this.f8909h = KeyEvent.normalizeMetaState(i7);
        this.f8910i = Character.toLowerCase(c3);
        this.f8911j = KeyEvent.normalizeMetaState(i8);
        return this;
    }
}
