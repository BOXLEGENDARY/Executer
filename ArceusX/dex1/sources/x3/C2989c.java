package x3;

import android.content.Context;

public class C2989c {

    private static final C2989c f24325b = new C2989c();

    private C2988b f24326a = null;

    public static C2988b a(Context context) {
        return f24325b.b(context);
    }

    public final synchronized C2988b b(Context context) {
        try {
            if (this.f24326a == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f24326a = new C2988b(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f24326a;
    }
}
