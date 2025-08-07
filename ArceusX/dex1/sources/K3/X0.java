package K3;

import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

final class X0 {

    private final Deque f1827a = new ArrayDeque(16);

    private X0(boolean z7) {
    }

    public static X0 a() {
        return new X0(false);
    }

    private final long h() {
        if (this.f1827a.isEmpty()) {
            return 0L;
        }
        return ((Long) this.f1827a.peek()).longValue();
    }

    private final void i(long j7) {
        this.f1827a.pop();
        this.f1827a.push(Long.valueOf(j7));
    }

    public final void b() throws IOException {
        if (!this.f1827a.isEmpty()) {
            throw new IOException(String.format("data item not completed, stackSize: %s scope: %s", Integer.valueOf(this.f1827a.size()), Long.valueOf(h())));
        }
    }

    public final void c() throws IOException {
        long jH = h();
        if (jH >= 0) {
            throw new IOException(String.format("expected indefinite length scope but found %s", Long.valueOf(jH)));
        }
        if (jH == -5) {
            throw new IOException("expected a value for dangling key in indefinite-length map");
        }
        this.f1827a.pop();
    }

    public final void d() throws IOException {
        long jH = h();
        if (jH != -1) {
            if (jH != -2) {
                return;
            } else {
                jH = -2;
            }
        }
        throw new IOException(String.format("expected non-string scope but found %s", Long.valueOf(jH)));
    }

    public final void e(long j7) throws IOException {
        long jH = h();
        if (jH != j7) {
            if (jH != -1) {
                if (jH != -2) {
                    return;
                } else {
                    jH = -2;
                }
            }
            throw new IOException(String.format("expected non-string scope or scope %s but found %s", Long.valueOf(j7), Long.valueOf(jH)));
        }
    }

    public final void f() {
        long jH = h();
        if (jH == 1) {
            this.f1827a.pop();
            return;
        }
        if (jH > 1) {
            i(jH - 1);
        } else if (jH == -4) {
            i(-5L);
        } else if (jH == -5) {
            i(-4L);
        }
    }

    public final void g(long j7) {
        this.f1827a.push(Long.valueOf(j7));
    }
}
