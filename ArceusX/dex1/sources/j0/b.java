package J0;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class b extends c {
    public static b h(ByteBuffer byteBuffer) {
        return i(byteBuffer, new b());
    }

    public static b i(ByteBuffer byteBuffer, b bVar) {
        byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
        return bVar.f(byteBuffer.getInt(byteBuffer.position()) + byteBuffer.position(), byteBuffer);
    }

    public b f(int i7, ByteBuffer byteBuffer) {
        g(i7, byteBuffer);
        return this;
    }

    public void g(int i7, ByteBuffer byteBuffer) {
        c(i7, byteBuffer);
    }

    public a j(a aVar, int i7) {
        int iB = b(6);
        if (iB != 0) {
            return aVar.f(a(d(iB) + (i7 * 4)), this.f1696b);
        }
        return null;
    }

    public int k() {
        int iB = b(6);
        if (iB != 0) {
            return e(iB);
        }
        return 0;
    }

    public int l() {
        int iB = b(4);
        if (iB != 0) {
            return this.f1696b.getInt(iB + this.f1695a);
        }
        return 0;
    }
}
