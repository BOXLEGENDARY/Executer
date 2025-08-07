package R3;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

public final class C1036c0 {

    private static final ClassLoader f5479a = C1036c0.class.getClassLoader();

    private C1036c0() {
    }

    public static void a(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static void b(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
