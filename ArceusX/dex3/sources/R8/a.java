package R8;

import Q8.r;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

public final class a implements j1.a {

    @NonNull
    private final View a;

    private a(@NonNull View view) {
        this.a = view;
    }

    @NonNull
    public static a b(@NonNull View view) {
        if (view != null) {
            return new a(view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(r.a, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public View a() {
        return this.a;
    }
}
