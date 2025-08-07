package W8;

import V8.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;

public final class b implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    private b(@NonNull ConstraintLayout constraintLayout) {
        this.a = constraintLayout;
    }

    @NonNull
    public static b b(@NonNull View view) {
        if (view != null) {
            return new b((ConstraintLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(h.b, viewGroup, false);
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
