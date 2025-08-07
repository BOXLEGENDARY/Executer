package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.checkbox.MaterialCheckBox;

public final class q implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final MaterialCheckBox b;

    @NonNull
    public final TextView c;

    private q(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextView textView) {
        this.a = constraintLayout;
        this.b = materialCheckBox;
        this.c = textView;
    }

    @NonNull
    public static q b(@NonNull View view) {
        int i = l9.d.o;
        MaterialCheckBox materialCheckBoxA = j1.b.a(view, i);
        if (materialCheckBoxA != null) {
            i = l9.d.V;
            TextView textView = (TextView) j1.b.a(view, i);
            if (textView != null) {
                return new q((ConstraintLayout) view, materialCheckBoxA, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static q d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.r, viewGroup, false);
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
