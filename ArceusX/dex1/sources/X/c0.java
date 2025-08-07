package X;

import android.media.MediaCodec;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

class c0 implements a0 {

    private final MediaCodec f7834a;

    private final int f7835b;

    private final ByteBuffer f7836c;

    private final com.google.common.util.concurrent.p<Void> f7837d;

    private final c.a<Void> f7838e;

    private final AtomicBoolean f7839f = new AtomicBoolean(false);

    private long f7840g = 0;

    private boolean f7841h = false;

    c0(MediaCodec mediaCodec, int i7) throws MediaCodec.CodecException {
        this.f7834a = (MediaCodec) x0.g.g(mediaCodec);
        this.f7835b = x0.g.d(i7);
        this.f7836c = mediaCodec.getInputBuffer(i7);
        final AtomicReference atomicReference = new AtomicReference();
        this.f7837d = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return c0.g(atomicReference, aVar);
            }
        });
        this.f7838e = (c.a) x0.g.g((c.a) atomicReference.get());
    }

    public static Object g(AtomicReference atomicReference, c.a aVar) throws Exception {
        atomicReference.set(aVar);
        return "Terminate InputBuffer";
    }

    private void h() {
        if (this.f7839f.get()) {
            throw new IllegalStateException("The buffer is submitted or canceled.");
        }
    }

    @Override
    public com.google.common.util.concurrent.p<Void> a() {
        return G.n.B(this.f7837d);
    }

    @Override
    public void b(boolean z7) {
        h();
        this.f7841h = z7;
    }

    @Override
    public boolean c() throws MediaCodec.CryptoException {
        if (this.f7839f.getAndSet(true)) {
            return false;
        }
        try {
            this.f7834a.queueInputBuffer(this.f7835b, this.f7836c.position(), this.f7836c.limit(), this.f7840g, this.f7841h ? 4 : 0);
            this.f7838e.c(null);
            return true;
        } catch (IllegalStateException e7) {
            this.f7838e.f(e7);
            return false;
        }
    }

    @Override
    public void d(long j7) {
        h();
        x0.g.a(j7 >= 0);
        this.f7840g = j7;
    }

    public boolean f() throws MediaCodec.CryptoException {
        if (this.f7839f.getAndSet(true)) {
            return false;
        }
        try {
            this.f7834a.queueInputBuffer(this.f7835b, 0, 0, 0L, 0);
            this.f7838e.c(null);
        } catch (IllegalStateException e7) {
            this.f7838e.f(e7);
        }
        return true;
    }
}
