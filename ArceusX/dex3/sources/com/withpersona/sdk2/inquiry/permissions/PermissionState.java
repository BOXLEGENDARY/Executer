package com.withpersona.sdk2.inquiry.permissions;

import Q8.l;
import Q8.m;
import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/withpersona/sdk2/inquiry/permissions/PermissionState;", "Landroid/os/Parcelable;", "LQ8/l;", "permission", "LQ8/m;", "result", "<init>", "(LQ8/l;LQ8/m;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "LQ8/l;", "getPermission", "()LQ8/l;", "e", "LQ8/m;", "a", "()LQ8/m;", "permissions_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class PermissionState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PermissionState> CREATOR = new a();

    @NotNull
    private final l permission;

    @NotNull
    private final m result;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PermissionState> {
        @Override
        @NotNull
        public final PermissionState createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PermissionState(l.valueOf(parcel.readString()), m.valueOf(parcel.readString()));
        }

        @Override
        @NotNull
        public final PermissionState[] newArray(int i) {
            return new PermissionState[i];
        }
    }

    public PermissionState(@NotNull l lVar, @NotNull m mVar) {
        Intrinsics.checkNotNullParameter(lVar, "permission");
        Intrinsics.checkNotNullParameter(mVar, "result");
        this.permission = lVar;
        this.result = mVar;
    }

    @NotNull
    public final m getResult() {
        return this.result;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PermissionState)) {
            return false;
        }
        PermissionState permissionState = (PermissionState) other;
        return this.permission == permissionState.permission && this.result == permissionState.result;
    }

    public int hashCode() {
        return (this.permission.hashCode() * 31) + this.result.hashCode();
    }

    @NotNull
    public String toString() {
        return "PermissionState(permission=" + this.permission + ", result=" + this.result + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.permission.name());
        parcel.writeString(this.result.name());
    }
}
