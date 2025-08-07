package r2;

import com.google.android.gms.common.Zb.JmBUOGMwkkxg;

final class h extends n {

    private final long f22824a;

    h(long j7) {
        this.f22824a = j7;
    }

    @Override
    public long c() {
        return this.f22824a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof n) && this.f22824a == ((n) obj).c();
    }

    public int hashCode() {
        long j7 = this.f22824a;
        return ((int) (j7 ^ (j7 >>> 32))) ^ 1000003;
    }

    public String toString() {
        return JmBUOGMwkkxg.FncAqhfbCSFsx + this.f22824a + "}";
    }
}
