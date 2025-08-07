package s2;

import android.util.Base64;
import com.github.luben.zstd.BuildConfig;
import s2.d;

public abstract class o {

    public static abstract class a {
        public abstract o a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(q2.d dVar);
    }

    public static a a() {
        return new d.b().d(q2.d.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract q2.d d();

    public boolean e() {
        return c() != null;
    }

    public o f(q2.d dVar) {
        return a().b(b()).d(dVar).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? BuildConfig.FLAVOR : Base64.encodeToString(c(), 2));
    }
}
