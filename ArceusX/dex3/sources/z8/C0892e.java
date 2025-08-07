package z8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import v8.C0824E;
import v8.C0825F;

public final class C0892e implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final ImageView b;

    @NonNull
    public final ImageView c;

    @NonNull
    public final ConstraintLayout d;

    @NonNull
    public final TextView e;

    @NonNull
    public final ConstraintLayout f;

    private C0892e(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout3) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = constraintLayout2;
        this.e = textView;
        this.f = constraintLayout3;
    }

    @NonNull
    public static C0892e b(@NonNull View view) {
        ConstraintLayout constraintLayoutA;
        int i = C0824E.q;
        ImageView imageView = (ImageView) j1.b.a(view, i);
        if (imageView != null) {
            i = C0824E.J;
            ImageView imageView2 = (ImageView) j1.b.a(view, i);
            if (imageView2 != null && (constraintLayoutA = j1.b.a(view, (i = C0824E.K))) != null) {
                i = C0824E.V;
                TextView textView = (TextView) j1.b.a(view, i);
                if (textView != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new C0892e(constraintLayout, imageView, imageView2, constraintLayoutA, textView, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static C0892e d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(C0825F.e, viewGroup, false);
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
