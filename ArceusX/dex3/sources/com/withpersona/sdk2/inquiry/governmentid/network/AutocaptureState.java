package com.withpersona.sdk2.inquiry.governmentid.network;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import com.withpersona.sdk2.camera.ImageIdMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "Landroid/os/Parcelable;", "", "Lcom/withpersona/sdk2/camera/ImageIdMetadata;", "previousFramesMetadata", "<init>", "(Ljava/util/List;)V", "a", "(Ljava/util/List;)Lcom/withpersona/sdk2/inquiry/governmentid/network/AutocaptureState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/List;", "b", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class AutocaptureState implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<AutocaptureState> CREATOR = new a();

    @NotNull
    private final List<ImageIdMetadata> previousFramesMetadata;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AutocaptureState> {
        @Override
        @NotNull
        public final AutocaptureState createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(AutocaptureState.class.getClassLoader()));
            }
            return new AutocaptureState(arrayList);
        }

        @Override
        @NotNull
        public final AutocaptureState[] newArray(int i) {
            return new AutocaptureState[i];
        }
    }

    public AutocaptureState() {
        List list = null;
        this(list, 1, list);
    }

    @NotNull
    public final AutocaptureState a(@NotNull List<ImageIdMetadata> previousFramesMetadata) {
        Intrinsics.checkNotNullParameter(previousFramesMetadata, "previousFramesMetadata");
        return new AutocaptureState(previousFramesMetadata);
    }

    @NotNull
    public final List<ImageIdMetadata> b() {
        return this.previousFramesMetadata;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AutocaptureState) && Intrinsics.b(this.previousFramesMetadata, ((AutocaptureState) other).previousFramesMetadata);
    }

    public int hashCode() {
        return this.previousFramesMetadata.hashCode();
    }

    @NotNull
    public String toString() {
        return "AutocaptureState(previousFramesMetadata=" + this.previousFramesMetadata + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        List<ImageIdMetadata> list = this.previousFramesMetadata;
        parcel.writeInt(list.size());
        Iterator<ImageIdMetadata> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
    }

    public AutocaptureState(@NotNull List<ImageIdMetadata> list) {
        Intrinsics.checkNotNullParameter(list, "previousFramesMetadata");
        this.previousFramesMetadata = list;
    }

    public AutocaptureState(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.j() : list);
    }
}
