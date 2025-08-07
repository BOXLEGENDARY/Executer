package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import r0.InterfaceSubMenuC2742c;

class s extends o implements SubMenu {

    private final InterfaceSubMenuC2742c f9103e;

    s(Context context, InterfaceSubMenuC2742c interfaceSubMenuC2742c) {
        super(context, interfaceSubMenuC2742c);
        this.f9103e = interfaceSubMenuC2742c;
    }

    @Override
    public void clearHeader() {
        this.f9103e.clearHeader();
    }

    @Override
    public MenuItem getItem() {
        return c(this.f9103e.getItem());
    }

    @Override
    public SubMenu setHeaderIcon(int i7) {
        this.f9103e.setHeaderIcon(i7);
        return this;
    }

    @Override
    public SubMenu setHeaderTitle(int i7) {
        this.f9103e.setHeaderTitle(i7);
        return this;
    }

    @Override
    public SubMenu setHeaderView(View view) {
        this.f9103e.setHeaderView(view);
        return this;
    }

    @Override
    public SubMenu setIcon(int i7) {
        this.f9103e.setIcon(i7);
        return this;
    }

    @Override
    public SubMenu setHeaderIcon(Drawable drawable) {
        this.f9103e.setHeaderIcon(drawable);
        return this;
    }

    @Override
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f9103e.setHeaderTitle(charSequence);
        return this;
    }

    @Override
    public SubMenu setIcon(Drawable drawable) {
        this.f9103e.setIcon(drawable);
        return this;
    }
}
