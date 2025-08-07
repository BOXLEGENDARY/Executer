package com.google.firebase.messaging;

import a4.C1574k;
import a4.C1576m;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.util.Log;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.p;
import java.util.concurrent.ExecutorService;
import w3.ThreadFactoryC2969b;

public abstract class f extends Service {
    private final ExecutorService zza;
    private Binder zzb;
    private final Object zzc;
    private int zzd;
    private int zze;

    public f() {
        L3.b bVarA = L3.a.a();
        String simpleName = getClass().getSimpleName();
        this.zza = bVarA.b(new ThreadFactoryC2969b(simpleName.length() != 0 ? "Firebase-".concat(simpleName) : new String("Firebase-")), L3.f.f2043a);
        this.zzc = new Object();
        this.zze = 0;
    }

    public final Task<Void> zzd(final Intent intent) {
        if (zzb(intent)) {
            return C1576m.f(null);
        }
        final C1574k c1574k = new C1574k();
        this.zza.execute(new Runnable(this, intent, c1574k) {

            private final f f19135d;

            private final Intent f19136e;

            private final C1574k f19137i;

            {
                this.f19135d = this;
                this.f19136e = intent;
                this.f19137i = c1574k;
            }

            @Override
            public final void run() {
                f fVar = this.f19135d;
                Intent intent2 = this.f19136e;
                C1574k c1574k2 = this.f19137i;
                try {
                    fVar.zzc(intent2);
                } finally {
                    c1574k2.c(null);
                }
            }
        });
        return c1574k.a();
    }

    private final void zzf(Intent intent) {
        if (intent != null) {
            a5.l.b(intent);
        }
        synchronized (this.zzc) {
            try {
                int i7 = this.zze - 1;
                this.zze = i7;
                if (i7 == 0) {
                    stopSelfResult(this.zzd);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override
    public final synchronized IBinder onBind(Intent intent) {
        try {
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                Log.d("EnhancedIntentService", "Service received bind request");
            }
            if (this.zzb == null) {
                this.zzb = new p(new a5.n(this) {

                    private final f f19138a;

                    {
                        this.f19138a = this;
                    }

                    @Override
                    public final Task f(Intent intent2) {
                        return this.f19138a.zzd(intent2);
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.zzb;
    }

    @Override
    public void onDestroy() {
        this.zza.shutdown();
        super.onDestroy();
    }

    @Override
    public final int onStartCommand(final Intent intent, int i7, int i8) {
        synchronized (this.zzc) {
            this.zzd = i8;
            this.zze++;
        }
        Intent intentZza = zza(intent);
        if (intentZza == null) {
            zzf(intent);
            return 2;
        }
        Task<Void> taskZzd = zzd(intentZza);
        if (taskZzd.n()) {
            zzf(intent);
            return 2;
        }
        taskZzd.b(k.f19141d, new OnCompleteListener(this, intent) {

            private final f f19139a;

            private final Intent f19140b;

            {
                this.f19139a = this;
                this.f19140b = intent;
            }

            @Override
            public final void onComplete(Task task) {
                this.f19139a.zza(this.f19140b, task);
            }
        });
        return 3;
    }

    protected Intent zza(Intent intent) {
        return intent;
    }

    public boolean zzb(Intent intent) {
        return false;
    }

    public abstract void zzc(Intent intent);

    final void zza(Intent intent, Task task) {
        zzf(intent);
    }
}
