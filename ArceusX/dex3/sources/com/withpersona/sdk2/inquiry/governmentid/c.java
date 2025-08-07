package com.withpersona.sdk2.inquiry.governmentid;

import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.governmentid.CaptureConfig;
import com.withpersona.sdk2.inquiry.governmentid.IdConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u0015\u0010\f\u001a\u00020\t*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0015\u0010\u0010\u001a\u00020\r*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;", "side", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "d", "(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$b;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig$IdSideConfig;", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "c", "(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "", "b", "(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)Ljava/lang/String;", "idClassKey", "LB8/b;", "a", "(Lcom/withpersona/sdk2/inquiry/governmentid/CaptureConfig;)LB8/b;", "idClass", "government-id_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class c {
    @NotNull
    public static final bb.b a(@NotNull CaptureConfig captureConfig) throws P9.m {
        Intrinsics.checkNotNullParameter(captureConfig, "<this>");
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            return bb.b.U;
        }
        if (captureConfig instanceof CaptureConfig.IdCaptureConfig) {
            return ((CaptureConfig.IdCaptureConfig) captureConfig).getId().getType();
        }
        throw new P9.m();
    }

    @NotNull
    public static final String b(@NotNull CaptureConfig captureConfig) throws P9.m {
        Intrinsics.checkNotNullParameter(captureConfig, "<this>");
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            return "auto-classification";
        }
        if (captureConfig instanceof CaptureConfig.IdCaptureConfig) {
            return ((CaptureConfig.IdCaptureConfig) captureConfig).getId().getIdClassKey();
        }
        throw new P9.m();
    }

    public static final IdConfig c(@NotNull CaptureConfig captureConfig) throws P9.m {
        Intrinsics.checkNotNullParameter(captureConfig, "<this>");
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            return null;
        }
        if (captureConfig instanceof CaptureConfig.IdCaptureConfig) {
            return ((CaptureConfig.IdCaptureConfig) captureConfig).getId();
        }
        throw new P9.m();
    }

    @NotNull
    public static final IdConfig.IdSideConfig d(@NotNull CaptureConfig captureConfig, @NotNull IdConfig.b bVar) throws P9.m {
        Intrinsics.checkNotNullParameter(captureConfig, "<this>");
        Intrinsics.checkNotNullParameter(bVar, "side");
        if (captureConfig instanceof CaptureConfig.AutoClassifyConfig) {
            return ((CaptureConfig.AutoClassifyConfig) captureConfig).getConfig().getIdSideConfig();
        }
        if (captureConfig instanceof CaptureConfig.IdCaptureConfig) {
            return ((CaptureConfig.IdCaptureConfig) captureConfig).getId().c(bVar);
        }
        throw new P9.m();
    }
}
