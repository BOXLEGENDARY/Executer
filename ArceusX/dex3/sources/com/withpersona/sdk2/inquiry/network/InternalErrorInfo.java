package com.withpersona.sdk2.inquiry.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.moshi.h;
import com.squareup.moshi.i;
import com.squareup.moshi.m;
import com.squareup.moshi.t;
import com.withpersona.sdk2.inquiry.network.ErrorResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public abstract class InternalErrorInfo implements Parcelable {

    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final h<Object> fallbackAdapter = new h<Object>() {
        public Object fromJson(@NotNull m mVar) {
            mVar.e();
            mVar.j();
            return null;
        }

        public void toJson(@NotNull t tVar, Object obj) {
            tVar.f().Z("message").b1("Error with class '" + (obj != null ? obj.getClass().getCanonicalName() : null) + "' does not have a json adapter registered.").y();
        }
    }.nullSafe();

    @i(generateAdapter = true)
    public static final class CameraErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<CameraErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<CameraErrorInfo> {
            @Override
            @NotNull
            public final CameraErrorInfo createFromParcel(@NotNull Parcel parcel) {
                return new CameraErrorInfo(parcel.readString());
            }

            @Override
            @NotNull
            public final CameraErrorInfo[] newArray(int i) {
                return new CameraErrorInfo[i];
            }
        }

        public CameraErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }

        public static CameraErrorInfo copy$default(CameraErrorInfo cameraErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cameraErrorInfo.message;
            }
            return cameraErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final CameraErrorInfo copy(@NotNull String str) {
            return new CameraErrorInfo(str);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CameraErrorInfo) && Intrinsics.b(this.message, ((CameraErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "CameraErrorInfo(message=" + this.message + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.message);
        }
    }

    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final h.e createAdapter() {
            return b8.b.b(InternalErrorInfo.class, "type").e(NetworkErrorInfo.class, "network").e(IntegrationErrorInfo.class, "integration").e(PermissionErrorInfo.class, "permission").e(CameraErrorInfo.class, "camera").e(ConfigurationErrorInfo.class, "configuration").e(UnknownErrorInfo.class, "unknown").d(InternalErrorInfo.fallbackAdapter);
        }

        private Companion() {
        }
    }

    @i(generateAdapter = true)
    public static final class ConfigurationErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<ConfigurationErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<ConfigurationErrorInfo> {
            @Override
            @NotNull
            public final ConfigurationErrorInfo createFromParcel(@NotNull Parcel parcel) {
                return new ConfigurationErrorInfo(parcel.readString());
            }

            @Override
            @NotNull
            public final ConfigurationErrorInfo[] newArray(int i) {
                return new ConfigurationErrorInfo[i];
            }
        }

        public ConfigurationErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }

        public static ConfigurationErrorInfo copy$default(ConfigurationErrorInfo configurationErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = configurationErrorInfo.message;
            }
            return configurationErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final ConfigurationErrorInfo copy(@NotNull String str) {
            return new ConfigurationErrorInfo(str);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ConfigurationErrorInfo) && Intrinsics.b(this.message, ((ConfigurationErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "ConfigurationErrorInfo(message=" + this.message + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.message);
        }
    }

    @i(generateAdapter = true)
    public static final class IntegrationErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<IntegrationErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<IntegrationErrorInfo> {
            @Override
            @NotNull
            public final IntegrationErrorInfo createFromParcel(@NotNull Parcel parcel) {
                return new IntegrationErrorInfo(parcel.readString());
            }

            @Override
            @NotNull
            public final IntegrationErrorInfo[] newArray(int i) {
                return new IntegrationErrorInfo[i];
            }
        }

        public IntegrationErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }

        public static IntegrationErrorInfo copy$default(IntegrationErrorInfo integrationErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = integrationErrorInfo.message;
            }
            return integrationErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final IntegrationErrorInfo copy(@NotNull String str) {
            return new IntegrationErrorInfo(str);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof IntegrationErrorInfo) && Intrinsics.b(this.message, ((IntegrationErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "IntegrationErrorInfo(message=" + this.message + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.message);
        }
    }

    @i(generateAdapter = true)
    public static final class NetworkErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<NetworkErrorInfo> CREATOR = new Creator();
        private final int code;
        private final boolean isRecoverable;
        private final String message;
        private final ErrorResponse.Error responseError;

        public static final class Creator implements Parcelable.Creator<NetworkErrorInfo> {
            @Override
            @NotNull
            public final NetworkErrorInfo createFromParcel(@NotNull Parcel parcel) {
                return new NetworkErrorInfo(parcel.readInt(), parcel.readString(), parcel.readInt() != 0, (ErrorResponse.Error) parcel.readParcelable(NetworkErrorInfo.class.getClassLoader()));
            }

            @Override
            @NotNull
            public final NetworkErrorInfo[] newArray(int i) {
                return new NetworkErrorInfo[i];
            }
        }

        public NetworkErrorInfo(int i, String str, boolean z, ErrorResponse.Error error, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, str, z, (i2 & 8) != 0 ? null : error);
        }

        public static NetworkErrorInfo copy$default(NetworkErrorInfo networkErrorInfo, int i, String str, boolean z, ErrorResponse.Error error, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = networkErrorInfo.code;
            }
            if ((i2 & 2) != 0) {
                str = networkErrorInfo.message;
            }
            if ((i2 & 4) != 0) {
                z = networkErrorInfo.isRecoverable;
            }
            if ((i2 & 8) != 0) {
                error = networkErrorInfo.responseError;
            }
            return networkErrorInfo.copy(i, str, z, error);
        }

        public final int component1() {
            return this.code;
        }

        public final String component2() {
            return this.message;
        }

        public final boolean component3() {
            return this.isRecoverable;
        }

        public final ErrorResponse.Error component4() {
            return this.responseError;
        }

        @NotNull
        public final NetworkErrorInfo copy(int i, String str, boolean z, ErrorResponse.Error error) {
            return new NetworkErrorInfo(i, str, z, error);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NetworkErrorInfo)) {
                return false;
            }
            NetworkErrorInfo networkErrorInfo = (NetworkErrorInfo) obj;
            return this.code == networkErrorInfo.code && Intrinsics.b(this.message, networkErrorInfo.message) && this.isRecoverable == networkErrorInfo.isRecoverable && Intrinsics.b(this.responseError, networkErrorInfo.responseError);
        }

        public final int getCode() {
            return this.code;
        }

        public final String getMessage() {
            return this.message;
        }

        public final ErrorResponse.Error getResponseError() {
            return this.responseError;
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.code) * 31;
            String str = this.message;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isRecoverable)) * 31;
            ErrorResponse.Error error = this.responseError;
            return iHashCode2 + (error != null ? error.hashCode() : 0);
        }

        public final boolean isRecoverable() {
            return this.isRecoverable;
        }

        @NotNull
        public String toString() {
            return "NetworkErrorInfo(code=" + this.code + ", message=" + this.message + ", isRecoverable=" + this.isRecoverable + ", responseError=" + this.responseError + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeInt(this.code);
            parcel.writeString(this.message);
            parcel.writeInt(this.isRecoverable ? 1 : 0);
            parcel.writeParcelable(this.responseError, i);
        }

        public NetworkErrorInfo(int i, String str, boolean z, ErrorResponse.Error error) {
            super(null);
            this.code = i;
            this.message = str;
            this.isRecoverable = z;
            this.responseError = error;
        }
    }

    @i(generateAdapter = true)
    public static final class NoDiskSpaceErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<NoDiskSpaceErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<NoDiskSpaceErrorInfo> {
            @Override
            @NotNull
            public final NoDiskSpaceErrorInfo createFromParcel(@NotNull Parcel parcel) {
                return new NoDiskSpaceErrorInfo(parcel.readString());
            }

            @Override
            @NotNull
            public final NoDiskSpaceErrorInfo[] newArray(int i) {
                return new NoDiskSpaceErrorInfo[i];
            }
        }

        public NoDiskSpaceErrorInfo() {
            String str = null;
            this(str, 1, str);
        }

        public static NoDiskSpaceErrorInfo copy$default(NoDiskSpaceErrorInfo noDiskSpaceErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = noDiskSpaceErrorInfo.message;
            }
            return noDiskSpaceErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final NoDiskSpaceErrorInfo copy(@NotNull String str) {
            return new NoDiskSpaceErrorInfo(str);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NoDiskSpaceErrorInfo) && Intrinsics.b(this.message, ((NoDiskSpaceErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "NoDiskSpaceErrorInfo(message=" + this.message + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.message);
        }

        public NoDiskSpaceErrorInfo(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "No disk space available." : str);
        }

        public NoDiskSpaceErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }
    }

    @i(generateAdapter = true)
    public static final class PermissionErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<PermissionErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<PermissionErrorInfo> {
            @Override
            @NotNull
            public final PermissionErrorInfo createFromParcel(@NotNull Parcel parcel) {
                return new PermissionErrorInfo(parcel.readString());
            }

            @Override
            @NotNull
            public final PermissionErrorInfo[] newArray(int i) {
                return new PermissionErrorInfo[i];
            }
        }

        public PermissionErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }

        public static PermissionErrorInfo copy$default(PermissionErrorInfo permissionErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = permissionErrorInfo.message;
            }
            return permissionErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final PermissionErrorInfo copy(@NotNull String str) {
            return new PermissionErrorInfo(str);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PermissionErrorInfo) && Intrinsics.b(this.message, ((PermissionErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "PermissionErrorInfo(message=" + this.message + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.message);
        }
    }

    @i(generateAdapter = true)
    public static final class UnknownErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<UnknownErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<UnknownErrorInfo> {
            @Override
            @NotNull
            public final UnknownErrorInfo createFromParcel(@NotNull Parcel parcel) {
                return new UnknownErrorInfo(parcel.readString());
            }

            @Override
            @NotNull
            public final UnknownErrorInfo[] newArray(int i) {
                return new UnknownErrorInfo[i];
            }
        }

        public UnknownErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }

        public static UnknownErrorInfo copy$default(UnknownErrorInfo unknownErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = unknownErrorInfo.message;
            }
            return unknownErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final UnknownErrorInfo copy(@NotNull String str) {
            return new UnknownErrorInfo(str);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnknownErrorInfo) && Intrinsics.b(this.message, ((UnknownErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "UnknownErrorInfo(message=" + this.message + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.message);
        }
    }

    @i(generateAdapter = true)
    public static final class WebRtcIntegrationErrorInfo extends InternalErrorInfo {

        @NotNull
        public static final Parcelable.Creator<WebRtcIntegrationErrorInfo> CREATOR = new Creator();

        @NotNull
        private final String message;

        public static final class Creator implements Parcelable.Creator<WebRtcIntegrationErrorInfo> {
            @Override
            @NotNull
            public final WebRtcIntegrationErrorInfo createFromParcel(@NotNull Parcel parcel) {
                return new WebRtcIntegrationErrorInfo(parcel.readString());
            }

            @Override
            @NotNull
            public final WebRtcIntegrationErrorInfo[] newArray(int i) {
                return new WebRtcIntegrationErrorInfo[i];
            }
        }

        public WebRtcIntegrationErrorInfo(@NotNull String str) {
            super(null);
            this.message = str;
        }

        public static WebRtcIntegrationErrorInfo copy$default(WebRtcIntegrationErrorInfo webRtcIntegrationErrorInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = webRtcIntegrationErrorInfo.message;
            }
            return webRtcIntegrationErrorInfo.copy(str);
        }

        @NotNull
        public final String component1() {
            return this.message;
        }

        @NotNull
        public final WebRtcIntegrationErrorInfo copy(@NotNull String str) {
            return new WebRtcIntegrationErrorInfo(str);
        }

        @Override
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof WebRtcIntegrationErrorInfo) && Intrinsics.b(this.message, ((WebRtcIntegrationErrorInfo) obj).message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public int hashCode() {
            return this.message.hashCode();
        }

        @NotNull
        public String toString() {
            return "WebRtcIntegrationErrorInfo(message=" + this.message + ")";
        }

        @Override
        public void writeToParcel(@NotNull Parcel parcel, int i) {
            parcel.writeString(this.message);
        }
    }

    public InternalErrorInfo(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private InternalErrorInfo() {
    }
}
