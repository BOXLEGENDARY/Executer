package S;

import S.AbstractC1229k;
import com.github.luben.zstd.BuildConfig;

final class C1222d extends AbstractC1229k {

    private final i0 f6273a;

    private final AbstractC1219a f6274b;

    private final int f6275c;

    static final class b extends AbstractC1229k.a {

        private i0 f6276a;

        private AbstractC1219a f6277b;

        private Integer f6278c;

        @Override
        public AbstractC1229k a() {
            i0 i0Var = this.f6276a;
            String str = BuildConfig.FLAVOR;
            if (i0Var == null) {
                str = BuildConfig.FLAVOR + " videoSpec";
            }
            if (this.f6277b == null) {
                str = str + " audioSpec";
            }
            if (this.f6278c == null) {
                str = str + " outputFormat";
            }
            if (str.isEmpty()) {
                return new C1222d(this.f6276a, this.f6277b, this.f6278c.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        i0 c() {
            i0 i0Var = this.f6276a;
            if (i0Var != null) {
                return i0Var;
            }
            throw new IllegalStateException("Property \"videoSpec\" has not been set");
        }

        @Override
        public AbstractC1229k.a d(AbstractC1219a abstractC1219a) {
            if (abstractC1219a == null) {
                throw new NullPointerException("Null audioSpec");
            }
            this.f6277b = abstractC1219a;
            return this;
        }

        @Override
        public AbstractC1229k.a e(int i7) {
            this.f6278c = Integer.valueOf(i7);
            return this;
        }

        @Override
        public AbstractC1229k.a f(i0 i0Var) {
            if (i0Var == null) {
                throw new NullPointerException("Null videoSpec");
            }
            this.f6276a = i0Var;
            return this;
        }

        b() {
        }

        private b(AbstractC1229k abstractC1229k) {
            this.f6276a = abstractC1229k.d();
            this.f6277b = abstractC1229k.b();
            this.f6278c = Integer.valueOf(abstractC1229k.c());
        }
    }

    @Override
    public AbstractC1219a b() {
        return this.f6274b;
    }

    @Override
    public int c() {
        return this.f6275c;
    }

    @Override
    public i0 d() {
        return this.f6273a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC1229k)) {
            return false;
        }
        AbstractC1229k abstractC1229k = (AbstractC1229k) obj;
        return this.f6273a.equals(abstractC1229k.d()) && this.f6274b.equals(abstractC1229k.b()) && this.f6275c == abstractC1229k.c();
    }

    @Override
    public AbstractC1229k.a g() {
        return new b(this);
    }

    public int hashCode() {
        return ((((this.f6273a.hashCode() ^ 1000003) * 1000003) ^ this.f6274b.hashCode()) * 1000003) ^ this.f6275c;
    }

    public String toString() {
        return "MediaSpec{videoSpec=" + this.f6273a + ", audioSpec=" + this.f6274b + ", outputFormat=" + this.f6275c + "}";
    }

    private C1222d(i0 i0Var, AbstractC1219a abstractC1219a, int i7) {
        this.f6273a = i0Var;
        this.f6274b = abstractC1219a;
        this.f6275c = i7;
    }
}
