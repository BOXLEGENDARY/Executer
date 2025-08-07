package com.withpersona.sdk2.inquiry.selfie;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.inquiry.selfie.Selfie;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.F;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/selfie/PoseConfigs;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;", "Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "poseConfigs", "<init>", "(Ljava/util/Map;)V", "pose", "a", "(Lcom/withpersona/sdk2/inquiry/selfie/Selfie$b;)Lcom/withpersona/sdk2/inquiry/selfie/PoseConfig;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/Map;", "selfie_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class PoseConfigs implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PoseConfigs> CREATOR = new a();

    @NotNull
    private final Map<Selfie.b, PoseConfig> poseConfigs;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PoseConfigs> {
        @Override
        @NotNull
        public final PoseConfigs createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(Selfie.b.valueOf(parcel.readString()), PoseConfig.CREATOR.createFromParcel(parcel));
            }
            return new PoseConfigs(linkedHashMap);
        }

        @Override
        @NotNull
        public final PoseConfigs[] newArray(int i) {
            return new PoseConfigs[i];
        }
    }

    public PoseConfigs() {
        Map map = null;
        this(map, 1, map);
    }

    @NotNull
    public final PoseConfig a(@NotNull Selfie.b pose) {
        Intrinsics.checkNotNullParameter(pose, "pose");
        PoseConfig poseConfig = this.poseConfigs.get(pose);
        return poseConfig == null ? PoseConfig.INSTANCE.a() : poseConfig;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PoseConfigs) && Intrinsics.b(this.poseConfigs, ((PoseConfigs) other).poseConfigs);
    }

    public int hashCode() {
        return this.poseConfigs.hashCode();
    }

    @NotNull
    public String toString() {
        return "PoseConfigs(poseConfigs=" + this.poseConfigs + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        Map<Selfie.b, PoseConfig> map = this.poseConfigs;
        parcel.writeInt(map.size());
        for (Map.Entry<Selfie.b, PoseConfig> entry : map.entrySet()) {
            parcel.writeString(entry.getKey().name());
            entry.getValue().writeToParcel(parcel, flags);
        }
    }

    public PoseConfigs(@NotNull Map<Selfie.b, PoseConfig> map) {
        Intrinsics.checkNotNullParameter(map, "poseConfigs");
        this.poseConfigs = map;
    }

    public PoseConfigs(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? F.h() : map);
    }
}
