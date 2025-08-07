package com.withpersona.sdk2.inquiry.selfie;

import android.content.Context;
import android.util.TypedValue;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0018\u00010\u000eR\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/GridAutoFitLayoutManager;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroid/content/Context;", "context", "", "columnWidth", "<init>", "(Landroid/content/Context;I)V", "g3", "(Landroid/content/Context;I)I", "newColumnWidth", "", "h3", "(I)V", "Landroidx/recyclerview/widget/RecyclerView$w;", "Landroidx/recyclerview/widget/RecyclerView;", "recycler", "Landroidx/recyclerview/widget/RecyclerView$A;", "state", "b1", "(Landroidx/recyclerview/widget/RecyclerView$w;Landroidx/recyclerview/widget/RecyclerView$A;)V", "R", "I", "", "S", "Z", "columnWidthChanged", "T", "lastTotalSpace", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class GridAutoFitLayoutManager extends GridLayoutManager {

    private int columnWidth;

    private boolean columnWidthChanged;

    private int lastTotalSpace;

    public GridAutoFitLayoutManager(@NotNull Context context, int i) {
        super(context, 1);
        Intrinsics.checkNotNullParameter(context, "context");
        this.columnWidthChanged = true;
        h3(g3(context, i));
    }

    private final int g3(Context context, int columnWidth) {
        return columnWidth <= 0 ? (int) TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics()) : columnWidth;
    }

    private final void h3(int newColumnWidth) {
        if (newColumnWidth <= 0 || newColumnWidth == this.columnWidth) {
            return;
        }
        this.columnWidth = newColumnWidth;
        this.columnWidthChanged = true;
    }

    public void b1(RecyclerView.w recycler, @NotNull RecyclerView.A state) {
        int iB0;
        int iH0;
        Intrinsics.checkNotNullParameter(state, "state");
        if (p2() == 1) {
            iB0 = s0() - j0();
            iH0 = i0();
        } else {
            iB0 = b0() - k0();
            iH0 = h0();
        }
        int i = iB0 - iH0;
        if ((this.columnWidthChanged && this.columnWidth > 0) || i != this.lastTotalSpace) {
            e3(kotlin.ranges.b.c(1, i / this.columnWidth));
            this.columnWidthChanged = false;
            this.lastTotalSpace = i;
        }
        super.b1(recycler, state);
    }
}
