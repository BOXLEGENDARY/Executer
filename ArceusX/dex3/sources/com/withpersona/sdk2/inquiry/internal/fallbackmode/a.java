package com.withpersona.sdk2.inquiry.internal.fallbackmode;

import P9.m;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.c;
import com.withpersona.sdk2.inquiry.internal.fallbackmode.f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/a;", "", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;", "params", "<init>", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;)V", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;", "fallbackModeApiController", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;", "offlineModeApiController", "LI8/a;", "a", "(Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/d;Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/f$a;)LI8/a;", "Lcom/withpersona/sdk2/inquiry/internal/fallbackmode/c;", "inquiry-internal_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a {

    @NotNull
    private final c params;

    public a(@NotNull c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "params");
        this.params = cVar;
    }

    @NotNull
    public final I8.a a(@NotNull d fallbackModeApiController, @NotNull f.a offlineModeApiController) throws m {
        Intrinsics.checkNotNullParameter(fallbackModeApiController, "fallbackModeApiController");
        Intrinsics.checkNotNullParameter(offlineModeApiController, "offlineModeApiController");
        c cVar = this.params;
        if (cVar instanceof c.b) {
            return offlineModeApiController.a(((c.b) cVar).getStaticTemplateResourceId());
        }
        if (cVar instanceof c.a) {
            return fallbackModeApiController;
        }
        throw new m();
    }
}
