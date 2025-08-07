package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public final class c implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextInputLayout b;

    @NonNull
    public final TextInputEditText c;

    @NonNull
    public final TextInputLayout d;

    @NonNull
    public final TextInputLayout e;

    @NonNull
    public final TextInputEditText f;

    @NonNull
    public final TextInputLayout g;

    private c(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputLayout textInputLayout4) {
        this.a = constraintLayout;
        this.b = textInputLayout;
        this.c = textInputEditText;
        this.d = textInputLayout2;
        this.e = textInputLayout3;
        this.f = textInputEditText2;
        this.g = textInputLayout4;
    }

    @NonNull
    public static c b(@NonNull View view) {
        TextInputEditText textInputEditTextA;
        TextInputLayout textInputLayoutA;
        TextInputLayout textInputLayoutA2;
        TextInputEditText textInputEditTextA2;
        TextInputLayout textInputLayoutA3;
        int i = l9.d.G;
        TextInputLayout textInputLayoutA4 = j1.b.a(view, i);
        if (textInputLayoutA4 == null || (textInputEditTextA = j1.b.a(view, (i = l9.d.H))) == null || (textInputLayoutA = j1.b.a(view, (i = l9.d.L))) == null || (textInputLayoutA2 = j1.b.a(view, (i = l9.d.u0))) == null || (textInputEditTextA2 = j1.b.a(view, (i = l9.d.v0))) == null || (textInputLayoutA3 = j1.b.a(view, (i = l9.d.B0))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        return new c((ConstraintLayout) view, textInputLayoutA4, textInputEditTextA, textInputLayoutA, textInputLayoutA2, textInputEditTextA2, textInputLayoutA3);
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static c e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.c, viewGroup, false);
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
