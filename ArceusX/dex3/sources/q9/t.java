package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;

public final class t implements j1.a {

    @NonNull
    private final TextView a;

    @NonNull
    public final TextView b;

    private t(@NonNull TextView textView, @NonNull TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    @NonNull
    public static t b(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new t(textView, textView);
    }

    @NonNull
    public static t d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static t e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.u, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public TextView a() {
        return this.a;
    }
}
