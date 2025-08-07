package r8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Guideline;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import q8.C0740f;
import q8.C0741g;

public final class c implements j1.a {

    @NonNull
    private final CoordinatorLayout a;

    @NonNull
    public final TextView b;

    @NonNull
    public final Guideline c;

    @NonNull
    public final TextView d;

    @NonNull
    public final Guideline e;

    @NonNull
    public final Pi2NavigationBar f;

    @NonNull
    public final RecyclerView g;

    @NonNull
    public final Guideline h;

    @NonNull
    public final Button i;

    @NonNull
    public final TextView j;

    private c(@NonNull CoordinatorLayout coordinatorLayout, @NonNull TextView textView, @NonNull Guideline guideline, @NonNull TextView textView2, @NonNull Guideline guideline2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull Guideline guideline3, @NonNull Button button, @NonNull TextView textView3) {
        this.a = coordinatorLayout;
        this.b = textView;
        this.c = guideline;
        this.d = textView2;
        this.e = guideline2;
        this.f = pi2NavigationBar;
        this.g = recyclerView;
        this.h = guideline3;
        this.i = button;
        this.j = textView3;
    }

    @NonNull
    public static c b(@NonNull View view) {
        Guideline guidelineA;
        Guideline guidelineA2;
        RecyclerView recyclerViewA;
        Guideline guidelineA3;
        int i = C0740f.c;
        TextView textView = (TextView) j1.b.a(view, i);
        if (textView != null && (guidelineA = j1.b.a(view, (i = C0740f.d))) != null) {
            i = C0740f.g;
            TextView textView2 = (TextView) j1.b.a(view, i);
            if (textView2 != null && (guidelineA2 = j1.b.a(view, (i = C0740f.k))) != null) {
                i = C0740f.m;
                Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                if (pi2NavigationBar != null && (recyclerViewA = j1.b.a(view, (i = C0740f.p))) != null && (guidelineA3 = j1.b.a(view, (i = C0740f.q))) != null) {
                    i = C0740f.r;
                    Button button = (Button) j1.b.a(view, i);
                    if (button != null) {
                        i = C0740f.s;
                        TextView textView3 = (TextView) j1.b.a(view, i);
                        if (textView3 != null) {
                            return new c((CoordinatorLayout) view, textView, guidelineA, textView2, guidelineA2, pi2NavigationBar, recyclerViewA, guidelineA3, button, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0741g.b, viewGroup, false);
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
