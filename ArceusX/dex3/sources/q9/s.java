package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class s implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    private s(@NonNull ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    @NonNull
    public static s b(@NonNull View view) {
        if (view != null) {
            return new s((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static s d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static s e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.t, viewGroup, false);
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
