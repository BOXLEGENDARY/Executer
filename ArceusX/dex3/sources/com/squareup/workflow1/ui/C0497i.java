package com.squareup.workflow1.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0004B\u008b\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012$\u0010\n\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\t0\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012B\b\u0002\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0013B{\b\u0016\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012B\b\u0002\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0015J1\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R2\u0010\n\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0\t0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$RN\u0010\u0011\u001a<\u0012\u0004\u0012\u00020\u000e\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\u0007j\b\u0012\u0004\u0012\u00028\u0001`\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lcom/squareup/workflow1/ui/i;", "", "OuterT", "InnerT", "Lcom/squareup/workflow1/ui/A;", "Lfa/c;", "type", "Lkotlin/Function2;", "Lcom/squareup/workflow1/ui/y;", "Lkotlin/Pair;", "map", "Lcom/squareup/workflow1/ui/F;", "viewStarter", "Lkotlin/Function4;", "Landroid/view/View;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "doShowRendering", "<init>", "(Lfa/c;Lkotlin/jvm/functions/Function2;Lcom/squareup/workflow1/ui/F;Laa/o;)V", "Lkotlin/Function1;", "(Lfa/c;Lkotlin/jvm/functions/Function1;Lcom/squareup/workflow1/ui/F;Laa/o;)V", "initialRendering", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "a", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "b", "Lkotlin/jvm/functions/Function2;", "c", "Lcom/squareup/workflow1/ui/F;", "d", "Laa/o;", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class C0497i<OuterT, InnerT> implements A<OuterT> {

    @NotNull
    private final fa.c<OuterT> type;

    @NotNull
    private final Function2<OuterT, ViewEnvironment, Pair<InnerT, ViewEnvironment>> map;

    private final F viewStarter;

    @NotNull
    private final aa.o<View, Function2<? super InnerT, ? super ViewEnvironment, Unit>, OuterT, ViewEnvironment, Unit> doShowRendering;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\f\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\"\u0010\t\u001a\u001e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\b\u0012\u0004\u0012\u00028\u0001`\b2\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u0006H\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"", "OuterT", "InnerT", "Landroid/view/View;", "<anonymous parameter 0>", "Lkotlin/Function2;", "Lcom/squareup/workflow1/ui/y;", "", "Lcom/squareup/workflow1/ui/ViewShowRendering;", "innerShowRendering", "outerRendering", "viewEnvironment", "a", "(Landroid/view/View;Lkotlin/jvm/functions/Function2;Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a extends kotlin.jvm.internal.l implements aa.o<View, Function2<? super InnerT, ? super ViewEnvironment, ? extends Unit>, OuterT, ViewEnvironment, Unit> {
        final Function1<OuterT, InnerT> d;

        a(Function1<? super OuterT, ? extends InnerT> function1) {
            super(4);
            this.d = function1;
        }

        public final void a(@NotNull View view, @NotNull Function2<? super InnerT, ? super ViewEnvironment, Unit> function2, @NotNull OuterT outert, @NotNull ViewEnvironment viewEnvironment) {
            Intrinsics.checkNotNullParameter(view, "$noName_0");
            Intrinsics.checkNotNullParameter(function2, "innerShowRendering");
            Intrinsics.checkNotNullParameter(outert, "outerRendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            function2.invoke(this.d.invoke(outert), viewEnvironment);
        }

        public Object h(Object obj, Object obj2, Object obj3, Object obj4) {
            a((View) obj, (Function2) obj2, obj3, (ViewEnvironment) obj4);
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "OuterT", "InnerT", "outer", "Lcom/squareup/workflow1/ui/y;", "viewEnvironment", "Lkotlin/Pair;", "a", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;)Lkotlin/Pair;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class b extends kotlin.jvm.internal.l implements Function2<OuterT, ViewEnvironment, Pair<? extends InnerT, ? extends ViewEnvironment>> {
        final Function1<OuterT, InnerT> d;

        b(Function1<? super OuterT, ? extends InnerT> function1) {
            super(2);
            this.d = function1;
        }

        @NotNull
        public final Pair<InnerT, ViewEnvironment> invoke(@NotNull OuterT outert, @NotNull ViewEnvironment viewEnvironment) {
            Intrinsics.checkNotNullParameter(outert, "outer");
            Intrinsics.checkNotNullParameter(viewEnvironment, "viewEnvironment");
            return new Pair<>(this.d.invoke(outert), viewEnvironment);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "OuterT", "InnerT", "rendering", "Lcom/squareup/workflow1/ui/y;", "env", "", "a", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class c extends kotlin.jvm.internal.l implements Function2<OuterT, ViewEnvironment, Unit> {
        final C0497i<OuterT, InnerT> d;
        final View e;
        final Function2<InnerT, ViewEnvironment, Unit> i;

        c(C0497i<OuterT, InnerT> c0497i, View view, Function2<? super InnerT, ? super ViewEnvironment, Unit> function2) {
            super(2);
            this.d = c0497i;
            this.e = view;
            this.i = function2;
        }

        public final void a(@NotNull OuterT outert, @NotNull ViewEnvironment viewEnvironment) {
            Intrinsics.checkNotNullParameter(outert, "rendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "env");
            ((C0497i) this.d).doShowRendering.h(this.e, this.i, outert, viewEnvironment);
        }

        public Object invoke(Object obj, Object obj2) {
            a(obj, (ViewEnvironment) obj2);
            return Unit.a;
        }
    }

    public C0497i(@NotNull fa.c<OuterT> cVar, @NotNull Function2<? super OuterT, ? super ViewEnvironment, ? extends Pair<? extends InnerT, ViewEnvironment>> function2, F f, @NotNull aa.o<? super View, ? super Function2<? super InnerT, ? super ViewEnvironment, Unit>, ? super OuterT, ? super ViewEnvironment, Unit> oVar) {
        Intrinsics.checkNotNullParameter(cVar, "type");
        Intrinsics.checkNotNullParameter(function2, "map");
        Intrinsics.checkNotNullParameter(oVar, "doShowRendering");
        this.type = cVar;
        this.map = function2;
        this.viewStarter = f;
        this.doShowRendering = oVar;
    }

    @Override
    @NotNull
    public View a(@NotNull OuterT initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        Pair pair = (Pair) this.map.invoke(initialRendering, initialViewEnvironment);
        Object objA = pair.a();
        ViewEnvironment viewEnvironment = (ViewEnvironment) pair.b();
        View viewC = D.c((C) viewEnvironment.a(C.INSTANCE), objA, viewEnvironment, contextForNewView, container, this.viewStarter);
        Function2 function2D = E.d(viewC);
        Intrinsics.d(function2D);
        E.a(viewC, initialRendering, viewEnvironment, new c(this, viewC, function2D));
        return viewC;
    }

    @Override
    @NotNull
    public fa.c<OuterT> getType() {
        return this.type;
    }

    public C0497i(fa.c cVar, Function1 function1, F f, aa.o oVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, function1, (i & 4) != 0 ? null : f, (i & 8) != 0 ? new a(function1) : oVar);
    }

    public C0497i(@NotNull fa.c<OuterT> cVar, @NotNull Function1<? super OuterT, ? extends InnerT> function1, F f, @NotNull aa.o<? super View, ? super Function2<? super InnerT, ? super ViewEnvironment, Unit>, ? super OuterT, ? super ViewEnvironment, Unit> oVar) {
        this(cVar, new b(function1), f, oVar);
        Intrinsics.checkNotNullParameter(cVar, "type");
        Intrinsics.checkNotNullParameter(function1, "map");
        Intrinsics.checkNotNullParameter(oVar, "doShowRendering");
    }
}
