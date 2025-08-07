package b;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface InterfaceC1738b extends IInterface {

    public static abstract class a extends Binder implements InterfaceC1738b {

        private static class C0127a implements InterfaceC1738b {

            public static InterfaceC1738b f12530e;

            private IBinder f12531d;

            C0127a(IBinder iBinder) {
                this.f12531d = iBinder;
            }

            @Override
            public int H1(InterfaceC1737a interfaceC1737a, String str, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1737a != null ? interfaceC1737a.asBinder() : null);
                    parcelObtain.writeString(str);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f12531d.transact(8, parcelObtain, parcelObtain2, 0) && a.O0() != null) {
                        int iH1 = a.O0().H1(interfaceC1737a, str, bundle);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return iH1;
                    }
                    parcelObtain2.readException();
                    int i7 = parcelObtain2.readInt();
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return i7;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override
            public boolean H3(InterfaceC1737a interfaceC1737a) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1737a != null ? interfaceC1737a.asBinder() : null);
                    if (!this.f12531d.transact(3, parcelObtain, parcelObtain2, 0) && a.O0() != null) {
                        boolean zH3 = a.O0().H3(interfaceC1737a);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zH3;
                    }
                    parcelObtain2.readException();
                    boolean z7 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z7;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override
            public boolean U4(InterfaceC1737a interfaceC1737a, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1737a != null ? interfaceC1737a.asBinder() : null);
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f12531d.transact(10, parcelObtain, parcelObtain2, 0) && a.O0() != null) {
                        boolean zU4 = a.O0().U4(interfaceC1737a, bundle);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zU4;
                    }
                    parcelObtain2.readException();
                    boolean z7 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z7;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override
            public IBinder asBinder() {
                return this.f12531d;
            }

            @Override
            public boolean c4(InterfaceC1737a interfaceC1737a, Uri uri) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1737a != null ? interfaceC1737a.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f12531d.transact(7, parcelObtain, parcelObtain2, 0) && a.O0() != null) {
                        boolean zC4 = a.O0().c4(interfaceC1737a, uri);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zC4;
                    }
                    parcelObtain2.readException();
                    boolean z7 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z7;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }

            @Override
            public boolean p3(long j7) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeLong(j7);
                    if (!this.f12531d.transact(2, parcelObtain, parcelObtain2, 0) && a.O0() != null) {
                        return a.O0().p3(j7);
                    }
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override
            public boolean s1(InterfaceC1737a interfaceC1737a, Uri uri, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    parcelObtain.writeStrongBinder(interfaceC1737a != null ? interfaceC1737a.asBinder() : null);
                    if (uri != null) {
                        parcelObtain.writeInt(1);
                        uri.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    if (!this.f12531d.transact(11, parcelObtain, parcelObtain2, 0) && a.O0() != null) {
                        boolean zS1 = a.O0().s1(interfaceC1737a, uri, bundle);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return zS1;
                    }
                    parcelObtain2.readException();
                    boolean z7 = parcelObtain2.readInt() != 0;
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    return z7;
                } catch (Throwable th) {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                    throw th;
                }
            }
        }

        public static InterfaceC1738b E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1738b)) ? new C0127a(iBinder) : (InterfaceC1738b) iInterfaceQueryLocalInterface;
        }

        public static InterfaceC1738b O0() {
            return C0127a.f12530e;
        }
    }

    int H1(InterfaceC1737a interfaceC1737a, String str, Bundle bundle) throws RemoteException;

    boolean H3(InterfaceC1737a interfaceC1737a) throws RemoteException;

    boolean U4(InterfaceC1737a interfaceC1737a, Bundle bundle) throws RemoteException;

    boolean c4(InterfaceC1737a interfaceC1737a, Uri uri) throws RemoteException;

    boolean p3(long j7) throws RemoteException;

    boolean s1(InterfaceC1737a interfaceC1737a, Uri uri, Bundle bundle) throws RemoteException;
}
