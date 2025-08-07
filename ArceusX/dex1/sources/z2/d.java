package z2;

import A2.InterfaceC0247d;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import android.util.Base64;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.zip.Adler32;

public class d implements x {

    private final Context f24792a;

    private final InterfaceC0247d f24793b;

    private final f f24794c;

    public d(Context context, InterfaceC0247d interfaceC0247d, f fVar) {
        this.f24792a = context;
        this.f24793b = interfaceC0247d;
        this.f24794c = fVar;
    }

    private boolean d(JobScheduler jobScheduler, int i7, int i8) {
        for (JobInfo jobInfo : jobScheduler.getAllPendingJobs()) {
            int i9 = jobInfo.getExtras().getInt("attemptNumber");
            if (jobInfo.getId() == i7) {
                return i9 >= i8;
            }
        }
        return false;
    }

    @Override
    public void a(s2.o oVar, int i7) {
        b(oVar, i7, false);
    }

    @Override
    public void b(s2.o oVar, int i7, boolean z7) {
        ComponentName componentName = new ComponentName(this.f24792a, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) this.f24792a.getSystemService("jobscheduler");
        int iC = c(oVar);
        if (!z7 && d(jobScheduler, iC, i7)) {
            w2.a.a("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", oVar);
            return;
        }
        long jV1 = this.f24793b.v1(oVar);
        JobInfo.Builder builderC = this.f24794c.c(new JobInfo.Builder(iC, componentName), oVar.d(), jV1, i7);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putInt("attemptNumber", i7);
        persistableBundle.putString("backendName", oVar.b());
        persistableBundle.putInt("priority", D2.a.a(oVar.d()));
        if (oVar.c() != null) {
            persistableBundle.putString("extras", Base64.encodeToString(oVar.c(), 0));
        }
        builderC.setExtras(persistableBundle);
        w2.a.b("JobInfoScheduler", "Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", oVar, Integer.valueOf(iC), Long.valueOf(this.f24794c.g(oVar.d(), jV1, i7)), Long.valueOf(jV1), Integer.valueOf(i7));
        jobScheduler.schedule(builderC.build());
    }

    int c(s2.o oVar) {
        Adler32 adler32 = new Adler32();
        adler32.update(this.f24792a.getPackageName().getBytes(Charset.forName("UTF-8")));
        adler32.update(oVar.b().getBytes(Charset.forName("UTF-8")));
        adler32.update(ByteBuffer.allocate(4).putInt(D2.a.a(oVar.d())).array());
        if (oVar.c() != null) {
            adler32.update(oVar.c());
        }
        return (int) adler32.getValue();
    }
}
