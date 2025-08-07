package androidx.core.view;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MenuItem;
import r0.InterfaceMenuItemC2741b;

public final class A {

    static class a {
        static MenuItem a(MenuItem menuItem, char c2, int i7) {
            return menuItem.setAlphabeticShortcut(c2, i7);
        }

        static MenuItem b(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        static MenuItem c(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        static MenuItem d(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        static MenuItem e(MenuItem menuItem, char c2, int i7) {
            return menuItem.setNumericShortcut(c2, i7);
        }

        static MenuItem f(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    public static MenuItem a(MenuItem menuItem, AbstractC1607b abstractC1607b) {
        if (menuItem instanceof InterfaceMenuItemC2741b) {
            return ((InterfaceMenuItemC2741b) menuItem).a(abstractC1607b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void b(MenuItem menuItem, char c2, int i7) {
        if (menuItem instanceof InterfaceMenuItemC2741b) {
            ((InterfaceMenuItemC2741b) menuItem).setAlphabeticShortcut(c2, i7);
        } else {
            a.a(menuItem, c2, i7);
        }
    }

    public static void c(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC2741b) {
            ((InterfaceMenuItemC2741b) menuItem).setContentDescription(charSequence);
        } else {
            a.b(menuItem, charSequence);
        }
    }

    public static void d(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof InterfaceMenuItemC2741b) {
            ((InterfaceMenuItemC2741b) menuItem).setIconTintList(colorStateList);
        } else {
            a.c(menuItem, colorStateList);
        }
    }

    public static void e(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof InterfaceMenuItemC2741b) {
            ((InterfaceMenuItemC2741b) menuItem).setIconTintMode(mode);
        } else {
            a.d(menuItem, mode);
        }
    }

    public static void f(MenuItem menuItem, char c2, int i7) {
        if (menuItem instanceof InterfaceMenuItemC2741b) {
            ((InterfaceMenuItemC2741b) menuItem).setNumericShortcut(c2, i7);
        } else {
            a.e(menuItem, c2, i7);
        }
    }

    public static void g(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof InterfaceMenuItemC2741b) {
            ((InterfaceMenuItemC2741b) menuItem).setTooltipText(charSequence);
        } else {
            a.f(menuItem, charSequence);
        }
    }
}
