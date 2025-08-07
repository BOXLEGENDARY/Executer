package com.squareup.workflow1.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.roblox.client.personasdk.R;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0004\u001a\u00020\u00032\u001a\u0010\u0002\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00010\u0000\"\u0006\u0012\u0002\b\u00030\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u000f\u0010\u0006\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\b\b\u0000\u0010\t*\u00020\b*\u00020\u00032\u0006\u0010\n\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aM\u0010\u0017\u001a\u00020\u0016\"\b\b\u0000\u0010\t*\u00020\b*\u00020\u00032\u0006\u0010\r\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "Lcom/squareup/workflow1/ui/A;", "bindings", "Lcom/squareup/workflow1/ui/C;", "b", "([Lcom/squareup/workflow1/ui/A;)Lcom/squareup/workflow1/ui/C;", "a", "()Lcom/squareup/workflow1/ui/C;", "", "RenderingT", "rendering", "e", "(Lcom/squareup/workflow1/ui/C;Ljava/lang/Object;)Lcom/squareup/workflow1/ui/A;", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "Lcom/squareup/workflow1/ui/F;", "viewStarter", "Landroid/view/View;", "c", "(Lcom/squareup/workflow1/ui/C;Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;Lcom/squareup/workflow1/ui/F;)Landroid/view/View;", "wf1-core-android"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class D {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "RenderingT", "Landroid/view/View;", "newView", "", "a", "(Landroid/view/View;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a extends kotlin.jvm.internal.l implements Function1<View, Unit> {
        final F d;
        final Function1<View, Unit> e;

        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "RenderingT", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
        static final class C0062a extends kotlin.jvm.internal.l implements Function0<Unit> {
            final Function1<View, Unit> d;
            final View e;

            C0062a(Function1<? super View, Unit> function1, View view) {
                super(0);
                this.d = function1;
                this.e = view;
            }

            public Object invoke() {
                m23invoke();
                return Unit.a;
            }

            public final void m23invoke() {
                this.d.invoke(this.e);
            }
        }

        a(F f, Function1<? super View, Unit> function1) {
            super(1);
            this.d = f;
            this.e = function1;
        }

        public final void a(@NotNull View view) {
            Intrinsics.checkNotNullParameter(view, "newView");
            this.d.a(view, new C0062a(this.e, view));
        }

        public Object invoke(Object obj) {
            a((View) obj);
            return Unit.a;
        }
    }

    @NotNull
    public static final C a() {
        return new w((A<?>[]) new A[0]);
    }

    @NotNull
    public static final C b(@NotNull A<?>... aArr) {
        Intrinsics.checkNotNullParameter(aArr, "bindings");
        return new w((A<?>[]) Arrays.copyOf(aArr, aArr.length));
    }

    @NotNull
    public static final <RenderingT> View c(@NotNull C c, @NotNull RenderingT renderingt, @NotNull ViewEnvironment viewEnvironment, @NotNull Context context, ViewGroup viewGroup, F f) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        Intrinsics.checkNotNullParameter(renderingt, "initialRendering");
        Intrinsics.checkNotNullParameter(viewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(context, "contextForNewView");
        View viewA = e(c, renderingt).a(renderingt, viewEnvironment, context, viewGroup);
        if (H.d(viewA) != null) {
            if (f != null) {
                E.f(viewA, new a(f, E.e(viewA)));
            }
            return viewA;
        }
        throw new IllegalStateException(("View.bindShowRendering should have been called for " + viewA + ", typically by the " + ((Object) A.class.getName()) + " that created it.").toString());
    }

    @NotNull
    public static final <RenderingT> A<RenderingT> e(@NotNull C c, @NotNull RenderingT renderingt) {
        Intrinsics.checkNotNullParameter(c, "<this>");
        Intrinsics.checkNotNullParameter(renderingt, "rendering");
        A<RenderingT> a3 = c.a(kotlin.jvm.internal.z.b(renderingt.getClass()));
        if (a3 == null) {
            InterfaceC0490b interfaceC0490b = renderingt instanceof InterfaceC0490b ? (InterfaceC0490b) renderingt : null;
            a3 = interfaceC0490b == null ? null : interfaceC0490b.a();
            if (a3 == null) {
                a3 = null;
            }
            if (a3 == null) {
                a3 = (renderingt instanceof m ? (m) renderingt : null) == null ? null : n.b;
                if (a3 == null) {
                    throw new IllegalArgumentException("A " + ((Object) kotlin.jvm.internal.z.b(A.class).a()) + " should have been registered to display " + ((Object) kotlin.jvm.internal.z.b(renderingt.getClass()).a()) + " instances, or that class should implement " + ((Object) kotlin.jvm.internal.z.b(InterfaceC0490b.class).b()) + '<' + ((Object) kotlin.jvm.internal.z.b(renderingt.getClass()).b()) + ">.");
                }
            }
        }
        return a3;
    }
}
