package o3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class C2678a {

    public static class C0210a extends RuntimeException {
        public C0210a(String str, Parcel parcel) {
            super(str + " Parcel: pos=" + parcel.dataPosition() + " size=" + parcel.dataSize());
        }
    }

    public static int A(Parcel parcel, int i7) {
        return (i7 & (-65536)) != -65536 ? (char) (i7 >> 16) : parcel.readInt();
    }

    public static void B(Parcel parcel, int i7) {
        parcel.setDataPosition(parcel.dataPosition() + A(parcel, i7));
    }

    public static int C(Parcel parcel) {
        int iT = t(parcel);
        int iA = A(parcel, iT);
        int iM = m(iT);
        int iDataPosition = parcel.dataPosition();
        if (iM != 20293) {
            throw new C0210a("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(iT))), parcel);
        }
        int i7 = iA + iDataPosition;
        if (i7 >= iDataPosition && i7 <= parcel.dataSize()) {
            return i7;
        }
        throw new C0210a("Size read is invalid start=" + iDataPosition + " end=" + i7, parcel);
    }

    private static void D(Parcel parcel, int i7, int i8, int i9) {
        if (i8 == i9) {
            return;
        }
        throw new C0210a("Expected size " + i9 + " got " + i8 + " (0x" + Integer.toHexString(i8) + ")", parcel);
    }

    private static void E(Parcel parcel, int i7, int i8) {
        int iA = A(parcel, i7);
        if (iA == i8) {
            return;
        }
        throw new C0210a("Expected size " + i8 + " got " + iA + " (0x" + Integer.toHexString(iA) + ")", parcel);
    }

    public static Bundle a(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        Bundle bundle = parcel.readBundle();
        parcel.setDataPosition(iDataPosition + iA);
        return bundle;
    }

    public static byte[] b(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        byte[] bArrCreateByteArray = parcel.createByteArray();
        parcel.setDataPosition(iDataPosition + iA);
        return bArrCreateByteArray;
    }

    public static byte[][] c(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        int i8 = parcel.readInt();
        byte[][] bArr = new byte[i8][];
        for (int i9 = 0; i9 < i8; i9++) {
            bArr[i9] = parcel.createByteArray();
        }
        parcel.setDataPosition(iDataPosition + iA);
        return bArr;
    }

    public static int[] d(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        int[] iArrCreateIntArray = parcel.createIntArray();
        parcel.setDataPosition(iDataPosition + iA);
        return iArrCreateIntArray;
    }

    public static ArrayList<Integer> e(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i8 = parcel.readInt();
        for (int i9 = 0; i9 < i8; i9++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(iDataPosition + iA);
        return arrayList;
    }

    public static <T extends Parcelable> T f(Parcel parcel, int i7, Parcelable.Creator<T> creator) {
        int iA = A(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        T tCreateFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(iDataPosition + iA);
        return tCreateFromParcel;
    }

    public static String g(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        String string = parcel.readString();
        parcel.setDataPosition(iDataPosition + iA);
        return string;
    }

    public static String[] h(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        String[] strArrCreateStringArray = parcel.createStringArray();
        parcel.setDataPosition(iDataPosition + iA);
        return strArrCreateStringArray;
    }

    public static ArrayList<String> i(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(iDataPosition + iA);
        return arrayListCreateStringArrayList;
    }

    public static <T> T[] j(Parcel parcel, int i7, Parcelable.Creator<T> creator) {
        int iA = A(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(iDataPosition + iA);
        return tArr;
    }

    public static <T> ArrayList<T> k(Parcel parcel, int i7, Parcelable.Creator<T> creator) {
        int iA = A(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        ArrayList<T> arrayListCreateTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(iDataPosition + iA);
        return arrayListCreateTypedArrayList;
    }

    public static void l(Parcel parcel, int i7) {
        if (parcel.dataPosition() == i7) {
            return;
        }
        throw new C0210a("Overread allowed size end=" + i7, parcel);
    }

    public static int m(int i7) {
        return (char) i7;
    }

    public static boolean n(Parcel parcel, int i7) {
        E(parcel, i7, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean o(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        if (iA == 0) {
            return null;
        }
        D(parcel, i7, iA, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static double p(Parcel parcel, int i7) {
        E(parcel, i7, 8);
        return parcel.readDouble();
    }

    public static Double q(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        if (iA == 0) {
            return null;
        }
        D(parcel, i7, iA, 8);
        return Double.valueOf(parcel.readDouble());
    }

    public static float r(Parcel parcel, int i7) {
        E(parcel, i7, 4);
        return parcel.readFloat();
    }

    public static Float s(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        if (iA == 0) {
            return null;
        }
        D(parcel, i7, iA, 4);
        return Float.valueOf(parcel.readFloat());
    }

    public static int t(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder u(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        int iDataPosition = parcel.dataPosition();
        if (iA == 0) {
            return null;
        }
        IBinder strongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(iDataPosition + iA);
        return strongBinder;
    }

    public static int v(Parcel parcel, int i7) {
        E(parcel, i7, 4);
        return parcel.readInt();
    }

    public static Integer w(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        if (iA == 0) {
            return null;
        }
        D(parcel, i7, iA, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long x(Parcel parcel, int i7) {
        E(parcel, i7, 8);
        return parcel.readLong();
    }

    public static Long y(Parcel parcel, int i7) {
        int iA = A(parcel, i7);
        if (iA == 0) {
            return null;
        }
        D(parcel, i7, iA, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static short z(Parcel parcel, int i7) {
        E(parcel, i7, 4);
        return (short) parcel.readInt();
    }
}
