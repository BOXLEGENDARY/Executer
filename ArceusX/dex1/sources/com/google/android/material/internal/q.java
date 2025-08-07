package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class q {

    private static final Comparator<View> f18174a = new a();

    class a implements Comparator<View> {
        a() {
        }

        @Override
        public int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    public static ActionMenuView a(Toolbar toolbar) {
        for (int i7 = 0; i7 < toolbar.getChildCount(); i7++) {
            View childAt = toolbar.getChildAt(i7);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    private static ImageView b(Toolbar toolbar, Drawable drawable) {
        ImageView imageView;
        Drawable drawable2;
        if (drawable == null) {
            return null;
        }
        for (int i7 = 0; i7 < toolbar.getChildCount(); i7++) {
            View childAt = toolbar.getChildAt(i7);
            if ((childAt instanceof ImageView) && (drawable2 = (imageView = (ImageView) childAt).getDrawable()) != null && drawable2.getConstantState() != null && drawable2.getConstantState().equals(drawable.getConstantState())) {
                return imageView;
            }
        }
        return null;
    }

    public static ImageView c(Toolbar toolbar) {
        return b(toolbar, toolbar.getLogo());
    }

    public static ImageButton d(Toolbar toolbar) {
        Drawable navigationIcon = toolbar.getNavigationIcon();
        if (navigationIcon == null) {
            return null;
        }
        for (int i7 = 0; i7 < toolbar.getChildCount(); i7++) {
            View childAt = toolbar.getChildAt(i7);
            if (childAt instanceof ImageButton) {
                ImageButton imageButton = (ImageButton) childAt;
                if (imageButton.getDrawable() == navigationIcon) {
                    return imageButton;
                }
            }
        }
        return null;
    }

    public static TextView e(Toolbar toolbar) {
        List<TextView> listF = f(toolbar, toolbar.getSubtitle());
        if (listF.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(listF, f18174a);
    }

    private static List<TextView> f(Toolbar toolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < toolbar.getChildCount(); i7++) {
            View childAt = toolbar.getChildAt(i7);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TextView g(Toolbar toolbar) {
        List<TextView> listF = f(toolbar, toolbar.getTitle());
        if (listF.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(listF, f18174a);
    }
}
