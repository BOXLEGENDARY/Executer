package c;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

public interface InterfaceC1743a extends IInterface {

    public static final String f12673c = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    public static abstract class AbstractBinderC0139a extends Binder implements InterfaceC1743a {

        private static class C0140a implements InterfaceC1743a {

            private IBinder f12674d;

            C0140a(IBinder iBinder) {
                this.f12674d = iBinder;
            }

            @Override
            public IBinder asBinder() {
                return this.f12674d;
            }

            @Override
            public void t6(String str, int i7, String str2, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(InterfaceC1743a.f12673c);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i7);
                    parcelObtain.writeString(str2);
                    b.b(parcelObtain, notification, 0);
                    this.f12674d.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public static InterfaceC1743a E0(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(InterfaceC1743a.f12673c);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof InterfaceC1743a)) ? new C0140a(iBinder) : (InterfaceC1743a) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        public static <T extends Parcelable> void b(Parcel parcel, T t7, int i7) {
            if (t7 == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t7.writeToParcel(parcel, i7);
            }
        }
    }

    void t6(String str, int i7, String str2, Notification notification) throws RemoteException;
}
