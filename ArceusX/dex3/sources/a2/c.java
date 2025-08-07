package a2;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.g;
import okio.h;
import okio.z;

public abstract class c implements Closeable {
    private static final String[] z = new String[128];
    int d;
    int[] e = new int[32];
    String[] i = new String[32];
    int[] v = new int[32];
    boolean w;
    boolean y;

    public static final class a {
        final String[] a;
        final z b;

        private a(String[] strArr, z zVar) {
            this.a = strArr;
            this.b = zVar;
        }

        public static a a(String... strArr) {
            try {
                h[] hVarArr = new h[strArr.length];
                okio.e eVar = new okio.e();
                for (int i = 0; i < strArr.length; i++) {
                    c.I0(eVar, strArr[i]);
                    eVar.readByte();
                    hVarArr[i] = eVar.C0();
                }
                return new a((String[]) strArr.clone(), z.o(hVarArr));
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    public enum b {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i = 0; i <= 31; i++) {
            z[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = z;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    c() {
    }

    public static void I0(okio.f r7, java.lang.String r8) throws java.io.IOException {
        throw new UnsupportedOperationException("Method not decompiled: a2.c.I0(okio.f, java.lang.String):void");
    }

    public static c Z(g gVar) {
        return new e(gVar);
    }

    public abstract double A() throws IOException;

    public abstract void H0() throws IOException;

    final a2.b J0(String str) throws a2.b {
        throw new a2.b(str + " at path " + getPath());
    }

    public abstract int K() throws IOException;

    public abstract String N() throws IOException;

    public abstract String U() throws IOException;

    public abstract void e() throws IOException;

    public abstract void f() throws IOException;

    public final String getPath() {
        return d.a(this.d, this.e, this.i, this.v);
    }

    public abstract b h0() throws IOException;

    public abstract void j() throws IOException;

    final void k0(int i) {
        int i2 = this.d;
        int[] iArr = this.e;
        if (i2 == iArr.length) {
            if (i2 == 256) {
                throw new a2.a("Nesting too deep at " + getPath());
            }
            this.e = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.i;
            this.i = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.v;
            this.v = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.e;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr3[i3] = i;
    }

    public abstract void m() throws IOException;

    public abstract int n0(a aVar) throws IOException;

    public abstract void t0() throws IOException;

    public abstract boolean u() throws IOException;

    public abstract boolean y() throws IOException;
}
