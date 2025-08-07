package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000eJ \u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/IdConfigForCountry;", "Landroid/os/Parcelable;", "", "countryName", "countryCode", "", "Lcom/withpersona/sdk2/inquiry/governmentid/IdConfig;", "ids", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "b", "e", "a", "i", "Ljava/util/List;", "c", "()Ljava/util/List;", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class IdConfigForCountry implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<IdConfigForCountry> CREATOR = new a();

    @NotNull
    private final String countryName;

    @NotNull
    private final String countryCode;

    @NotNull
    private final List<IdConfig> ids;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<IdConfigForCountry> {
        @Override
        @NotNull
        public final IdConfigForCountry createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(IdConfig.CREATOR.createFromParcel(parcel));
            }
            return new IdConfigForCountry(string, string2, arrayList);
        }

        @Override
        @NotNull
        public final IdConfigForCountry[] newArray(int i) {
            return new IdConfigForCountry[i];
        }
    }

    public IdConfigForCountry(@NotNull String str, @NotNull String str2, @NotNull List<IdConfig> list) {
        Intrinsics.checkNotNullParameter(str, "countryName");
        Intrinsics.checkNotNullParameter(str2, "countryCode");
        Intrinsics.checkNotNullParameter(list, "ids");
        this.countryName = str;
        this.countryCode = str2;
        this.ids = list;
    }

    @NotNull
    public final String getCountryCode() {
        return this.countryCode;
    }

    @NotNull
    public final String getCountryName() {
        return this.countryName;
    }

    @NotNull
    public final List<IdConfig> c() {
        return this.ids;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdConfigForCountry)) {
            return false;
        }
        IdConfigForCountry idConfigForCountry = (IdConfigForCountry) other;
        return Intrinsics.b(this.countryName, idConfigForCountry.countryName) && Intrinsics.b(this.countryCode, idConfigForCountry.countryCode) && Intrinsics.b(this.ids, idConfigForCountry.ids);
    }

    public int hashCode() {
        return (((this.countryName.hashCode() * 31) + this.countryCode.hashCode()) * 31) + this.ids.hashCode();
    }

    @NotNull
    public String toString() {
        return "IdConfigForCountry(countryName=" + this.countryName + ", countryCode=" + this.countryCode + ", ids=" + this.ids + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.countryName);
        parcel.writeString(this.countryCode);
        List<IdConfig> list = this.ids;
        parcel.writeInt(list.size());
        Iterator<IdConfig> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }
}
