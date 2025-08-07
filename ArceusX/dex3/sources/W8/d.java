package W8;

import V8.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2CircleMaskView;
import com.withpersona.sdk2.inquiry.selfie.view.Pi2ProgressArcView;
import com.withpersona.sdk2.inquiry.shared.ui.ThemeableLottieAnimationView;

public final class d implements j1.a {

    @NonNull
    private final View a;

    @NonNull
    public final View b;

    @NonNull
    public final Pi2CircleMaskView c;

    @NonNull
    public final ThemeableLottieAnimationView d;

    @NonNull
    public final ImageView e;

    @NonNull
    public final View f;

    @NonNull
    public final View g;

    @NonNull
    public final Pi2ProgressArcView h;

    private d(@NonNull View view, @NonNull View view2, @NonNull Pi2CircleMaskView pi2CircleMaskView, @NonNull ThemeableLottieAnimationView themeableLottieAnimationView, @NonNull ImageView imageView, @NonNull View view3, @NonNull View view4, @NonNull Pi2ProgressArcView pi2ProgressArcView) {
        this.a = view;
        this.b = view2;
        this.c = pi2CircleMaskView;
        this.d = themeableLottieAnimationView;
        this.e = imageView;
        this.f = view3;
        this.g = view4;
        this.h = pi2ProgressArcView;
    }

    @NonNull
    public static d b(@NonNull View view) {
        View viewA;
        View viewA2;
        int i = V8.g.b;
        View viewA3 = j1.b.a(view, i);
        if (viewA3 != null) {
            i = V8.g.h;
            Pi2CircleMaskView pi2CircleMaskView = (Pi2CircleMaskView) j1.b.a(view, i);
            if (pi2CircleMaskView != null) {
                i = V8.g.m;
                ThemeableLottieAnimationView themeableLottieAnimationView = (ThemeableLottieAnimationView) j1.b.a(view, i);
                if (themeableLottieAnimationView != null) {
                    i = V8.g.n;
                    ImageView imageView = (ImageView) j1.b.a(view, i);
                    if (imageView != null && (viewA = j1.b.a(view, (i = V8.g.p))) != null && (viewA2 = j1.b.a(view, (i = V8.g.r))) != null) {
                        i = V8.g.D;
                        Pi2ProgressArcView pi2ProgressArcView = (Pi2ProgressArcView) j1.b.a(view, i);
                        if (pi2ProgressArcView != null) {
                            return new d(view, viewA3, pi2CircleMaskView, themeableLottieAnimationView, imageView, viewA, viewA2, pi2ProgressArcView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static d c(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(h.d, viewGroup);
        return b(viewGroup);
    }

    @NonNull
    public View a() {
        return this.a;
    }
}
