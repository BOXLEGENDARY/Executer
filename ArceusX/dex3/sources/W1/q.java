package W1;

import android.graphics.Paint;
import java.util.List;

public class q implements W1.c {
    private final String a;
    private final V1.b b;
    private final List<V1.b> c;
    private final V1.a d;
    private final V1.d e;
    private final V1.b f;
    private final b g;
    private final c h;
    private final float i;
    private final boolean j;

    static class a {
        static final int[] a;
        static final int[] b;

        static {
            int[] iArr = new int[c.values().length];
            b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap c() {
            int i = a.a[ordinal()];
            return i != 1 ? i != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join c() {
            int i = a.b[ordinal()];
            if (i == 1) {
                return Paint.Join.BEVEL;
            }
            if (i == 2) {
                return Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public q(String str, V1.b bVar, List<V1.b> list, V1.a aVar, V1.d dVar, V1.b bVar2, b bVar3, c cVar, float f, boolean z) {
        this.a = str;
        this.b = bVar;
        this.c = list;
        this.d = aVar;
        this.e = dVar;
        this.f = bVar2;
        this.g = bVar3;
        this.h = cVar;
        this.i = f;
        this.j = z;
    }

    @Override
    public R1.c a(com.airbnb.lottie.a aVar, X1.b bVar) {
        return new R1.r(aVar, bVar, this);
    }

    public b b() {
        return this.g;
    }

    public V1.a c() {
        return this.d;
    }

    public V1.b d() {
        return this.b;
    }

    public c e() {
        return this.h;
    }

    public List<V1.b> f() {
        return this.c;
    }

    public float g() {
        return this.i;
    }

    public String h() {
        return this.a;
    }

    public V1.d i() {
        return this.e;
    }

    public V1.b j() {
        return this.f;
    }

    public boolean k() {
        return this.j;
    }
}
