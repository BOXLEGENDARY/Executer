package z8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import v8.C0824E;
import v8.C0825F;

public final class C0893f implements j1.a {

    @NonNull
    private final CoordinatorLayout a;

    @NonNull
    public final Barrier b;

    @NonNull
    public final ConstraintLayout c;

    @NonNull
    public final ImageView d;

    @NonNull
    public final View e;

    @NonNull
    public final Pi2NavigationBar f;

    @NonNull
    public final RecyclerView g;

    @NonNull
    public final TextView h;

    @NonNull
    public final TextView i;

    @NonNull
    public final TextView j;

    @NonNull
    public final TextView k;

    private C0893f(@NonNull CoordinatorLayout coordinatorLayout, @NonNull Barrier barrier, @NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull View view, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4) {
        this.a = coordinatorLayout;
        this.b = barrier;
        this.c = constraintLayout;
        this.d = imageView;
        this.e = view;
        this.f = pi2NavigationBar;
        this.g = recyclerView;
        this.h = textView;
        this.i = textView2;
        this.j = textView3;
        this.k = textView4;
    }

    @NonNull
    public static C0893f b(@NonNull View view) {
        ConstraintLayout constraintLayoutA;
        View viewA;
        RecyclerView recyclerViewA;
        int i = C0824E.G;
        Barrier barrierA = j1.b.a(view, i);
        if (barrierA != null && (constraintLayoutA = j1.b.a(view, (i = C0824E.H))) != null) {
            i = C0824E.T;
            ImageView imageView = (ImageView) j1.b.a(view, i);
            if (imageView != null && (viewA = j1.b.a(view, (i = C0824E.W))) != null) {
                i = C0824E.Y;
                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                if (pi2NavigationBar != null && (recyclerViewA = j1.b.a(view, (i = C0824E.q0))) != null) {
                    i = C0824E.y0;
                    TextView textView = (TextView) j1.b.a(view, i);
                    if (textView != null) {
                        i = C0824E.z0;
                        TextView textView2 = (TextView) j1.b.a(view, i);
                        if (textView2 != null) {
                            i = C0824E.A0;
                            TextView textView3 = (TextView) j1.b.a(view, i);
                            if (textView3 != null) {
                                i = C0824E.B0;
                                TextView textView4 = (TextView) j1.b.a(view, i);
                                if (textView4 != null) {
                                    return new C0893f((CoordinatorLayout) view, barrierA, constraintLayoutA, imageView, viewA, pi2NavigationBar, recyclerViewA, textView, textView2, textView3, textView4);
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
    public static C0893f d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0825F.f, viewGroup, false);
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
