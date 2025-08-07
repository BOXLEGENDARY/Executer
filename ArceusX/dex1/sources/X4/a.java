package X4;

import X4.d;
import java.lang.annotation.Annotation;

public final class a {

    private int f7925a;

    private d.a f7926b = d.a.DEFAULT;

    private static final class C0054a implements d {

        private final int f7927a;

        private final d.a f7928b;

        C0054a(int i7, d.a aVar) {
            this.f7927a = i7;
            this.f7928b = aVar;
        }

        @Override
        public Class<? extends Annotation> annotationType() {
            return d.class;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f7927a == dVar.tag() && this.f7928b.equals(dVar.intEncoding());
        }

        @Override
        public int hashCode() {
            return (14552422 ^ this.f7927a) + (this.f7928b.hashCode() ^ 2041407134);
        }

        @Override
        public d.a intEncoding() {
            return this.f7928b;
        }

        @Override
        public int tag() {
            return this.f7927a;
        }

        @Override
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f7927a + "intEncoding=" + this.f7928b + ')';
        }
    }

    public static a b() {
        return new a();
    }

    public d a() {
        return new C0054a(this.f7925a, this.f7926b);
    }

    public a c(int i7) {
        this.f7925a = i7;
        return this;
    }
}
