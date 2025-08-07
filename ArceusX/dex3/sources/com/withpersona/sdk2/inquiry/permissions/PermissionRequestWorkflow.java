package com.withpersona.sdk2.inquiry.permissions;

import P9.p;
import Q8.CheckRequestPermissionRationaleStateView;
import Q8.m;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.squareup.workflow1.ui.q;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.Title;
import com.withpersona.sdk2.inquiry.network.dto.ui.styling.StepStyle;
import com.withpersona.sdk2.inquiry.permissions.DeviceFeatureRequestWorkflow;
import com.withpersona.sdk2.inquiry.permissions.c;
import ha.L;
import j9.C0606i;
import j9.EnumC0605h;
import ka.InterfaceC0563a;
import ka.InterfaceC0570h;
import ka.Snapshot;
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
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001:\u0003%+'B!\b\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\u0015\u001a\u00020\u000e*\u00180\u0011R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u0004\u0018\u00010\u00052\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00032$\u0010\u001f\u001a 0\u001eR\u001c\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0001H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u0003H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow;", "Lf8/k;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "Landroid/content/Context;", "applicationContext", "Lcom/withpersona/sdk2/inquiry/permissions/c$a;", "permissionRequestWorkerFactory", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;", "deviceFeatureRequestWorkflow", "<init>", "(Landroid/content/Context;Lcom/withpersona/sdk2/inquiry/permissions/c$a;Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;)V", "", "m", "()V", "Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "output", "k", "(Lf8/r$c;Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "props", "Lf8/i;", "snapshot", "l", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;Lf8/i;)Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "renderProps", "renderState", "Lf8/k$a;", "context", "n", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;Lf8/k$a;)Ljava/lang/Object;", "state", "o", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;)Lf8/i;", "a", "Landroid/content/Context;", "b", "Lcom/withpersona/sdk2/inquiry/permissions/c$a;", "c", "Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow;", "PermissionRequestState", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class PermissionRequestWorkflow extends ka.k<Props, PermissionRequestState, Output, Object> {

    @NotNull
    private final Context applicationContext;

    @NotNull
    private final c.a permissionRequestWorkerFactory;

    @NotNull
    private final DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0003\u0004\u0005\u0006\u0007\b\t\nB\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\b\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Landroid/os/Parcelable;", "()V", "CheckPermissionPermanentlyDenied", "CheckPermissionRationaleState", "CheckPermissionState", "Complete", "RequestDeviceFeature", "RequestPermission", "ShowPermissionPermanentlyDeniedMessage", "ShowRequestPermissionRationale", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static abstract class PermissionRequestState implements Parcelable {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionPermanentlyDenied;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class CheckPermissionPermanentlyDenied extends PermissionRequestState {

            @NotNull
            public static final CheckPermissionPermanentlyDenied d = new CheckPermissionPermanentlyDenied();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionPermanentlyDenied> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckPermissionPermanentlyDenied> {
                @Override
                @NotNull
                public final CheckPermissionPermanentlyDenied createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionPermanentlyDenied.d;
                }

                @Override
                @NotNull
                public final CheckPermissionPermanentlyDenied[] newArray(int i) {
                    return new CheckPermissionPermanentlyDenied[i];
                }
            }

            private CheckPermissionPermanentlyDenied() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CheckPermissionPermanentlyDenied);
            }

            public int hashCode() {
                return -367421189;
            }

            @NotNull
            public String toString() {
                return "CheckPermissionPermanentlyDenied";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionRationaleState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class CheckPermissionRationaleState extends PermissionRequestState {

            @NotNull
            public static final CheckPermissionRationaleState d = new CheckPermissionRationaleState();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionRationaleState> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckPermissionRationaleState> {
                @Override
                @NotNull
                public final CheckPermissionRationaleState createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionRationaleState.d;
                }

                @Override
                @NotNull
                public final CheckPermissionRationaleState[] newArray(int i) {
                    return new CheckPermissionRationaleState[i];
                }
            }

            private CheckPermissionRationaleState() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CheckPermissionRationaleState);
            }

            public int hashCode() {
                return -1860465355;
            }

            @NotNull
            public String toString() {
                return "CheckPermissionRationaleState";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$CheckPermissionState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class CheckPermissionState extends PermissionRequestState {

            @NotNull
            public static final CheckPermissionState d = new CheckPermissionState();

            @NotNull
            public static final Parcelable.Creator<CheckPermissionState> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<CheckPermissionState> {
                @Override
                @NotNull
                public final CheckPermissionState createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return CheckPermissionState.d;
                }

                @Override
                @NotNull
                public final CheckPermissionState[] newArray(int i) {
                    return new CheckPermissionState[i];
                }
            }

            private CheckPermissionState() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof CheckPermissionState);
            }

            public int hashCode() {
                return -885686570;
            }

            @NotNull
            public String toString() {
                return "CheckPermissionState";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$Complete;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class Complete extends PermissionRequestState {

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
                return 1563807797;
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestDeviceFeature;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class RequestDeviceFeature extends PermissionRequestState {

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
                return -1821218195;
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

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$RequestPermission;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class RequestPermission extends PermissionRequestState {

            @NotNull
            public static final RequestPermission d = new RequestPermission();

            @NotNull
            public static final Parcelable.Creator<RequestPermission> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RequestPermission> {
                @Override
                @NotNull
                public final RequestPermission createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return RequestPermission.d;
                }

                @Override
                @NotNull
                public final RequestPermission[] newArray(int i) {
                    return new RequestPermission[i];
                }
            }

            private RequestPermission() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RequestPermission);
            }

            public int hashCode() {
                return -2052298174;
            }

            @NotNull
            public String toString() {
                return "RequestPermission";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowPermissionPermanentlyDeniedMessage;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class ShowPermissionPermanentlyDeniedMessage extends PermissionRequestState {

            @NotNull
            public static final ShowPermissionPermanentlyDeniedMessage d = new ShowPermissionPermanentlyDeniedMessage();

            @NotNull
            public static final Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShowPermissionPermanentlyDeniedMessage> {
                @Override
                @NotNull
                public final ShowPermissionPermanentlyDeniedMessage createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowPermissionPermanentlyDeniedMessage.d;
                }

                @Override
                @NotNull
                public final ShowPermissionPermanentlyDeniedMessage[] newArray(int i) {
                    return new ShowPermissionPermanentlyDeniedMessage[i];
                }
            }

            private ShowPermissionPermanentlyDeniedMessage() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowPermissionPermanentlyDeniedMessage);
            }

            public int hashCode() {
                return -1723010119;
            }

            @NotNull
            public String toString() {
                return "ShowPermissionPermanentlyDeniedMessage";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState$ShowRequestPermissionRationale;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
        public static final class ShowRequestPermissionRationale extends PermissionRequestState {

            @NotNull
            public static final ShowRequestPermissionRationale d = new ShowRequestPermissionRationale();

            @NotNull
            public static final Parcelable.Creator<ShowRequestPermissionRationale> CREATOR = new a();

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<ShowRequestPermissionRationale> {
                @Override
                @NotNull
                public final ShowRequestPermissionRationale createFromParcel(@NotNull Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ShowRequestPermissionRationale.d;
                }

                @Override
                @NotNull
                public final ShowRequestPermissionRationale[] newArray(int i) {
                    return new ShowRequestPermissionRationale[i];
                }
            }

            private ShowRequestPermissionRationale() {
                super(null);
            }

            @Override
            public int describeContents() {
                return 0;
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof ShowRequestPermissionRationale);
            }

            public int hashCode() {
                return 120525746;
            }

            @NotNull
            public String toString() {
                return "ShowRequestPermissionRationale";
            }

            @Override
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeInt(1);
            }
        }

        public PermissionRequestState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private PermissionRequestState() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissionState", "<init>", "(Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "()Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Output {

        @NotNull
        private final PermissionState permissionState;

        public Output(@NotNull PermissionState permissionState) {
            Intrinsics.checkNotNullParameter(permissionState, "permissionState");
            this.permissionState = permissionState;
        }

        @NotNull
        public final PermissionState getPermissionState() {
            return this.permissionState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Output) && Intrinsics.b(this.permissionState, ((Output) other).permissionState);
        }

        public int hashCode() {
            return this.permissionState.hashCode();
        }

        @NotNull
        public String toString() {
            return "Output(permissionState=" + this.permissionState + ")";
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010$\u001a\u0004\b(\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010$\u001a\u0004\b)\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b&\u0010\u0014R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b#\u0010\u0014R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b\u001f\u0010\u0014R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b\u001b\u0010\u0014R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b%\u0010+\u001a\u0004\b*\u0010,R\u0011\u0010.\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010\"¨\u0006/"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "", "LQ8/l;", "permission", "", "optional", "", Title.type, "rationale", "rationaleWhenPermanentlyDenied", "positiveButtonText", "negativeButtonText", "gpsFeatureTitle", "gpsFeatureRationale", "gpsFeatureModalNegativeButton", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "styles", "<init>", "(LQ8/l;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "LQ8/l;", "f", "()LQ8/l;", "b", "Z", "e", "()Z", "c", "Ljava/lang/String;", "k", "d", "h", "i", "g", "j", "Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "()Lcom/withpersona/sdk2/inquiry/network/dto/ui/styling/StepStyle;", "l", "isPermissionLocation", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class Props {

        @NotNull
        private final Q8.l permission;

        private final boolean optional;

        @NotNull
        private final String title;

        @NotNull
        private final String rationale;

        @NotNull
        private final String rationaleWhenPermanentlyDenied;

        private final String positiveButtonText;

        private final String negativeButtonText;

        private final String gpsFeatureTitle;

        private final String gpsFeatureRationale;

        private final String gpsFeatureModalNegativeButton;

        private final StepStyle styles;

        public Props(@NotNull Q8.l lVar, boolean z, @NotNull String str, @NotNull String str2, @NotNull String str3, String str4, String str5, String str6, String str7, String str8, StepStyle stepStyle) {
            Intrinsics.checkNotNullParameter(lVar, "permission");
            Intrinsics.checkNotNullParameter(str, Title.type);
            Intrinsics.checkNotNullParameter(str2, "rationale");
            Intrinsics.checkNotNullParameter(str3, "rationaleWhenPermanentlyDenied");
            this.permission = lVar;
            this.optional = z;
            this.title = str;
            this.rationale = str2;
            this.rationaleWhenPermanentlyDenied = str3;
            this.positiveButtonText = str4;
            this.negativeButtonText = str5;
            this.gpsFeatureTitle = str6;
            this.gpsFeatureRationale = str7;
            this.gpsFeatureModalNegativeButton = str8;
            this.styles = stepStyle;
        }

        public final String getGpsFeatureModalNegativeButton() {
            return this.gpsFeatureModalNegativeButton;
        }

        public final String getGpsFeatureRationale() {
            return this.gpsFeatureRationale;
        }

        public final String getGpsFeatureTitle() {
            return this.gpsFeatureTitle;
        }

        public final String getNegativeButtonText() {
            return this.negativeButtonText;
        }

        public final boolean getOptional() {
            return this.optional;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Props)) {
                return false;
            }
            Props props = (Props) other;
            return this.permission == props.permission && this.optional == props.optional && Intrinsics.b(this.title, props.title) && Intrinsics.b(this.rationale, props.rationale) && Intrinsics.b(this.rationaleWhenPermanentlyDenied, props.rationaleWhenPermanentlyDenied) && Intrinsics.b(this.positiveButtonText, props.positiveButtonText) && Intrinsics.b(this.negativeButtonText, props.negativeButtonText) && Intrinsics.b(this.gpsFeatureTitle, props.gpsFeatureTitle) && Intrinsics.b(this.gpsFeatureRationale, props.gpsFeatureRationale) && Intrinsics.b(this.gpsFeatureModalNegativeButton, props.gpsFeatureModalNegativeButton) && Intrinsics.b(this.styles, props.styles);
        }

        @NotNull
        public final Q8.l getPermission() {
            return this.permission;
        }

        public final String getPositiveButtonText() {
            return this.positiveButtonText;
        }

        @NotNull
        public final String getRationale() {
            return this.rationale;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.permission.hashCode() * 31) + Boolean.hashCode(this.optional)) * 31) + this.title.hashCode()) * 31) + this.rationale.hashCode()) * 31) + this.rationaleWhenPermanentlyDenied.hashCode()) * 31;
            String str = this.positiveButtonText;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.negativeButtonText;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gpsFeatureTitle;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.gpsFeatureRationale;
            int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.gpsFeatureModalNegativeButton;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            StepStyle stepStyle = this.styles;
            return iHashCode6 + (stepStyle != null ? stepStyle.hashCode() : 0);
        }

        @NotNull
        public final String getRationaleWhenPermanentlyDenied() {
            return this.rationaleWhenPermanentlyDenied;
        }

        public final StepStyle getStyles() {
            return this.styles;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final boolean l() {
            Q8.l lVar = this.permission;
            return lVar == Q8.l.i || lVar == Q8.l.v;
        }

        @NotNull
        public String toString() {
            return "Props(permission=" + this.permission + ", optional=" + this.optional + ", title=" + this.title + ", rationale=" + this.rationale + ", rationaleWhenPermanentlyDenied=" + this.rationaleWhenPermanentlyDenied + ", positiveButtonText=" + this.positiveButtonText + ", negativeButtonText=" + this.negativeButtonText + ", gpsFeatureTitle=" + this.gpsFeatureTitle + ", gpsFeatureRationale=" + this.gpsFeatureRationale + ", gpsFeatureModalNegativeButton=" + this.gpsFeatureModalNegativeButton + ", styles=" + this.styles + ")";
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$1", f = "PermissionRequestWorkflow.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class c extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final Props i;
        final ka.k<Props, PermissionRequestState, Output, Object>.a v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(PermissionRequestState.RequestDeviceFeature.d);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
            public static final b d = new b();

            b() {
                super(1);
            }

            public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(PermissionRequestState.CheckPermissionRationaleState.d);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        c(Props props, ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.i = props;
            this.v = aVar;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return PermissionRequestWorkflow.this.new c(this.i, this.v, continuation);
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
            if (com.withpersona.sdk2.inquiry.permissions.d.b(PermissionRequestWorkflow.this.applicationContext, this.i.getPermission())) {
                this.v.b().d(z.d(PermissionRequestWorkflow.this, null, a.d, 1, null));
            } else {
                this.v.b().d(z.d(PermissionRequestWorkflow.this, null, b.d, 1, null));
            }
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class d extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Props, PermissionRequestState, Output, Object>.a d;
        final PermissionRequestWorkflow e;
        final Props i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
            final PermissionRequestWorkflow d;
            final Props e;

            a(PermissionRequestWorkflow permissionRequestWorkflow, Props props) {
                super(1);
                this.d = permissionRequestWorkflow;
                this.e = props;
            }

            public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.k(cVar, new PermissionState(this.e.getPermission(), m.e));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        d(ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, Props props) {
            super(0);
            this.d = aVar;
            this.e = permissionRequestWorkflow;
            this.i = props;
        }

        public Object invoke() {
            m523invoke();
            return Unit.a;
        }

        public final void m523invoke() {
            InterfaceC0570h<r<? super Props, PermissionRequestState, ? extends Output>> interfaceC0570hB = this.d.b();
            PermissionRequestWorkflow permissionRequestWorkflow = this.e;
            interfaceC0570hB.d(z.d(permissionRequestWorkflow, null, new a(permissionRequestWorkflow, this.i), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldShowRationale", "", "a", "(Z)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class e extends kotlin.jvm.internal.l implements Function1<Boolean, Unit> {
        final ka.k<Props, PermissionRequestState, Output, Object>.a d;
        final PermissionRequestWorkflow e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
            final boolean d;

            a(boolean z) {
                super(1);
                this.d = z;
            }

            public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (this.d) {
                    cVar.e(PermissionRequestState.ShowRequestPermissionRationale.d);
                } else {
                    cVar.e(PermissionRequestState.RequestPermission.d);
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        e(ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, PermissionRequestWorkflow permissionRequestWorkflow) {
            super(1);
            this.d = aVar;
            this.e = permissionRequestWorkflow;
        }

        public final void a(boolean z) {
            this.d.b().d(z.d(this.e, null, new a(z), 1, null));
        }

        public Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class f extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Props, PermissionRequestState, Output, Object>.a d;
        final PermissionRequestWorkflow e;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
            public static final a d = new a();

            a() {
                super(1);
            }

            public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                cVar.e(PermissionRequestState.RequestPermission.d);
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        f(ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, PermissionRequestWorkflow permissionRequestWorkflow) {
            super(0);
            this.d = aVar;
            this.e = permissionRequestWorkflow;
        }

        public Object invoke() {
            m524invoke();
            return Unit.a;
        }

        public final void m524invoke() {
            this.d.b().d(z.d(this.e, null, a.d, 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class g extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Props, PermissionRequestState, Output, Object>.a d;
        final PermissionRequestWorkflow e;
        final Props i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
            final PermissionRequestWorkflow d;
            final Props e;

            a(PermissionRequestWorkflow permissionRequestWorkflow, Props props) {
                super(1);
                this.d = permissionRequestWorkflow;
                this.e = props;
            }

            public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.k(cVar, new PermissionState(this.e.getPermission(), m.e));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        g(ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, Props props) {
            super(0);
            this.d = aVar;
            this.e = permissionRequestWorkflow;
            this.i = props;
        }

        public Object invoke() {
            m525invoke();
            return Unit.a;
        }

        public final void m525invoke() {
            InterfaceC0570h<r<? super Props, PermissionRequestState, ? extends Output>> interfaceC0570hB = this.d.b();
            PermissionRequestWorkflow permissionRequestWorkflow = this.e;
            interfaceC0570hB.d(z.d(permissionRequestWorkflow, null, new a(permissionRequestWorkflow, this.i), 1, null));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/c$b;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/c$b;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class h extends kotlin.jvm.internal.l implements Function1<c.b, r<? super Props, PermissionRequestState, ? extends Output>> {
        final ka.k<Props, PermissionRequestState, Output, Object>.a e;
        final Props i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
            final ka.k<Props, PermissionRequestState, Output, Object>.a d;
            final PermissionRequestWorkflow e;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0144a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
                public static final C0144a d = new C0144a();

                C0144a() {
                    super(1);
                }

                public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$action");
                    cVar.e(PermissionRequestState.RequestDeviceFeature.d);
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            a(ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, PermissionRequestWorkflow permissionRequestWorkflow) {
                super(1);
                this.d = aVar;
                this.e = permissionRequestWorkflow;
            }

            public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.b().d(z.d(this.e, null, C0144a.d, 1, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class b extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
            final ka.k<Props, PermissionRequestState, Output, Object>.a d;
            final PermissionRequestWorkflow e;
            final Props i;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
                final PermissionRequestWorkflow d;
                final Props e;

                a(PermissionRequestWorkflow permissionRequestWorkflow, Props props) {
                    super(1);
                    this.d = permissionRequestWorkflow;
                    this.e = props;
                }

                public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$action");
                    this.d.k(cVar, new PermissionState(this.e.getPermission(), m.e));
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0145b extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
                public static final C0145b d = new C0145b();

                C0145b() {
                    super(1);
                }

                public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$action");
                    cVar.e(PermissionRequestState.CheckPermissionPermanentlyDenied.d);
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            b(ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, Props props) {
                super(1);
                this.d = aVar;
                this.e = permissionRequestWorkflow;
                this.i = props;
            }

            public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (!cVar.b().getOptional()) {
                    this.d.b().d(z.d(this.e, null, C0145b.d, 1, null));
                    return;
                }
                InterfaceC0570h<r<? super Props, PermissionRequestState, ? extends Output>> interfaceC0570hB = this.d.b();
                PermissionRequestWorkflow permissionRequestWorkflow = this.e;
                interfaceC0570hB.d(z.d(permissionRequestWorkflow, null, new a(permissionRequestWorkflow, this.i), 1, null));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        h(ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, Props props) {
            super(1);
            this.e = aVar;
            this.i = props;
        }

        @NotNull
        public final r<Props, PermissionRequestState, Output> invoke(@NotNull c.b bVar) throws P9.m {
            Intrinsics.checkNotNullParameter(bVar, "it");
            if (Intrinsics.b(bVar, c.b.C0153b.a)) {
                PermissionRequestWorkflow permissionRequestWorkflow = PermissionRequestWorkflow.this;
                return z.d(permissionRequestWorkflow, null, new a(this.e, permissionRequestWorkflow), 1, null);
            }
            if (!Intrinsics.b(bVar, c.b.a.a)) {
                throw new P9.m();
            }
            PermissionRequestWorkflow permissionRequestWorkflow2 = PermissionRequestWorkflow.this;
            return z.d(permissionRequestWorkflow2, null, new b(this.e, permissionRequestWorkflow2, this.i), 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;", "it", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "a", "(Lcom/withpersona/sdk2/inquiry/permissions/DeviceFeatureRequestWorkflow$a;)Lf8/r;"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class i extends kotlin.jvm.internal.l implements Function1<DeviceFeatureRequestWorkflow.Output, r<? super Props, PermissionRequestState, ? extends Output>> {
        final ka.k<Props, PermissionRequestState, Output, Object>.a e;
        final Props i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
            final DeviceFeatureRequestWorkflow.Output d;
            final ka.k<Props, PermissionRequestState, Output, Object>.a e;
            final PermissionRequestWorkflow i;
            final Props v;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0146a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
                final PermissionRequestWorkflow d;
                final Props e;

                C0146a(PermissionRequestWorkflow permissionRequestWorkflow, Props props) {
                    super(1);
                    this.d = permissionRequestWorkflow;
                    this.e = props;
                }

                public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$action");
                    this.d.k(cVar, new PermissionState(this.e.getPermission(), m.d));
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class b extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
                final PermissionRequestWorkflow d;
                final Props e;

                b(PermissionRequestWorkflow permissionRequestWorkflow, Props props) {
                    super(1);
                    this.d = permissionRequestWorkflow;
                    this.e = props;
                }

                public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$action");
                    this.d.k(cVar, new PermissionState(this.e.getPermission(), m.i));
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
            public class c {
                public static final int[] a;

                static {
                    int[] iArr = new int[Q8.k.values().length];
                    try {
                        iArr[Q8.k.d.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Q8.k.e.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Q8.k.i.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            a(DeviceFeatureRequestWorkflow.Output output, ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, Props props) {
                super(1);
                this.d = output;
                this.e = aVar;
                this.i = permissionRequestWorkflow;
                this.v = props;
            }

            public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                int i = c.a[this.d.getDeviceFeatureState().getResult().ordinal()];
                if (i == 1) {
                    InterfaceC0570h<r<? super Props, PermissionRequestState, ? extends Output>> interfaceC0570hB = this.e.b();
                    PermissionRequestWorkflow permissionRequestWorkflow = this.i;
                    interfaceC0570hB.d(z.d(permissionRequestWorkflow, null, new C0146a(permissionRequestWorkflow, this.v), 1, null));
                } else if (i == 2) {
                    this.i.k(cVar, new PermissionState(this.v.getPermission(), m.e));
                } else {
                    if (i != 3) {
                        return;
                    }
                    InterfaceC0570h<r<? super Props, PermissionRequestState, ? extends Output>> interfaceC0570hB2 = this.e.b();
                    PermissionRequestWorkflow permissionRequestWorkflow2 = this.i;
                    interfaceC0570hB2.d(z.d(permissionRequestWorkflow2, null, new b(permissionRequestWorkflow2, this.v), 1, null));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        i(ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, Props props) {
            super(1);
            this.e = aVar;
            this.i = props;
        }

        @NotNull
        public final r<Props, PermissionRequestState, Output> invoke(@NotNull DeviceFeatureRequestWorkflow.Output output) {
            Intrinsics.checkNotNullParameter(output, "it");
            PermissionRequestWorkflow permissionRequestWorkflow = PermissionRequestWorkflow.this;
            return z.d(permissionRequestWorkflow, null, new a(output, this.e, permissionRequestWorkflow, this.i), 1, null);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow$render$7", f = "PermissionRequestWorkflow.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lha/L;", "", "<anonymous>", "(Lha/L;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class j extends kotlin.coroutines.jvm.internal.k implements Function2<L, Continuation<? super Unit>, Object> {
        int d;
        final ka.k<Props, PermissionRequestState, Output, Object>.a e;
        final PermissionRequestWorkflow i;
        final Props v;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
            final PermissionRequestWorkflow d;
            final Props e;

            a(PermissionRequestWorkflow permissionRequestWorkflow, Props props) {
                super(1);
                this.d = permissionRequestWorkflow;
                this.e = props;
            }

            public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.k(cVar, new PermissionState(this.e.getPermission(), m.d));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        j(ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, Props props, Continuation<? super j> continuation) {
            super(2, continuation);
            this.e = aVar;
            this.i = permissionRequestWorkflow;
            this.v = props;
        }

        @NotNull
        public final Continuation<Unit> create(Object obj, @NotNull Continuation<?> continuation) {
            return new j(this.e, this.i, this.v, continuation);
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
            InterfaceC0570h<r<? super Props, PermissionRequestState, ? extends Output>> interfaceC0570hB = this.e.b();
            PermissionRequestWorkflow permissionRequestWorkflow = this.i;
            interfaceC0570hB.d(z.d(permissionRequestWorkflow, null, new a(permissionRequestWorkflow, this.v), 1, null));
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "shouldShowRationale", "", "a", "(Z)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
    static final class k extends kotlin.jvm.internal.l implements Function1<Boolean, Unit> {
        final ka.k<Props, PermissionRequestState, Output, Object>.a d;
        final PermissionRequestWorkflow e;
        final Props i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
            final boolean d;
            final PermissionRequestWorkflow e;
            final Props i;
            final ka.k<Props, PermissionRequestState, Output, Object>.a v;

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
            static final class C0147a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
                public static final C0147a d = new C0147a();

                C0147a() {
                    super(1);
                }

                public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                    Intrinsics.checkNotNullParameter(cVar, "$this$action");
                    cVar.e(PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.d);
                }

                public Object invoke(Object obj) {
                    a((r.c) obj);
                    return Unit.a;
                }
            }

            a(boolean z, PermissionRequestWorkflow permissionRequestWorkflow, Props props, ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar) {
                super(1);
                this.d = z;
                this.e = permissionRequestWorkflow;
                this.i = props;
                this.v = aVar;
            }

            public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                if (this.d) {
                    this.e.k(cVar, new PermissionState(this.i.getPermission(), m.e));
                } else {
                    this.v.b().d(z.d(this.e, null, C0147a.d, 1, null));
                }
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        k(ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, PermissionRequestWorkflow permissionRequestWorkflow, Props props) {
            super(1);
            this.d = aVar;
            this.e = permissionRequestWorkflow;
            this.i = props;
        }

        public final void a(boolean z) {
            InterfaceC0570h<r<? super Props, PermissionRequestState, ? extends Output>> interfaceC0570hB = this.d.b();
            PermissionRequestWorkflow permissionRequestWorkflow = this.e;
            interfaceC0570hB.d(z.d(permissionRequestWorkflow, null, new a(z, permissionRequestWorkflow, this.i, this.d), 1, null));
        }

        public Object invoke(Object obj) {
            a(((Boolean) obj).booleanValue());
            return Unit.a;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    static final class l extends kotlin.jvm.internal.l implements Function0<Unit> {
        final ka.k<Props, PermissionRequestState, Output, Object>.a e;
        final Props i;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u00180\u0000R\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lf8/r$c;", "Lf8/r;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$b;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$PermissionRequestState;", "Lcom/withpersona/sdk2/inquiry/permissions/PermissionRequestWorkflow$a;", "", "a", "(Lf8/r$c;)V"}, k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0})
        static final class a extends kotlin.jvm.internal.l implements Function1<r<? super Props, PermissionRequestState, ? extends Output>.c, Unit> {
            final PermissionRequestWorkflow d;
            final Props e;

            a(PermissionRequestWorkflow permissionRequestWorkflow, Props props) {
                super(1);
                this.d = permissionRequestWorkflow;
                this.e = props;
            }

            public final void a(@NotNull r<? super Props, PermissionRequestState, Output>.c cVar) {
                Intrinsics.checkNotNullParameter(cVar, "$this$action");
                this.d.k(cVar, new PermissionState(this.e.getPermission(), m.i));
            }

            public Object invoke(Object obj) {
                a((r.c) obj);
                return Unit.a;
            }
        }

        l(ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a aVar, Props props) {
            super(0);
            this.e = aVar;
            this.i = props;
        }

        public Object invoke() {
            m526invoke();
            return Unit.a;
        }

        public final void m526invoke() {
            PermissionRequestWorkflow.this.m();
            InterfaceC0570h<r<? super Props, PermissionRequestState, ? extends Output>> interfaceC0570hB = this.e.b();
            PermissionRequestWorkflow permissionRequestWorkflow = PermissionRequestWorkflow.this;
            interfaceC0570hB.d(z.d(permissionRequestWorkflow, null, new a(permissionRequestWorkflow, this.i), 1, null));
        }
    }

    public PermissionRequestWorkflow(@NotNull Context context, @NotNull c.a aVar, @NotNull DeviceFeatureRequestWorkflow deviceFeatureRequestWorkflow) {
        Intrinsics.checkNotNullParameter(context, "applicationContext");
        Intrinsics.checkNotNullParameter(aVar, "permissionRequestWorkerFactory");
        Intrinsics.checkNotNullParameter(deviceFeatureRequestWorkflow, "deviceFeatureRequestWorkflow");
        this.applicationContext = context;
        this.permissionRequestWorkerFactory = aVar;
        this.deviceFeatureRequestWorkflow = deviceFeatureRequestWorkflow;
    }

    public final void k(r<? super Props, PermissionRequestState, Output>.c cVar, PermissionState permissionState) {
        cVar.d(new Output(permissionState));
    }

    public final void m() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addFlags(268435456);
        intent.setData(Uri.fromParts("package", this.applicationContext.getPackageName(), null));
        this.applicationContext.startActivity(intent);
    }

    @Override
    @NotNull
    public PermissionRequestState d(@NotNull Props props, Snapshot snapshot) {
        Intrinsics.checkNotNullParameter(props, "props");
        if (snapshot != null) {
            okio.h hVarB = snapshot.b();
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
            PermissionRequestState permissionRequestState = (PermissionRequestState) parcelable;
            if (permissionRequestState != null) {
                return permissionRequestState;
            }
        }
        return PermissionRequestState.CheckPermissionState.d;
    }

    @Override
    public Object f(@NotNull Props renderProps, @NotNull PermissionRequestState renderState, @NotNull ka.k<? super Props, PermissionRequestState, Output, ? extends Object>.a context) throws P9.m {
        Intrinsics.checkNotNullParameter(renderProps, "renderProps");
        Intrinsics.checkNotNullParameter(renderState, "renderState");
        Intrinsics.checkNotNullParameter(context, "context");
        if (Intrinsics.b(renderState, PermissionRequestState.CheckPermissionState.d)) {
            context.a("check_permission_state", new c(renderProps, context, null));
            return null;
        }
        if (Intrinsics.b(renderState, PermissionRequestState.CheckPermissionRationaleState.d)) {
            return new C0606i(new CheckRequestPermissionRationaleStateView(renderProps.getPermission(), false, new e(context, this)), EnumC0605h.i);
        }
        if (Intrinsics.b(renderState, PermissionRequestState.ShowRequestPermissionRationale.d)) {
            String title = renderProps.getTitle();
            String rationale = renderProps.getRationale();
            String positiveButtonText = renderProps.getPositiveButtonText();
            if (positiveButtonText == null) {
                positiveButtonText = this.applicationContext.getString(S8.e.z);
                Intrinsics.checkNotNullExpressionValue(positiveButtonText, "getString(...)");
            }
            String str = positiveButtonText;
            StepStyle styles = renderProps.getStyles();
            f fVar = new f(context, this);
            String negativeButtonText = renderProps.getNegativeButtonText();
            if (negativeButtonText == null) {
                negativeButtonText = this.applicationContext.getString(S8.e.y);
                Intrinsics.checkNotNullExpressionValue(negativeButtonText, "getString(...)");
            }
            return new C0606i(new Q8.e(title, rationale, str, styles, fVar, negativeButtonText, new g(context, this, renderProps)), EnumC0605h.i);
        }
        if (Intrinsics.b(renderState, PermissionRequestState.RequestPermission.d)) {
            w.l(context, this.permissionRequestWorkerFactory.a(renderProps.getPermission()), kotlin.jvm.internal.z.j(com.withpersona.sdk2.inquiry.permissions.c.class), "", new h(context, renderProps));
            return null;
        }
        if (Intrinsics.b(renderState, PermissionRequestState.RequestDeviceFeature.d)) {
            if (renderProps.l()) {
                return InterfaceC0563a.C0224a.a(context, this.deviceFeatureRequestWorkflow, new DeviceFeatureRequestWorkflow.Props(Q8.p.a(renderProps.getPermission()), renderProps.getGpsFeatureTitle(), renderProps.getGpsFeatureRationale(), renderProps.getPositiveButtonText(), renderProps.getGpsFeatureModalNegativeButton(), renderProps.getStyles()), null, new i(context, renderProps), 4, null);
            }
            context.a("request_device_feature", new j(context, this, renderProps, null));
            return null;
        }
        if (Intrinsics.b(renderState, PermissionRequestState.CheckPermissionPermanentlyDenied.d)) {
            return new C0606i(new CheckRequestPermissionRationaleStateView(renderProps.getPermission(), true, new k(context, this, renderProps)), EnumC0605h.i);
        }
        if (!Intrinsics.b(renderState, PermissionRequestState.ShowPermissionPermanentlyDeniedMessage.d)) {
            if (Intrinsics.b(renderState, PermissionRequestState.Complete.d)) {
                return null;
            }
            throw new P9.m();
        }
        String title2 = renderProps.getTitle();
        String rationaleWhenPermanentlyDenied = renderProps.getRationaleWhenPermanentlyDenied();
        String positiveButtonText2 = renderProps.getPositiveButtonText();
        if (positiveButtonText2 == null) {
            positiveButtonText2 = this.applicationContext.getString(S8.e.A);
            Intrinsics.checkNotNullExpressionValue(positiveButtonText2, "getString(...)");
        }
        String str2 = positiveButtonText2;
        StepStyle styles2 = renderProps.getStyles();
        l lVar = new l(context, renderProps);
        String negativeButtonText2 = renderProps.getNegativeButtonText();
        if (negativeButtonText2 == null) {
            negativeButtonText2 = this.applicationContext.getString(S8.e.y);
            Intrinsics.checkNotNullExpressionValue(negativeButtonText2, "getString(...)");
        }
        return new C0606i(new Q8.e(title2, rationaleWhenPermanentlyDenied, str2, styles2, lVar, negativeButtonText2, new d(context, this, renderProps)), EnumC0605h.i);
    }

    @Override
    @NotNull
    public Snapshot g(@NotNull PermissionRequestState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return q.a(state);
    }
}
