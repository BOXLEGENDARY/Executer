package Z3;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import n3.C2651i;
import t3.C2910a;
import u3.C2929c;
import u3.C2930d;
import v3.r;
import v3.t;

public class a {

    private static ScheduledExecutorService f8193n;

    private static volatile InterfaceC0061a f8194o = new b();

    private final Object f8195a;

    private final PowerManager.WakeLock f8196b;

    private WorkSource f8197c;

    private final int f8198d;

    private final String f8199e;

    private final String f8200f;

    private final String f8201g;

    private final Context f8202h;

    private boolean f8203i;

    private final Map<String, Integer[]> f8204j;

    private final Set<Future<?>> f8205k;

    private int f8206l;

    private AtomicInteger f8207m;

    public interface InterfaceC0061a {
    }

    public a(Context context, int i7, String str) {
        this(context, i7, str, null, context == null ? null : context.getPackageName());
    }

    private final String d(String str) {
        return (!this.f8203i || TextUtils.isEmpty(str)) ? this.f8200f : str;
    }

    private final List<String> e() {
        return t.d(this.f8197c);
    }

    public final void f(int i7) {
        if (this.f8196b.isHeld()) {
            try {
                this.f8196b.release();
            } catch (RuntimeException e7) {
                if (!e7.getClass().equals(RuntimeException.class)) {
                    throw e7;
                }
                Log.e("WakeLock", String.valueOf(this.f8199e).concat(" was already released!"), e7);
            }
            this.f8196b.isHeld();
        }
    }

    public void a(long j7) {
        this.f8207m.incrementAndGet();
        String strD = d(null);
        synchronized (this.f8195a) {
            try {
                if (!this.f8204j.isEmpty() || this.f8206l > 0) {
                    if (!this.f8196b.isHeld()) {
                        this.f8204j.clear();
                        this.f8206l = 0;
                    }
                }
                if (this.f8203i) {
                    Integer[] numArr = this.f8204j.get(strD);
                    if (numArr == null) {
                        this.f8204j.put(strD, new Integer[]{1});
                        C2930d.a().c(this.f8202h, C2929c.a(this.f8196b, strD), 7, this.f8199e, strD, null, this.f8198d, e(), j7);
                        this.f8206l++;
                    } else {
                        numArr[0] = Integer.valueOf(numArr[0].intValue() + 1);
                        if (!this.f8203i) {
                            C2930d.a().c(this.f8202h, C2929c.a(this.f8196b, strD), 7, this.f8199e, strD, null, this.f8198d, e(), j7);
                            this.f8206l++;
                        }
                    }
                } else if (!this.f8203i && this.f8206l == 0) {
                    C2930d.a().c(this.f8202h, C2929c.a(this.f8196b, strD), 7, this.f8199e, strD, null, this.f8198d, e(), j7);
                    this.f8206l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f8196b.acquire();
        if (j7 > 0) {
            f8193n.schedule(new c(this), j7, TimeUnit.MILLISECONDS);
        }
    }

    public void b() {
        Integer[] numArr;
        if (this.f8207m.decrementAndGet() < 0) {
            Log.e("WakeLock", String.valueOf(this.f8199e).concat(" release without a matched acquire!"));
        }
        String strD = d(null);
        synchronized (this.f8195a) {
            try {
                if (!this.f8203i || (numArr = this.f8204j.get(strD)) == null) {
                    if (!this.f8203i && this.f8206l == 1) {
                        C2930d.a().b(this.f8202h, C2929c.a(this.f8196b, strD), 8, this.f8199e, strD, null, this.f8198d, e());
                        this.f8206l--;
                    }
                } else if (numArr[0].intValue() == 1) {
                    this.f8204j.remove(strD);
                    C2930d.a().b(this.f8202h, C2929c.a(this.f8196b, strD), 8, this.f8199e, strD, null, this.f8198d, e());
                    this.f8206l--;
                } else {
                    numArr[0] = Integer.valueOf(numArr[0].intValue() - 1);
                    if (!this.f8203i) {
                        C2930d.a().b(this.f8202h, C2929c.a(this.f8196b, strD), 8, this.f8199e, strD, null, this.f8198d, e());
                        this.f8206l--;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        f(0);
    }

    public void c(boolean z7) {
        this.f8196b.setReferenceCounted(z7);
        this.f8203i = z7;
    }

    private a(Context context, int i7, String str, String str2, String str3) {
        this(context, i7, str, null, str3, null);
    }

    private a(Context context, int i7, String str, String str2, String str3, String str4) {
        this.f8195a = this;
        this.f8203i = true;
        this.f8204j = new HashMap();
        this.f8205k = Collections.synchronizedSet(new HashSet());
        this.f8207m = new AtomicInteger(0);
        C2651i.m(context, "WakeLock: context must not be null");
        C2651i.g(str, "WakeLock: wakeLockName must not be empty");
        this.f8198d = i7;
        this.f8200f = null;
        this.f8201g = null;
        Context applicationContext = context.getApplicationContext();
        this.f8202h = applicationContext;
        if (!"com.google.android.gms".equals(context.getPackageName())) {
            String strValueOf = String.valueOf(str);
            this.f8199e = strValueOf.length() != 0 ? "*gcore*:".concat(strValueOf) : new String("*gcore*:");
        } else {
            this.f8199e = str;
        }
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(i7, str);
        this.f8196b = wakeLockNewWakeLock;
        if (t.e(context)) {
            WorkSource workSourceB = t.b(context, r.a(str3) ? context.getPackageName() : str3);
            this.f8197c = workSourceB;
            if (workSourceB != null && t.e(applicationContext)) {
                WorkSource workSource = this.f8197c;
                if (workSource != null) {
                    workSource.add(workSourceB);
                } else {
                    this.f8197c = workSourceB;
                }
                try {
                    wakeLockNewWakeLock.setWorkSource(this.f8197c);
                } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e7) {
                    Log.wtf("WakeLock", e7.toString());
                }
            }
        }
        if (f8193n == null) {
            f8193n = C2910a.a().a();
        }
    }
}
