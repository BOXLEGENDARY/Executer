package O;

import O.a;
import com.github.luben.zstd.BuildConfig;

public abstract class e {

    public static abstract class a {
        public abstract e a();

        public abstract a b(String str);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(String str);
    }

    e() {
    }

    public static a a() {
        return new a.b().e("0.0").c("0.0").d(BuildConfig.FLAVOR).b(BuildConfig.FLAVOR);
    }

    public abstract String b();

    public abstract String c();

    public abstract String d();

    public abstract String e();
}
