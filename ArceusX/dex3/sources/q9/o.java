package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public final class o implements j1.a {

    @NonNull
    private final TextInputLayout a;

    @NonNull
    public final TextInputEditText b;

    @NonNull
    public final TextInputLayout c;

    private o(@NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout2) {
        this.a = textInputLayout;
        this.b = textInputEditText;
        this.c = textInputLayout2;
    }

    @NonNull
    public static o b(@NonNull View view) {
        int i = l9.d.z;
        TextInputEditText textInputEditTextA = j1.b.a(view, i);
        if (textInputEditTextA == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new o(textInputLayout, textInputEditTextA, textInputLayout);
    }

    @NonNull
    public static o d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static o e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.o, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public TextInputLayout a() {
        return this.a;
    }
}
