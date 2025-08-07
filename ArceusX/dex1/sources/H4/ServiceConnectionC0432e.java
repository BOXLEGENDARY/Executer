package H4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

final class ServiceConnectionC0432e implements ServiceConnection {

    final C0433f f1596d;

    ServiceConnectionC0432e(C0433f c0433f, C0431d c0431d) {
        this.f1596d = c0433f;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f1596d.f1599b.c("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f1596d.c().post(new C0429b(this, iBinder));
    }

    @Override
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f1596d.f1599b.c("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f1596d.c().post(new C0430c(this));
    }
}
