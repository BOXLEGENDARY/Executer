package z8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import v8.C0824E;
import v8.C0825F;

public final class j implements j1.a {

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

    private j(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull TextView textView2) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = textView;
        this.d = constraintLayout3;
        this.e = pi2NavigationBar;
        this.f = themeableLottieAnimationView;
        this.g = textView2;
    }

    @NonNull
    public static j b(@NonNull View view) {
        ConstraintLayout constraintLayoutA;
        int i = C0824E.b;
        ConstraintLayout constraintLayoutA2 = j1.b.a(view, i);
        if (constraintLayoutA2 != null) {
            i = C0824E.d;
            TextView textView = (TextView) j1.b.a(view, i);
            if (textView != null && (constraintLayoutA = j1.b.a(view, (i = C0824E.s))) != null) {
                i = C0824E.Y;
                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                if (pi2NavigationBar != null) {
                    i = C0824E.f0;
                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) j1.b.a(view, i);
                    if (themeableLottieAnimationView != null) {
                        i = C0824E.D0;
                        TextView textView2 = (TextView) j1.b.a(view, i);
                        if (textView2 != null) {
                            return new j((ConstraintLayout) view, constraintLayoutA2, textView, constraintLayoutA, pi2NavigationBar, themeableLottieAnimationView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static j d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0825F.k, viewGroup, false);
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
