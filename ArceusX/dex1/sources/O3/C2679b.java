package o3;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public class C2679b {
    private static void A(Parcel parcel, int i7) {
        int iDataPosition = parcel.dataPosition();
        parcel.setDataPosition(i7 - 4);
        parcel.writeInt(iDataPosition - i7);
        parcel.setDataPosition(iDataPosition);
    }

    private static void B(Parcel parcel, int i7, int i8) {
        parcel.writeInt(i7 | (i8 << 16));
    }

    private static void C(Parcel parcel, Parcelable parcelable, int i7) {
        int iDataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int iDataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i7);
        int iDataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(iDataPosition);
        parcel.writeInt(iDataPosition3 - iDataPosition2);
        parcel.setDataPosition(iDataPosition3);
    }

    public static int a(Parcel parcel) {
        return z(parcel, 20293);
    }

    public static void b(Parcel parcel, int i7) {
        A(parcel, i7);
    }

    public static void c(Parcel parcel, int i7, boolean z7) {
        B(parcel, i7, 4);
        parcel.writeInt(z7 ? 1 : 0);
    }

    public static void d(Parcel parcel, int i7, Boolean bool, boolean z7) {
        if (bool != null) {
            B(parcel, i7, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z7) {
            B(parcel, i7, 0);
        }
    }

    public static void e(Parcel parcel, int i7, Bundle bundle, boolean z7) {
        if (bundle == null) {
            if (z7) {
                B(parcel, i7, 0);
            }
        } else {
            int iZ = z(parcel, i7);
            parcel.writeBundle(bundle);
            A(parcel, iZ);
        }
    }

    public static void f(Parcel parcel, int i7, byte[] bArr, boolean z7) {
        if (bArr == null) {
            if (z7) {
                B(parcel, i7, 0);
            }
        } else {
            int iZ = z(parcel, i7);
            parcel.writeByteArray(bArr);
            A(parcel, iZ);
        }
    }

    public static void g(Parcel parcel, int i7, byte[][] bArr, boolean z7) {
        if (bArr == null) {
            if (z7) {
                B(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZ = z(parcel, i7);
        parcel.writeInt(bArr.length);
        for (byte[] bArr2 : bArr) {
            parcel.writeByteArray(bArr2);
        }
        A(parcel, iZ);
    }

    public static void h(Parcel parcel, int i7, double d7) {
        B(parcel, i7, 8);
        parcel.writeDouble(d7);
    }

    public static void i(Parcel parcel, int i7, Double d7, boolean z7) {
        if (d7 != null) {
            B(parcel, i7, 8);
            parcel.writeDouble(d7.doubleValue());
        } else if (z7) {
            B(parcel, i7, 0);
        }
    }

    public static void j(Parcel parcel, int i7, float f7) {
        B(parcel, i7, 4);
        parcel.writeFloat(f7);
    }

    public static void k(Parcel parcel, int i7, Float f7, boolean z7) {
        if (f7 != null) {
            B(parcel, i7, 4);
            parcel.writeFloat(f7.floatValue());
        } else if (z7) {
            B(parcel, i7, 0);
        }
    }

    public static void l(Parcel parcel, int i7, IBinder iBinder, boolean z7) {
        if (iBinder == null) {
            if (z7) {
                B(parcel, i7, 0);
            }
        } else {
            int iZ = z(parcel, i7);
            parcel.writeStrongBinder(iBinder);
            A(parcel, iZ);
        }
    }

    public static void m(Parcel parcel, int i7, int i8) {
        B(parcel, i7, 4);
        parcel.writeInt(i8);
    }

    public static void n(Parcel parcel, int i7, int[] iArr, boolean z7) {
        if (iArr == null) {
            if (z7) {
                B(parcel, i7, 0);
            }
        } else {
            int iZ = z(parcel, i7);
            parcel.writeIntArray(iArr);
            A(parcel, iZ);
        }
    }

    public static void o(Parcel parcel, int i7, List<Integer> list, boolean z7) {
        if (list == null) {
            if (z7) {
                B(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZ = z(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            parcel.writeInt(list.get(i8).intValue());
        }
        A(parcel, iZ);
    }

    public static void p(Parcel parcel, int i7, Integer num, boolean z7) {
        if (num != null) {
            B(parcel, i7, 4);
            parcel.writeInt(num.intValue());
        } else if (z7) {
            B(parcel, i7, 0);
        }
    }

    public static void q(Parcel parcel, int i7, long j7) {
        B(parcel, i7, 8);
        parcel.writeLong(j7);
    }

    public static void r(Parcel parcel, int i7, Long l7, boolean z7) {
        if (l7 != null) {
            B(parcel, i7, 8);
            parcel.writeLong(l7.longValue());
        } else if (z7) {
            B(parcel, i7, 0);
        }
    }

    public static void s(Parcel parcel, int i7, Parcelable parcelable, int i8, boolean z7) {
        if (parcelable == null) {
            if (z7) {
                B(parcel, i7, 0);
            }
        } else {
            int iZ = z(parcel, i7);
            parcelable.writeToParcel(parcel, i8);
            A(parcel, iZ);
        }
    }

    public static void t(Parcel parcel, int i7, short s7) {
        B(parcel, i7, 4);
        parcel.writeInt(s7);
    }

    public static void u(Parcel parcel, int i7, String str, boolean z7) {
        if (str == null) {
            if (z7) {
                B(parcel, i7, 0);
            }
        } else {
            int iZ = z(parcel, i7);
            parcel.writeString(str);
            A(parcel, iZ);
        }
    }

    public static void v(Parcel parcel, int i7, String[] strArr, boolean z7) {
        if (strArr == null) {
            if (z7) {
                B(parcel, i7, 0);
            }
        } else {
            int iZ = z(parcel, i7);
            parcel.writeStringArray(strArr);
            A(parcel, iZ);
        }
    }

    public static void w(Parcel parcel, int i7, List<String> list, boolean z7) {
        if (list == null) {
            if (z7) {
                B(parcel, i7, 0);
            }
        } else {
            int iZ = z(parcel, i7);
            parcel.writeStringList(list);
            A(parcel, iZ);
        }
    }

    public static <T extends Parcelable> void x(Parcel parcel, int i7, T[] tArr, int i8, boolean z7) {
        if (tArr == null) {
            if (z7) {
                B(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZ = z(parcel, i7);
        parcel.writeInt(tArr.length);
        for (T t7 : tArr) {
            if (t7 == null) {
                parcel.writeInt(0);
            } else {
                C(parcel, t7, i8);
            }
        }
        A(parcel, iZ);
    }

    public static <T extends Parcelable> void y(Parcel parcel, int i7, List<T> list, boolean z7) {
        if (list == null) {
            if (z7) {
                B(parcel, i7, 0);
                return;
            }
            return;
        }
        int iZ = z(parcel, i7);
        int size = list.size();
        parcel.writeInt(size);
        for (int i8 = 0; i8 < size; i8++) {
            T t7 = list.get(i8);
            if (t7 == null) {
                parcel.writeInt(0);
            } else {
                C(parcel, t7, 0);
            }
        }
        A(parcel, iZ);
    }

    private static int z(Parcel parcel, int i7) {
        parcel.writeInt(i7 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }
}
