package W8;

import V8.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

public final class c implements j1.a {

    @NonNull
    private final ScrollView a;

    @NonNull
    public final Guideline b;

    @NonNull
    public final ConstraintLayout c;

    @NonNull
    public final ImageView d;

    @NonNull
    public final ThemeableLottieAnimationView e;

    @NonNull
    public final Guideline f;

    @NonNull
    public final Pi2NavigationBar g;

    @NonNull
    public final ConstraintLayout h;

    @NonNull
    public final Guideline i;

    @NonNull
    public final Button j;

    @NonNull
    public final TextView k;

    @NonNull
    public final TextView l;

    @NonNull
    public final TextView m;

    private c(@NonNull ScrollView scrollView, @NonNull Guideline guideline, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull Guideline guideline2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ConstraintLayout constraintLayout2, @NonNull Guideline guideline3, @NonNull Button button, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = scrollView;
        this.b = guideline;
        this.c = constraintLayout;
        this.d = imageView;
        this.e = themeableLottieAnimationView;
        this.f = guideline2;
        this.g = pi2NavigationBar;
        this.h = constraintLayout2;
        this.i = guideline3;
        this.j = button;
        this.k = textView;
        this.l = textView2;
        this.m = textView3;
    }

    @NonNull
    public static c b(@NonNull View view) {
        ConstraintLayout constraintLayoutA;
        Guideline guidelineA;
        ConstraintLayout constraintLayoutA2;
        Guideline guidelineA2;
        int i = V8.g.d;
        Guideline guidelineA3 = j1.b.a(view, i);
        if (guidelineA3 != null && (constraintLayoutA = j1.b.a(view, (i = V8.g.j))) != null) {
            i = V8.g.s;
            ImageView imageView = (ImageView) j1.b.a(view, i);
            if (imageView != null) {
                i = V8.g.u;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) j1.b.a(view, i);
                if (themeableLottieAnimationView != null && (guidelineA = j1.b.a(view, (i = V8.g.w))) != null) {
                    i = V8.g.x;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                    if (pi2NavigationBar != null && (constraintLayoutA2 = j1.b.a(view, (i = V8.g.y))) != null && (guidelineA2 = j1.b.a(view, (i = V8.g.G))) != null) {
                        i = V8.g.I;
                        Button button = (Button) j1.b.a(view, i);
                        if (button != null) {
                            i = V8.g.J;
                            TextView textView = (TextView) j1.b.a(view, i);
                            if (textView != null) {
                                i = V8.g.K;
                                TextView textView2 = (TextView) j1.b.a(view, i);
                                if (textView2 != null) {
                                    i = V8.g.L;
                                    TextView textView3 = (TextView) j1.b.a(view, i);
                                    if (textView3 != null) {
                                        return new c((ScrollView) view, guidelineA3, constraintLayoutA, imageView, themeableLottieAnimationView, guidelineA, pi2NavigationBar, constraintLayoutA2, guidelineA2, button, textView, textView2, textView3);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(h.c, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public ScrollView a() {
        return this.a;
    }
}
