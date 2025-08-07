package c9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ha.C0471p;

public final class C0488f implements j1.a {

    @NonNull
    private final ImageView a;

    @NonNull
    public final ImageView b;

    private C0488f(@NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.a = imageView;
        this.b = imageView2;
    }

    @NonNull
    public static C0488f b(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new C0488f(imageView, imageView);
    }

    @NonNull
    public static C0488f d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static C0488f e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0471p.f, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public ImageView a() {
        return this.a;
    }
}
