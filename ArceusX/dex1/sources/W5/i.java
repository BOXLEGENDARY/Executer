package W5;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LW5/i;", BuildConfig.FLAVOR, "LW5/i$a;", "type", BuildConfig.FLAVOR, "a", "(LW5/i$a;)V", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface i {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"LW5/i$a;", BuildConfig.FLAVOR, "<init>", "(Ljava/lang/String;I)V", "d", "e", "i", "NativeShell_googleProdRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        public static final a f7691d = new a("Optional", 0);

        public static final a f7692e = new a("Required", 1);

        public static final a f7693i = new a("NewApp", 2);

        private static final a[] f7694v;

        private static final T9.a f7695w;

        static {
            a[] aVarArrC = c();
            f7694v = aVarArrC;
            f7695w = T9.b.a(aVarArrC);
        }

        private a(String str, int i7) {
        }

        private static final a[] c() {
            return new a[]{f7691d, f7692e, f7693i};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f7694v.clone();
        }
    }

    void a(a type);
}
