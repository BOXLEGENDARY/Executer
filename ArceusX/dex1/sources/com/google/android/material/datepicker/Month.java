package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    private final Calendar f17741d;

    final int f17742e;

    final int f17743i;

    final int f17744v;

    final int f17745w;

    final long f17746y;

    private String f17747z;

    class a implements Parcelable.Creator<Month> {
        a() {
        }

        @Override
        public Month createFromParcel(Parcel parcel) {
            return Month.f(parcel.readInt(), parcel.readInt());
        }

        @Override
        public Month[] newArray(int i7) {
            return new Month[i7];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = p.c(calendar);
        this.f17741d = calendarC;
        this.f17742e = calendarC.get(2);
        this.f17743i = calendarC.get(1);
        this.f17744v = calendarC.getMaximum(7);
        this.f17745w = calendarC.getActualMaximum(5);
        this.f17746y = calendarC.getTimeInMillis();
    }

    static Month f(int i7, int i8) {
        Calendar calendarI = p.i();
        calendarI.set(1, i7);
        calendarI.set(2, i8);
        return new Month(calendarI);
    }

    static Month g(long j7) {
        Calendar calendarI = p.i();
        calendarI.setTimeInMillis(j7);
        return new Month(calendarI);
    }

    static Month h() {
        return new Month(p.g());
    }

    @Override
    public int compareTo(Month month) {
        return this.f17741d.compareTo(month.f17741d);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f17742e == month.f17742e && this.f17743i == month.f17743i;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f17742e), Integer.valueOf(this.f17743i)});
    }

    int i(int i7) {
        int i8 = this.f17741d.get(7);
        if (i7 <= 0) {
            i7 = this.f17741d.getFirstDayOfWeek();
        }
        int i9 = i8 - i7;
        return i9 < 0 ? i9 + this.f17744v : i9;
    }

    long k(int i7) {
        Calendar calendarC = p.c(this.f17741d);
        calendarC.set(5, i7);
        return calendarC.getTimeInMillis();
    }

    int l(long j7) {
        Calendar calendarC = p.c(this.f17741d);
        calendarC.setTimeInMillis(j7);
        return calendarC.get(5);
    }

    String n() {
        if (this.f17747z == null) {
            this.f17747z = c.f(this.f17741d.getTimeInMillis());
        }
        return this.f17747z;
    }

    long o() {
        return this.f17741d.getTimeInMillis();
    }

    Month p(int i7) {
        Calendar calendarC = p.c(this.f17741d);
        calendarC.add(2, i7);
        return new Month(calendarC);
    }

    int q(Month month) {
        if (this.f17741d instanceof GregorianCalendar) {
            return ((month.f17743i - this.f17743i) * 12) + (month.f17742e - this.f17742e);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f17743i);
        parcel.writeInt(this.f17742e);
    }
}
