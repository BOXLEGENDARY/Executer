package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.radiobutton.MaterialRadioButton;

public final class b implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final MaterialRadioButton b;

    @NonNull
    public final TextView c;

    @NonNull
    public final TextView d;

    private b(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialRadioButton materialRadioButton, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = constraintLayout;
        this.b = materialRadioButton;
        this.c = textView;
        this.d = textView2;
    }

    @NonNull
    public static b b(@NonNull View view) {
        int i = l9.d.k0;
        MaterialRadioButton materialRadioButtonA = j1.b.a(view, i);
        if (materialRadioButtonA != null) {
            i = l9.d.m0;
            TextView textView = (TextView) j1.b.a(view, i);
            if (textView != null) {
                i = l9.d.n0;
                TextView textView2 = (TextView) j1.b.a(view, i);
                if (textView2 != null) {
                    return new b((ConstraintLayout) view, materialRadioButtonA, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.b, viewGroup, false);
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
