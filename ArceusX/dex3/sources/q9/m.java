package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

public final class m implements j1.a {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout b;

    @NonNull
    public final TextView c;

    @NonNull
    public final TextView d;

    private m(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = textView;
        this.d = textView2;
    }

    @NonNull
    public static m b(@NonNull View view) {
        int i = l9.d.l0;
        LinearLayout linearLayout = (LinearLayout) j1.b.a(view, i);
        if (linearLayout != null) {
            i = l9.d.o0;
            TextView textView = (TextView) j1.b.a(view, i);
            if (textView != null) {
                i = l9.d.p0;
                TextView textView2 = (TextView) j1.b.a(view, i);
                if (textView2 != null) {
                    return new m((LinearLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static m d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static m e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.n, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public LinearLayout a() {
        return this.a;
    }
}
