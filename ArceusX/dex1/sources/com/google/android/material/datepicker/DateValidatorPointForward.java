package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new a();

    private final long f17737d;

    class a implements Parcelable.Creator<DateValidatorPointForward> {
        a() {
        }

        @Override
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), null);
        }

        @Override
        public DateValidatorPointForward[] newArray(int i7) {
            return new DateValidatorPointForward[i7];
        }
    }

    DateValidatorPointForward(long j7, a aVar) {
        this(j7);
    }

    public static DateValidatorPointForward a(long j7) {
        return new DateValidatorPointForward(j7);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.f17737d == ((DateValidatorPointForward) obj).f17737d;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f17737d)});
    }

    @Override
    public boolean n0(long j7) {
        return j7 >= this.f17737d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeLong(this.f17737d);
    }

    private DateValidatorPointForward(long j7) {
        this.f17737d = j7;
    }
}
