package t2;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import t2.f;

final class a extends f {

    private final Iterable<s2.i> f23790a;

    private final byte[] f23791b;

    static final class b extends f.a {

        private Iterable<s2.i> f23792a;

        private byte[] f23793b;

        b() {
        }

        @Override
        public f a() {
            Iterable<s2.i> iterable = this.f23792a;
            String str = BuildConfig.FLAVOR;
            if (iterable == null) {
                str = BuildConfig.FLAVOR + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f23792a, this.f23793b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override
        public f.a b(Iterable<s2.i> iterable) {
            if (iterable == null) {
                throw new NullPointerException("Null events");
            }
            this.f23792a = iterable;
            return this;
        }

        @Override
        public f.a c(byte[] bArr) {
            this.f23793b = bArr;
            return this;
        }
    }

    @Override
    public Iterable<s2.i> b() {
        return this.f23790a;
    }

    @Override
    public byte[] c() {
        return this.f23791b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f23790a.equals(fVar.b())) {
            if (Arrays.equals(this.f23791b, fVar instanceof a ? ((a) fVar).f23791b : fVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23790a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f23791b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f23790a + ", extras=" + Arrays.toString(this.f23791b) + "}";
    }

    private a(Iterable<s2.i> iterable, byte[] bArr) {
        this.f23790a = iterable;
        this.f23791b = bArr;
    }
}
