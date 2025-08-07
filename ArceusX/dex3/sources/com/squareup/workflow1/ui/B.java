package com.squareup.workflow1.ui;

import android.content.res.Resources;
import android.view.View;
import com.roblox.client.personasdk.R;
import h8.C0584b;
import ha.D0;
import ha.K;
import ha.L;
import ha.M;
import ha.N;
import ha.z0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aD\u0010\n\u001a\u00020\t*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003H\u0001ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\r\u001a\u00020\f*\u00020\u0000H\u0003¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"Landroid/view/View;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/Function2;", "Lha/L;", "Lkotlin/coroutines/Continuation;", "", "", "block", "Lha/z0;", "b", "(Landroid/view/View;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;)Lha/z0;", "Lcom/squareup/workflow1/ui/c;", "a", "(Landroid/view/View;)Lcom/squareup/workflow1/ui/c;", "wf1-core-android"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class B {

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<no name provided>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    static final class a extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ViewOnAttachStateChangeListenerC0491c d;
        final CoroutineContext e;
        final Function2<L, Continuation<? super Unit>, Object> i;

        a(ViewOnAttachStateChangeListenerC0491c viewOnAttachStateChangeListenerC0491c, CoroutineContext coroutineContext, Function2<? super L, ? super Continuation<? super Unit>, ? extends Object> function2) {
            super(0);
            this.d = viewOnAttachStateChangeListenerC0491c;
            this.e = coroutineContext;
            this.i = function2;
        }

        public Object invoke() {
            m22invoke();
            return Unit.a;
        }

        public final void m22invoke() {
            ha.g.c(this.d.getCoroutineScope(), this.e, N.v, this.i);
        }
    }

    private static final ViewOnAttachStateChangeListenerC0491c a(View view) throws Resources.NotFoundException {
        Object tag = view.getTag(o.b);
        ViewOnAttachStateChangeListenerC0491c viewOnAttachStateChangeListenerC0491c = null;
        ViewOnAttachStateChangeListenerC0491c viewOnAttachStateChangeListenerC0491c2 = tag instanceof ViewOnAttachStateChangeListenerC0491c ? (ViewOnAttachStateChangeListenerC0491c) tag : null;
        if (viewOnAttachStateChangeListenerC0491c2 != null && M.h(viewOnAttachStateChangeListenerC0491c2.getCoroutineScope())) {
            viewOnAttachStateChangeListenerC0491c = viewOnAttachStateChangeListenerC0491c2;
        }
        if (viewOnAttachStateChangeListenerC0491c != null) {
            return viewOnAttachStateChangeListenerC0491c;
        }
        androidx.lifecycle.o oVarA = C0584b.a.a(view);
        if (oVarA == null) {
            throw new IllegalStateException("ViewTreeLifecycleOwner is required by View.ensureAttachedScope");
        }
        androidx.lifecycle.i iVarA = androidx.lifecycle.p.a(oVarA);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) view.getClass().getName());
        sb2.append('@');
        sb2.append(view.hashCode());
        sb.append(sb2.toString());
        if (view.getId() != -1) {
            try {
                String resourceEntryName = view.getResources().getResourceEntryName(view.getId());
                sb.append('-');
                sb.append(resourceEntryName);
            } catch (Resources.NotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        ViewOnAttachStateChangeListenerC0491c viewOnAttachStateChangeListenerC0491c3 = new ViewOnAttachStateChangeListenerC0491c(M.i(iVarA, new K(string)));
        view.setTag(o.b, viewOnAttachStateChangeListenerC0491c3);
        view.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0491c3);
        return viewOnAttachStateChangeListenerC0491c3;
    }

    @NotNull
    public static final z0 b(@NotNull View view, @NotNull CoroutineContext coroutineContext, @NotNull Function2<? super L, ? super Continuation<? super Unit>, ? extends Object> function2) throws Resources.NotFoundException {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(coroutineContext, "context");
        Intrinsics.checkNotNullParameter(function2, "block");
        if (coroutineContext.e(z0.s) != null) {
            throw new IllegalArgumentException("Expected custom CoroutineContext to not contain a Job.");
        }
        ViewOnAttachStateChangeListenerC0491c viewOnAttachStateChangeListenerC0491cA = a(view);
        a aVar = new a(viewOnAttachStateChangeListenerC0491cA, coroutineContext, function2);
        if (view.isAttachedToWindow()) {
            aVar.invoke();
        } else {
            viewOnAttachStateChangeListenerC0491cA.c(aVar);
        }
        return D0.i(viewOnAttachStateChangeListenerC0491cA.getCoroutineScope().H0());
    }

    public static z0 c(View view, CoroutineContext coroutineContext, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            coroutineContext = kotlin.coroutines.f.d;
        }
        return b(view, coroutineContext, function2);
    }
}
