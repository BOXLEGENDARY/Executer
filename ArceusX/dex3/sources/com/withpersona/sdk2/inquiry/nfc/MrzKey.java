package com.withpersona.sdk2.inquiry.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\"\u0010 ¨\u0006#"}, d2 = {"Lcom/withpersona/sdk2/inquiry/nfc/MrzKey;", "Landroid/os/Parcelable;", "", "passportNumber", "Ljava/util/Date;", "expirationDate", "dateOfBirth", "<init>", "(Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/lang/String;", "getPassportNumber", "e", "Ljava/util/Date;", "getExpirationDate", "()Ljava/util/Date;", "i", "getDateOfBirth", "nfc_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class MrzKey implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<MrzKey> CREATOR = new a();

    @NotNull
    private final String passportNumber;

    @NotNull
    private final Date expirationDate;

    @NotNull
    private final Date dateOfBirth;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MrzKey> {
        @Override
        @NotNull
        public final MrzKey createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MrzKey(parcel.readString(), (Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }

        @Override
        @NotNull
        public final MrzKey[] newArray(int i) {
            return new MrzKey[i];
        }
    }

    public MrzKey(@NotNull String str, @NotNull Date date, @NotNull Date date2) {
        Intrinsics.checkNotNullParameter(str, "passportNumber");
        Intrinsics.checkNotNullParameter(date, "expirationDate");
        Intrinsics.checkNotNullParameter(date2, "dateOfBirth");
        this.passportNumber = str;
        this.expirationDate = date;
        this.dateOfBirth = date2;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MrzKey)) {
            return false;
        }
        MrzKey mrzKey = (MrzKey) other;
        return Intrinsics.b(this.passportNumber, mrzKey.passportNumber) && Intrinsics.b(this.expirationDate, mrzKey.expirationDate) && Intrinsics.b(this.dateOfBirth, mrzKey.dateOfBirth);
    }

    public int hashCode() {
        return (((this.passportNumber.hashCode() * 31) + this.expirationDate.hashCode()) * 31) + this.dateOfBirth.hashCode();
    }

    @NotNull
    public String toString() {
        return "MrzKey(passportNumber=" + this.passportNumber + ", expirationDate=" + this.expirationDate + ", dateOfBirth=" + this.dateOfBirth + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.passportNumber);
        parcel.writeSerializable(this.expirationDate);
        parcel.writeSerializable(this.dateOfBirth);
    }
}
