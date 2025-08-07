package D3;

import android.os.Parcel;

public class c {

    private static final ClassLoader f890a = c.class.getClassLoader();

    private c() {
    }

    public static void a(Parcel parcel, boolean z7) {
        parcel.writeInt(1);
    }

    public static boolean b(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
