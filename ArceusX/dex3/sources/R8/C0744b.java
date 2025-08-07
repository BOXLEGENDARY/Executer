package r8;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import q8.C0740f;

public final class C0744b implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ThemeableLottieAnimationView b;

    @NonNull
    public final MaterialCardView c;

    private C0744b(@NonNull ConstraintLayout constraintLayout, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull MaterialCardView materialCardView) {
        this.a = constraintLayout;
        this.b = themeableLottieAnimationView;
        this.c = materialCardView;
    }

    @NonNull
    public static C0744b b(@NonNull View view) {
        MaterialCardView materialCardViewA;
        int i = C0740f.a;
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) j1.b.a(view, i);
        if (themeableLottieAnimationView == null || (materialCardViewA = j1.b.a(view, (i = C0740f.e))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        return new C0744b((ConstraintLayout) view, themeableLottieAnimationView, materialCardViewA);
    }

    @NonNull
    public ConstraintLayout a() {
        return this.a;
    }
}
