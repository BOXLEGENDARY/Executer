package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.g;

public class r extends g implements SubMenu {

    private g f9101B;

    private i f9102C;

    public r(Context context, g gVar, i iVar) {
        super(context);
        this.f9101B = gVar;
        this.f9102C = iVar;
    }

    @Override
    public g D() {
        return this.f9101B.D();
    }

    @Override
    public boolean F() {
        return this.f9101B.F();
    }

    @Override
    public boolean G() {
        return this.f9101B.G();
    }

    @Override
    public boolean H() {
        return this.f9101B.H();
    }

    @Override
    public void R(g.a aVar) {
        this.f9101B.R(aVar);
    }

    public Menu e0() {
        return this.f9101B;
    }

    @Override
    public boolean f(i iVar) {
        return this.f9101B.f(iVar);
    }

    @Override
    public MenuItem getItem() {
        return this.f9102C;
    }

    @Override
    boolean h(g gVar, MenuItem menuItem) {
        return super.h(gVar, menuItem) || this.f9101B.h(gVar, menuItem);
    }

    @Override
    public boolean k(i iVar) {
        return this.f9101B.k(iVar);
    }

    @Override
    public void setGroupDividerEnabled(boolean z7) {
        this.f9101B.setGroupDividerEnabled(z7);
    }

    @Override
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.V(drawable);
    }

    @Override
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Y(charSequence);
    }

    @Override
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.Z(view);
    }

    @Override
    public SubMenu setIcon(Drawable drawable) {
        this.f9102C.setIcon(drawable);
        return this;
    }

    @Override
    public void setQwertyMode(boolean z7) {
        this.f9101B.setQwertyMode(z7);
    }

    @Override
    public String t() {
        i iVar = this.f9102C;
        int itemId = iVar != null ? iVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + ":" + itemId;
    }

    @Override
    public SubMenu setHeaderIcon(int i7) {
        return (SubMenu) super.U(i7);
    }

    @Override
    public SubMenu setHeaderTitle(int i7) {
        return (SubMenu) super.X(i7);
    }

    @Override
    public SubMenu setIcon(int i7) {
        this.f9102C.setIcon(i7);
        return this;
    }
}
