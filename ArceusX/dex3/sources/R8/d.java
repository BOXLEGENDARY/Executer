package r8;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import q8.C0740f;

public final class d implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final MaterialCardView b;

    @NonNull
    public final TextView c;

    @NonNull
    public final ImageView d;

    @NonNull
    public final LinearLayout e;

    @NonNull
    public final CircularProgressIndicator f;

    @NonNull
    public final ThemeableLottieAnimationView g;

    private d(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCardView materialCardView, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull CircularProgressIndicator circularProgressIndicator, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView) {
        this.a = constraintLayout;
        this.b = materialCardView;
        this.c = textView;
        this.d = imageView;
        this.e = linearLayout;
        this.f = circularProgressIndicator;
        this.g = themeableLottieAnimationView;
    }

    @NonNull
    public static d b(@NonNull View view) {
        CircularProgressIndicator circularProgressIndicatorA;
        int i = C0740f.e;
        MaterialCardView materialCardViewA = j1.b.a(view, i);
        if (materialCardViewA != null) {
            i = C0740f.h;
            TextView textView = (TextView) j1.b.a(view, i);
            if (textView != null) {
                i = C0740f.i;
                ImageView imageView = (ImageView) j1.b.a(view, i);
                if (imageView != null) {
                    i = C0740f.j;
                    LinearLayout linearLayout = (LinearLayout) j1.b.a(view, i);
                    if (linearLayout != null && (circularProgressIndicatorA = j1.b.a(view, (i = C0740f.l))) != null) {
                        i = C0740f.o;
                        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) j1.b.a(view, i);
                        if (themeableLottieAnimationView != null) {
                            return new d((ConstraintLayout) view, materialCardViewA, textView, imageView, linearLayout, circularProgressIndicatorA, themeableLottieAnimationView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public ConstraintLayout a() {
        return this.a;
    }
}
