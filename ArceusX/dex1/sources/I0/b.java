package I0;

import I0.a;
import I0.b;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.View;
import androidx.core.view.Z;
import java.util.ArrayList;

public abstract class b<T extends b<T>> implements a.b {

    public static final r f1644m = new f("translationX");

    public static final r f1645n = new g("translationY");

    public static final r f1646o = new h("translationZ");

    public static final r f1647p = new i("scaleX");

    public static final r f1648q = new j("scaleY");

    public static final r f1649r = new k("rotation");

    public static final r f1650s = new l("rotationX");

    public static final r f1651t = new m("rotationY");

    public static final r f1652u = new n("x");

    public static final r f1653v = new a("y");

    public static final r f1654w = new C0026b("z");

    public static final r f1655x = new c("alpha");

    public static final r f1656y = new d("scrollX");

    public static final r f1657z = new e("scrollY");

    final Object f1661d;

    final I0.c f1662e;

    private float f1667j;

    float f1658a = 0.0f;

    float f1659b = Float.MAX_VALUE;

    boolean f1660c = false;

    boolean f1663f = false;

    float f1664g = Float.MAX_VALUE;

    float f1665h = -Float.MAX_VALUE;

    private long f1666i = 0;

    private final ArrayList<p> f1668k = new ArrayList<>();

    private final ArrayList<q> f1669l = new ArrayList<>();

    static class a extends r {
        a(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return view.getY();
        }

        @Override
        public void b(View view, float f7) {
            view.setY(f7);
        }
    }

    static class C0026b extends r {
        C0026b(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return Z.L(view);
        }

        @Override
        public void b(View view, float f7) {
            Z.J0(view, f7);
        }
    }

    static class c extends r {
        c(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return view.getAlpha();
        }

        @Override
        public void b(View view, float f7) {
            view.setAlpha(f7);
        }
    }

    static class d extends r {
        d(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return view.getScrollX();
        }

        @Override
        public void b(View view, float f7) {
            view.setScrollX((int) f7);
        }
    }

    static class e extends r {
        e(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return view.getScrollY();
        }

        @Override
        public void b(View view, float f7) {
            view.setScrollY((int) f7);
        }
    }

    static class f extends r {
        f(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override
        public void b(View view, float f7) {
            view.setTranslationX(f7);
        }
    }

    static class g extends r {
        g(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override
        public void b(View view, float f7) {
            view.setTranslationY(f7);
        }
    }

    static class h extends r {
        h(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return Z.I(view);
        }

        @Override
        public void b(View view, float f7) {
            Z.H0(view, f7);
        }
    }

    static class i extends r {
        i(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return view.getScaleX();
        }

        @Override
        public void b(View view, float f7) {
            view.setScaleX(f7);
        }
    }

    static class j extends r {
        j(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return view.getScaleY();
        }

        @Override
        public void b(View view, float f7) {
            view.setScaleY(f7);
        }
    }

    static class k extends r {
        k(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return view.getRotation();
        }

        @Override
        public void b(View view, float f7) {
            view.setRotation(f7);
        }
    }

    static class l extends r {
        l(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return view.getRotationX();
        }

        @Override
        public void b(View view, float f7) {
            view.setRotationX(f7);
        }
    }

    static class m extends r {
        m(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return view.getRotationY();
        }

        @Override
        public void b(View view, float f7) {
            view.setRotationY(f7);
        }
    }

    static class n extends r {
        n(String str) {
            super(str, null);
        }

        @Override
        public float a(View view) {
            return view.getX();
        }

        @Override
        public void b(View view, float f7) {
            view.setX(f7);
        }
    }

    static class o {

        float f1670a;

        float f1671b;

        o() {
        }
    }

    public interface p {
        void a(b bVar, boolean z7, float f7, float f8);
    }

    public interface q {
        void a(b bVar, float f7, float f8);
    }

    public static abstract class r extends I0.c<View> {
        r(String str, f fVar) {
            this(str);
        }

        private r(String str) {
            super(str);
        }
    }

    <K> b(K k7, I0.c<K> cVar) {
        this.f1661d = k7;
        this.f1662e = cVar;
        if (cVar == f1649r || cVar == f1650s || cVar == f1651t) {
            this.f1667j = 0.1f;
            return;
        }
        if (cVar == f1655x) {
            this.f1667j = 0.00390625f;
        } else if (cVar == f1647p || cVar == f1648q) {
            this.f1667j = 0.00390625f;
        } else {
            this.f1667j = 1.0f;
        }
    }

    private void b(boolean z7) {
        this.f1663f = false;
        I0.a.d().g(this);
        this.f1666i = 0L;
        this.f1660c = false;
        for (int i7 = 0; i7 < this.f1668k.size(); i7++) {
            if (this.f1668k.get(i7) != null) {
                this.f1668k.get(i7).a(this, z7, this.f1659b, this.f1658a);
            }
        }
        f(this.f1668k);
    }

    private float c() {
        return this.f1662e.a(this.f1661d);
    }

    private static <T> void f(ArrayList<T> arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void j() {
        if (this.f1663f) {
            return;
        }
        this.f1663f = true;
        if (!this.f1660c) {
            this.f1659b = c();
        }
        float f7 = this.f1659b;
        if (f7 > this.f1664g || f7 < this.f1665h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        I0.a.d().a(this, 0L);
    }

    @Override
    public boolean a(long j7) {
        long j8 = this.f1666i;
        if (j8 == 0) {
            this.f1666i = j7;
            g(this.f1659b);
            return false;
        }
        this.f1666i = j7;
        boolean zK = k(j7 - j8);
        float fMin = Math.min(this.f1659b, this.f1664g);
        this.f1659b = fMin;
        float fMax = Math.max(fMin, this.f1665h);
        this.f1659b = fMax;
        g(fMax);
        if (zK) {
            b(false);
        }
        return zK;
    }

    float d() {
        return this.f1667j * 0.75f;
    }

    public boolean e() {
        return this.f1663f;
    }

    void g(float f7) {
        this.f1662e.b(this.f1661d, f7);
        for (int i7 = 0; i7 < this.f1669l.size(); i7++) {
            if (this.f1669l.get(i7) != null) {
                this.f1669l.get(i7).a(this, this.f1659b, this.f1658a);
            }
        }
        f(this.f1669l);
    }

    public T h(float f7) {
        this.f1659b = f7;
        this.f1660c = true;
        return this;
    }

    public void i() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f1663f) {
            return;
        }
        j();
    }

    abstract boolean k(long j7);
}
