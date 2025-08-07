package r8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import q8.C0740f;
import q8.C0741g;

public final class C0743a implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout b;

    @NonNull
    public final TextView c;

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final Pi2NavigationBar e;

    @NonNull
    public final ThemeableLottieAnimationView f;

    @NonNull
    public final TextView g;

    private C0743a(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull TextView textView2) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = textView;
        this.d = constraintLayout3;
        this.e = pi2NavigationBar;
        this.f = themeableLottieAnimationView;
        this.g = textView2;
    }

    @NonNull
    public static C0743a b(@NonNull View view) {
        ConstraintLayout constraintLayoutA;
        int i = C0740f.b;
        ConstraintLayout constraintLayoutA2 = j1.b.a(view, i);
        if (constraintLayoutA2 != null) {
            i = C0740f.c;
            TextView textView = (TextView) j1.b.a(view, i);
            if (textView != null && (constraintLayoutA = j1.b.a(view, (i = C0740f.f))) != null) {
                i = C0740f.m;
                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                if (pi2NavigationBar != null) {
                    i = C0740f.n;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) j1.b.a(view, i);
                    if (themeableLottieAnimationView != null) {
                        i = C0740f.s;
                        TextView textView2 = (TextView) j1.b.a(view, i);
                        if (textView2 != null) {
                            return new C0743a((ConstraintLayout) view, constraintLayoutA2, textView, constraintLayoutA, pi2NavigationBar, themeableLottieAnimationView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static C0743a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0741g.a, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public ConstraintLayout a() {
        return this.a;
    }
}
