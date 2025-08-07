package a4;

import com.google.android.gms.tasks.Task;
import w7.Jld.EZYiRMRTxKdo;

public final class C1567d extends IllegalStateException {
    private C1567d(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(Task<?> task) {
        if (!task.n()) {
            return new IllegalStateException(EZYiRMRTxKdo.lrGCYi);
        }
        Exception excJ = task.j();
        return new C1567d("Complete with: ".concat(excJ != null ? "failure" : task.o() ? "result ".concat(String.valueOf(task.k())) : task.m() ? "cancellation" : "unknown issue"), excJ);
    }
}
