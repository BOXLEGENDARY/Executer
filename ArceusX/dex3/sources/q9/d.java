package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public final class d implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextInputLayout b;

    @NonNull
    public final TextView c;

    @NonNull
    public final TextInputLayout d;

    @NonNull
    public final MaterialAutoCompleteTextView e;

    @NonNull
    public final TextInputLayout f;

    @NonNull
    public final MaterialAutoCompleteTextView g;

    @NonNull
    public final ConstraintLayout h;

    @NonNull
    public final ConstraintLayout i;

    @NonNull
    public final ConstraintLayout j;

    @NonNull
    public final TextView k;

    @NonNull
    public final TextInputLayout l;

    @NonNull
    public final TextInputLayout m;

    @NonNull
    public final TextInputLayout n;

    @NonNull
    public final TextInputEditText o;

    @NonNull
    public final TextInputEditText p;

    @NonNull
    public final TextInputEditText q;

    @NonNull
    public final TextInputEditText r;

    @NonNull
    public final CircularProgressIndicator s;

    private d(@NonNull ConstraintLayout constraintLayout, @NonNull TextInputLayout textInputLayout, @NonNull TextView textView, @NonNull TextInputLayout textInputLayout2, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView, @NonNull TextInputLayout textInputLayout3, @NonNull MaterialAutoCompleteTextView materialAutoCompleteTextView2, @NonNull ConstraintLayout constraintLayout2, @NonNull ConstraintLayout constraintLayout3, @NonNull ConstraintLayout constraintLayout4, @NonNull TextView textView2, @NonNull TextInputLayout textInputLayout4, @NonNull TextInputLayout textInputLayout5, @NonNull TextInputLayout textInputLayout6, @NonNull TextInputEditText textInputEditText, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputEditText textInputEditText3, @NonNull TextInputEditText textInputEditText4, @NonNull CircularProgressIndicator circularProgressIndicator) {
        this.a = constraintLayout;
        this.b = textInputLayout;
        this.c = textView;
        this.d = textInputLayout2;
        this.e = materialAutoCompleteTextView;
        this.f = textInputLayout3;
        this.g = materialAutoCompleteTextView2;
        this.h = constraintLayout2;
        this.i = constraintLayout3;
        this.j = constraintLayout4;
        this.k = textView2;
        this.l = textInputLayout4;
        this.m = textInputLayout5;
        this.n = textInputLayout6;
        this.o = textInputEditText;
        this.p = textInputEditText2;
        this.q = textInputEditText3;
        this.r = textInputEditText4;
        this.s = circularProgressIndicator;
    }

    @NonNull
    public static d b(@NonNull View view) {
        TextInputLayout textInputLayoutA;
        MaterialAutoCompleteTextView materialAutoCompleteTextViewA;
        TextInputLayout textInputLayoutA2;
        MaterialAutoCompleteTextView materialAutoCompleteTextViewA2;
        ConstraintLayout constraintLayoutA;
        TextInputLayout textInputLayoutA3;
        TextInputLayout textInputLayoutA4;
        TextInputLayout textInputLayoutA5;
        TextInputEditText textInputEditTextA;
        TextInputEditText textInputEditTextA2;
        TextInputEditText textInputEditTextA3;
        TextInputEditText textInputEditTextA4;
        CircularProgressIndicator circularProgressIndicatorA;
        int i = l9.d.b;
        TextInputLayout textInputLayoutA6 = j1.b.a(view, i);
        if (textInputLayoutA6 != null) {
            i = l9.d.c;
            TextView textView = (TextView) j1.b.a(view, i);
            if (textView != null && (textInputLayoutA = j1.b.a(view, (i = l9.d.d))) != null && (materialAutoCompleteTextViewA = j1.b.a(view, (i = l9.d.e))) != null && (textInputLayoutA2 = j1.b.a(view, (i = l9.d.f))) != null && (materialAutoCompleteTextViewA2 = j1.b.a(view, (i = l9.d.g))) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i = l9.d.h;
                ConstraintLayout constraintLayoutA2 = j1.b.a(view, i);
                if (constraintLayoutA2 != null && (constraintLayoutA = j1.b.a(view, (i = l9.d.i))) != null) {
                    i = l9.d.j;
                    TextView textView2 = (TextView) j1.b.a(view, i);
                    if (textView2 != null && (textInputLayoutA3 = j1.b.a(view, (i = l9.d.k))) != null && (textInputLayoutA4 = j1.b.a(view, (i = l9.d.l))) != null && (textInputLayoutA5 = j1.b.a(view, (i = l9.d.m))) != null && (textInputEditTextA = j1.b.a(view, (i = l9.d.A))) != null && (textInputEditTextA2 = j1.b.a(view, (i = l9.d.B))) != null && (textInputEditTextA3 = j1.b.a(view, (i = l9.d.C))) != null && (textInputEditTextA4 = j1.b.a(view, (i = l9.d.D))) != null && (circularProgressIndicatorA = j1.b.a(view, (i = l9.d.j0))) != null) {
                        return new d(constraintLayout, textInputLayoutA6, textView, textInputLayoutA, materialAutoCompleteTextViewA, textInputLayoutA2, materialAutoCompleteTextViewA2, constraintLayout, constraintLayoutA2, constraintLayoutA, textView2, textInputLayoutA3, textInputLayoutA4, textInputLayoutA5, textInputEditTextA, textInputEditTextA2, textInputEditTextA3, textInputEditTextA4, circularProgressIndicatorA);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static d d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static d e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.d, viewGroup, false);
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
