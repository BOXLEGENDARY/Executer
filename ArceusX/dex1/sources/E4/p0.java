package E4;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class p0 {

    protected final r0 f1157a;

    private final IntentFilter f1158b;

    private final Context f1159c;

    protected final Set f1160d = new HashSet();

    private o0 f1161e = null;

    private volatile boolean f1162f = false;

    protected p0(r0 r0Var, IntentFilter intentFilter, Context context) {
        this.f1157a = r0Var;
        this.f1158b = intentFilter;
        this.f1159c = N.a(context);
    }

    private final void f() {
        o0 o0Var;
        if ((this.f1162f || !this.f1160d.isEmpty()) && this.f1161e == null) {
            o0 o0Var2 = new o0(this, null);
            this.f1161e = o0Var2;
            if (Build.VERSION.SDK_INT >= 33) {
                this.f1159c.registerReceiver(o0Var2, this.f1158b, 2);
            } else {
                this.f1159c.registerReceiver(o0Var2, this.f1158b);
            }
        }
        if (this.f1162f || !this.f1160d.isEmpty() || (o0Var = this.f1161e) == null) {
            return;
        }
        this.f1159c.unregisterReceiver(o0Var);
        this.f1161e = null;
    }

    public abstract void a(Context context, Intent intent);

    public final synchronized void b(B4.a aVar) {
        this.f1157a.d("registerListener", new Object[0]);
        S.a(aVar, "Registered Play Core listener should not be null.");
        this.f1160d.add(aVar);
        f();
    }

    public final synchronized void c(boolean z7) {
        this.f1162f = true;
        f();
    }

    public final synchronized void d(B4.a aVar) {
        this.f1157a.d("unregisterListener", new Object[0]);
        S.a(aVar, "Unregistered Play Core listener should not be null.");
        this.f1160d.remove(aVar);
        f();
    }

    public final synchronized void e(Object obj) {
        Iterator it = new HashSet(this.f1160d).iterator();
        while (it.hasNext()) {
            ((B4.a) it.next()).a(obj);
        }
    }
}
