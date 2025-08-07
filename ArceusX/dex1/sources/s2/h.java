package s2;

import java.util.Arrays;

public final class h {

    private final q2.b f23636a;

    private final byte[] f23637b;

    public h(q2.b bVar, byte[] bArr) {
        if (bVar == null) {
            throw new NullPointerException("encoding is null");
        }
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        }
        this.f23636a = bVar;
        this.f23637b = bArr;
    }

    public byte[] a() {
        return this.f23637b;
    }

    public q2.b b() {
        return this.f23636a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f23636a.equals(hVar.f23636a)) {
            return Arrays.equals(this.f23637b, hVar.f23637b);
        }
        return false;
    }

    public int hashCode() {
        return ((this.f23636a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f23637b);
    }

    public String toString() {
        return "EncodedPayload{encoding=" + this.f23636a + ", bytes=[...]}";
    }
}
