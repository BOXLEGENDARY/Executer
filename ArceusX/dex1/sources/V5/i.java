package V5;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.Toolbar;
import com.roblox.client.a0;
import com.roblox.client.q0;

public class i {
    public static void a(Toolbar toolbar, Context context, int i7, int i8) {
        View viewFindViewById = toolbar.findViewById(i7);
        if (viewFindViewById != null) {
            ActionMenuView.LayoutParams layoutParams = (ActionMenuView.LayoutParams) viewFindViewById.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).width = (int) q0.f(context, i8);
            viewFindViewById.setLayoutParams(layoutParams);
        }
    }

    public static void b(Toolbar toolbar, View.OnClickListener onClickListener) {
        toolbar.setNavigationOnClickListener(onClickListener);
    }

    public static void c(Toolbar toolbar, boolean z7) {
        if (a0.l0() || z7) {
            toolbar.setSubtitle(toolbar.getContext() != null ? a0.d(toolbar.getContext()) : null);
        }
    }

    public static void d(Toolbar toolbar, int i7) {
        for (int i8 = 0; i8 < toolbar.getChildCount(); i8++) {
            View childAt = toolbar.getChildAt(i8);
            if (childAt != null && childAt.getClass() == AppCompatImageButton.class) {
                ((AppCompatImageButton) childAt).setImageResource(i7);
            }
        }
    }

    public static void e(Toolbar toolbar, View.OnClickListener onClickListener) {
        f(toolbar, onClickListener, false);
    }

    public static void f(Toolbar toolbar, View.OnClickListener onClickListener, boolean z7) {
        c(toolbar, z7);
        b(toolbar, onClickListener);
    }
}
