package C;

import S5.Cg.XjqcfAbdbc;
import android.os.Handler;
import java.util.concurrent.Executor;

final class C0319c extends S {

    private final Executor f531a;

    private final Handler f532b;

    C0319c(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f531a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.f532b = handler;
    }

    @Override
    public Executor b() {
        return this.f531a;
    }

    @Override
    public Handler c() {
        return this.f532b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof S)) {
            return false;
        }
        S s7 = (S) obj;
        return this.f531a.equals(s7.b()) && this.f532b.equals(s7.c());
    }

    public int hashCode() {
        return ((this.f531a.hashCode() ^ 1000003) * 1000003) ^ this.f532b.hashCode();
    }

    public String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f531a + XjqcfAbdbc.Pkey + this.f532b + "}";
    }
}
