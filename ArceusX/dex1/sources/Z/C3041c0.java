package z;

public class C3041c0 {

    public static final C3041c0 f24613f = new b().b(1.0f).d(0.0f).e(0.0f).f(1.0f).c(1.0f).a();

    private final float f24614a;

    private final float f24615b;

    private final float f24616c;

    private final float f24617d;

    private final float f24618e;

    public static final class b {

        private float f24619a = 1.0f;

        private float f24620b = 0.0f;

        private float f24621c = 0.0f;

        private float f24622d = 0.0f;

        private float f24623e = 0.0f;

        public C3041c0 a() {
            return new C3041c0(this.f24619a, this.f24620b, this.f24621c, this.f24622d, this.f24623e);
        }

        public b b(float f7) {
            this.f24619a = f7;
            return this;
        }

        public b c(float f7) {
            this.f24623e = f7;
            return this;
        }

        public b d(float f7) {
            this.f24620b = f7;
            return this;
        }

        public b e(float f7) {
            this.f24621c = f7;
            return this;
        }

        public b f(float f7) {
            this.f24622d = f7;
            return this;
        }
    }

    public float a() {
        return this.f24614a;
    }

    public float b() {
        return this.f24618e;
    }

    public float c() {
        return this.f24615b;
    }

    public float d() {
        return this.f24616c;
    }

    public float e() {
        return this.f24617d;
    }

    private C3041c0(float f7, float f8, float f9, float f10, float f11) {
        this.f24614a = f7;
        this.f24615b = f8;
        this.f24616c = f9;
        this.f24617d = f10;
        this.f24618e = f11;
    }
}
