package a4;

import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import java.util.Queue;

final class I {

    private final Object f8302a = new Object();

    private Queue f8303b;

    private boolean f8304c;

    I() {
    }

    public final void a(H h7) {
        synchronized (this.f8302a) {
            try {
                if (this.f8303b == null) {
                    this.f8303b = new ArrayDeque();
                }
                this.f8303b.add(h7);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void b(Task task) {
        H h7;
        synchronized (this.f8302a) {
            if (this.f8303b != null && !this.f8304c) {
                this.f8304c = true;
                while (true) {
                    synchronized (this.f8302a) {
                        try {
                            h7 = (H) this.f8303b.poll();
                            if (h7 == null) {
                                this.f8304c = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    h7.b(task);
                }
            }
        }
    }
}
