package W8;

import V8.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;

public final class f implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ShapeableImageView b;

    @NonNull
    public final TextView c;

    private f(@NonNull ConstraintLayout constraintLayout, @NonNull ShapeableImageView shapeableImageView, @NonNull TextView textView) {
        this.a = constraintLayout;
        this.b = shapeableImageView;
        this.c = textView;
    }

    @NonNull
    public static f b(@NonNull View view) {
        int i = V8.g.q;
        ShapeableImageView shapeableImageViewA = j1.b.a(view, i);
        if (shapeableImageViewA != null) {
            i = V8.g.v;
            TextView textView = (TextView) j1.b.a(view, i);
            if (textView != null) {
                return new f((ConstraintLayout) view, shapeableImageViewA, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static f d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(h.f, viewGroup, false);
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
