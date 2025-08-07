package q9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;

public final class x implements j1.a {

    @NonNull
    private final TextView a;

    @NonNull
    public final TextView b;

    private x(@NonNull TextView textView, @NonNull TextView textView2) {
        this.a = textView;
        this.b = textView2;
    }

    @NonNull
    public static x b(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new x(textView, textView);
    }

    @NonNull
    public static x d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static x e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(l9.e.y, viewGroup, false);
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
