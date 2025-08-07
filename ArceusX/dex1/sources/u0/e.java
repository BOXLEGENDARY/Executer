package u0;

import android.os.CancellationSignal;

@Deprecated
public final class e {

    private boolean f23885a;

    private a f23886b;

    private Object f23887c;

    private boolean f23888d;

    public interface a {
        void onCancel();
    }

    private void c() throws InterruptedException {
        while (this.f23888d) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }

    public void a() {
        synchronized (this) {
            try {
                if (this.f23885a) {
                    return;
                }
                this.f23885a = true;
                this.f23888d = true;
                a aVar = this.f23886b;
                Object obj = this.f23887c;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.f23888d = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                if (obj != null) {
                    ((CancellationSignal) obj).cancel();
                }
                synchronized (this) {
                    this.f23888d = false;
                    notifyAll();
                }
            } finally {
            }
        }
    }

    public void b(a aVar) {
        synchronized (this) {
            try {
                c();
                if (this.f23886b == aVar) {
                    return;
                }
                this.f23886b = aVar;
                if (this.f23885a && aVar != null) {
                    aVar.onCancel();
                }
            } finally {
            }
        }
    }
}
