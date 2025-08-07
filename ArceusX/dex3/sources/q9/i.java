package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;

public final class i implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final MaterialCheckBox b;

    @NonNull
    public final TextView c;

    @NonNull
    public final TextView d;

    @NonNull
    public final TextView e;

    private i(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.a = constraintLayout;
        this.b = materialCheckBox;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
    }

    @NonNull
    public static i b(@NonNull View view) {
        int i = l9.d.o;
        MaterialCheckBox materialCheckBoxA = j1.b.a(view, i);
        if (materialCheckBoxA != null) {
            i = l9.d.p;
            TextView textView = (TextView) j1.b.a(view, i);
            if (textView != null) {
                i = l9.d.q;
                TextView textView2 = (TextView) j1.b.a(view, i);
                if (textView2 != null) {
                    i = l9.d.u;
                    TextView textView3 = (TextView) j1.b.a(view, i);
                    if (textView3 != null) {
                        return new i((ConstraintLayout) view, materialCheckBoxA, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static i d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static i e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.j, viewGroup, false);
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
