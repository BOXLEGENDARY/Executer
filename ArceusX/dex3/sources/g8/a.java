package G8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ha.y;
import ha.z;

public final class a implements j1.a {

    @NonNull
    private final View a;

    @NonNull
    public final View b;

    @NonNull
    public final FrameLayout c;

    private a(@NonNull View view, @NonNull View view2, @NonNull FrameLayout frameLayout) {
        this.a = view;
        this.b = view2;
        this.c = frameLayout;
    }

    @NonNull
    public static a b(@NonNull View view) {
        int i = y.c;
        View viewA = j1.b.a(view, i);
        if (viewA != null) {
            i = y.e;
            FrameLayout frameLayout = (FrameLayout) j1.b.a(view, i);
            if (frameLayout != null) {
                return new a(view, viewA, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static a c(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(z.a, viewGroup);
        return b(viewGroup);
    }

    @NonNull
    public View a() {
        return this.a;
    }
}
