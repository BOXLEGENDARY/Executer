package x9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.withpersona.sdk2.inquiry.steps.ui.view.SignatureView;
import w9.c;
import w9.d;

public final class b implements j1.a {

    @NonNull
    private final FrameLayout a;

    @NonNull
    public final FrameLayout b;

    @NonNull
    public final Button c;

    @NonNull
    public final ImageView d;

    @NonNull
    public final Flow e;

    @NonNull
    public final Button f;

    @NonNull
    public final View g;

    @NonNull
    public final SignatureView h;

    @NonNull
    public final TextView i;

    @NonNull
    public final TextView j;

    @NonNull
    public final ConstraintLayout k;

    private b(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull Button button, @NonNull ImageView imageView, @NonNull Flow flow, @NonNull Button button2, @NonNull View view, @NonNull SignatureView signatureView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull ConstraintLayout constraintLayout) {
        this.a = frameLayout;
        this.b = frameLayout2;
        this.c = button;
        this.d = imageView;
        this.e = flow;
        this.f = button2;
        this.g = view;
        this.h = signatureView;
        this.i = textView;
        this.j = textView2;
        this.k = constraintLayout;
    }

    @NonNull
    public static b b(@NonNull View view) {
        Flow flowA;
        View viewA;
        ConstraintLayout constraintLayoutA;
        int i = c.a;
        FrameLayout frameLayout = (FrameLayout) j1.b.a(view, i);
        if (frameLayout != null) {
            i = c.b;
            Button button = (Button) j1.b.a(view, i);
            if (button != null) {
                i = c.c;
                ImageView imageView = (ImageView) j1.b.a(view, i);
                if (imageView != null && (flowA = j1.b.a(view, (i = c.e))) != null) {
                    i = c.p;
                    Button button2 = (Button) j1.b.a(view, i);
                    if (button2 != null && (viewA = j1.b.a(view, (i = c.q))) != null) {
                        i = c.r;
                        SignatureView signatureView = (SignatureView) j1.b.a(view, i);
                        if (signatureView != null) {
                            i = c.s;
                            TextView textView = (TextView) j1.b.a(view, i);
                            if (textView != null) {
                                i = c.t;
                                TextView textView2 = (TextView) j1.b.a(view, i);
                                if (textView2 != null && (constraintLayoutA = j1.b.a(view, (i = c.u))) != null) {
                                    return new b((FrameLayout) view, frameLayout, button, imageView, flowA, button2, viewA, signatureView, textView, textView2, constraintLayoutA);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(d.b, viewGroup, false);
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
