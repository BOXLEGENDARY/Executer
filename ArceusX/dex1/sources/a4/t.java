package a4;

import com.google.android.gms.tasks.Task;

final class t implements Runnable {

    final Task f8330d;

    final u f8331e;

    t(u uVar, Task task) {
        this.f8331e = uVar;
        this.f8330d = task;
    }

    @Override
    public final void run() {
        if (this.f8330d.m()) {
            this.f8331e.f8334c.t();
            return;
        }
        try {
            this.f8331e.f8334c.s(this.f8331e.f8333b.a(this.f8330d));
        } catch (C1572i e7) {
            if (e7.getCause() instanceof Exception) {
                this.f8331e.f8334c.r((Exception) e7.getCause());
            } else {
                this.f8331e.f8334c.r(e7);
            }
        } catch (Exception e8) {
            this.f8331e.f8334c.r(e8);
        }
    }
}
