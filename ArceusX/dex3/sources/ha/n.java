package ha;

import P9.m;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.network.ErrorResponse;
import com.withpersona.sdk2.inquiry.network.InternalErrorInfo;
import com.withpersona.sdk2.inquiry.types.collected_data.ErrorCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;", "", "b", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)Ljava/lang/String;", "Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "a", "(Lcom/withpersona/sdk2/inquiry/network/InternalErrorInfo;)Lcom/withpersona/sdk2/inquiry/types/collected_data/ErrorCode;", "inquiry-internal_release"}, k = 2, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class n {
    @NotNull
    public static final ErrorCode a(@NotNull InternalErrorInfo internalErrorInfo) throws m {
        Intrinsics.checkNotNullParameter(internalErrorInfo, "<this>");
        if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
            return ErrorCode.v;
        }
        if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
            return ErrorCode.w;
        }
        if (!(internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo)) {
            if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
                return ErrorCode.e;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) {
                return ErrorCode.i;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) {
                return ErrorCode.B;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) {
                return ErrorCode.C;
            }
            if (internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) {
                return ErrorCode.A;
            }
            throw new m();
        }
        ErrorResponse.Error responseError = ((InternalErrorInfo.NetworkErrorInfo) internalErrorInfo).getResponseError();
        if (responseError instanceof ErrorResponse.Error.RateLimitExceededError) {
            return ErrorCode.z;
        }
        if (responseError instanceof ErrorResponse.Error.UnauthenticatedError) {
            return ErrorCode.y;
        }
        boolean z = true;
        if (!(responseError instanceof ErrorResponse.Error.FieldNotFoundError ? true : responseError instanceof ErrorResponse.Error.InactiveTemplateError ? true : responseError instanceof ErrorResponse.Error.InconsistentTransitionError ? true : responseError instanceof ErrorResponse.Error.TransitionFromTerminalStateError ? true : responseError instanceof ErrorResponse.Error.InvalidConfigError ? true : responseError instanceof ErrorResponse.Error.UnknownError ? true : responseError instanceof ErrorResponse.Error.InvalidFieldValueError) && responseError != null) {
            z = false;
        }
        if (z) {
            return ErrorCode.d;
        }
        throw new m();
    }

    @NotNull
    public static final String b(@NotNull InternalErrorInfo internalErrorInfo) throws m {
        Intrinsics.checkNotNullParameter(internalErrorInfo, "<this>");
        if (internalErrorInfo instanceof InternalErrorInfo.CameraErrorInfo) {
            return "Unable to find a suitable camera.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.IntegrationErrorInfo) {
            return "The SDK is misconfigured.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.NetworkErrorInfo) {
            return "There was a problem reaching the server.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.PermissionErrorInfo) {
            return "There was an issue with camera permissions.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.ConfigurationErrorInfo) {
            return "The SDK needs a template ID that starts with `itmpl_`. If your template ID starts with `tmpl_`, you should use version v1.x of the Persona Android SDK. https://docs.withpersona.com/docs/mobile-sdks-v1";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.NoDiskSpaceErrorInfo) {
            return "The device has no available disk space.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.WebRtcIntegrationErrorInfo) {
            return "WebRTC is listed as the preferred or only capture method, but it has not been configured for this project.";
        }
        if (internalErrorInfo instanceof InternalErrorInfo.UnknownErrorInfo) {
            return "An otherwise unexpected error occurred.";
        }
        throw new m();
    }
}
