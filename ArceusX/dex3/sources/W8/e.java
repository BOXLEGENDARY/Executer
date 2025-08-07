package W8;

import V8.h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.withpersona.sdk2.inquiry.shared.ui.Pi2NavigationBar;

public final class e implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final TextView b;

    @NonNull
    public final ConstraintLayout c;

    @NonNull
    public final Pi2NavigationBar d;

    @NonNull
    public final RecyclerView e;

    @NonNull
    public final Button f;

    @NonNull
    public final TextView g;

    @NonNull
    public final Button h;

    private e(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout2, @NonNull Pi2NavigationBar pi2NavigationBar, @NonNull RecyclerView recyclerView, @NonNull Button button, @NonNull TextView textView2, @NonNull Button button2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = constraintLayout2;
        this.d = pi2NavigationBar;
        this.e = recyclerView;
        this.f = button;
        this.g = textView2;
        this.h = button2;
    }

    @NonNull
    public static e b(@NonNull View view) {
        ConstraintLayout constraintLayoutA;
        RecyclerView recyclerViewA;
        int i = V8.g.c;
        TextView textView = (TextView) j1.b.a(view, i);
        if (textView != null && (constraintLayoutA = j1.b.a(view, (i = V8.g.l))) != null) {
            i = V8.g.x;
            Pi2NavigationBar pi2NavigationBar = (Pi2NavigationBar) j1.b.a(view, i);
            if (pi2NavigationBar != null && (recyclerViewA = j1.b.a(view, (i = V8.g.E))) != null) {
                i = V8.g.F;
                Button button = (Button) j1.b.a(view, i);
                if (button != null) {
                    i = V8.g.M;
                    TextView textView2 = (TextView) j1.b.a(view, i);
                    if (textView2 != null) {
                        i = V8.g.N;
                        Button button2 = (Button) j1.b.a(view, i);
                        if (button2 != null) {
                            return new e((ConstraintLayout) view, textView, constraintLayoutA, pi2NavigationBar, recyclerViewA, button, textView2, button2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    @NonNull
    public static e d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(h.e, viewGroup, false);
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
