package N8;

import M8.m;
import M8.n;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import j1.b;

public final class a implements j1.a {

    @NonNull
    private final CoordinatorLayout a;

    @NonNull
    public final FrameLayout b;

    @NonNull
    public final ConstraintLayout c;

    @NonNull
    public final Button d;

    @NonNull
    public final Flow e;

    @NonNull
    public final TextView f;

    @NonNull
    public final TextView g;

    @NonNull
    public final Button h;

    @NonNull
    public final View i;

    private a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull Flow flow, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Button button2, @NonNull View view) {
        this.a = coordinatorLayout;
        this.b = frameLayout;
        this.c = constraintLayout;
        this.d = button;
        this.e = flow;
        this.f = textView;
        this.g = textView2;
        this.h = button2;
        this.i = view;
    }

    @NonNull
    public static a b(@NonNull View view) {
        ConstraintLayout constraintLayoutA;
        Flow flowA;
        View viewA;
        int i = m.a;
        FrameLayout frameLayout = (FrameLayout) b.a(view, i);
        if (frameLayout != null && (constraintLayoutA = b.a(view, (i = m.b))) != null) {
            i = m.c;
            Button button = (Button) b.a(view, i);
            if (button != null && (flowA = b.a(view, (i = m.d))) != null) {
                i = m.e;
                TextView textView = (TextView) b.a(view, i);
                if (textView != null) {
                    i = m.f;
                    TextView textView2 = (TextView) b.a(view, i);
                    if (textView2 != null) {
                        i = m.i;
                        Button button2 = (Button) b.a(view, i);
                        if (button2 != null && (viewA = b.a(view, (i = m.j))) != null) {
                            return new a((CoordinatorLayout) view, frameLayout, constraintLayoutA, button, flowA, textView, textView2, button2, viewA);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(n.a, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public CoordinatorLayout a() {
        return this.a;
    }
}
