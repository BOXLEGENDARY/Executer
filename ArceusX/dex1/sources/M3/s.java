package m3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class s extends BroadcastReceiver {

    Context f22039a;

    private final r f22040b;

    public s(r rVar) {
        this.f22040b = rVar;
    }

    public final void a(Context context) {
        this.f22039a = context;
    }

    public final synchronized void b() {
        try {
            Context context = this.f22039a;
            if (context != null) {
                context.unregisterReceiver(this);
            }
            this.f22039a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f22040b.a();
            b();
        }
    }
}
