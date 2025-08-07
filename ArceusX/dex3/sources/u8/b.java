package U8;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.squareup.workflow1.ui.WorkflowViewStub;

public final class b implements j1.a {

    @NonNull
    private final CoordinatorLayout a;

    @NonNull
    public final WorkflowViewStub b;

    @NonNull
    public final FloatingActionButton c;

    private b(@NonNull CoordinatorLayout coordinatorLayout, @NonNull WorkflowViewStub workflowViewStub, @NonNull FloatingActionButton floatingActionButton) {
        this.a = coordinatorLayout;
        this.b = workflowViewStub;
        this.c = floatingActionButton;
    }

    @NonNull
    public static b b(@NonNull View view) {
        FloatingActionButton floatingActionButtonA;
        int i = T8.a.a;
        WorkflowViewStub workflowViewStub = (WorkflowViewStub) j1.b.a(view, i);
        if (workflowViewStub == null || (floatingActionButtonA = j1.b.a(view, (i = T8.a.b))) == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        }
        return new b((CoordinatorLayout) view, workflowViewStub, floatingActionButtonA);
    }

    @NonNull
    public static b d(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(T8.b.b, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        return b(viewInflate);
    }

    @NonNull
    public CoordinatorLayout a() {
        return this.a;
    }
}
