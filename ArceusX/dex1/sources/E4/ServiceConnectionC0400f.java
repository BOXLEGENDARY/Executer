package E4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class ServiceConnectionC0400f implements ServiceConnection {

    final C0401g f1119d;

    ServiceConnectionC0400f(C0401g c0401g, C0399e c0399e) {
        this.f1119d = c0401g;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1119d.f1122b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        C0401g c0401g = this.f1119d;
        c0401g.c().post(new C0397c(this, iBinder));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f1119d.f1122b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        C0401g c0401g = this.f1119d;
        c0401g.c().post(new C0398d(this));
    }
}
