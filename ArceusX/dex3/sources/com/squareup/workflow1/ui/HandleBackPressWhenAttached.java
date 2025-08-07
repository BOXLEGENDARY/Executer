package com.squareup.workflow1.ui;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.T;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0005*\u0001\u001d\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\r\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R!\u0010\b\u001a\f\u0012\u0004\u0012\u00020\u00060\u0005j\u0002`\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/squareup/workflow1/ui/HandleBackPressWhenAttached;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/lifecycle/d;", "Landroid/view/View;", "view", "Lkotlin/Function0;", "", "Lcom/squareup/workflow1/ui/BackPressHandler;", "handler", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V", "start", "()V", "b", "attachedView", "onViewAttachedToWindow", "(Landroid/view/View;)V", "detachedView", "onViewDetachedFromWindow", "Landroidx/lifecycle/o;", "owner", "onDestroy", "(Landroidx/lifecycle/o;)V", "d", "Landroid/view/View;", "e", "Lkotlin/jvm/functions/Function0;", "a", "()Lkotlin/jvm/functions/Function0;", "com/squareup/workflow1/ui/HandleBackPressWhenAttached$a", "i", "Lcom/squareup/workflow1/ui/HandleBackPressWhenAttached$a;", "onBackPressedCallback", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
final class HandleBackPressWhenAttached implements View.OnAttachStateChangeListener, androidx.lifecycle.d {

    @NotNull
    private final View view;

    @NotNull
    private final Function0<Unit> handler;

    @NotNull
    private final a onBackPressedCallback;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/squareup/workflow1/ui/HandleBackPressWhenAttached$a", "Landroidx/activity/E;", "", "d", "()V", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class a extends androidx.activity.E {
        a() {
            super(false);
        }

        public void d() {
            HandleBackPressWhenAttached.this.a().invoke();
        }
    }

    public HandleBackPressWhenAttached(@NotNull View view, @NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(function0, "handler");
        this.view = view;
        this.handler = function0;
        this.onBackPressedCallback = new a();
    }

    @NotNull
    public final Function0<Unit> a() {
        return this.handler;
    }

    public final void b() {
        androidx.lifecycle.h lifecycle;
        this.onBackPressedCallback.h();
        this.view.removeOnAttachStateChangeListener(this);
        androidx.lifecycle.o oVarA = T.a(this.view);
        if (oVarA == null || (lifecycle = oVarA.getLifecycle()) == null) {
            return;
        }
        lifecycle.d(this);
    }

    public void onDestroy(@NotNull androidx.lifecycle.o owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        b();
    }

    @Override
    public void onViewAttachedToWindow(@NotNull View attachedView) {
        Intrinsics.checkNotNullParameter(attachedView, "attachedView");
        if (this.view != attachedView) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.onBackPressedCallback.j(true);
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull View detachedView) {
        Intrinsics.checkNotNullParameter(detachedView, "detachedView");
        if (this.view != detachedView) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.onBackPressedCallback.j(false);
    }

    public final void start() {
        androidx.lifecycle.h lifecycle;
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        androidx.activity.G gB = C0493e.b(context);
        if (gB == null) {
            return;
        }
        gB.getOnBackPressedDispatcher().h(gB, this.onBackPressedCallback);
        this.view.addOnAttachStateChangeListener(this);
        if (this.view.isAttachedToWindow()) {
            onViewAttachedToWindow(this.view);
        }
        androidx.lifecycle.o oVarA = T.a(this.view);
        if (oVarA == null || (lifecycle = oVarA.getLifecycle()) == null) {
            return;
        }
        lifecycle.a(this);
    }
}
