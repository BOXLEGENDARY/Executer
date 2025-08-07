package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public final class p implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ConstraintLayout b;

    @NonNull
    public final TextInputLayout c;

    @NonNull
    public final AutoCompleteTextView d;

    @NonNull
    public final TextView e;

    @NonNull
    public final TextInputLayout f;

    @NonNull
    public final AutoCompleteTextView g;

    @NonNull
    public final TextView h;

    @NonNull
    public final TextInputLayout i;

    @NonNull
    public final TextInputEditText j;

    private p(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextInputLayout textInputLayout, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView2, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = textInputLayout;
        this.d = autoCompleteTextView;
        this.e = textView;
        this.f = textInputLayout2;
        this.g = autoCompleteTextView2;
        this.h = textView2;
        this.i = textInputLayout3;
        this.j = textInputEditText;
    }

    @NonNull
    public static p b(@NonNull View view) {
        TextInputLayout textInputLayoutA;
        TextInputLayout textInputLayoutA2;
        TextInputEditText textInputEditTextA;
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = l9.d.N;
        TextInputLayout textInputLayoutA3 = j1.b.a(view, i);
        if (textInputLayoutA3 != null) {
            i = l9.d.O;
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) j1.b.a(view, i);
            if (autoCompleteTextView != null) {
                i = l9.d.P;
                TextView textView = (TextView) j1.b.a(view, i);
                if (textView != null && (textInputLayoutA = j1.b.a(view, (i = l9.d.Q))) != null) {
                    i = l9.d.R;
                    AutoCompleteTextView autoCompleteTextView2 = (AutoCompleteTextView) j1.b.a(view, i);
                    if (autoCompleteTextView2 != null) {
                        i = l9.d.S;
                        TextView textView2 = (TextView) j1.b.a(view, i);
                        if (textView2 != null && (textInputLayoutA2 = j1.b.a(view, (i = l9.d.T))) != null && (textInputEditTextA = j1.b.a(view, (i = l9.d.U))) != null) {
                            return new p(constraintLayout, constraintLayout, textInputLayoutA3, autoCompleteTextView, textView, textInputLayoutA, autoCompleteTextView2, textView2, textInputLayoutA2, textInputEditTextA);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static p d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static p e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.q, viewGroup, false);
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
