package z8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;
import v8.C0824E;
import v8.C0825F;

public final class i implements j1.a {

    @NonNull
    private final CoordinatorLayout a;

    @NonNull
    public final LinearLayout b;

    @NonNull
    public final Button c;

    @NonNull
    public final TextInputLayout d;

    @NonNull
    public final TextView e;

    @NonNull
    public final TextInputLayout f;

    @NonNull
    public final TextView g;

    @NonNull
    public final Pi2NavigationBar h;

    @NonNull
    public final TextView i;

    private i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull LinearLayout linearLayout, @NonNull Button button, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull TextView textView2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull TextView textView3) {
        this.a = coordinatorLayout;
        this.b = linearLayout;
        this.c = button;
        this.d = textInputLayout;
        this.e = textView;
        this.f = textInputLayout2;
        this.g = textView2;
        this.h = pi2NavigationBar;
        this.i = textView3;
    }

    @NonNull
    public static i b(@NonNull View view) {
        TextInputLayout textInputLayoutA;
        TextInputLayout textInputLayoutA2;
        int i = C0824E.t;
        LinearLayout linearLayout = (LinearLayout) j1.b.a(view, i);
        if (linearLayout != null) {
            i = C0824E.u;
            Button button = (Button) j1.b.a(view, i);
            if (button != null && (textInputLayoutA = j1.b.a(view, (i = C0824E.v))) != null) {
                i = C0824E.w;
                TextView textView = (TextView) j1.b.a(view, i);
                if (textView != null && (textInputLayoutA2 = j1.b.a(view, (i = C0824E.L))) != null) {
                    i = C0824E.M;
                    TextView textView2 = (TextView) j1.b.a(view, i);
                    if (textView2 != null) {
                        i = C0824E.Y;
                        Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
                        if (pi2NavigationBar != null) {
                            i = C0824E.D0;
                            TextView textView3 = (TextView) j1.b.a(view, i);
                            if (textView3 != null) {
                                return new i((CoordinatorLayout) view, linearLayout, button, textInputLayoutA, textView, textInputLayoutA2, textView2, pi2NavigationBar, textView3);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static i d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0825F.j, viewGroup, false);
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
