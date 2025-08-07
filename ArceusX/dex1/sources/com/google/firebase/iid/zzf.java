package com.google.firebase.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;

public class zzf implements Parcelable {
    public static final Parcelable.Creator<zzf> CREATOR = new v();

    private Messenger f19092d;

    public static final class a extends ClassLoader {
        @Override
        protected final Class<?> loadClass(String str, boolean z7) throws ClassNotFoundException {
            if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
                return super.loadClass(str, z7);
            }
            if (!FirebaseInstanceId.v()) {
                return zzf.class;
            }
            Log.d("FirebaseInstanceId", "Using renamed FirebaseIidMessengerCompat class");
            return zzf.class;
        }
    }

    public zzf(IBinder iBinder) {
        this.f19092d = new Messenger(iBinder);
    }

    private final IBinder a() {
        Messenger messenger = this.f19092d;
        messenger.getClass();
        return messenger.getBinder();
    }

    public final void b(Message message) throws RemoteException {
        Messenger messenger = this.f19092d;
        messenger.getClass();
        messenger.send(message);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return a().equals(((zzf) obj).a());
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public int hashCode() {
        return a().hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i7) {
        Messenger messenger = this.f19092d;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
