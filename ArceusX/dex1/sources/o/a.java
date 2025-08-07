package O;

import O.e;
import com.github.luben.zstd.BuildConfig;

final class a extends e {

    private final String f2658a;

    private final String f2659b;

    private final String f2660c;

    private final String f2661d;

    static final class b extends e.a {

        private String f2662a;

        private String f2663b;

        private String f2664c;

        private String f2665d;

        b() {
        }

        @Override
        public e a() {
            String str = this.f2662a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " glVersion";
            }
            if (this.f2663b == null) {
                str2 = str2 + " eglVersion";
            }
            if (this.f2664c == null) {
                str2 = str2 + " glExtensions";
            }
            if (this.f2665d == null) {
                str2 = str2 + " eglExtensions";
            }
            if (str2.isEmpty()) {
                return new a(this.f2662a, this.f2663b, this.f2664c, this.f2665d);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override
        public e.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglExtensions");
            }
            this.f2665d = str;
            return this;
        }

        @Override
        public e.a c(String str) {
            if (str == null) {
                throw new NullPointerException("Null eglVersion");
            }
            this.f2663b = str;
            return this;
        }

        @Override
        public e.a d(String str) {
            if (str == null) {
                throw new NullPointerException("Null glExtensions");
            }
            this.f2664c = str;
            return this;
        }

        @Override
        public e.a e(String str) {
            if (str == null) {
                throw new NullPointerException("Null glVersion");
            }
            this.f2662a = str;
            return this;
        }
    }

    @Override
    public String b() {
        return this.f2661d;
    }

    @Override
    public String c() {
        return this.f2659b;
    }

    @Override
    public String d() {
        return this.f2660c;
    }

    @Override
    public String e() {
        return this.f2658a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f2658a.equals(eVar.e()) && this.f2659b.equals(eVar.c()) && this.f2660c.equals(eVar.d()) && this.f2661d.equals(eVar.b());
    }

    public int hashCode() {
        return ((((((this.f2658a.hashCode() ^ 1000003) * 1000003) ^ this.f2659b.hashCode()) * 1000003) ^ this.f2660c.hashCode()) * 1000003) ^ this.f2661d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f2658a + ", eglVersion=" + this.f2659b + ", glExtensions=" + this.f2660c + ", eglExtensions=" + this.f2661d + "}";
    }

    private a(String str, String str2, String str3, String str4) {
        this.f2658a = str;
        this.f2659b = str2;
        this.f2660c = str3;
        this.f2661d = str4;
    }
}
