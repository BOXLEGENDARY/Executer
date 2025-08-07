package E2;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p2.b;
import p2.c;

public interface a extends IInterface {

    public static abstract class AbstractBinderC0012a extends b implements a {

        public static class C0013a extends p2.a implements a {
            C0013a(IBinder iBinder) {
                super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            }

            @Override
            public final Bundle n0(Bundle bundle) throws RemoteException {
                Parcel parcelE0 = E0();
                c.b(parcelE0, bundle);
                Parcel parcelO0 = O0(parcelE0);
                Bundle bundle2 = (Bundle) c.a(parcelO0, Bundle.CREATOR);
                parcelO0.recycle();
                return bundle2;
            }
        }

        public static a E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new C0013a(iBinder);
        }
    }

    Bundle n0(Bundle bundle) throws RemoteException;
}
