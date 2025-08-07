package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.room.a;

public interface b extends IInterface {

    public static final String f12050b = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    public static abstract class a extends Binder implements b {

        private static class C0116a implements b {

            private IBinder f12051d;

            C0116a(IBinder iBinder) {
                this.f12051d = iBinder;
            }

            @Override
            public int C2(androidx.room.a aVar, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f12050b);
                    parcelObtain.writeStrongInterface(aVar);
                    parcelObtain.writeString(str);
                    this.f12051d.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override
            public IBinder asBinder() {
                return this.f12051d;
            }

            @Override
            public void n6(int i7, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(b.f12050b);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeStringArray(strArr);
                    this.f12051d.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, b.f12050b);
        }

        public static b E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.f12050b);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b)) ? new C0116a(iBinder) : (b) iInterfaceQueryLocalInterface;
        }

        @Override
        public IBinder asBinder() {
            return this;
        }

        @Override
        public boolean onTransact(int i7, Parcel parcel, Parcel parcel2, int i8) throws RemoteException {
            String str = b.f12050b;
            if (i7 >= 1 && i7 <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i7 == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i7 == 1) {
                int iC2 = C2(a.AbstractBinderC0114a.E0(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iC2);
            } else if (i7 == 2) {
                F6(a.AbstractBinderC0114a.E0(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else {
                if (i7 != 3) {
                    return super.onTransact(i7, parcel, parcel2, i8);
                }
                n6(parcel.readInt(), parcel.createStringArray());
            }
            return true;
        }
    }

    int C2(androidx.room.a aVar, String str) throws RemoteException;

    void F6(androidx.room.a aVar, int i7) throws RemoteException;

    void n6(int i7, String[] strArr) throws RemoteException;
}
