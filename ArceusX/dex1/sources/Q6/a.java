package Q6;

import S6.e;
import S6.m;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.RingtoneManager;
import android.os.AsyncTask;
import androidx.core.app.l;
import com.roblox.client.I;
import com.roblox.client.M;
import com.roblox.client.startup.ActivitySplash;
import com.roblox.client.startup.StartedForEnum;
import java.io.Serializable;

public abstract class a<T extends S6.m> implements i<T>, e.a<T> {

    protected S6.e<T> f4873a;

    class AsyncTaskC0045a extends u {

        final Context f4874d;

        final boolean f4875e;

        AsyncTaskC0045a(Context context, long j7, Context context2, boolean z7) {
            super(context, j7);
            this.f4874d = context2;
            this.f4875e = z7;
        }

        @Override
        public void c(Bitmap bitmap) {
            if (a.this.f4873a.isEmpty()) {
                return;
            }
            a.this.u(this.f4874d, a.this.g(this.f4874d, this.f4875e, bitmap));
        }
    }

    public a() {
        S6.e<T> eVar = new S6.e<>();
        this.f4873a = eVar;
        eVar.l(this);
    }

    private PendingIntent h(Context context, T t7) {
        Intent intent = new Intent(j(2));
        intent.setClass(context, ActivitySplash.class);
        intent.putExtra("STARTED_FOR_INTENT_KEY", (Serializable) StartedForEnum.LOADED_FROM_PUSH_NOTIFICATION);
        Intent intentS = s(intent, t7);
        intentS.putExtra("EXTRA_NOTIFICATION_ID", t7.b());
        intentS.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 2);
        intentS.putExtra("EXTRA_NOTIFICATION_TYPE", p());
        return PendingIntent.getActivity(context, n(), intentS, 301989888);
    }

    @Override
    public void a(Context context, String str) {
        this.f4873a.j(str);
        if (this.f4873a.isEmpty()) {
            f(context, n());
        } else {
            e(context, false);
        }
    }

    @Override
    public void b(Context context, T t7) {
        this.f4873a.g(t7);
        e(context, r());
    }

    @Override
    public void clear() {
        this.f4873a.clear();
    }

    @Override
    public void d(Context context, long j7) {
        this.f4873a.k(j7);
        if (this.f4873a.isEmpty()) {
            f(context, n());
        } else {
            e(context, false);
        }
    }

    protected void e(Context context, boolean z7) {
        if (context == null || this.f4873a.isEmpty()) {
            return;
        }
        new AsyncTaskC0045a(context, q(), context, z7).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    protected void f(Context context, int i7) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            notificationManager.cancel(i7);
        }
    }

    protected l.e g(Context context, boolean z7, Bitmap bitmap) {
        l.e eVar = new l.e(context, "channel_general");
        eVar.k(h(context, l()));
        eVar.o(i(context, l()));
        eVar.x(I.f19467j);
        eVar.l(m(context));
        eVar.f(true);
        eVar.m(o(context));
        eVar.u(this.f4873a.size());
        eVar.r(bitmap);
        if (z7) {
            eVar.y(RingtoneManager.getDefaultUri(2));
        } else {
            eVar.y(null);
        }
        eVar.z(new l.c().h(m(context)));
        return eVar;
    }

    protected PendingIntent i(Context context, T t7) {
        Intent intent = new Intent(j(1));
        intent.setClass(context, k());
        Intent intentT = t(intent, t7);
        intentT.putExtra("EXTRA_NOTIFICATION_TYPE", p());
        intentT.putExtra("EXTRA_INTENT_ACTION_TYPE_CODE", 1);
        intentT.putExtra("EXTRA_NOTIFICATION_ID", t7.b());
        return PendingIntent.getBroadcast(context, n(), intentT, 301989888);
    }

    protected abstract String j(int i7);

    protected abstract Class<?> k();

    protected T l() {
        if (this.f4873a.isEmpty()) {
            return null;
        }
        return this.f4873a.get(r0.size() - 1);
    }

    protected abstract String m(Context context);

    protected abstract int n();

    protected String o(Context context) {
        return context.getString(M.f19622W);
    }

    protected abstract String p();

    protected abstract long q();

    public boolean r() {
        return this.f4873a.size() != 0 && this.f4873a.size() <= 2;
    }

    protected abstract Intent s(Intent intent, T t7);

    protected abstract Intent t(Intent intent, T t7);

    protected void u(Context context, l.e eVar) {
        ((NotificationManager) context.getSystemService("notification")).notify(n(), eVar.c());
    }
}
