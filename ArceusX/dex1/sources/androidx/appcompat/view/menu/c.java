package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import r0.InterfaceMenuItemC2741b;
import r0.InterfaceSubMenuC2742c;

abstract class c {

    final Context f8932a;

    private g0.k<InterfaceMenuItemC2741b, MenuItem> f8933b;

    private g0.k<InterfaceSubMenuC2742c, SubMenu> f8934c;

    c(Context context) {
        this.f8932a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof InterfaceMenuItemC2741b)) {
            return menuItem;
        }
        InterfaceMenuItemC2741b interfaceMenuItemC2741b = (InterfaceMenuItemC2741b) menuItem;
        if (this.f8933b == null) {
            this.f8933b = new g0.k<>();
        }
        MenuItem menuItem2 = this.f8933b.get(interfaceMenuItemC2741b);
        if (menuItem2 != null) {
            return menuItem2;
        }
        j jVar = new j(this.f8932a, interfaceMenuItemC2741b);
        this.f8933b.put(interfaceMenuItemC2741b, jVar);
        return jVar;
    }

    final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC2742c)) {
            return subMenu;
        }
        InterfaceSubMenuC2742c interfaceSubMenuC2742c = (InterfaceSubMenuC2742c) subMenu;
        if (this.f8934c == null) {
            this.f8934c = new g0.k<>();
        }
        SubMenu subMenu2 = this.f8934c.get(interfaceSubMenuC2742c);
        if (subMenu2 != null) {
            return subMenu2;
        }
        s sVar = new s(this.f8932a, interfaceSubMenuC2742c);
        this.f8934c.put(interfaceSubMenuC2742c, sVar);
        return sVar;
    }

    final void e() {
        g0.k<InterfaceMenuItemC2741b, MenuItem> kVar = this.f8933b;
        if (kVar != null) {
            kVar.clear();
        }
        g0.k<InterfaceSubMenuC2742c, SubMenu> kVar2 = this.f8934c;
        if (kVar2 != null) {
            kVar2.clear();
        }
    }

    final void f(int i7) {
        if (this.f8933b == null) {
            return;
        }
        int i8 = 0;
        while (i8 < this.f8933b.getSize()) {
            if (this.f8933b.g(i8).getGroupId() == i7) {
                this.f8933b.i(i8);
                i8--;
            }
            i8++;
        }
    }

    final void g(int i7) {
        if (this.f8933b == null) {
            return;
        }
        for (int i8 = 0; i8 < this.f8933b.getSize(); i8++) {
            if (this.f8933b.g(i8).getItemId() == i7) {
                this.f8933b.i(i8);
                return;
            }
        }
    }
}
