package com.google.android.gms.internal.measurement;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;

public final class S {

    private static final ClassLoader f15021a = S.class.getClassLoader();

    private S() {
    }

    public static <T extends Parcelable> T a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static HashMap b(Parcel parcel) {
        return parcel.readHashMap(f15021a);
    }

    public static void c(Parcel parcel, boolean z7) {
        parcel.writeInt(z7 ? 1 : 0);
    }

    public static void d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }

    public static void e(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    public static boolean f(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
