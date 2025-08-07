package h2;

import android.content.Context;
import com.birbit.android.jobqueue.QueueFactory;
import com.birbit.android.jobqueue.di.DependencyInjector;
import com.birbit.android.jobqueue.log.CustomLogger;
import com.birbit.android.jobqueue.network.NetworkUtil;
import com.birbit.android.jobqueue.scheduling.Scheduler;
import com.birbit.android.jobqueue.timer.Timer;
import j2.C2491a;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;

public class a {

    String f21020a;

    int f21021b;

    int f21022c;

    int f21023d;

    int f21024e;

    Context f21025f;

    QueueFactory f21026g;

    DependencyInjector f21027h;

    NetworkUtil f21028i;

    CustomLogger f21029j;

    Timer f21030k;

    Scheduler f21031l;

    boolean f21032m;

    boolean f21033n;

    int f21034o;

    boolean f21035p;

    ThreadFactory f21036q;

    public static final class b {

        private Pattern f21037a = Pattern.compile("^([A-Za-z]|[0-9]|_|-)+$");

        private a f21038b;

        public b(Context context) {
            a aVar = new a();
            this.f21038b = aVar;
            aVar.f21025f = context.getApplicationContext();
        }

        public a a() {
            a aVar = this.f21038b;
            if (aVar.f21026g == null) {
                aVar.f21026g = new f2.b();
            }
            a aVar2 = this.f21038b;
            if (aVar2.f21028i == null) {
                aVar2.f21028i = new com.birbit.android.jobqueue.network.a(aVar2.f21025f);
            }
            a aVar3 = this.f21038b;
            if (aVar3.f21030k == null) {
                aVar3.f21030k = new n2.a();
            }
            return this.f21038b;
        }

        public b b(int i7) {
            this.f21038b.f21023d = i7;
            return this;
        }

        public b c(CustomLogger customLogger) {
            this.f21038b.f21029j = customLogger;
            return this;
        }

        public b d(String str) {
            if (str == null || !this.f21037a.matcher(str).matches()) {
                throw new IllegalArgumentException("id cannot be null or empty and can only include alphanumeric characters, - or _ .");
            }
            this.f21038b.f21020a = str;
            return this;
        }

        public b e(int i7) {
            this.f21038b.f21024e = i7;
            return this;
        }

        public b f(int i7) {
            this.f21038b.f21021b = i7;
            return this;
        }

        public b g(int i7) {
            this.f21038b.f21022c = i7;
            return this;
        }
    }

    public boolean a() {
        return this.f21035p;
    }

    public Context b() {
        return this.f21025f;
    }

    public int c() {
        return this.f21023d;
    }

    public CustomLogger d() {
        return this.f21029j;
    }

    public DependencyInjector e() {
        return this.f21027h;
    }

    public String f() {
        return this.f21020a;
    }

    public int g() {
        return this.f21024e;
    }

    public int h() {
        return this.f21021b;
    }

    public int i() {
        return this.f21022c;
    }

    public NetworkUtil j() {
        return this.f21028i;
    }

    public QueueFactory k() {
        return this.f21026g;
    }

    public Scheduler l() {
        return this.f21031l;
    }

    public ThreadFactory m() {
        return this.f21036q;
    }

    public int n() {
        return this.f21034o;
    }

    public Timer o() {
        return this.f21030k;
    }

    public boolean p() {
        return this.f21032m;
    }

    public boolean q() {
        return this.f21033n;
    }

    private a() {
        this.f21020a = "default_job_manager";
        this.f21021b = 5;
        this.f21022c = 0;
        this.f21023d = 15;
        this.f21024e = 3;
        this.f21029j = new C2491a.b();
        this.f21032m = false;
        this.f21033n = false;
        this.f21034o = 5;
        this.f21035p = true;
        this.f21036q = null;
    }
}
