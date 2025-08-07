package com.withpersona.sdk2.inquiry.governmentid.live_hint;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\t\u0010\u0003\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bHÖ\u0003J\t\u0010\t\u001a\u00020\u0004HÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001J\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004HÖ\u0001¨\u0006\u0011"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/HoldStillHint;", "Lcom/withpersona/sdk2/inquiry/governmentid/live_hint/Hint;", "()V", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class HoldStillHint implements Hint {

    @NotNull
    public static final HoldStillHint d = new HoldStillHint();

    @NotNull
    public static final Parcelable.Creator<HoldStillHint> CREATOR = new a();

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HoldStillHint> {
        @Override
        @NotNull
        public final HoldStillHint createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.readInt();
            return HoldStillHint.d;
        }

        @Override
        @NotNull
        public final HoldStillHint[] newArray(int i) {
            return new HoldStillHint[i];
        }
    }

    private HoldStillHint() {
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        return this == other || (other instanceof HoldStillHint);
    }

    public int hashCode() {
        return 1462785890;
    }

    @NotNull
    public String toString() {
        return "HoldStillHint";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(1);
    }
}
