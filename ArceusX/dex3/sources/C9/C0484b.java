package c9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import ha.C0470o;
import ha.C0471p;

public final class C0484b implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final FrameLayout b;

    @NonNull
    public final NestedScrollView c;

    @NonNull
    public final FrameLayout d;

    @NonNull
    public final Pi2NavigationBar e;

    private C0484b(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull FrameLayout frameLayout2, @NonNull Pi2NavigationBar pi2NavigationBar) {
        this.a = constraintLayout;
        this.b = frameLayout;
        this.c = nestedScrollView;
        this.d = frameLayout2;
        this.e = pi2NavigationBar;
    }

    @NonNull
    public static C0484b b(@NonNull View view) {
        NestedScrollView nestedScrollViewA;
        int i = C0470o.b;
        FrameLayout frameLayout = (FrameLayout) j1.b.a(view, i);
        if (frameLayout != null && (nestedScrollViewA = j1.b.a(view, (i = C0470o.c))) != null) {
            i = C0470o.d;
            FrameLayout frameLayout2 = (FrameLayout) j1.b.a(view, i);
            if (frameLayout2 != null) {
                i = C0470o.g;
                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                if (pi2NavigationBar != null) {
                    return new C0484b((ConstraintLayout) view, frameLayout, nestedScrollViewA, frameLayout2, pi2NavigationBar);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static C0484b d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0471p.b, viewGroup, false);
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
