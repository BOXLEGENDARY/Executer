package E4;

import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;

final class X implements InterfaceC0416w {

    private final FileChannel f1105a;

    private final long f1106b;

    private final long f1107c;

    public X(FileChannel fileChannel, long j7, long j8) {
        this.f1105a = fileChannel;
        this.f1106b = j7;
        this.f1107c = j8;
    }

    @Override
    public final void a(MessageDigest[] messageDigestArr, long j7, int i7) throws IOException {
        MappedByteBuffer map = this.f1105a.map(FileChannel.MapMode.READ_ONLY, this.f1106b + j7, i7);
        map.load();
        for (MessageDigest messageDigest : messageDigestArr) {
            map.position(0);
            messageDigest.update(map);
        }
    }

    @Override
    public final long zza() {
        return this.f1107c;
    }
}
