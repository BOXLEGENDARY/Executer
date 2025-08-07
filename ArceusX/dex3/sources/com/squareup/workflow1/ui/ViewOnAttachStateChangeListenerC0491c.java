package com.squareup.workflow1.ui;

import android.view.View;
import com.roblox.client.personasdk.R;
import ha.D0;
import ha.L;
import ha.M;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR \u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/squareup/workflow1/ui/c;", "Landroid/view/View$OnAttachStateChangeListener;", "Lha/L;", "parentCoroutineScope", "<init>", "(Lha/L;)V", "Lkotlin/Function0;", "", "block", "c", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "", "d", "Ljava/util/List;", "attachHandlers", "Lha/y;", "e", "Lha/y;", "attachedJob", "i", "Lha/L;", "b", "()Lha/L;", "coroutineScope", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
final class ViewOnAttachStateChangeListenerC0491c implements View.OnAttachStateChangeListener {

    @NotNull
    private final List<Function0<Unit>> attachHandlers;

    @NotNull
    private final ha.y attachedJob;

    @NotNull
    private final L coroutineScope;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a extends kotlin.jvm.internal.l implements Function1<Throwable, Unit> {
        a() {
            super(1);
        }

        public final void a(Throwable th) {
            ViewOnAttachStateChangeListenerC0491c.this.attachHandlers.clear();
        }

        public Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.a;
        }
    }

    public ViewOnAttachStateChangeListenerC0491c(@NotNull L l) {
        Intrinsics.checkNotNullParameter(l, "parentCoroutineScope");
        this.attachHandlers = new ArrayList();
        ha.y yVarA = D0.a(D0.i(l.H0()));
        yVarA.I0(new a());
        this.attachedJob = yVarA;
        this.coroutineScope = M.i(l, yVarA);
    }

    @NotNull
    public final L getCoroutineScope() {
        return this.coroutineScope;
    }

    public final void c(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (!M.h(this.coroutineScope)) {
            throw new IllegalStateException("Expected AttachedScope to be active when adding attach handler.");
        }
        this.attachHandlers.add(block);
    }

    @Override
    public void onViewAttachedToWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        List<Function0<Unit>> list = this.attachHandlers;
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((Function0) it.next()).invoke();
        }
        list.clear();
    }

    @Override
    public void onViewDetachedFromWindow(@NotNull View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        M.d(this.coroutineScope, "View detached", (Throwable) null, 2, (Object) null);
        v.removeOnAttachStateChangeListener(this);
    }
}
