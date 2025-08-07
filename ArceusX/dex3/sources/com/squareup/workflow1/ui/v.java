package com.squareup.workflow1.ui;

import com.roblox.client.personasdk.R;
import ha.z0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/v;", "", "Lcom/squareup/workflow1/ui/r;", "controller", "Lha/z0;", "subscription", "<init>", "(Lcom/squareup/workflow1/ui/r;Lha/z0;)V", "a", "Lcom/squareup/workflow1/ui/r;", "()Lcom/squareup/workflow1/ui/r;", "b", "Lha/z0;", "()Lha/z0;", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
final class v {

    @NotNull
    private final r controller;

    @NotNull
    private final z0 subscription;

    public v(@NotNull r rVar, @NotNull z0 z0Var) {
        Intrinsics.checkNotNullParameter(rVar, "controller");
        Intrinsics.checkNotNullParameter(z0Var, "subscription");
        this.controller = rVar;
        this.subscription = z0Var;
    }

    @NotNull
    public final r getController() {
        return this.controller;
    }

    @NotNull
    public final z0 getSubscription() {
        return this.subscription;
    }
}
