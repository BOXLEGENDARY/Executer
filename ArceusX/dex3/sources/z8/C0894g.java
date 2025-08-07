package z8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.withpersona.sdk2.inquiry.governmentid.view.SpotlightView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import v8.C0824E;
import v8.C0825F;

public final class C0894g implements j1.a {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final Button b;

    @NonNull
    public final CheckBox c;

    @NonNull
    public final CoordinatorLayout d;

    @NonNull
    public final ConstraintLayout e;

    @NonNull
    public final TextView f;

    @NonNull
    public final ImageView g;

    @NonNull
    public final LinearLayout h;

    @NonNull
    public final View i;

    @NonNull
    public final Flow j;

    @NonNull
    public final Pi2NavigationBar k;

    @NonNull
    public final View l;

    @NonNull
    public final ImageView m;

    @NonNull
    public final ConstraintLayout n;

    @NonNull
    public final ThemeableLottieAnimationView o;

    @NonNull
    public final ConstraintLayout p;

    @NonNull
    public final TextView q;

    @NonNull
    public final FrameLayout r;

    @NonNull
    public final ProgressBar s;

    @NonNull
    public final Button t;

    @NonNull
    public final ImageView u;

    @NonNull
    public final SpotlightView v;

    @NonNull
    public final SpotlightView w;

    @NonNull
    public final TextView x;

    private C0894g(@NonNull FrameLayout frameLayout, @NonNull Button button, @NonNull CheckBox checkBox, @NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull Flow flow, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull View view2, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout3, @NonNull TextView textView2, @NonNull FrameLayout frameLayout2, @NonNull ProgressBar progressBar, @NonNull Button button2, @NonNull ImageView imageView3, @NonNull SpotlightView spotlightView, @NonNull SpotlightView spotlightView2, @NonNull TextView textView3) {
        this.a = frameLayout;
        this.b = button;
        this.c = checkBox;
        this.d = coordinatorLayout;
        this.e = constraintLayout;
        this.f = textView;
        this.g = imageView;
        this.h = linearLayout;
        this.i = view;
        this.j = flow;
        this.k = pi2NavigationBar;
        this.l = view2;
        this.m = imageView2;
        this.n = constraintLayout2;
        this.o = themeableLottieAnimationView;
        this.p = constraintLayout3;
        this.q = textView2;
        this.r = frameLayout2;
        this.s = progressBar;
        this.t = button2;
        this.u = imageView3;
        this.v = spotlightView;
        this.w = spotlightView2;
        this.x = textView3;
    }

    @NonNull
    public static C0894g b(@NonNull View view) {
        CoordinatorLayout coordinatorLayoutA;
        ConstraintLayout constraintLayoutA;
        View viewA;
        Flow flowA;
        View viewA2;
        ConstraintLayout constraintLayoutA2;
        ConstraintLayout constraintLayoutA3;
        int i = C0824E.a;
        Button button = (Button) j1.b.a(view, i);
        if (button != null) {
            i = C0824E.c;
            CheckBox checkBox = (CheckBox) j1.b.a(view, i);
            if (checkBox != null && (coordinatorLayoutA = j1.b.a(view, (i = C0824E.l))) != null && (constraintLayoutA = j1.b.a(view, (i = C0824E.m))) != null) {
                i = C0824E.x;
                TextView textView = (TextView) j1.b.a(view, i);
                if (textView != null) {
                    i = C0824E.y;
                    ImageView imageView = (ImageView) j1.b.a(view, i);
                    if (imageView != null) {
                        i = C0824E.A;
                        LinearLayout linearLayout = (LinearLayout) j1.b.a(view, i);
                        if (linearLayout != null && (viewA = j1.b.a(view, (i = C0824E.D))) != null && (flowA = j1.b.a(view, (i = C0824E.F))) != null) {
                            i = C0824E.Y;
                            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                            if (pi2NavigationBar != null && (viewA2 = j1.b.a(view, (i = C0824E.Z))) != null) {
                                i = C0824E.a0;
                                ImageView imageView2 = (ImageView) j1.b.a(view, i);
                                if (imageView2 != null && (constraintLayoutA2 = j1.b.a(view, (i = C0824E.b0))) != null) {
                                    i = C0824E.c0;
                                    ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) j1.b.a(view, i);
                                    if (themeableLottieAnimationView != null && (constraintLayoutA3 = j1.b.a(view, (i = C0824E.d0))) != null) {
                                        i = C0824E.e0;
                                        TextView textView2 = (TextView) j1.b.a(view, i);
                                        if (textView2 != null) {
                                            i = C0824E.n0;
                                            FrameLayout frameLayout = (FrameLayout) j1.b.a(view, i);
                                            if (frameLayout != null) {
                                                i = C0824E.o0;
                                                ProgressBar progressBar = (ProgressBar) j1.b.a(view, i);
                                                if (progressBar != null) {
                                                    i = C0824E.r0;
                                                    Button button2 = (Button) j1.b.a(view, i);
                                                    if (button2 != null) {
                                                        i = C0824E.s0;
                                                        ImageView imageView3 = (ImageView) j1.b.a(view, i);
                                                        if (imageView3 != null) {
                                                            i = C0824E.w0;
                                                            SpotlightView spotlightView = (SpotlightView) j1.b.a(view, i);
                                                            if (spotlightView != null) {
                                                                i = C0824E.x0;
                                                                SpotlightView spotlightView2 = (SpotlightView) j1.b.a(view, i);
                                                                if (spotlightView2 != null) {
                                                                    i = C0824E.D0;
                                                                    TextView textView3 = (TextView) j1.b.a(view, i);
                                                                    if (textView3 != null) {
                                                                        return new C0894g((FrameLayout) view, button, checkBox, coordinatorLayoutA, constraintLayoutA, textView, imageView, linearLayout, viewA, flowA, pi2NavigationBar, viewA2, imageView2, constraintLayoutA2, themeableLottieAnimationView, constraintLayoutA3, textView2, frameLayout, progressBar, button2, imageView3, spotlightView, spotlightView2, textView3);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static C0894g d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0825F.g, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public FrameLayout a() {
        return this.a;
    }
}
