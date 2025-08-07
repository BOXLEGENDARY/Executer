package M3;

import android.os.Parcel;
import android.os.Parcelable;

public final class i {

    private static final ClassLoader f2357a = i.class.getClassLoader();

    private i() {
    }

    public static void a(Parcel parcel, boolean z7) {
        parcel.writeInt(z7 ? 1 : 0);
    }

    public static <T extends Parcelable> T b(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void c(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        }
    }
}
