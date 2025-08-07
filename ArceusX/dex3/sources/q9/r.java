package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;

public final class r implements j1.a {

    @NonNull
    private final TextInputLayout a;

    @NonNull
    public final TextInputLayout b;

    @NonNull
    public final AutoCompleteTextView c;

    private r(@NonNull TextInputLayout textInputLayout, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView) {
        this.a = textInputLayout;
        this.b = textInputLayout2;
        this.c = autoCompleteTextView;
    }

    @NonNull
    public static r b(@NonNull View view) {
        TextInputLayout textInputLayout = (TextInputLayout) view;
        int i = l9.d.z0;
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) j1.b.a(view, i);
        if (autoCompleteTextView != null) {
            return new r(textInputLayout, textInputLayout, autoCompleteTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static r d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static r e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.s, viewGroup, false);
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
