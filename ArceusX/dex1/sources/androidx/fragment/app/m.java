package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class m<E> extends AbstractC1665j {

    private final Activity f11209d;

    private final Context f11210e;

    private final Handler f11211i;

    private final int f11212v;

    final FragmentManager f11213w;

    m(ActivityC1663h activityC1663h) {
        this(activityC1663h, activityC1663h, new Handler(), 0);
    }

    @Override
    public View c(int i7) {
        return null;
    }

    @Override
    public boolean d() {
        return true;
    }

    Activity e() {
        return this.f11209d;
    }

    Context f() {
        return this.f11210e;
    }

    public Handler g() {
        return this.f11211i;
    }

    public void h(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public abstract E i();

    public LayoutInflater j() {
        return LayoutInflater.from(this.f11210e);
    }

    @Deprecated
    public void k(Fragment fragment, String[] strArr, int i7) {
    }

    public boolean l(String str) {
        return false;
    }

    public void m(Fragment fragment, Intent intent, int i7, Bundle bundle) {
        if (i7 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        androidx.core.content.a.l(this.f11210e, intent, bundle);
    }

    @Deprecated
    public void n(Fragment fragment, IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) throws IntentSender.SendIntentException {
        if (i7 != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        androidx.core.app.b.y(this.f11209d, intentSender, i7, intent, i8, i9, i10, bundle);
    }

    public void o() {
    }

    m(Activity activity, Context context, Handler handler, int i7) {
        this.f11213w = new v();
        this.f11209d = activity;
        this.f11210e = (Context) x0.g.h(context, "context == null");
        this.f11211i = (Handler) x0.g.h(handler, "handler == null");
        this.f11212v = i7;
    }
}
