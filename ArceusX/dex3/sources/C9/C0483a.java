package c9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import ha.C0470o;
import ha.C0471p;

public final class C0483a implements j1.a {

    @NonNull
    private final CoordinatorLayout a;

    @NonNull
    public final ConstraintLayout b;

    @NonNull
    public final FrameLayout c;

    @NonNull
    public final NestedScrollView d;

    @NonNull
    public final View e;

    private C0483a(@NonNull CoordinatorLayout coordinatorLayout, @NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull NestedScrollView nestedScrollView, @NonNull View view) {
        this.a = coordinatorLayout;
        this.b = constraintLayout;
        this.c = frameLayout;
        this.d = nestedScrollView;
        this.e = view;
    }

    @NonNull
    public static C0483a b(@NonNull View view) {
        NestedScrollView nestedScrollViewA;
        View viewA;
        int i = C0470o.a;
        ConstraintLayout constraintLayoutA = j1.b.a(view, i);
        if (constraintLayoutA != null) {
            i = C0470o.b;
            FrameLayout frameLayout = (FrameLayout) j1.b.a(view, i);
            if (frameLayout != null && (nestedScrollViewA = j1.b.a(view, (i = C0470o.c))) != null && (viewA = j1.b.a(view, (i = C0470o.l))) != null) {
                return new C0483a((CoordinatorLayout) view, constraintLayoutA, frameLayout, nestedScrollViewA, viewA);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static C0483a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0471p.a, viewGroup, false);
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
