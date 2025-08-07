package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    private final b f18720d;

    private final b f18721e;

    final int f18722i;

    int f18723v;

    int f18724w;

    int f18725y;

    int f18726z;

    class a implements Parcelable.Creator<TimeModel> {
        a() {
        }

        @Override
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override
        public TimeModel[] newArray(int i7) {
            return new TimeModel[i7];
        }
    }

    public TimeModel() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i7) {
        return i7 >= 12 ? 1 : 0;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f18723v == timeModel.f18723v && this.f18724w == timeModel.f18724w && this.f18722i == timeModel.f18722i && this.f18725y == timeModel.f18725y;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f18722i), Integer.valueOf(this.f18723v), Integer.valueOf(this.f18724w), Integer.valueOf(this.f18725y)});
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f18723v);
        parcel.writeInt(this.f18724w);
        parcel.writeInt(this.f18725y);
        parcel.writeInt(this.f18722i);
    }

    public TimeModel(int i7) {
        this(0, 0, 10, i7);
    }

    public TimeModel(int i7, int i8, int i9, int i10) {
        this.f18723v = i7;
        this.f18724w = i8;
        this.f18725y = i9;
        this.f18722i = i10;
        this.f18726z = c(i7);
        this.f18720d = new b(59);
        this.f18721e = new b(i10 == 1 ? 23 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
