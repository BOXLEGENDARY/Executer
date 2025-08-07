package a4;

import com.google.android.gms.tasks.Task;

final class D implements Runnable {

    final Task f8292d;

    final E f8293e;

    D(E e7, Task task) {
        this.f8293e = e7;
        this.f8292d = task;
    }

    @Override
    public final void run() {
        synchronized (this.f8293e.f8295b) {
            try {
                E e7 = this.f8293e;
                if (e7.f8296c != null) {
                    e7.f8296c.onSuccess(this.f8292d.k());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
