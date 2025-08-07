package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import g0.k;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new a();

    public final k<String, Bundle> f18453d;

    class a implements Parcelable.ClassLoaderCreator<ExtendableSavedState> {
        a() {
        }

        @Override
        public ExtendableSavedState createFromParcel(Parcel parcel) {
            return new ExtendableSavedState(parcel, null, 0 == true ? 1 : 0);
        }

        @Override
        public ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, null);
        }

        @Override
        public ExtendableSavedState[] newArray(int i7) {
            return new ExtendableSavedState[i7];
        }
    }

    ExtendableSavedState(Parcel parcel, ClassLoader classLoader, a aVar) {
        this(parcel, classLoader);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.f18453d + "}";
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        super.writeToParcel(parcel, i7);
        int size = this.f18453d.getSize();
        parcel.writeInt(size);
        String[] strArr = new String[size];
        Bundle[] bundleArr = new Bundle[size];
        for (int i8 = 0; i8 < size; i8++) {
            strArr[i8] = this.f18453d.g(i8);
            bundleArr[i8] = this.f18453d.k(i8);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.f18453d = new k<>();
    }

    private ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i7 = parcel.readInt();
        String[] strArr = new String[i7];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i7];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.f18453d = new k<>(i7);
        for (int i8 = 0; i8 < i7; i8++) {
            this.f18453d.put(strArr[i8], bundleArr[i8]);
        }
    }
}
