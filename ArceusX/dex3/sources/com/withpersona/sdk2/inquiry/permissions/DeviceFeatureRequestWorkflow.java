package com.withpersona.sdk2.inquiry.permissions;

import P9.m;
import P9.p;
import Q8.j;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.q;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.a;
import g9.C0582d;
import ha.L;
import j9.C0606i;
import j9.EnumC0605h;
import ka.InterfaceC0570h;
import ka.Snapshot;
import ka.k;
import ka.r;
import ka.w;
import ka.z;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l;
import okio.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003'#%B\u0019\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ1\u0010\u0011\u001a\u00020\u0010*\u00180\fR\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00032$\u0010\u001d\u001a 0\u001cR\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u0003H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/a$a;", "deviceFeatureRequestWorkerFactory", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/a$a;)V", "Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "output", "", "k", "(Lf8/r$c;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;)V", "l", "()V", "props", "Lf8/i;", "snapshot", "m", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;Lf8/i;)Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "renderProps", "renderState", "Lf8/k$a;", "context", "n", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;Lf8/k$a;)Ljava/lang/Object;", "state", "o", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;)Lf8/i;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/permissions/a$a;", "DeviceFeatureRequestState", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class DeviceFeatureRequestWorkflow extends k<Props, DeviceFeatureRequestState, Output, Object> {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final a.InterfaceC0148a deviceFeatureRequestWorkerFactory;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Landroid/os/Parcelable;", "()V", "CheckDeviceFeatureState", "Complete", "RequestDeviceFeature", "ShowDeviceFeaturePrompt", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$CheckDeviceFeatureState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class DeviceFeatureRequestState implements Parcelable {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$CheckDeviceFeatureState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class CheckDeviceFeatureState extends DeviceFeatureRequestState {

            @NotNull
            public static final CheckDeviceFeatureState d = new CheckDeviceFeatureState();

            @NotNull
            public static final Parcelable.Creator<CheckDeviceFeatureState> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckDeviceFeatureState> {
                @Override
                @NotNull
                public final CheckDeviceFeatureState createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckDeviceFeatureState.d;
                }

                @Override
                @NotNull
                public final CheckDeviceFeatureState[] newArray(int i) {
                    return new CheckDeviceFeatureState[i];
                }
            }

            private CheckDeviceFeatureState() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CheckDeviceFeatureState);
            }

            public int hashCode() {
                return -86189441;
            }

            @NotNull
            public String toString() {
                return "CheckDeviceFeatureState";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Complete extends DeviceFeatureRequestState {

            @NotNull
            public static final Complete d = new Complete();

            @NotNull
            public static final Parcelable.Creator<Complete> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<Complete> {
                @Override
                @NotNull
                public final Complete createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Complete.d;
                }

                @Override
                @NotNull
                public final Complete[] newArray(int i) {
                    return new Complete[i];
                }
            }

            private Complete() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Complete);
            }

            public int hashCode() {
                return 92238675;
            }

            @NotNull
            public String toString() {
                return "Complete";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class RequestDeviceFeature extends DeviceFeatureRequestState {

            @NotNull
            public static final RequestDeviceFeature d = new RequestDeviceFeature();

            @NotNull
            public static final Parcelable.Creator<RequestDeviceFeature> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RequestDeviceFeature> {
                @Override
                @NotNull
                public final RequestDeviceFeature createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestDeviceFeature.d;
                }

                @Override
                @NotNull
                public final RequestDeviceFeature[] newArray(int i) {
                    return new RequestDeviceFeature[i];
                }
            }

            private RequestDeviceFeature() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RequestDeviceFeature);
            }

            public int hashCode() {
                return 1991921803;
            }

            @NotNull
            public String toString() {
                return "RequestDeviceFeature";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState$ShowDeviceFeaturePrompt;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class ShowDeviceFeaturePrompt extends DeviceFeatureRequestState {

            @NotNull
            public static final ShowDeviceFeaturePrompt d = new ShowDeviceFeaturePrompt();

            @NotNull
            public static final Parcelable.Creator<ShowDeviceFeaturePrompt> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShowDeviceFeaturePrompt> {
                @Override
                @NotNull
                public final ShowDeviceFeaturePrompt createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowDeviceFeaturePrompt.d;
                }

                @Override
                @NotNull
                public final ShowDeviceFeaturePrompt[] newArray(int i) {
                    return new ShowDeviceFeaturePrompt[i];
                }
            }

            private ShowDeviceFeaturePrompt() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowDeviceFeaturePrompt);
            }

            public int hashCode() {
                return 725044653;
            }

            @NotNull
            public String toString() {
                return "ShowDeviceFeaturePrompt";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public DeviceFeatureRequestState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DeviceFeatureRequestState() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "deviceFeatureState", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "()Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureState;", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Output {

        @NotNull
        private final DeviceFeatureState deviceFeatureState;

        public Output(@NotNull DeviceFeatureState deviceFeatureState) {
            Intrinsics.checkNotNullParameter(deviceFeatureState, "deviceFeatureState");
            this.deviceFeatureState = deviceFeatureState;
        }

        @NotNull
        public final DeviceFeatureState getDeviceFeatureState() {
            return this.deviceFeatureState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Output) && Intrinsics.b(this.deviceFeatureState, ((Output) other).deviceFeatureState);
        }

        public int hashCode() {
            return this.deviceFeatureState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Output(deviceFeatureState=" + this.deviceFeatureState + ")";
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001a\u001a\u0004\b\u0019\u0010\u000eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 ¨\u0006!"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "", "LQ8/j;", "feature", "", "requestFeatureTitle", "requestFeatureRationale", "requestFeatureModalPositiveButton", "requestFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "<init>", "(LQ8/j;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LQ8/j;", "()LQ8/j;", "b", "Ljava/lang/String;", "e", "c", "d", "f", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Props {

        @NotNull
        private final j feature;

        private final String requestFeatureTitle;

        private final String requestFeatureRationale;

        private final String requestFeatureModalPositiveButton;

        private final String requestFeatureModalNegativeButton;

        private final StepStyle styles;

        public Props(@NotNull j jVar, String str, String str2, String str3, String str4, StepStyle stepStyle) {
            Intrinsics.checkNotNullParameter(jVar, "feature");
            this.feature = jVar;
            this.requestFeatureTitle = str;
            this.requestFeatureRationale = str2;
            this.requestFeatureModalPositiveButton = str3;
            this.requestFeatureModalNegativeButton = str4;
            this.styles = stepStyle;
        }

        @NotNull
        public final j getFeature() {
            return this.feature;
        }

        public final String getRequestFeatureModalNegativeButton() {
            return this.requestFeatureModalNegativeButton;
        }

        public final String getRequestFeatureModalPositiveButton() {
            return this.requestFeatureModalPositiveButton;
        }

        public final String getRequestFeatureRationale() {
            return this.requestFeatureRationale;
        }

        public final String getRequestFeatureTitle() {
            return this.requestFeatureTitle;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Props)) {
                return false;
            }
            Props props = (Props) other;
            return this.feature == props.feature && Intrinsics.b(this.requestFeatureTitle, props.requestFeatureTitle) && Intrinsics.b(this.requestFeatureRationale, props.requestFeatureRationale) && Intrinsics.b(this.requestFeatureModalPositiveButton, props.requestFeatureModalPositiveButton) && Intrinsics.b(this.requestFeatureModalNegativeButton, props.requestFeatureModalNegativeButton) && Intrinsics.b(this.styles, props.styles);
        }

        public final StepStyle getStyles() {
            return this.styles;
        }

        public int hashCode() {
            int iHashCode = this.feature.hashCode() * 31;
            String str = this.requestFeatureTitle;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.requestFeatureRationale;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.requestFeatureModalPositiveButton;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.requestFeatureModalNegativeButton;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            StepStyle stepStyle = this.styles;
            return iHashCode5 + (stepStyle != null ? stepStyle.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Props(feature=" + this.feature + ", requestFeatureTitle=" + this.requestFeatureTitle + ", requestFeatureRationale=" + this.requestFeatureRationale + ", requestFeatureModalPositiveButton=" + this.requestFeatureModalPositiveButton + ", requestFeatureModalNegativeButton=" + this.requestFeatureModalNegativeButton + ", styles=" + this.styles + ")";
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow$render$1", f = "DeviceFeatureRequestWorkflow.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final k<Props, DeviceFeatureRequestState, Output, Object>.a i;
        final Props v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Props, DeviceFeatureRequestState, ? extends Output>.c, Unit> {
            final DeviceFeatureRequestWorkflow d;
            final Props e;

            a(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props) {
                super(1);
                this.d = deviceFeatureRequestWorkflow;
                this.e = props;
            }

            public final void a(@NotNull r<? super Props, DeviceFeatureRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.k(cVar, new DeviceFeatureState(this.e.getFeature(), Q8.k.d));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends l implements Function1<r<? super Props, DeviceFeatureRequestState, ? extends Output>.c, Unit> {
            public static final b d = new b();

            b() {
                super(1);
            }

            public final void a(@NotNull r<? super Props, DeviceFeatureRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(DeviceFeatureRequestState.ShowDeviceFeaturePrompt.d);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        c(k<? super Props, DeviceFeatureRequestState, Output, ? extends Object>.a aVar, Props props, Continuation<? super c> continuation) {
            super(2, continuation);
            this.i = aVar;
            this.v = props;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return DeviceFeatureRequestWorkflow.this.new c(this.i, this.v, continuation);
        }

        public final Object invoke(@NotNull L l, Continuation<? super Unit> continuation) {
            return create(l, continuation).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(@NotNull Object obj) {
            S9.b.c();
            if (this.d != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p.b(obj);
            if (C0582d.b(DeviceFeatureRequestWorkflow.this.applicationContext)) {
                InterfaceC0570h<r<? super Props, DeviceFeatureRequestState, ? extends Output>> interfaceC0570hB = this.i.b();
                DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow = DeviceFeatureRequestWorkflow.this;
                interfaceC0570hB.d(z.d(deviceFeatureRequestWorkflow, null, new a(deviceFeatureRequestWorkflow, this.v), 1, null));
            } else {
                this.i.b().d(z.d(DeviceFeatureRequestWorkflow.this, null, b.d, 1, null));
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends l implements Function0<Unit> {
        final k<Props, DeviceFeatureRequestState, Output, Object>.a d;
        final DeviceFeatureRequestWorkflow e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Props, DeviceFeatureRequestState, ? extends Output>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull r<? super Props, DeviceFeatureRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(DeviceFeatureRequestState.RequestDeviceFeature.d);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        d(k<? super Props, DeviceFeatureRequestState, Output, ? extends Object>.a aVar, DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow) {
            super(0);
            this.d = aVar;
            this.e = deviceFeatureRequestWorkflow;
        }

        public Object invoke() {
            m521invoke();
            return Unit.a;
        }

        public final void m521invoke() {
            this.d.b().d(z.d(this.e, null, a.d, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class e extends l implements Function0<Unit> {
        final k<Props, DeviceFeatureRequestState, Output, Object>.a d;
        final DeviceFeatureRequestWorkflow e;
        final Props i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Props, DeviceFeatureRequestState, ? extends Output>.c, Unit> {
            final DeviceFeatureRequestWorkflow d;
            final Props e;

            a(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props) {
                super(1);
                this.d = deviceFeatureRequestWorkflow;
                this.e = props;
            }

            public final void a(@NotNull r<? super Props, DeviceFeatureRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.k(cVar, new DeviceFeatureState(this.e.getFeature(), Q8.k.e));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        e(k<? super Props, DeviceFeatureRequestState, Output, ? extends Object>.a aVar, DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props) {
            super(0);
            this.d = aVar;
            this.e = deviceFeatureRequestWorkflow;
            this.i = props;
        }

        public Object invoke() {
            m522invoke();
            return Unit.a;
        }

        public final void m522invoke() {
            InterfaceC0570h<r<? super Props, DeviceFeatureRequestState, ? extends Output>> interfaceC0570hB = this.d.b();
            DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow = this.e;
            interfaceC0570hB.d(z.d(deviceFeatureRequestWorkflow, null, new a(deviceFeatureRequestWorkflow, this.i), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/a$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/a$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class f extends l implements Function1<a.b, r<? super Props, DeviceFeatureRequestState, ? extends Output>> {
        final Props e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends l implements Function1<r<? super Props, DeviceFeatureRequestState, ? extends Output>.c, Unit> {
            final DeviceFeatureRequestWorkflow d;
            final Props e;

            a(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props) {
                super(1);
                this.d = deviceFeatureRequestWorkflow;
                this.e = props;
            }

            public final void a(@NotNull r<? super Props, DeviceFeatureRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.k(cVar, new DeviceFeatureState(this.e.getFeature(), Q8.k.d));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends l implements Function1<r<? super Props, DeviceFeatureRequestState, ? extends Output>.c, Unit> {
            final DeviceFeatureRequestWorkflow d;
            final Props e;

            b(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props) {
                super(1);
                this.d = deviceFeatureRequestWorkflow;
                this.e = props;
            }

            public final void a(@NotNull r<? super Props, DeviceFeatureRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.k(cVar, new DeviceFeatureState(this.e.getFeature(), Q8.k.e));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$DeviceFeatureRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class c extends l implements Function1<r<? super Props, DeviceFeatureRequestState, ? extends Output>.c, Unit> {
            final DeviceFeatureRequestWorkflow d;
            final Props e;

            c(DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow, Props props) {
                super(1);
                this.d = deviceFeatureRequestWorkflow;
                this.e = props;
            }

            public final void a(@NotNull r<? super Props, DeviceFeatureRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.k(cVar, new DeviceFeatureState(this.e.getFeature(), Q8.k.i));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        f(Props props) {
            super(1);
            this.e = props;
        }

        @NotNull
        public final r<Props, DeviceFeatureRequestState, Output> invoke(@NotNull a.b bVar) throws m {
            Intrinsics.checkNotNullParameter(bVar, "it");
            if (bVar instanceof a.b.c) {
                DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow = DeviceFeatureRequestWorkflow.this;
                return z.d(deviceFeatureRequestWorkflow, null, new a(deviceFeatureRequestWorkflow, this.e), 1, null);
            }
            if (bVar instanceof a.b.C0149a) {
                DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow2 = DeviceFeatureRequestWorkflow.this;
                return z.d(deviceFeatureRequestWorkflow2, null, new b(deviceFeatureRequestWorkflow2, this.e), 1, null);
            }
            if (!(bVar instanceof a.b.C0150b)) {
                throw new m();
            }
            DeviceFeatureRequestWorkflow.this.l();
            DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow3 = DeviceFeatureRequestWorkflow.this;
            return z.d(deviceFeatureRequestWorkflow3, null, new c(deviceFeatureRequestWorkflow3, this.e), 1, null);
        }
    }

    public DeviceFeatureRequestWorkflow(@NotNull Context context, @NotNull a.InterfaceC0148a interfaceC0148a) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(interfaceC0148a, "deviceFeatureRequestWorkerFactory");
        this.applicationContext = context;
        this.deviceFeatureRequestWorkerFactory = interfaceC0148a;
    }

    public final void k(r<? super Props, DeviceFeatureRequestState, Output>.c cVar, DeviceFeatureState deviceFeatureState) {
        cVar.d(new Output(deviceFeatureState));
    }

    public final void l() {
        Intent intent = new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        intent.setFlags(268435456);
        this.applicationContext.startActivity(intent);
    }

    @Override
    @NotNull
    public DeviceFeatureRequestState d(@NotNull Props props, Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            h hVarB = snapshot.b();
            Parcelable parcelable = null;
            if (hVarB.E() <= 0) {
                hVarB = null;
            }
            if (hVarB != null) {
                Parcel parcelObtain = Parcel.obtain();
                Intrinsics.checkNotNullExpressionValue(parcelObtain, "obtain()");
                byte[] bArrJ = hVarB.J();
                parcelObtain.unmarshall(bArrJ, 0, bArrJ.length);
                parcelObtain.setDataPosition(0);
                parcelable = parcelObtain.readParcelable(Snapshot.class.getClassLoader());
                Intrinsics.d(parcelable);
                Intrinsics.checkNotNullExpressionValue(parcelable, "parcel.readParcelable<T>…class.java.classLoader)!!");
                parcelObtain.recycle();
            }
            DeviceFeatureRequestState deviceFeatureRequestState = (DeviceFeatureRequestState) parcelable;
            if (deviceFeatureRequestState != null) {
                return deviceFeatureRequestState;
            }
        }
        return DeviceFeatureRequestState.CheckDeviceFeatureState.d;
    }

    @Override
    public Object f(@NotNull Props renderProps, @NotNull DeviceFeatureRequestState renderState, @NotNull k<? super Props, DeviceFeatureRequestState, Output, ? extends Object>.a context) throws m {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        C0606i c0606i = null;
        if (Intrinsics.b(renderState, DeviceFeatureRequestState.CheckDeviceFeatureState.d)) {
            context.a("check_device_feature_state", new c(context, renderProps, null));
        } else if (Intrinsics.b(renderState, DeviceFeatureRequestState.ShowDeviceFeaturePrompt.d)) {
            String requestFeatureTitle = renderProps.getRequestFeatureTitle();
            if (requestFeatureTitle == null) {
                requestFeatureTitle = "Couldn't access location feature";
            }
            String str = requestFeatureTitle;
            String requestFeatureRationale = renderProps.getRequestFeatureRationale();
            if (requestFeatureRationale == null) {
                requestFeatureRationale = "Location is turned off, please allow access to your device's location feature";
            }
            String str2 = requestFeatureRationale;
            String requestFeatureModalPositiveButton = renderProps.getRequestFeatureModalPositiveButton();
            if (requestFeatureModalPositiveButton == null) {
                requestFeatureModalPositiveButton = "Allow";
            }
            String str3 = requestFeatureModalPositiveButton;
            StepStyle styles = renderProps.getStyles();
            d dVar = new d(context, this);
            String requestFeatureModalNegativeButton = renderProps.getRequestFeatureModalNegativeButton();
            if (requestFeatureModalNegativeButton == null) {
                requestFeatureModalNegativeButton = "Cancel";
            }
            c0606i = new C0606i(new Q8.e(str, str2, str3, styles, dVar, requestFeatureModalNegativeButton, new e(context, this, renderProps)), EnumC0605h.i);
        } else if (Intrinsics.b(renderState, DeviceFeatureRequestState.RequestDeviceFeature.d)) {
            w.l(context, this.deviceFeatureRequestWorkerFactory.a(), kotlin.jvm.internal.z.j(a.class), "", new f(renderProps));
        } else if (!Intrinsics.b(renderState, DeviceFeatureRequestState.Complete.d)) {
            throw new m();
        }
        return c0606i;
    }

    @Override
    @NotNull
    public Snapshot g(@NotNull DeviceFeatureRequestState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return q.a(state);
    }
}
