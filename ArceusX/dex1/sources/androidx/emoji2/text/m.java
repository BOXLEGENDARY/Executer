package androidx.emoji2.text;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

class m {

    private static class a implements c {

        private final ByteBuffer f10881a;

        a(ByteBuffer byteBuffer) {
            this.f10881a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override
        public int a() throws IOException {
            return this.f10881a.getInt();
        }

        @Override
        public void b(int i7) throws IOException {
            ByteBuffer byteBuffer = this.f10881a;
            byteBuffer.position(byteBuffer.position() + i7);
        }

        @Override
        public long c() throws IOException {
            return m.c(this.f10881a.getInt());
        }

        @Override
        public long getPosition() {
            return this.f10881a.position();
        }

        @Override
        public int readUnsignedShort() throws IOException {
            return m.d(this.f10881a.getShort());
        }
    }

    private static class b {

        private final long f10882a;

        private final long f10883b;

        b(long j7, long j8) {
            this.f10882a = j7;
            this.f10883b = j8;
        }

        long a() {
            return this.f10882a;
        }
    }

    private interface c {
        int a() throws IOException;

        void b(int i7) throws IOException;

        long c() throws IOException;

        long getPosition();

        int readUnsignedShort() throws IOException;
    }

    private static b a(c cVar) throws IOException {
        long jC;
        cVar.b(4);
        int unsignedShort = cVar.readUnsignedShort();
        if (unsignedShort > 100) {
            throw new IOException("Cannot read metadata.");
        }
        cVar.b(6);
        int i7 = 0;
        while (true) {
            if (i7 >= unsignedShort) {
                jC = -1;
                break;
            }
            int iA = cVar.a();
            cVar.b(4);
            jC = cVar.c();
            cVar.b(4);
            if (1835365473 == iA) {
                break;
            }
            i7++;
        }
        if (jC != -1) {
            cVar.b((int) (jC - cVar.getPosition()));
            cVar.b(12);
            long jC2 = cVar.c();
            for (int i8 = 0; i8 < jC2; i8++) {
                int iA2 = cVar.a();
                long jC3 = cVar.c();
                long jC4 = cVar.c();
                if (1164798569 == iA2 || 1701669481 == iA2) {
                    return new b(jC3 + jC, jC4);
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    static J0.b b(ByteBuffer byteBuffer) throws IOException {
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.position((int) a(new a(byteBufferDuplicate)).a());
        return J0.b.h(byteBufferDuplicate);
    }

    static long c(int i7) {
        return i7 & 4294967295L;
    }

    static int d(short s7) {
        return s7 & 65535;
    }
}
