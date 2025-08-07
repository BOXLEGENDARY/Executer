package com.withpersona.sdk2.inquiry.governmentid.digitalId;

import android.os.Parcel;
import android.os.Parcelable;
import bb.b;
import com.roblox.client.personasdk.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/digitalId/DigitalIdRequest;", "Landroid/os/Parcelable;", "LB8/b;", "idType", "", "minAge", "", "", "elementToStoreLength", "<init>", "(LB8/b;Ljava/lang/String;Ljava/util/Map;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "LB8/b;", "getIdType", "()LB8/b;", "e", "Ljava/lang/String;", "getMinAge", "()Ljava/lang/String;", "i", "Ljava/util/Map;", "getElementToStoreLength", "()Ljava/util/Map;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class DigitalIdRequest implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<DigitalIdRequest> CREATOR = new a();

    @NotNull
    private final b idType;

    @NotNull
    private final String minAge;

    @NotNull
    private final Map<String, Integer> elementToStoreLength;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DigitalIdRequest> {
        @Override
        @NotNull
        public final DigitalIdRequest createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            b bVarValueOf = b.valueOf(parcel.readString());
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashMap.put(parcel.readString(), Integer.valueOf(parcel.readInt()));
            }
            return new DigitalIdRequest(bVarValueOf, string, linkedHashMap);
        }

        @Override
        @NotNull
        public final DigitalIdRequest[] newArray(int i) {
            return new DigitalIdRequest[i];
        }
    }

    public DigitalIdRequest(@NotNull b bVar, @NotNull String str, @NotNull Map<String, Integer> map) {
        Intrinsics.checkNotNullParameter(bVar, "idType");
        Intrinsics.checkNotNullParameter(str, "minAge");
        Intrinsics.checkNotNullParameter(map, "elementToStoreLength");
        this.idType = bVar;
        this.minAge = str;
        this.elementToStoreLength = map;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.idType.name());
        parcel.writeString(this.minAge);
        Map<String, Integer> map = this.elementToStoreLength;
        parcel.writeInt(map.size());
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            parcel.writeString(entry.getKey());
            parcel.writeInt(entry.getValue().intValue());
        }
    }
}
