package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface InterfaceC1737a extends IInterface {

    public static abstract class AbstractBinderC0126a extends Binder implements InterfaceC1737a {
        public AbstractBinderC0126a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsCallback");
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
            if (i7 == 1598968902) {
                parcel2.writeString("android.support.customtabs.ICustomTabsCallback");
                return true;
            }
            switch (i7) {
                case 2:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    r5(parcel.readInt(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    N4(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    q6(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    h6(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    z6(parcel.readInt(), parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface("android.support.customtabs.ICustomTabsCallback");
                    Bundle bundleM2 = M2(parcel.readString(), parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
                    parcel2.writeNoException();
                    if (bundleM2 != null) {
                        parcel2.writeInt(1);
                        bundleM2.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                default:
                    return super.onTransact(i7, parcel, parcel2, i8);
            }
        }
    }

    Bundle M2(String str, Bundle bundle) throws RemoteException;

    void N4(String str, Bundle bundle) throws RemoteException;

    void h6(String str, Bundle bundle) throws RemoteException;

    void q6(Bundle bundle) throws RemoteException;

    void r5(int i7, Bundle bundle) throws RemoteException;

    void z6(int i7, Uri uri, boolean z7, Bundle bundle) throws RemoteException;
}
