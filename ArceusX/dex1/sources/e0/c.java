package E0;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LE0/c;", BuildConfig.FLAVOR, "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c {

    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LE0/c$a;", BuildConfig.FLAVOR, "<init>", "()V", "T", "LD0/e;", "domError", BuildConfig.FLAVOR, "msg", "t", "b", "(LD0/e;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "SEPARATOR", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T> T b(D0.e domError, String msg, T t7) throws F0.a {
            if (t7 instanceof a) {
                return (T) new a(domError, msg);
            }
            if (t7 instanceof d) {
                return (T) new d(domError, msg);
            }
            throw new F0.a();
        }

        private Companion() {
        }
    }
}
