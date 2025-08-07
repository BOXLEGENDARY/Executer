package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.IBinder;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class h extends Service {

    static final Object f10381A = new Object();

    static final HashMap<ComponentName, g> f10382B = new HashMap<>();

    b f10383d;

    g f10384e;

    a f10385i;

    boolean f10386v = false;

    boolean f10387w = false;

    boolean f10388y = false;

    final ArrayList<c> f10389z = null;

    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        @Override
        public Void doInBackground(Void... voidArr) {
            while (true) {
                d dVarA = h.this.a();
                if (dVarA == null) {
                    return null;
                }
                h.this.f(dVarA.getIntent());
                dVarA.e();
            }
        }

        @Override
        public void onCancelled(Void r1) {
            h.this.h();
        }

        @Override
        public void onPostExecute(Void r1) {
            h.this.h();
        }
    }

    interface b {
        IBinder a();

        d b();
    }

    final class c implements d {

        final Intent f10391a;

        final int f10392b;

        c(Intent intent, int i7) {
            this.f10391a = intent;
            this.f10392b = i7;
        }

        @Override
        public void e() {
            h.this.stopSelf(this.f10392b);
        }

        @Override
        public Intent getIntent() {
            return this.f10391a;
        }
    }

    interface d {
        void e();

        Intent getIntent();
    }

    static final class e extends JobServiceEngine implements b {

        final h f10394a;

        final Object f10395b;

        JobParameters f10396c;

        final class a implements d {

            final JobWorkItem f10397a;

            a(JobWorkItem jobWorkItem) {
                this.f10397a = jobWorkItem;
            }

            @Override
            public void e() {
                synchronized (e.this.f10395b) {
                    try {
                        JobParameters jobParameters = e.this.f10396c;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.f10397a);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override
            public Intent getIntent() {
                return this.f10397a.getIntent();
            }
        }

        e(h hVar) {
            super(hVar);
            this.f10395b = new Object();
            this.f10394a = hVar;
        }

        @Override
        public IBinder a() {
            return getBinder();
        }

        @Override
        public d b() {
            synchronized (this.f10395b) {
                try {
                    JobParameters jobParameters = this.f10396c;
                    if (jobParameters == null) {
                        return null;
                    }
                    JobWorkItem jobWorkItemDequeueWork = jobParameters.dequeueWork();
                    if (jobWorkItemDequeueWork == null) {
                        return null;
                    }
                    jobWorkItemDequeueWork.getIntent().setExtrasClassLoader(this.f10394a.getClassLoader());
                    return new a(jobWorkItemDequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override
        public boolean onStartJob(JobParameters jobParameters) {
            this.f10396c = jobParameters;
            this.f10394a.d(false);
            return true;
        }

        @Override
        public boolean onStopJob(JobParameters jobParameters) {
            boolean zB = this.f10394a.b();
            synchronized (this.f10395b) {
                this.f10396c = null;
            }
            return zB;
        }
    }

    static final class f extends g {

        private final JobInfo f10399d;

        private final JobScheduler f10400e;

        f(Context context, ComponentName componentName, int i7) {
            super(componentName);
            b(i7);
            this.f10399d = new JobInfo.Builder(i7, this.f10401a).setOverrideDeadline(0L).build();
            this.f10400e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        @Override
        void a(Intent intent) {
            this.f10400e.enqueue(this.f10399d, new JobWorkItem(intent));
        }
    }

    static abstract class g {

        final ComponentName f10401a;

        boolean f10402b;

        int f10403c;

        g(ComponentName componentName) {
            this.f10401a = componentName;
        }

        abstract void a(Intent intent);

        void b(int i7) {
            if (!this.f10402b) {
                this.f10402b = true;
                this.f10403c = i7;
            } else {
                if (this.f10403c == i7) {
                    return;
                }
                throw new IllegalArgumentException("Given job ID " + i7 + " is different than previous " + this.f10403c);
            }
        }

        public void c() {
        }

        public void d() {
        }

        public void e() {
        }
    }

    public static void c(Context context, ComponentName componentName, int i7, Intent intent) {
        if (intent == null) {
            throw new IllegalArgumentException("work must not be null");
        }
        synchronized (f10381A) {
            g gVarE = e(context, componentName, true, i7);
            gVarE.b(i7);
            gVarE.a(intent);
        }
    }

    static g e(Context context, ComponentName componentName, boolean z7, int i7) {
        HashMap<ComponentName, g> map = f10382B;
        g gVar = map.get(componentName);
        if (gVar != null) {
            return gVar;
        }
        if (!z7) {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        f fVar = new f(context, componentName, i7);
        map.put(componentName, fVar);
        return fVar;
    }

    d a() {
        b bVar = this.f10383d;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.f10389z) {
            try {
                if (this.f10389z.size() <= 0) {
                    return null;
                }
                return this.f10389z.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean b() {
        a aVar = this.f10385i;
        if (aVar != null) {
            aVar.cancel(this.f10386v);
        }
        this.f10387w = true;
        return g();
    }

    void d(boolean z7) {
        if (this.f10385i == null) {
            this.f10385i = new a();
            g gVar = this.f10384e;
            if (gVar != null && z7) {
                gVar.d();
            }
            this.f10385i.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    protected abstract void f(Intent intent);

    public boolean g() {
        return true;
    }

    void h() {
        ArrayList<c> arrayList = this.f10389z;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.f10385i = null;
                    ArrayList<c> arrayList2 = this.f10389z;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        d(false);
                    } else if (!this.f10388y) {
                        this.f10384e.c();
                    }
                } finally {
                }
            }
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        b bVar = this.f10383d;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        this.f10383d = new e(this);
        this.f10384e = null;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        ArrayList<c> arrayList = this.f10389z;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f10388y = true;
                this.f10384e.c();
            }
        }
    }

    @Override
    public int onStartCommand(Intent intent, int i7, int i8) {
        if (this.f10389z == null) {
            return 2;
        }
        this.f10384e.e();
        synchronized (this.f10389z) {
            ArrayList<c> arrayList = this.f10389z;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new c(intent, i8));
            d(true);
        }
        return 3;
    }
}
