package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;

public final class v implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView b;

    @NonNull
    public final ImageView c;

    @NonNull
    public final TextView d;

    @NonNull
    public final TextView e;

    @NonNull
    public final MaterialCardView f;

    @NonNull
    public final ImageView g;

    private v(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull MaterialCardView materialCardView, @NonNull ImageView imageView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
        this.e = textView3;
        this.f = materialCardView;
        this.g = imageView2;
    }

    @NonNull
    public static v b(@NonNull View view) {
        MaterialCardView materialCardViewA;
        int i = l9.d.a;
        TextView textView = (TextView) j1.b.a(view, i);
        if (textView != null) {
            i = l9.d.y;
            ImageView imageView = (ImageView) j1.b.a(view, i);
            if (imageView != null) {
                i = l9.d.E;
                TextView textView2 = (TextView) j1.b.a(view, i);
                if (textView2 != null) {
                    i = l9.d.V;
                    TextView textView3 = (TextView) j1.b.a(view, i);
                    if (textView3 != null && (materialCardViewA = j1.b.a(view, (i = l9.d.x0))) != null) {
                        i = l9.d.y0;
                        ImageView imageView2 = (ImageView) j1.b.a(view, i);
                        if (imageView2 != null) {
                            return new v((ConstraintLayout) view, textView, imageView, textView2, textView3, materialCardViewA, imageView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static v d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static v e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.w, viewGroup, false);
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
