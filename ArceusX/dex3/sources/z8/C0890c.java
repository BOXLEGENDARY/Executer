package z8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import v8.C0824E;
import v8.C0825F;

public final class C0890c implements j1.a {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final Space b;

    @NonNull
    public final FrameLayout c;

    @NonNull
    public final LinearLayout d;

    @NonNull
    public final Button e;

    @NonNull
    public final ConstraintLayout f;

    @NonNull
    public final ThemeableLottieAnimationView g;

    @NonNull
    public final ConstraintLayout h;

    @NonNull
    public final TextView i;

    @NonNull
    public final View j;

    @NonNull
    public final TextView k;

    @NonNull
    public final TextView l;

    private C0890c(@NonNull FrameLayout frameLayout, @NonNull Space space, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull ConstraintLayout constraintLayout, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull View view, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = frameLayout;
        this.b = space;
        this.c = frameLayout2;
        this.d = linearLayout;
        this.e = button;
        this.f = constraintLayout;
        this.g = themeableLottieAnimationView;
        this.h = constraintLayout2;
        this.i = textView;
        this.j = view;
        this.k = textView2;
        this.l = textView3;
    }

    @NonNull
    public static C0890c b(@NonNull View view) {
        ConstraintLayout constraintLayoutA;
        ConstraintLayout constraintLayoutA2;
        View viewA;
        int i = C0824E.e;
        Space space = (Space) j1.b.a(view, i);
        if (space != null) {
            i = C0824E.f;
            FrameLayout frameLayout = (FrameLayout) j1.b.a(view, i);
            if (frameLayout != null) {
                i = C0824E.g;
                LinearLayout linearLayout = (LinearLayout) j1.b.a(view, i);
                if (linearLayout != null) {
                    i = C0824E.n;
                    Button button = (Button) j1.b.a(view, i);
                    if (button != null && (constraintLayoutA = j1.b.a(view, (i = C0824E.s))) != null) {
                        i = C0824E.P;
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) j1.b.a(view, i);
                        if (themeableLottieAnimationView != null && (constraintLayoutA2 = j1.b.a(view, (i = C0824E.Q))) != null) {
                            i = C0824E.p0;
                            TextView textView = (TextView) j1.b.a(view, i);
                            if (textView != null && (viewA = j1.b.a(view, (i = C0824E.v0))) != null) {
                                i = C0824E.C0;
                                TextView textView2 = (TextView) j1.b.a(view, i);
                                if (textView2 != null) {
                                    i = C0824E.D0;
                                    TextView textView3 = (TextView) j1.b.a(view, i);
                                    if (textView3 != null) {
                                        return new C0890c((FrameLayout) view, space, frameLayout, linearLayout, button, constraintLayoutA, themeableLottieAnimationView, constraintLayoutA2, textView, viewA, textView2, textView3);
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
    public static C0890c d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0825F.c, viewGroup, false);
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
