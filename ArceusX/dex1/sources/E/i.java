package E;

import E.h;
import java.io.BufferedOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.Map;

public final class i extends FilterOutputStream {

    private static final byte[] f1051z = "Exif\u0000\u0000".getBytes(g.f1018e);

    private final h f1052d;

    private final byte[] f1053e;

    private final ByteBuffer f1054i;

    private int f1055v;

    private int f1056w;

    private int f1057y;

    static final class a {
        public static boolean a(short s7) {
            return (s7 < -64 || s7 > -49 || s7 == -60 || s7 == -56 || s7 == -52) ? false : true;
        }
    }

    public i(OutputStream outputStream, h hVar) {
        super(new BufferedOutputStream(outputStream, 65536));
        this.f1053e = new byte[1];
        this.f1054i = ByteBuffer.allocate(4);
        this.f1055v = 0;
        this.f1052d = hVar;
    }

    private int b(int i7, byte[] bArr, int i8, int i9) {
        int iMin = Math.min(i9, i7 - this.f1054i.position());
        this.f1054i.put(bArr, i8, iMin);
        return iMin;
    }

    private void e(b bVar) throws IOException {
        j[][] jVarArr = h.f1032i;
        int[] iArr = new int[jVarArr.length];
        int[] iArr2 = new int[jVarArr.length];
        for (j jVar : h.f1030g) {
            for (int i7 = 0; i7 < h.f1032i.length; i7++) {
                this.f1052d.c(i7).remove(jVar.f1059b);
            }
        }
        if (!this.f1052d.c(1).isEmpty()) {
            this.f1052d.c(0).put(h.f1030g[1].f1059b, g.f(0L, this.f1052d.d()));
        }
        if (!this.f1052d.c(2).isEmpty()) {
            this.f1052d.c(0).put(h.f1030g[2].f1059b, g.f(0L, this.f1052d.d()));
        }
        if (!this.f1052d.c(3).isEmpty()) {
            this.f1052d.c(1).put(h.f1030g[3].f1059b, g.f(0L, this.f1052d.d()));
        }
        for (int i8 = 0; i8 < h.f1032i.length; i8++) {
            Iterator<Map.Entry<String, g>> it = this.f1052d.c(i8).entrySet().iterator();
            int i9 = 0;
            while (it.hasNext()) {
                int iJ = it.next().getValue().j();
                if (iJ > 4) {
                    i9 += iJ;
                }
            }
            iArr2[i8] = iArr2[i8] + i9;
        }
        int size = 8;
        for (int i10 = 0; i10 < h.f1032i.length; i10++) {
            if (!this.f1052d.c(i10).isEmpty()) {
                iArr[i10] = size;
                size += (this.f1052d.c(i10).size() * 12) + 6 + iArr2[i10];
            }
        }
        int i11 = size + 8;
        if (!this.f1052d.c(1).isEmpty()) {
            this.f1052d.c(0).put(h.f1030g[1].f1059b, g.f(iArr[1], this.f1052d.d()));
        }
        if (!this.f1052d.c(2).isEmpty()) {
            this.f1052d.c(0).put(h.f1030g[2].f1059b, g.f(iArr[2], this.f1052d.d()));
        }
        if (!this.f1052d.c(3).isEmpty()) {
            this.f1052d.c(1).put(h.f1030g[3].f1059b, g.f(iArr[3], this.f1052d.d()));
        }
        bVar.u(i11);
        bVar.write(f1051z);
        bVar.j(this.f1052d.d() == ByteOrder.BIG_ENDIAN ? (short) 19789 : (short) 18761);
        bVar.b(this.f1052d.d());
        bVar.u(42);
        bVar.m(8L);
        for (int i12 = 0; i12 < h.f1032i.length; i12++) {
            if (!this.f1052d.c(i12).isEmpty()) {
                bVar.u(this.f1052d.c(i12).size());
                int size2 = iArr[i12] + 2 + (this.f1052d.c(i12).size() * 12) + 4;
                for (Map.Entry<String, g> entry : this.f1052d.c(i12).entrySet()) {
                    int i13 = ((j) x0.g.h(h.b.f1040f.get(i12).get(entry.getKey()), "Tag not supported: " + entry.getKey() + ". Tag needs to be ported from ExifInterface to ExifData.")).f1058a;
                    g value = entry.getValue();
                    int iJ2 = value.j();
                    bVar.u(i13);
                    bVar.u(value.f1022a);
                    bVar.f(value.f1023b);
                    if (iJ2 > 4) {
                        bVar.m(size2);
                        size2 += iJ2;
                    } else {
                        bVar.write(value.f1025d);
                        if (iJ2 < 4) {
                            while (iJ2 < 4) {
                                bVar.e(0);
                                iJ2++;
                            }
                        }
                    }
                }
                bVar.m(0L);
                Iterator<Map.Entry<String, g>> it2 = this.f1052d.c(i12).entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f1025d;
                    if (bArr.length > 4) {
                        bVar.write(bArr, 0, bArr.length);
                    }
                }
            }
        }
        bVar.b(ByteOrder.BIG_ENDIAN);
    }

    @Override
    public void write(byte[] r7, int r8, int r9) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: E.i.write(byte[], int, int):void");
    }

    @Override
    public void write(int i7) throws IOException {
        byte[] bArr = this.f1053e;
        bArr[0] = (byte) (i7 & 255);
        write(bArr);
    }

    @Override
    public void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }
}
