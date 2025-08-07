package G8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ha.z;

public final class b implements j1.a {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout b;

    private b(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2) {
        this.a = frameLayout;
        this.b = frameLayout2;
    }

    @NonNull
    public static b b(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        FrameLayout frameLayout = (FrameLayout) view;
        return new b(frameLayout, frameLayout);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static b e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(z.b, viewGroup, false);
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
