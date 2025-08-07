package i4;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import o4.C2681a;

public interface d {

    public static class b implements TypeEvaluator<e> {

        public static final TypeEvaluator<e> f21072b = new b();

        private final e f21073a = new e();

        @Override
        public e evaluate(float f7, e eVar, e eVar2) {
            this.f21073a.a(C2681a.c(eVar.f21076a, eVar2.f21076a, f7), C2681a.c(eVar.f21077b, eVar2.f21077b, f7), C2681a.c(eVar.f21078c, eVar2.f21078c, f7));
            return this.f21073a;
        }
    }

    public static class c extends Property<d, e> {

        public static final Property<d, e> f21074a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    public static class C0196d extends Property<d, Integer> {

        public static final Property<d, Integer> f21075a = new C0196d("circularRevealScrimColor");

        private C0196d(String str) {
            super(Integer.class, str);
        }

        @Override
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    public static class e {

        public float f21076a;

        public float f21077b;

        public float f21078c;

        public void a(float f7, float f8, float f9) {
            this.f21076a = f7;
            this.f21077b = f8;
            this.f21078c = f9;
        }

        private e() {
        }

        public e(float f7, float f8, float f9) {
            this.f21076a = f7;
            this.f21077b = f8;
            this.f21078c = f9;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i7);

    void setRevealInfo(e eVar);
}
