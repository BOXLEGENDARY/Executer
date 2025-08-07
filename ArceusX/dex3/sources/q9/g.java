package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

public final class g implements j1.a {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final Guideline b;

    @NonNull
    public final LinearLayout c;

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final Guideline e;

    @NonNull
    public final View f;

    private g(@NonNull LinearLayout linearLayout, @NonNull Guideline guideline, @NonNull LinearLayout linearLayout2, @NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline2, @NonNull View view) {
        this.a = linearLayout;
        this.b = guideline;
        this.c = linearLayout2;
        this.d = constraintLayout;
        this.e = guideline2;
        this.f = view;
    }

    @NonNull
    public static g b(@NonNull View view) {
        Guideline guidelineA;
        View viewA;
        int i = l9.d.I;
        Guideline guidelineA2 = j1.b.a(view, i);
        if (guidelineA2 != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = l9.d.J;
            ConstraintLayout constraintLayoutA = j1.b.a(view, i);
            if (constraintLayoutA != null && (guidelineA = j1.b.a(view, (i = l9.d.K))) != null && (viewA = j1.b.a(view, (i = l9.d.M))) != null) {
                return new g(linearLayout, guidelineA2, linearLayout, constraintLayoutA, guidelineA, viewA);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static g d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static g e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.h, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public LinearLayout a() {
        return this.a;
    }
}
