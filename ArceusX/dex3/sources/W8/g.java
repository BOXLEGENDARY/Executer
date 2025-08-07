package W8;

import V8.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

public final class g implements j1.a {

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

    private g(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull TextView textView2) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = textView;
        this.d = constraintLayout3;
        this.e = pi2NavigationBar;
        this.f = themeableLottieAnimationView;
        this.g = textView2;
    }

    @NonNull
    public static g b(@NonNull View view) {
        ConstraintLayout constraintLayoutA;
        int i = V8.g.a;
        ConstraintLayout constraintLayoutA2 = j1.b.a(view, i);
        if (constraintLayoutA2 != null) {
            i = V8.g.c;
            TextView textView = (TextView) j1.b.a(view, i);
            if (textView != null && (constraintLayoutA = j1.b.a(view, (i = V8.g.i))) != null) {
                i = V8.g.x;
                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                if (pi2NavigationBar != null) {
                    i = V8.g.z;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) j1.b.a(view, i);
                    if (themeableLottieAnimationView != null) {
                        i = V8.g.M;
                        TextView textView2 = (TextView) j1.b.a(view, i);
                        if (textView2 != null) {
                            return new g((ConstraintLayout) view, constraintLayoutA2, textView, constraintLayoutA, pi2NavigationBar, themeableLottieAnimationView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static g d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(h.g, viewGroup, false);
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
