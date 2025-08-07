package s2;

import com.github.luben.zstd.BuildConfig;
import java.util.Arrays;
import s2.o;

final class d extends o {

    private final String f23616a;

    private final byte[] f23617b;

    private final q2.d f23618c;

    static final class b extends o.a {

        private String f23619a;

        private byte[] f23620b;

        private q2.d f23621c;

        b() {
        }

        @Override
        public o a() {
            String str = this.f23619a;
            String str2 = BuildConfig.FLAVOR;
            if (str == null) {
                str2 = BuildConfig.FLAVOR + " backendName";
            }
            if (this.f23621c == null) {
                str2 = str2 + " priority";
            }
            if (str2.isEmpty()) {
                return new d(this.f23619a, this.f23620b, this.f23621c);
            }
            throw new IllegalStateException("Missing required properties:" + str2);
        }

        @Override
        public o.a b(String str) {
            if (str == null) {
                throw new NullPointerException("Null backendName");
            }
            this.f23619a = str;
            return this;
        }

        @Override
        public o.a c(byte[] bArr) {
            this.f23620b = bArr;
            return this;
        }

        @Override
        public o.a d(q2.d dVar) {
            if (dVar == null) {
                throw new NullPointerException("Null priority");
            }
            this.f23621c = dVar;
            return this;
        }
    }

    @Override
    public String b() {
        return this.f23616a;
    }

    @Override
    public byte[] c() {
        return this.f23617b;
    }

    @Override
    public q2.d d() {
        return this.f23618c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f23616a.equals(oVar.b())) {
            if (Arrays.equals(this.f23617b, oVar instanceof d ? ((d) oVar).f23617b : oVar.c()) && this.f23618c.equals(oVar.d())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f23616a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f23617b)) * 1000003) ^ this.f23618c.hashCode();
    }

    private d(String str, byte[] bArr, q2.d dVar) {
        this.f23616a = str;
        this.f23617b = bArr;
        this.f23618c = dVar;
    }
}
