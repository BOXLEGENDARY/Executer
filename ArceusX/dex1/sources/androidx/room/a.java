package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

public interface a extends IInterface {

    public static final String f12048a = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    public static abstract class AbstractBinderC0114a extends Binder implements a {

        private static class C0115a implements a {

            private IBinder f12049d;

            C0115a(IBinder iBinder) {
                this.f12049d = iBinder;
            }

            @Override
            public void P1(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(a.f12048a);
                    parcelObtain.writeStringArray(strArr);
                    this.f12049d.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override
            public IBinder asBinder() {
                return this.f12049d;
            }
        }

        public AbstractBinderC0114a() {
            attachInterface(this, a.f12048a);
        }

        public static a E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.f12048a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0115a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
            String str = a.f12048a;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i7 != 1) {
                return super.onTransact(i7, parcel, parcel2, i8);
            }
            P1(parcel.createStringArray());
            return true;
        }
    }

    void P1(String[] strArr) throws RemoteException;
}
