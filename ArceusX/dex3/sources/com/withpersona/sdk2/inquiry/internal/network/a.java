package com.withpersona.sdk2.inquiry.internal.network;

import P9.m;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.internal.network.ErrorRequest;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "a", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest$a;", "inquiry-internal_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class a {
    @NotNull
    public static final ErrorRequest.a a(@NotNull InternalErrorInfo internalErrorInfo) throws m {
        Intrinsics.checkNotNullParameter(internalErrorInfo, "<this>");
        if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
            return ErrorRequest.a.Network;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
            return ErrorRequest.a.Other;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
            return ErrorRequest.a.Permissions;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
            return ErrorRequest.a.Camera;
        }
        if (!(internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) && !(internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo)) {
            throw new m();
        }
        return ErrorRequest.a.Other;
    }
}
