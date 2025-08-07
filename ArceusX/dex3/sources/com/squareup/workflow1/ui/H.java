package com.squareup.workflow1.ui;

import android.view.View;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.G;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"$\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0002\u0010\u0003\"6\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u00002\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00018@@@X\u0081\u000e¢\u0006\u0012\u0012\u0004\b\u000b\u0010\u0005\u001a\u0004\b\b\u0010\u0003\"\u0004\b\t\u0010\n\"\"\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\r*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u000e\u0010\u000f\"\"\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0012*\u00020\u00008@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0005\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroid/view/View;", "Lcom/squareup/workflow1/ui/G;", "d", "(Landroid/view/View;)Lcom/squareup/workflow1/ui/G;", "getWorkflowViewStateOrNull$annotations", "(Landroid/view/View;)V", "workflowViewStateOrNull", "value", "a", "e", "(Landroid/view/View;Lcom/squareup/workflow1/ui/G;)V", "getWorkflowViewState$annotations", "workflowViewState", "Lcom/squareup/workflow1/ui/G$a;", "b", "(Landroid/view/View;)Lcom/squareup/workflow1/ui/G$a;", "getWorkflowViewStateAsNew$annotations", "workflowViewStateAsNew", "Lcom/squareup/workflow1/ui/G$b;", "c", "(Landroid/view/View;)Lcom/squareup/workflow1/ui/G$b;", "getWorkflowViewStateAsStarted$annotations", "workflowViewStateAsStarted", "wf1-core-android"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class H {
    @NotNull
    public static final G<?> a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        G<?> gD = d(view);
        if (gD != null) {
            return gD;
        }
        throw new IllegalStateException(("Expected " + view + " to have been built by a ViewFactory. Perhaps the factory did not call View.bindShowRendering.").toString());
    }

    @NotNull
    public static final G.New<?> b(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        G<?> gA = a(view);
        G.New<?> aVar = gA instanceof G.New ? (G.New) gA : null;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Expected " + view + " to be un-started, but View.start() has been called").toString());
    }

    @NotNull
    public static final G.Started<?> c(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        G<?> gA = a(view);
        G.Started<?> bVar = gA instanceof G.Started ? (G.Started) gA : null;
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalStateException(("Expected " + view + " to have been started, but View.start() has not been called").toString());
    }

    public static final G<?> d(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Object tag = view.getTag(o.e);
        if (tag instanceof G) {
            return (G) tag;
        }
        return null;
    }

    public static final void e(@NotNull View view, @NotNull G<?> g) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(g, "value");
        view.setTag(o.e, g);
    }
}
