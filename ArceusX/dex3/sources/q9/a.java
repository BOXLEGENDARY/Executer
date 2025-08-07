package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public final class a implements j1.a {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout b;

    @NonNull
    public final LinearLayout c;

    @NonNull
    public final View d;

    @NonNull
    public final RecyclerView e;

    @NonNull
    public final TextInputEditText f;

    @NonNull
    public final TextInputLayout g;

    @NonNull
    public final View h;

    @NonNull
    public final TextView i;

    @NonNull
    public final MaterialToolbar j;

    private a(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull LinearLayout linearLayout, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull View view2, @NonNull TextView textView, @NonNull MaterialToolbar materialToolbar) {
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = linearLayout;
        this.d = view;
        this.e = recyclerView;
        this.f = textInputEditText;
        this.g = textInputLayout;
        this.h = view2;
        this.i = textView;
        this.j = materialToolbar;
    }

    @NonNull
    public static a b(@NonNull View view) {
        View viewA;
        RecyclerView recyclerViewA;
        TextInputEditText textInputEditTextA;
        TextInputLayout textInputLayoutA;
        View viewA2;
        MaterialToolbar materialToolbarA;
        int i = l9.d.n;
        FrameLayout frameLayout = (FrameLayout) j1.b.a(view, i);
        if (frameLayout != null) {
            i = l9.d.X;
            LinearLayout linearLayout = (LinearLayout) j1.b.a(view, i);
            if (linearLayout != null && (viewA = j1.b.a(view, (i = l9.d.Y))) != null && (recyclerViewA = j1.b.a(view, (i = l9.d.q0))) != null && (textInputEditTextA = j1.b.a(view, (i = l9.d.s0))) != null && (textInputLayoutA = j1.b.a(view, (i = l9.d.t0))) != null && (viewA2 = j1.b.a(view, (i = l9.d.w0))) != null) {
                i = l9.d.A0;
                TextView textView = (TextView) j1.b.a(view, i);
                if (textView != null && (materialToolbarA = j1.b.a(view, (i = l9.d.C0))) != null) {
                    return new a((FrameLayout) view, frameLayout, linearLayout, viewA, recyclerViewA, textInputEditTextA, textInputLayoutA, viewA2, textView, materialToolbarA);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.a, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public FrameLayout a() {
        return this.a;
    }
}
