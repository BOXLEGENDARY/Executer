package z8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import v8.C0824E;
import v8.C0825F;

public final class C0888a implements j1.a {

    @NonNull
    private final CoordinatorLayout a;

    @NonNull
    public final LinearLayout b;

    @NonNull
    public final Button c;

    @NonNull
    public final ThemeableLottieAnimationView d;

    @NonNull
    public final Pi2NavigationBar e;

    @NonNull
    public final TextView f;

    private C0888a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView) {
        this.a = coordinatorLayout;
        this.b = linearLayout;
        this.c = button;
        this.d = themeableLottieAnimationView;
        this.e = pi2NavigationBar;
        this.f = textView;
    }

    @NonNull
    public static C0888a b(@NonNull View view) {
        int i = C0824E.t;
        LinearLayout linearLayout = (LinearLayout) j1.b.a(view, i);
        if (linearLayout != null) {
            i = C0824E.u;
            Button button = (Button) j1.b.a(view, i);
            if (button != null) {
                i = C0824E.P;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) j1.b.a(view, i);
                if (themeableLottieAnimationView != null) {
                    i = C0824E.Y;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                    if (pi2NavigationBar != null) {
                        i = C0824E.D0;
                        TextView textView = (TextView) j1.b.a(view, i);
                        if (textView != null) {
                            return new C0888a((CoordinatorLayout) view, linearLayout, button, themeableLottieAnimationView, pi2NavigationBar, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static C0888a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0825F.a, viewGroup, false);
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
