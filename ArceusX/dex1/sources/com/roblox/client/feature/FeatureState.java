package com.roblox.client.feature;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

public class FeatureState implements Parcelable {
    public static final Parcelable.Creator<FeatureState> CREATOR = new a();

    private String f19989d;

    private Bundle f19990e;

    class a implements Parcelable.Creator<FeatureState> {
        a() {
        }

        @Override
        public FeatureState createFromParcel(Parcel parcel) {
            return new FeatureState(parcel);
        }

        @Override
        public FeatureState[] newArray(int i7) {
            return new FeatureState[i7];
        }
    }

    public Bundle a() {
        if (this.f19990e == null) {
            this.f19990e = new Bundle();
        }
        return this.f19990e;
    }

    public long b(String str, long j7) {
        return a().getLong(str, j7);
    }

    public void c(String str, long j7) {
        a().putLong(str, j7);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public String getName() {
        return this.f19989d;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeString(this.f19989d);
        parcel.writeBundle(this.f19990e);
    }

    public FeatureState(String str) {
        this(str, new Bundle());
    }

    public FeatureState(String str, Bundle bundle) {
        this.f19989d = str;
        this.f19990e = bundle;
    }

    private FeatureState(Parcel parcel) {
        this.f19989d = parcel.readString();
        this.f19990e = parcel.readBundle();
    }
}
