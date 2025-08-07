package androidx.appcompat.view.menu;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import r0.InterfaceMenuC2740a;

public class o extends c implements Menu {

    private final InterfaceMenuC2740a f9077d;

    public o(Context context, InterfaceMenuC2740a interfaceMenuC2740a) {
        super(context);
        if (interfaceMenuC2740a == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f9077d = interfaceMenuC2740a;
    }

    @Override
    public MenuItem add(CharSequence charSequence) {
        return c(this.f9077d.add(charSequence));
    }

    @Override
    public int addIntentOptions(int i7, int i8, int i9, ComponentName componentName, Intent[] intentArr, Intent intent, int i10, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f9077d.addIntentOptions(i7, i8, i9, componentName, intentArr, intent, i10, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i11 = 0; i11 < length; i11++) {
                menuItemArr[i11] = c(menuItemArr2[i11]);
            }
        }
        return iAddIntentOptions;
    }

    @Override
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f9077d.addSubMenu(charSequence));
    }

    @Override
    public void clear() {
        e();
        this.f9077d.clear();
    }

    @Override
    public void close() {
        this.f9077d.close();
    }

    @Override
    public MenuItem findItem(int i7) {
        return c(this.f9077d.findItem(i7));
    }

    @Override
    public MenuItem getItem(int i7) {
        return c(this.f9077d.getItem(i7));
    }

    @Override
    public boolean hasVisibleItems() {
        return this.f9077d.hasVisibleItems();
    }

    @Override
    public boolean isShortcutKey(int i7, KeyEvent keyEvent) {
        return this.f9077d.isShortcutKey(i7, keyEvent);
    }

    @Override
    public boolean performIdentifierAction(int i7, int i8) {
        return this.f9077d.performIdentifierAction(i7, i8);
    }

    @Override
    public boolean performShortcut(int i7, KeyEvent keyEvent, int i8) {
        return this.f9077d.performShortcut(i7, keyEvent, i8);
    }

    @Override
    public void removeGroup(int i7) {
        f(i7);
        this.f9077d.removeGroup(i7);
    }

    @Override
    public void removeItem(int i7) {
        g(i7);
        this.f9077d.removeItem(i7);
    }

    @Override
    public void setGroupCheckable(int i7, boolean z7, boolean z8) {
        this.f9077d.setGroupCheckable(i7, z7, z8);
    }

    @Override
    public void setGroupEnabled(int i7, boolean z7) {
        this.f9077d.setGroupEnabled(i7, z7);
    }

    @Override
    public void setGroupVisible(int i7, boolean z7) {
        this.f9077d.setGroupVisible(i7, z7);
    }

    @Override
    public void setQwertyMode(boolean z7) {
        this.f9077d.setQwertyMode(z7);
    }

    @Override
    public int size() {
        return this.f9077d.size();
    }

    @Override
    public MenuItem add(int i7) {
        return c(this.f9077d.add(i7));
    }

    @Override
    public SubMenu addSubMenu(int i7) {
        return d(this.f9077d.addSubMenu(i7));
    }

    @Override
    public MenuItem add(int i7, int i8, int i9, CharSequence charSequence) {
        return c(this.f9077d.add(i7, i8, i9, charSequence));
    }

    @Override
    public SubMenu addSubMenu(int i7, int i8, int i9, CharSequence charSequence) {
        return d(this.f9077d.addSubMenu(i7, i8, i9, charSequence));
    }

    @Override
    public MenuItem add(int i7, int i8, int i9, int i10) {
        return c(this.f9077d.add(i7, i8, i9, i10));
    }

    @Override
    public SubMenu addSubMenu(int i7, int i8, int i9, int i10) {
        return d(this.f9077d.addSubMenu(i7, i8, i9, i10));
    }
}
