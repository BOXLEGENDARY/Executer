package com.squareup.workflow1.ui;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import ka.C0573m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okio.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/squareup/workflow1/ui/PickledTreesnapshot;", "Landroid/os/Parcelable;", "Lf8/m;", "snapshot", "<init>", "(Lf8/m;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Lf8/m;", "a", "()Lf8/m;", "CREATOR", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
public final class PickledTreesnapshot implements Parcelable {

    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final C0573m snapshot;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/squareup/workflow1/ui/PickledTreesnapshot$a;", "Landroid/os/Parcelable$Creator;", "Lcom/squareup/workflow1/ui/PickledTreesnapshot;", "<init>", "()V", "Landroid/os/Parcel;", "parcel", "a", "(Landroid/os/Parcel;)Lcom/squareup/workflow1/ui/PickledTreesnapshot;", "", "size", "", "b", "(I)[Lcom/squareup/workflow1/ui/PickledTreesnapshot;", "wf1-core-android"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, 0}, xi = 48)
    public static final class Companion implements Parcelable.Creator<PickledTreesnapshot> {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Override
        @NotNull
        public PickledTreesnapshot createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            h.a aVar = okio.h.v;
            byte[] bArrCreateByteArray = parcel.createByteArray();
            Intrinsics.d(bArrCreateByteArray);
            Intrinsics.checkNotNullExpressionValue(bArrCreateByteArray, "parcel.createByteArray()!!");
            return new PickledTreesnapshot(C0573m.INSTANCE.a(h.a.f(aVar, bArrCreateByteArray, 0, 0, 3, (Object) null)));
        }

        @Override
        @NotNull
        public PickledTreesnapshot[] newArray(int size) {
            return new PickledTreesnapshot[size];
        }

        private Companion() {
        }
    }

    public PickledTreesnapshot(@NotNull C0573m c0573m) {
        Intrinsics.checkNotNullParameter(c0573m, "snapshot");
        this.snapshot = c0573m;
    }

    @NotNull
    public final C0573m getSnapshot() {
        return this.snapshot;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeByteArray(this.snapshot.c().J());
    }
}
