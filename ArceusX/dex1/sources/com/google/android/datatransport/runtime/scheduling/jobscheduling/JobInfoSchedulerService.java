package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import D2.a;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import s2.o;
import s2.t;

public class JobInfoSchedulerService extends JobService {
    public void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    @Override
    public boolean onStartJob(final JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i7 = jobParameters.getExtras().getInt("priority");
        int i8 = jobParameters.getExtras().getInt("attemptNumber");
        t.f(getApplicationContext());
        o.a aVarD = o.a().b(string).d(a.b(i7));
        if (string2 != null) {
            aVarD.c(Base64.decode(string2, 0));
        }
        t.c().e().v(aVarD.a(), i8, new Runnable() {
            @Override
            public final void run() {
                this.f24795d.b(jobParameters);
            }
        });
        return true;
    }

    @Override
    public boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
