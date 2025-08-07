package com.withpersona.sdk2.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import com.roblox.client.personasdk.R;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/withpersona/sdk2/inquiry/governmentid/GovernmentIdDetails;", "Landroid/os/Parcelable;", "Ljava/util/Date;", "dateOfBirth", "expirationDate", "<init>", "(Ljava/util/Date;Ljava/util/Date;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "d", "Ljava/util/Date;", "a", "()Ljava/util/Date;", "e", "b", "government-id_release"}, k = 1, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
public final class GovernmentIdDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<GovernmentIdDetails> CREATOR = new a();

    private final Date dateOfBirth;

    private final Date expirationDate;

    @Metadata(k = 3, mv = {1, R.styleable.LottieAnimationView_lottie_progress, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GovernmentIdDetails> {
        @Override
        @NotNull
        public final GovernmentIdDetails createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new GovernmentIdDetails((Date) parcel.readSerializable(), (Date) parcel.readSerializable());
        }

        @Override
        @NotNull
        public final GovernmentIdDetails[] newArray(int i) {
            return new GovernmentIdDetails[i];
        }
    }

    public GovernmentIdDetails(Date date, Date date2) {
        this.dateOfBirth = date;
        this.expirationDate = date2;
    }

    public final Date getDateOfBirth() {
        return this.dateOfBirth;
    }

    public final Date getExpirationDate() {
        return this.expirationDate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GovernmentIdDetails)) {
            return false;
        }
        GovernmentIdDetails governmentIdDetails = (GovernmentIdDetails) other;
        return Intrinsics.b(this.dateOfBirth, governmentIdDetails.dateOfBirth) && Intrinsics.b(this.expirationDate, governmentIdDetails.expirationDate);
    }

    public int hashCode() {
        Date date = this.dateOfBirth;
        int iHashCode = (date == null ? 0 : date.hashCode()) * 31;
        Date date2 = this.expirationDate;
        return iHashCode + (date2 != null ? date2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "GovernmentIdDetails(dateOfBirth=" + this.dateOfBirth + ", expirationDate=" + this.expirationDate + ")";
    }

    @Override
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeSerializable(this.dateOfBirth);
        parcel.writeSerializable(this.expirationDate);
    }
}
