package c9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ha.C0470o;
import ha.C0471p;

public final class C0485c implements j1.a {

    @NonNull
    private final View a;

    @NonNull
    public final ImageView b;

    @NonNull
    public final ImageView c;

    private C0485c(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.a = view;
        this.b = imageView;
        this.c = imageView2;
    }

    @NonNull
    public static C0485c b(@NonNull View view) {
        int i = C0470o.e;
        ImageView imageView = (ImageView) j1.b.a(view, i);
        if (imageView != null) {
            i = C0470o.f;
            ImageView imageView2 = (ImageView) j1.b.a(view, i);
            if (imageView2 != null) {
                return new C0485c(view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static C0485c c(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C0471p.c, viewGroup);
        return b(viewGroup);
    }

    @NonNull
    public View a() {
        return this.a;
    }
}
