package g2;

import com.birbit.android.jobqueue.JobQueue;
import com.birbit.android.jobqueue.c;
import com.birbit.android.jobqueue.f;
import java.util.Set;

public class a implements JobQueue {

    private JobQueue f20955a;

    private Integer f20956b;

    public a(JobQueue jobQueue) {
        this.f20955a = jobQueue;
    }

    private void a() {
        this.f20956b = null;
    }

    private boolean b() {
        Integer num = this.f20956b;
        return num != null && num.intValue() == 0;
    }

    @Override
    public void clear() {
        a();
        this.f20955a.clear();
    }

    @Override
    public int count() {
        if (this.f20956b == null) {
            this.f20956b = Integer.valueOf(this.f20955a.count());
        }
        return this.f20956b.intValue();
    }

    @Override
    public int countReadyJobs(c cVar) {
        if (b()) {
            return 0;
        }
        return this.f20955a.countReadyJobs(cVar);
    }

    @Override
    public f findJobById(String str) {
        return this.f20955a.findJobById(str);
    }

    @Override
    public Set<f> findJobs(c cVar) {
        return this.f20955a.findJobs(cVar);
    }

    @Override
    public Long getNextJobDelayUntilNs(c cVar) {
        return this.f20955a.getNextJobDelayUntilNs(cVar);
    }

    @Override
    public boolean insert(f fVar) {
        a();
        return this.f20955a.insert(fVar);
    }

    @Override
    public boolean insertOrReplace(f fVar) {
        a();
        return this.f20955a.insertOrReplace(fVar);
    }

    @Override
    public f nextJobAndIncRunCount(c cVar) {
        Integer num;
        if (b()) {
            return null;
        }
        f fVarNextJobAndIncRunCount = this.f20955a.nextJobAndIncRunCount(cVar);
        if (fVarNextJobAndIncRunCount != null && (num = this.f20956b) != null) {
            this.f20956b = Integer.valueOf(num.intValue() - 1);
        }
        return fVarNextJobAndIncRunCount;
    }

    @Override
    public void onJobCancelled(f fVar) {
        a();
        this.f20955a.onJobCancelled(fVar);
    }

    @Override
    public void remove(f fVar) {
        a();
        this.f20955a.remove(fVar);
    }

    @Override
    public void substitute(f fVar, f fVar2) {
        a();
        this.f20955a.substitute(fVar, fVar2);
    }
}
