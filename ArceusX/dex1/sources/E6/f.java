package E6;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import h7.l;
import java.util.ArrayList;
import java.util.Iterator;

public class f {

    private boolean f1195a;

    private final Handler f1196b;

    private final ArrayList<e> f1197c;

    class a implements Runnable {

        final e f1198d;

        a(e eVar) {
            this.f1198d = eVar;
        }

        @Override
        public void run() {
            if (f.this.f1197c.contains(this.f1198d)) {
                return;
            }
            f.this.f1197c.add(this.f1198d);
        }
    }

    class b implements Runnable {

        final e f1200d;

        b(e eVar) {
            this.f1200d = eVar;
        }

        @Override
        public void run() {
            while (f.this.f1197c.remove(this.f1200d)) {
            }
        }
    }

    class c implements Runnable {

        final int f1202d;

        final Bundle f1203e;

        c(int i7, Bundle bundle) {
            this.f1202d = i7;
            this.f1203e = bundle;
        }

        @Override
        public void run() {
            Iterator it = f.this.f1197c.iterator();
            while (it.hasNext()) {
                e eVar = (e) it.next();
                l.g("NotificationManager", "observer= " + eVar.getClass() + ". notificationId= " + this.f1202d + ".");
                eVar.i(this.f1202d, this.f1203e);
            }
        }
    }

    private static class d {

        static final f f1205a = new f();
    }

    public interface e {
        void i(int i7, Bundle bundle);
    }

    public static f c() {
        return d.f1205a;
    }

    private void e(int i7, Bundle bundle) {
        this.f1196b.post(new c(i7, bundle));
    }

    public void b(e eVar) {
        if (!this.f1195a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        this.f1196b.post(new a(eVar));
    }

    public void d(Context context) {
        l.g("NotificationManager", "init:");
        this.f1195a = true;
    }

    public void f(int i7, Bundle bundle) {
        if (!this.f1195a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        e(i7, bundle);
    }

    public void g(e eVar) {
        if (!this.f1195a) {
            throw new IllegalStateException("NotificationManager was not initialized");
        }
        this.f1196b.post(new b(eVar));
    }

    private f() {
        this.f1196b = new Handler(Looper.getMainLooper());
        this.f1197c = new ArrayList<>();
    }
}
