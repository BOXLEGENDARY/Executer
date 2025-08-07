package G8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ha.z;

public final class c implements j1.a {

    @NonNull
    private final FrameLayout a;

    private c(@NonNull FrameLayout frameLayout) {
        this.a = frameLayout;
    }

    @NonNull
    public static c b(@NonNull View view) {
        if (view != null) {
            return new c((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @NonNull
    public static c d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(z.d, viewGroup, false);
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
