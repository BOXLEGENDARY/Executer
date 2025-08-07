package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;

public final class e implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final Guideline b;

    @NonNull
    public final Guideline c;

    private e(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull Guideline guideline2) {
        this.a = constraintLayout;
        this.b = guideline;
        this.c = guideline2;
    }

    @NonNull
    public static e b(@NonNull View view) {
        Guideline guidelineA;
        int i = l9.d.W;
        Guideline guidelineA2 = j1.b.a(view, i);
        if (guidelineA2 == null || (guidelineA = j1.b.a(view, (i = l9.d.r0))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        return new e((ConstraintLayout) view, guidelineA2, guidelineA);
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static e e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.e, viewGroup, false);
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
