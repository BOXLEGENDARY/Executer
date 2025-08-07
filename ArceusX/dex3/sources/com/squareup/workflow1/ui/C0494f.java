package com.squareup.workflow1.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B=\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012&\u0010\u000b\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u0006¢\u0006\u0004\b\f\u0010\rJ1\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R4\u0010\u000b\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\n0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/squareup/workflow1/ui/f;", "", "RenderingT", "Lcom/squareup/workflow1/ui/A;", "Lfa/c;", "type", "Lkotlin/Function4;", "Lcom/squareup/workflow1/ui/y;", "Landroid/content/Context;", "Landroid/view/ViewGroup;", "Landroid/view/View;", "viewConstructor", "<init>", "(Lfa/c;Laa/o;)V", "initialRendering", "initialViewEnvironment", "contextForNewView", "container", "a", "(Ljava/lang/Object;Lcom/squareup/workflow1/ui/y;Landroid/content/Context;Landroid/view/ViewGroup;)Landroid/view/View;", "Lfa/c;", "getType", "()Lfa/c;", "b", "Laa/o;", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class C0494f<RenderingT> implements A<RenderingT> {

    @NotNull
    private final fa.c<RenderingT> type;

    @NotNull
    private final aa.o<RenderingT, ViewEnvironment, Context, ViewGroup, View> viewConstructor;

    public C0494f(@NotNull fa.c<RenderingT> cVar, @NotNull aa.o<? super RenderingT, ? super ViewEnvironment, ? super Context, ? super ViewGroup, ? extends View> oVar) {
        Intrinsics.checkNotNullParameter(cVar, "type");
        Intrinsics.checkNotNullParameter(oVar, "viewConstructor");
        this.type = cVar;
        this.viewConstructor = oVar;
    }

    @Override
    @NotNull
    public View a(@NotNull RenderingT initialRendering, @NotNull ViewEnvironment initialViewEnvironment, @NotNull Context contextForNewView, ViewGroup container) {
        Intrinsics.checkNotNullParameter(initialRendering, "initialRendering");
        Intrinsics.checkNotNullParameter(initialViewEnvironment, "initialViewEnvironment");
        Intrinsics.checkNotNullParameter(contextForNewView, "contextForNewView");
        return (View) this.viewConstructor.h(initialRendering, initialViewEnvironment, contextForNewView, container);
    }

    @Override
    @NotNull
    public fa.c<RenderingT> getType() {
        return this.type;
    }
}
