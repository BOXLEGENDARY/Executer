package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import x0.C2985b;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    private final Month f17723d;

    private final Month f17724e;

    private final DateValidator f17725i;

    private Month f17726v;

    private final int f17727w;

    private final int f17728y;

    private final int f17729z;

    public interface DateValidator extends Parcelable {
        boolean n0(long j7);
    }

    class a implements Parcelable.Creator<CalendarConstraints> {
        a() {
        }

        @Override
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override
        public CalendarConstraints[] newArray(int i7) {
            return new CalendarConstraints[i7];
        }
    }

    public static final class b {

        static final long f17730f = p.a(Month.f(1900, 0).f17746y);

        static final long f17731g = p.a(Month.f(2100, 11).f17746y);

        private long f17732a;

        private long f17733b;

        private Long f17734c;

        private int f17735d;

        private DateValidator f17736e;

        b(CalendarConstraints calendarConstraints) {
            this.f17732a = f17730f;
            this.f17733b = f17731g;
            this.f17736e = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f17732a = calendarConstraints.f17723d.f17746y;
            this.f17733b = calendarConstraints.f17724e.f17746y;
            this.f17734c = Long.valueOf(calendarConstraints.f17726v.f17746y);
            this.f17735d = calendarConstraints.f17727w;
            this.f17736e = calendarConstraints.f17725i;
        }

        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f17736e);
            Month monthG = Month.g(this.f17732a);
            Month monthG2 = Month.g(this.f17733b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l7 = this.f17734c;
            return new CalendarConstraints(monthG, monthG2, dateValidator, l7 == null ? null : Month.g(l7.longValue()), this.f17735d, null);
        }

        public b b(long j7) {
            this.f17734c = Long.valueOf(j7);
            return this;
        }
    }

    CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i7, a aVar) {
        this(month, month2, dateValidator, month3, i7);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f17723d.equals(calendarConstraints.f17723d) && this.f17724e.equals(calendarConstraints.f17724e) && C2985b.a(this.f17726v, calendarConstraints.f17726v) && this.f17727w == calendarConstraints.f17727w && this.f17725i.equals(calendarConstraints.f17725i);
    }

    Month g(Month month) {
        return month.compareTo(this.f17723d) < 0 ? this.f17723d : month.compareTo(this.f17724e) > 0 ? this.f17724e : month;
    }

    public DateValidator h() {
        return this.f17725i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17723d, this.f17724e, this.f17726v, Integer.valueOf(this.f17727w), this.f17725i});
    }

    Month i() {
        return this.f17724e;
    }

    int k() {
        return this.f17727w;
    }

    int l() {
        return this.f17729z;
    }

    Month n() {
        return this.f17726v;
    }

    Month o() {
        return this.f17723d;
    }

    int p() {
        return this.f17728y;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeParcelable(this.f17723d, 0);
        parcel.writeParcelable(this.f17724e, 0);
        parcel.writeParcelable(this.f17726v, 0);
        parcel.writeParcelable(this.f17725i, 0);
        parcel.writeInt(this.f17727w);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i7) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f17723d = month;
        this.f17724e = month2;
        this.f17726v = month3;
        this.f17727w = i7;
        this.f17725i = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i7 < 0 || i7 > p.i().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f17729z = month.q(month2) + 1;
        this.f17728y = (month2.f17743i - month.f17743i) + 1;
    }
}
