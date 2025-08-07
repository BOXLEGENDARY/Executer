package E4;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.datatransport.runtime.backends.vUbH.jUbDmI;
import java.util.ArrayList;

public abstract class L extends i0 implements M {
    public L() {
        super(jUbDmI.msSanW);
    }

    @Override
    protected final boolean E0(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
        switch (i7) {
            case 2:
                int i9 = parcel.readInt();
                Bundle bundle = (Bundle) j0.a(parcel, Bundle.CREATOR);
                j0.b(parcel);
                I4(i9, bundle);
                return true;
            case 3:
                int i10 = parcel.readInt();
                Bundle bundle2 = (Bundle) j0.a(parcel, Bundle.CREATOR);
                j0.b(parcel);
                N3(i10, bundle2);
                return true;
            case 4:
                int i11 = parcel.readInt();
                Bundle bundle3 = (Bundle) j0.a(parcel, Bundle.CREATOR);
                j0.b(parcel);
                r0(i11, bundle3);
                return true;
            case 5:
                int i12 = parcel.readInt();
                Bundle bundle4 = (Bundle) j0.a(parcel, Bundle.CREATOR);
                j0.b(parcel);
                M5(i12, bundle4);
                return true;
            case 6:
                Bundle bundle5 = (Bundle) j0.a(parcel, Bundle.CREATOR);
                j0.b(parcel);
                A0(bundle5);
                return true;
            case 7:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                j0.b(parcel);
                i1(arrayListCreateTypedArrayList);
                return true;
            case 8:
                Bundle bundle6 = (Bundle) j0.a(parcel, Bundle.CREATOR);
                j0.b(parcel);
                o0(bundle6);
                return true;
            case 9:
                Bundle bundle7 = (Bundle) j0.a(parcel, Bundle.CREATOR);
                j0.b(parcel);
                Z3(bundle7);
                return true;
            case 10:
                Bundle bundle8 = (Bundle) j0.a(parcel, Bundle.CREATOR);
                j0.b(parcel);
                x0(bundle8);
                return true;
            case 11:
                Bundle bundle9 = (Bundle) j0.a(parcel, Bundle.CREATOR);
                j0.b(parcel);
                c5(bundle9);
                return true;
            case 12:
                Bundle bundle10 = (Bundle) j0.a(parcel, Bundle.CREATOR);
                j0.b(parcel);
                P(bundle10);
                return true;
            case 13:
                Bundle bundle11 = (Bundle) j0.a(parcel, Bundle.CREATOR);
                j0.b(parcel);
                T2(bundle11);
                return true;
            default:
                return false;
        }
    }
}
