package z8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.button.MaterialButton;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import v8.C0824E;
import v8.C0825F;

public final class C0891d implements j1.a {

    @NonNull
    private final CoordinatorLayout a;

    @NonNull
    public final TextView b;

    @NonNull
    public final MaterialButton c;

    @NonNull
    public final ThemeableLottieAnimationView d;

    @NonNull
    public final View e;

    @NonNull
    public final ConstraintLayout f;

    @NonNull
    public final CardView g;

    @NonNull
    public final Pi2NavigationBar h;

    @NonNull
    public final TextView i;

    @NonNull
    public final Button j;

    private C0891d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull MaterialButton materialButton, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull View view, @NonNull ConstraintLayout constraintLayout, @NonNull CardView cardView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView2, @NonNull Button button) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = materialButton;
        this.d = themeableLottieAnimationView;
        this.e = view;
        this.f = constraintLayout;
        this.g = cardView;
        this.h = pi2NavigationBar;
        this.i = textView2;
        this.j = button;
    }

    @NonNull
    public static C0891d b(@NonNull View view) {
        MaterialButton materialButtonA;
        View viewA;
        ConstraintLayout constraintLayoutA;
        CardView cardViewA;
        int i = C0824E.d;
        TextView textView = (TextView) j1.b.a(view, i);
        if (textView != null && (materialButtonA = j1.b.a(view, (i = C0824E.j))) != null) {
            i = C0824E.N;
            ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) j1.b.a(view, i);
            if (themeableLottieAnimationView != null && (viewA = j1.b.a(view, (i = C0824E.O))) != null && (constraintLayoutA = j1.b.a(view, (i = C0824E.S))) != null && (cardViewA = j1.b.a(view, (i = C0824E.X))) != null) {
                i = C0824E.Y;
                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                if (pi2NavigationBar != null) {
                    i = C0824E.D0;
                    TextView textView2 = (TextView) j1.b.a(view, i);
                    if (textView2 != null) {
                        i = C0824E.F0;
                        Button button = (Button) j1.b.a(view, i);
                        if (button != null) {
                            return new C0891d((CoordinatorLayout) view, textView, materialButtonA, themeableLottieAnimationView, viewA, constraintLayoutA, cardViewA, pi2NavigationBar, textView2, button);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static C0891d d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0825F.d, viewGroup, false);
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
