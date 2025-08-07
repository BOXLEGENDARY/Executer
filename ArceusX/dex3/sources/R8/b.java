package R8;

import Q8.q;
import Q8.r;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public final class b implements j1.a {

    @NonNull
    private final CoordinatorLayout a;

    @NonNull
    public final FrameLayout b;

    @NonNull
    public final ConstraintLayout c;

    @NonNull
    public final Flow d;

    @NonNull
    public final TextView e;

    @NonNull
    public final Button f;

    @NonNull
    public final Button g;

    @NonNull
    public final View h;

    @NonNull
    public final TextView i;

    private b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout, @NonNull Flow flow, @NonNull TextView textView, @NonNull Button button, @NonNull Button button2, @NonNull View view, @NonNull TextView textView2) {
        this.a = coordinatorLayout;
        this.b = frameLayout;
        this.c = constraintLayout;
        this.d = flow;
        this.e = textView;
        this.f = button;
        this.g = button2;
        this.h = view;
        this.i = textView2;
    }

    @NonNull
    public static b b(@NonNull View view) {
        ConstraintLayout constraintLayoutA;
        Flow flowA;
        View viewA;
        int i = q.a;
        FrameLayout frameLayout = (FrameLayout) j1.b.a(view, i);
        if (frameLayout != null && (constraintLayoutA = j1.b.a(view, (i = q.b))) != null && (flowA = j1.b.a(view, (i = q.c))) != null) {
            i = q.d;
            TextView textView = (TextView) j1.b.a(view, i);
            if (textView != null) {
                i = q.e;
                Button button = (Button) j1.b.a(view, i);
                if (button != null) {
                    i = q.f;
                    Button button2 = (Button) j1.b.a(view, i);
                    if (button2 != null && (viewA = j1.b.a(view, (i = q.g))) != null) {
                        i = q.h;
                        TextView textView2 = (TextView) j1.b.a(view, i);
                        if (textView2 != null) {
                            return new b((CoordinatorLayout) view, frameLayout, constraintLayoutA, flowA, textView, button, button2, viewA, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(r.b, viewGroup, false);
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
