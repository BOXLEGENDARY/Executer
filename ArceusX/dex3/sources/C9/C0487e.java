package c9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;
import ha.C0471p;

public final class C0487e implements j1.a {

    @NonNull
    private final ThemeableLottieAnimationView a;

    @NonNull
    public final ThemeableLottieAnimationView b;

    private C0487e(@NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView2) {
        this.a = themeableLottieAnimationView;
        this.b = themeableLottieAnimationView2;
    }

    @NonNull
    public static C0487e b(@NonNull View view) {
        if (view == 0) {
            throw new NullPointerException("rootView");
        }
        ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) view;
        return new C0487e(themeableLottieAnimationView, themeableLottieAnimationView);
    }

    @NonNull
    public static C0487e d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static C0487e e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0471p.e, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public ThemeableLottieAnimationView a() {
        return this.a;
    }
}
