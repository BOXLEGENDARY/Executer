package x9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.divider.MaterialDivider;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import com.withpersona.sdk2.inquiry.steps.ui.view.ShadowedNestedScrollView;
import w9.c;
import w9.d;

public final class a implements j1.a {

    @NonNull
    private final CoordinatorLayout a;

    @NonNull
    public final ConstraintLayout b;

    @NonNull
    public final FrameLayout c;

    @NonNull
    public final MaterialDivider d;

    @NonNull
    public final LinearLayout e;

    @NonNull
    public final CoordinatorLayout f;

    @NonNull
    public final View g;

    @NonNull
    public final NestedScrollView h;

    @NonNull
    public final Pi2NavigationBar i;

    @NonNull
    public final ShadowedNestedScrollView j;

    @NonNull
    public final ConstraintLayout k;

    @NonNull
    public final FrameLayout l;

    private a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull MaterialDivider materialDivider, @NonNull LinearLayout linearLayout, @NonNull CoordinatorLayout coordinatorLayout2, @NonNull View view, @NonNull NestedScrollView nestedScrollView, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull ShadowedNestedScrollView shadowedNestedScrollView, @NonNull ConstraintLayout constraintLayout2, @NonNull FrameLayout frameLayout2) {
        this.a = coordinatorLayout;
        this.b = constraintLayout;
        this.c = frameLayout;
        this.d = materialDivider;
        this.e = linearLayout;
        this.f = coordinatorLayout2;
        this.g = view;
        this.h = nestedScrollView;
        this.i = pi2NavigationBar;
        this.j = shadowedNestedScrollView;
        this.k = constraintLayout2;
        this.l = frameLayout2;
    }

    @NonNull
    public static a b(@NonNull View view) {
        MaterialDivider materialDividerA;
        CoordinatorLayout coordinatorLayoutA;
        View viewA;
        NestedScrollView nestedScrollViewA;
        ConstraintLayout constraintLayoutA;
        int i = c.d;
        ConstraintLayout constraintLayoutA2 = j1.b.a(view, i);
        if (constraintLayoutA2 != null) {
            i = c.f;
            FrameLayout frameLayout = (FrameLayout) j1.b.a(view, i);
            if (frameLayout != null && (materialDividerA = j1.b.a(view, (i = c.g))) != null) {
                i = c.h;
                LinearLayout linearLayout = (LinearLayout) j1.b.a(view, i);
                if (linearLayout != null && (coordinatorLayoutA = j1.b.a(view, (i = c.i))) != null && (viewA = j1.b.a(view, (i = c.j))) != null && (nestedScrollViewA = j1.b.a(view, (i = c.l))) != null) {
                    i = c.m;
                    Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                    if (pi2NavigationBar != null) {
                        i = c.n;
                        ShadowedNestedScrollView shadowedNestedScrollView = (ShadowedNestedScrollView) j1.b.a(view, i);
                        if (shadowedNestedScrollView != null && (constraintLayoutA = j1.b.a(view, (i = c.o))) != null) {
                            i = c.v;
                            FrameLayout frameLayout2 = (FrameLayout) j1.b.a(view, i);
                            if (frameLayout2 != null) {
                                return new a((CoordinatorLayout) view, constraintLayoutA2, frameLayout, materialDividerA, linearLayout, coordinatorLayoutA, viewA, nestedScrollViewA, pi2NavigationBar, shadowedNestedScrollView, constraintLayoutA, frameLayout2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static a e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(d.a, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public CoordinatorLayout a() {
        return this.a;
    }
}
