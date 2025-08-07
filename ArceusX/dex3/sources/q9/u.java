package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;

public final class u implements j1.a {

    @NonNull
    private final TextInputLayout a;

    @NonNull
    public final TextInputLayout b;

    private u(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2) {
        this.a = textInputLayout;
        this.b = textInputLayout2;
    }

    @NonNull
    public static u b(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextInputLayout textInputLayout = (TextInputLayout) view;
        return new u(textInputLayout, textInputLayout);
    }

    @NonNull
    public static u d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static u e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.v, viewGroup, false);
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
