package X;

import android.media.MediaCodec;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public class C1537h implements InterfaceC1535f {

    private final MediaCodec f7848d;

    private final MediaCodec.BufferInfo f7849e;

    private final int f7850i;

    private final ByteBuffer f7851v;

    private final com.google.common.util.concurrent.p<Void> f7852w;

    private final c.a<Void> f7853y;

    private final AtomicBoolean f7854z = new AtomicBoolean(false);

    C1537h(MediaCodec mediaCodec, int i7, MediaCodec.BufferInfo bufferInfo) throws MediaCodec.CodecException {
        this.f7848d = (MediaCodec) x0.g.g(mediaCodec);
        this.f7850i = i7;
        this.f7851v = mediaCodec.getOutputBuffer(i7);
        this.f7849e = (MediaCodec.BufferInfo) x0.g.g(bufferInfo);
        final AtomicReference atomicReference = new AtomicReference();
        this.f7852w = androidx.concurrent.futures.c.a(new c.InterfaceC0078c() {
            @Override
            public final Object a(c.a aVar) {
                return C1537h.f(atomicReference, aVar);
            }
        });
        this.f7853y = (c.a) x0.g.g((c.a) atomicReference.get());
    }

    public static Object f(AtomicReference atomicReference, c.a aVar) throws Exception {
        atomicReference.set(aVar);
        return "Data closed";
    }

    private void j() {
        if (this.f7854z.get()) {
            throw new IllegalStateException("encoded data is closed.");
        }
    }

    @Override
    public ByteBuffer F0() {
        j();
        this.f7851v.position(this.f7849e.offset);
        ByteBuffer byteBuffer = this.f7851v;
        MediaCodec.BufferInfo bufferInfo = this.f7849e;
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        return this.f7851v;
    }

    @Override
    public long U0() {
        return this.f7849e.presentationTimeUs;
    }

    @Override
    public MediaCodec.BufferInfo a0() {
        return this.f7849e;
    }

    @Override
    public void close() {
        if (this.f7854z.getAndSet(true)) {
            return;
        }
        try {
            this.f7848d.releaseOutputBuffer(this.f7850i, false);
            this.f7853y.c(null);
        } catch (IllegalStateException e7) {
            this.f7853y.f(e7);
        }
    }

    public com.google.common.util.concurrent.p<Void> e() {
        return G.n.B(this.f7852w);
    }

    @Override
    public boolean g0() {
        return (this.f7849e.flags & 1) != 0;
    }

    @Override
    public long size() {
        return this.f7849e.size;
    }
}
