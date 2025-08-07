package f2;

import com.birbit.android.jobqueue.JobQueue;
import com.birbit.android.jobqueue.QueueFactory;
import com.birbit.android.jobqueue.persistentQueue.sqlite.SqliteJobQueue;

public class b implements QueueFactory {

    SqliteJobQueue.JobSerializer f20472a = new SqliteJobQueue.b();

    @Override
    public JobQueue createNonPersistent(h2.a aVar, long j7) {
        return new g2.a(new i2.a(aVar, j7));
    }

    @Override
    public JobQueue createPersistentQueue(h2.a aVar, long j7) {
        return new g2.a(new SqliteJobQueue(aVar, j7, this.f20472a));
    }
}
