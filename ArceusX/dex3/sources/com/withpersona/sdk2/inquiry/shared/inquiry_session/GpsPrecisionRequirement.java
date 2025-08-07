package com.withpersona.sdk2.inquiry.shared.inquiry_session;

import T9.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/withpersona/sdk2/inquiry/shared/inquiry_session/GpsPrecisionRequirement;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "e", "shared_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class GpsPrecisionRequirement implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GpsPrecisionRequirement> CREATOR;
    public static final GpsPrecisionRequirement d = new GpsPrecisionRequirement("ROUGH", 0);
    public static final GpsPrecisionRequirement e = new GpsPrecisionRequirement("PRECISE", 1);
    private static final GpsPrecisionRequirement[] i;
    private static final T9.a v;

    static {
        GpsPrecisionRequirement[] gpsPrecisionRequirementArrC = c();
        i = gpsPrecisionRequirementArrC;
        v = b.a(gpsPrecisionRequirementArrC);
        CREATOR = new Parcelable.Creator<GpsPrecisionRequirement>() {
            @Override
            @NotNull
            public final GpsPrecisionRequirement createFromParcel(@NotNull Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return GpsPrecisionRequirement.valueOf(parcel.readString());
            }

            @Override
            @NotNull
            public final GpsPrecisionRequirement[] newArray(int i2) {
                return new GpsPrecisionRequirement[i2];
            }
        };
    }

    private GpsPrecisionRequirement(String str, int i2) {
    }

    private static final GpsPrecisionRequirement[] c() {
        return new GpsPrecisionRequirement[]{d, e};
    }

    public static GpsPrecisionRequirement valueOf(String str) {
        return (GpsPrecisionRequirement) Enum.valueOf(GpsPrecisionRequirement.class, str);
    }

    public static GpsPrecisionRequirement[] values() {
        return (GpsPrecisionRequirement[]) i.clone();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(name());
    }
}
