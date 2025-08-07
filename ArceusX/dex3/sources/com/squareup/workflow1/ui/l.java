package com.squareup.workflow1.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B9\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\b¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0015\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/squareup/workflow1/ui/l;", "", "RenderingT", "Lcom/squareup/workflow1/ui/A;", "Lfa/c;", "type", "", "layoutId", "Lkotlin/Function1;", "Landroid/view/View;", "Lcom/squareup/workflow1/ui/j;", "runnerConstructor", "<init>", "(Lfa/c;ILkotlin/jvm/functions/Function1;)V", "initialRendering", "Lcom/squareup/workflow1/ui/y;", "initialViewEnvironment", "Landroid/content/Context;", "contextForNewView", "Landroid/view/ViewGroup;", "container", "a", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "b", "I", "c", "Lkotlin/jvm/functions/Function1;", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class l<RenderingT> implements A<RenderingT> {

    @NotNull
    private final fa.c<RenderingT> type;

    private final int layoutId;

    @NotNull
    private final Function1<View, j<RenderingT>> runnerConstructor;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "RenderingT", "rendering", "Lcom/squareup/workflow1/ui/y;", "environment", "", "a", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0})
    static final class a extends kotlin.jvm.internal.l implements Function2<RenderingT, ViewEnvironment, Unit> {
        final j<RenderingT> d;

        a(j<RenderingT> jVar) {
            super(2);
            this.d = jVar;
        }

        public final void a(@NotNull RenderingT renderingt, @NotNull ViewEnvironment viewEnvironment) {
            Intrinsics.checkNotNullParameter(renderingt, "rendering");
            Intrinsics.checkNotNullParameter(viewEnvironment, "environment");
            this.d.a(renderingt, viewEnvironment);
        }

        public Object invoke(Object obj, Object obj2) {
            a(obj, (ViewEnvironment) obj2);
            return Unit.a;
        }
    }

    public l(@NotNull fa.c<RenderingT> cVar, int i, @NotNull Function1<? super View, ? extends j<RenderingT>> function1) {
        Intrinsics.checkNotNullParameter(cVar, "type");
        Intrinsics.checkNotNullParameter(function1, "runnerConstructor");
        this.type = cVar;
        this.layoutId = i;
        this.runnerConstructor = function1;
    }

    @Override
    @NotNull
    public View a(@NotNull RenderingT initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        View viewInflate = k.a(contextForNewView, container).inflate(this.layoutId, container, false);
        Function1<View, j<RenderingT>> function1 = this.runnerConstructor;
        Intrinsics.checkNotNullExpressionValue(viewInflate, "view");
        E.a(viewInflate, initialRendering, initialViewEnvironment, new a((j) function1.invoke(viewInflate)));
        Intrinsics.checkNotNullExpressionValue(viewInflate, "contextForNewView.viewBi…onment)\n        }\n      }");
        return viewInflate;
    }

    @Override
    @NotNull
    public fa.c<RenderingT> getType() {
        return this.type;
    }
}
