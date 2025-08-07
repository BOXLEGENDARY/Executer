package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import b.InterfaceC1738b;

public abstract class e implements ServiceConnection {

    private Context f22609d;

    class a extends C2715c {
        a(InterfaceC1738b interfaceC1738b, ComponentName componentName, Context context) {
            super(interfaceC1738b, componentName, context);
        }
    }

    public abstract void a(ComponentName componentName, C2715c c2715c);

    void b(Context context) {
        this.f22609d = context;
    }

    @Override
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.f22609d == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        a(componentName, new a(InterfaceC1738b.a.E0(iBinder), componentName, this.f22609d));
    }
}
