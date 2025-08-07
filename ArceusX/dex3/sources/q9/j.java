package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;

public final class j implements j1.a {

    @NonNull
    private final LinearLayout a;

    @NonNull
    public final LinearLayout b;

    @NonNull
    public final TextView c;

    @NonNull
    public final TextView d;

    private j(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = textView;
        this.d = textView2;
    }

    @NonNull
    public static j b(@NonNull View view) {
        int i = l9.d.r;
        LinearLayout linearLayout = (LinearLayout) j1.b.a(view, i);
        if (linearLayout != null) {
            i = l9.d.s;
            TextView textView = (TextView) j1.b.a(view, i);
            if (textView != null) {
                i = l9.d.t;
                TextView textView2 = (TextView) j1.b.a(view, i);
                if (textView2 != null) {
                    return new j((LinearLayout) view, linearLayout, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static j d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static j e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.k, viewGroup, false);
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
