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

public final class f implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView b;

    @NonNull
    public final TextInputLayout c;

    @NonNull
    public final TextInputEditText d;

    @NonNull
    public final TextView e;

    @NonNull
    public final TextInputLayout f;

    @NonNull
    public final AutoCompleteTextView g;

    @NonNull
    public final TextInputLayout h;

    @NonNull
    public final TextInputEditText i;

    private f(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout, @NonNull TextInputEditText textInputEditText, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout2, @NonNull AutoCompleteTextView autoCompleteTextView, @NonNull TextInputLayout textInputLayout3, @NonNull TextInputEditText textInputEditText2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textInputLayout;
        this.d = textInputEditText;
        this.e = textView2;
        this.f = textInputLayout2;
        this.g = autoCompleteTextView;
        this.h = textInputLayout3;
        this.i = textInputEditText2;
    }

    @NonNull
    public static f b(@NonNull View view) {
        TextInputLayout textInputLayoutA;
        TextInputEditText textInputEditTextA;
        TextInputLayout textInputLayoutA2;
        TextInputLayout textInputLayoutA3;
        TextInputEditText textInputEditTextA2;
        int i = l9.d.v;
        TextView textView = (TextView) j1.b.a(view, i);
        if (textView != null && (textInputLayoutA = j1.b.a(view, (i = l9.d.w))) != null && (textInputEditTextA = j1.b.a(view, (i = l9.d.x))) != null) {
            i = l9.d.E;
            TextView textView2 = (TextView) j1.b.a(view, i);
            if (textView2 != null && (textInputLayoutA2 = j1.b.a(view, (i = l9.d.Z))) != null) {
                i = l9.d.a0;
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) j1.b.a(view, i);
                if (autoCompleteTextView != null && (textInputLayoutA3 = j1.b.a(view, (i = l9.d.D0))) != null && (textInputEditTextA2 = j1.b.a(view, (i = l9.d.E0))) != null) {
                    return new f((ConstraintLayout) view, textView, textInputLayoutA, textInputEditTextA, textView2, textInputLayoutA2, autoCompleteTextView, textInputLayoutA3, textInputEditTextA2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static f e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.f, viewGroup, false);
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
