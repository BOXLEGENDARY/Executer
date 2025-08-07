package E4;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

final class C0395a implements InterfaceC0416w {

    private final ByteBuffer f1108a;

    public C0395a(ByteBuffer byteBuffer) {
        this.f1108a = byteBuffer.slice();
    }

    @Override
    public final void a(MessageDigest[] messageDigestArr, long j7, int i7) throws IOException {
        ByteBuffer byteBufferSlice;
        synchronized (this.f1108a) {
            int i8 = (int) j7;
            this.f1108a.position(i8);
            this.f1108a.limit(i8 + i7);
            byteBufferSlice = this.f1108a.slice();
        }
        for (MessageDigest messageDigest : messageDigestArr) {
            byteBufferSlice.position(0);
            messageDigest.update(byteBufferSlice);
        }
    }

    @Override
    public final long zza() {
        return this.f1108a.capacity();
    }
}
