package c9;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import ha.C0470o;
import ha.C0471p;

public final class C0486d implements j1.a {

    @NonNull
    private final View a;

    @NonNull
    public final ProgressBar b;

    private C0486d(@NonNull View view, @NonNull ProgressBar progressBar) {
        this.a = view;
        this.b = progressBar;
    }

    @NonNull
    public static C0486d b(@NonNull View view) {
        int i = C0470o.j;
        ProgressBar progressBar = (ProgressBar) j1.b.a(view, i);
        if (progressBar != null) {
            return new C0486d(view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static C0486d c(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(C0471p.d, viewGroup);
        return b(viewGroup);
    }

    @NonNull
    public View a() {
        return this.a;
    }
}
