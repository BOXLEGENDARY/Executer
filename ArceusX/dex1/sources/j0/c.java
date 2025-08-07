package J0;

import java.nio.ByteBuffer;

public class c {

    protected int f1695a;

    protected ByteBuffer f1696b;

    private int f1697c;

    private int f1698d;

    d f1699e = d.a();

    protected int a(int i7) {
        return i7 + this.f1696b.getInt(i7);
    }

    protected int b(int i7) {
        if (i7 < this.f1698d) {
            return this.f1696b.getShort(this.f1697c + i7);
        }
        return 0;
    }

    protected void c(int i7, ByteBuffer byteBuffer) {
        this.f1696b = byteBuffer;
        if (byteBuffer == null) {
            this.f1695a = 0;
            this.f1697c = 0;
            this.f1698d = 0;
        } else {
            this.f1695a = i7;
            int i8 = i7 - byteBuffer.getInt(i7);
            this.f1697c = i8;
            this.f1698d = this.f1696b.getShort(i8);
        }
    }

    protected int d(int i7) {
        int i8 = i7 + this.f1695a;
        return i8 + this.f1696b.getInt(i8) + 4;
    }

    protected int e(int i7) {
        int i8 = i7 + this.f1695a;
        return this.f1696b.getInt(i8 + this.f1696b.getInt(i8));
    }
}
