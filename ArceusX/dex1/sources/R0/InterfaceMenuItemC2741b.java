package r0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import android.view.View;
import androidx.core.view.AbstractC1607b;

public interface InterfaceMenuItemC2741b extends MenuItem {
    InterfaceMenuItemC2741b a(AbstractC1607b abstractC1607b);

    AbstractC1607b b();

    @Override
    boolean collapseActionView();

    @Override
    boolean expandActionView();

    @Override
    View getActionView();

    @Override
    int getAlphabeticModifiers();

    @Override
    CharSequence getContentDescription();

    @Override
    ColorStateList getIconTintList();

    @Override
    PorterDuff.Mode getIconTintMode();

    @Override
    int getNumericModifiers();

    @Override
    CharSequence getTooltipText();

    @Override
    boolean isActionViewExpanded();

    @Override
    MenuItem setActionView(int i7);

    @Override
    MenuItem setActionView(View view);

    @Override
    MenuItem setAlphabeticShortcut(char c2, int i7);

    @Override
    InterfaceMenuItemC2741b setContentDescription(CharSequence charSequence);

    @Override
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override
    MenuItem setNumericShortcut(char c2, int i7);

    @Override
    MenuItem setShortcut(char c2, char c3, int i7, int i8);

    @Override
    void setShowAsAction(int i7);

    @Override
    MenuItem setShowAsActionFlags(int i7);

    @Override
    InterfaceMenuItemC2741b setTooltipText(CharSequence charSequence);
}
