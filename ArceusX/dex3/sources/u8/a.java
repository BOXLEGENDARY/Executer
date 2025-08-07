package U8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.materialswitch.MaterialSwitch;

public final class a implements j1.a {

    @NonNull
    private final ConstraintLayout a;

    @NonNull
    public final MaterialSwitch b;

    @NonNull
    public final MaterialToolbar c;

    private a(@NonNull ConstraintLayout constraintLayout, @NonNull MaterialSwitch materialSwitch, @NonNull MaterialToolbar materialToolbar) {
        this.a = constraintLayout;
        this.b = materialSwitch;
        this.c = materialToolbar;
    }

    @NonNull
    public static a b(@NonNull View view) {
        MaterialToolbar materialToolbarA;
        int i = T8.a.c;
        MaterialSwitch materialSwitchA = j1.b.a(view, i);
        if (materialSwitchA == null || (materialToolbarA = j1.b.a(view, (i = T8.a.d))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        return new a((ConstraintLayout) view, materialSwitchA, materialToolbarA);
    }

    @NonNull
    public static a d(@NonNull LayoutInflater layoutInflater) {
        return e(layoutInflater, null, false);
    }

    @NonNull
    public static a e(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(T8.b.a, viewGroup, false);
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
