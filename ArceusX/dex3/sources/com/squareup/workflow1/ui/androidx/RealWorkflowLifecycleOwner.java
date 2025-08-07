package com.squareup.workflow1.ui.androidx;

import android.view.View;
import androidx.lifecycle.h;
import androidx.lifecycle.l;
import androidx.lifecycle.o;
import androidx.lifecycle.q;
import com.roblox.client.personasdk.R;
import h8.InterfaceC0585c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B%\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\u000e2\b\b\u0002\u0010\u001b\u001a\u00020\tH\u0001¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010'¨\u0006."}, d2 = {"Lcom/squareup/workflow1/ui/androidx/RealWorkflowLifecycleOwner;", "Lh8/c;", "Landroidx/lifecycle/o;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/lifecycle/l;", "Lkotlin/Function1;", "Landroid/view/View;", "Landroidx/lifecycle/h;", "findParentLifecycle", "", "enforceMainThread", "<init>", "(Lkotlin/jvm/functions/Function1;Z)V", "v", "", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "source", "Landroidx/lifecycle/h$a;", "event", "j", "(Landroidx/lifecycle/o;Landroidx/lifecycle/h$a;)V", "P", "()V", "getLifecycle", "()Landroidx/lifecycle/h;", "isAttached", "a", "(Z)V", "d", "Lkotlin/jvm/functions/Function1;", "e", "Landroid/view/View;", "view", "Landroidx/lifecycle/q;", "i", "Landroidx/lifecycle/q;", "localLifecycle", "Z", "hasBeenDestroyed", "w", "Landroidx/lifecycle/h;", "parentLifecycle", "y", "destroyOnDetach", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class RealWorkflowLifecycleOwner implements InterfaceC0585c, o, View.OnAttachStateChangeListener, l {

    @NotNull
    private final Function1<View, h> findParentLifecycle;

    private View view;

    @NotNull
    private final q localLifecycle;

    private boolean hasBeenDestroyed;

    private h parentLifecycle;

    private boolean destroyOnDetach;

    public RealWorkflowLifecycleOwner(@NotNull Function1<? super View, ? extends h> function1, boolean z) {
        q qVarG;
        Intrinsics.checkNotNullParameter(function1, "findParentLifecycle");
        this.findParentLifecycle = function1;
        if (z) {
            qVarG = new q(this);
        } else {
            qVarG = q.g(this);
            Intrinsics.checkNotNullExpressionValue(qVarG, "createUnsafe(this)");
        }
        this.localLifecycle = qVarG;
    }

    public static void b(RealWorkflowLifecycleOwner realWorkflowLifecycleOwner, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            View view = realWorkflowLifecycleOwner.view;
            z = view == null ? false : view.isAttachedToWindow();
        }
        realWorkflowLifecycleOwner.a(z);
    }

    @Override
    public void P() {
        if (this.destroyOnDetach) {
            return;
        }
        this.destroyOnDetach = true;
        b(this, false, 1, null);
    }

    public final void a(boolean isAttached) {
        h hVar = this.parentLifecycle;
        h.b bVarB = hVar == null ? null : hVar.b();
        h.b bVarB2 = this.localLifecycle.b();
        Intrinsics.checkNotNullExpressionValue(bVarB2, "localLifecycle.currentState");
        h.b bVar = h.b.d;
        if (bVarB2 == bVar || this.hasBeenDestroyed) {
            this.view = null;
            return;
        }
        q qVar = this.localLifecycle;
        if (this.destroyOnDetach && !isAttached) {
            bVarB = bVar;
        } else if (bVarB == null && bVarB2 != (bVarB = h.b.e)) {
            throw new AssertionError("Must have a parent lifecycle after attaching and until being destroyed.");
        }
        if (bVarB == bVar) {
            this.hasBeenDestroyed = true;
            h hVar2 = this.parentLifecycle;
            if (hVar2 != null) {
                hVar2.d(this);
            }
            this.parentLifecycle = null;
            View view = this.view;
            if (view != null) {
                this.view = null;
                view.removeOnAttachStateChangeListener(this);
            }
            h.b bVar2 = h.b.e;
            if (bVarB2 == bVar2) {
                bVar = bVar2;
            }
        } else {
            bVar = bVarB;
        }
        qVar.o(bVar);
    }

    @NotNull
    public h getLifecycle() {
        return this.localLifecycle;
    }

    public void j(@NotNull o source, @NotNull h.a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        b(this, false, 1, null);
    }

    @Override
    public void onViewAttachedToWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        if (this.localLifecycle.b() == h.b.d || this.hasBeenDestroyed) {
            return;
        }
        this.view = v;
        h hVar = this.parentLifecycle;
        h hVar2 = (h) this.findParentLifecycle.invoke(v);
        this.parentLifecycle = hVar2;
        if (hVar2 != hVar) {
            if (hVar != null) {
                hVar.d(this);
            }
            h hVar3 = this.parentLifecycle;
            if (hVar3 != null) {
                hVar3.a(this);
            }
        }
        a(true);
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        a(false);
    }

    public RealWorkflowLifecycleOwner(Function1 function1, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i & 2) != 0 ? true : z);
    }
}
