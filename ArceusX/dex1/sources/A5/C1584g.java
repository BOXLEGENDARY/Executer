package a5;

import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import com.google.firebase.iid.zzf;

final class C1584g {

    private final Messenger f8352a;

    private final zzf f8353b;

    C1584g(IBinder iBinder) throws RemoteException {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.f8352a = new Messenger(iBinder);
            this.f8353b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.f8353b = new zzf(iBinder);
            this.f8352a = null;
        } else {
            String strValueOf = String.valueOf(interfaceDescriptor);
            Log.w("MessengerIpcClient", strValueOf.length() != 0 ? "Invalid interface descriptor: ".concat(strValueOf) : new String("Invalid interface descriptor: "));
            throw new RemoteException();
        }
    }

    final void a(Message message) throws RemoteException {
        Messenger messenger = this.f8352a;
        if (messenger != null) {
            messenger.send(message);
            return;
        }
        zzf zzfVar = this.f8353b;
        if (zzfVar == null) {
            throw new IllegalStateException("Both messengers are null");
        }
        zzfVar.b(message);
    }
}
