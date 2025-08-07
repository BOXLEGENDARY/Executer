package E0;

import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\t\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0001\nB\u001d\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"LE0/b;", "LC0/e;", BuildConfig.FLAVOR, "type", BuildConfig.FLAVOR, "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;)V", "i", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "v", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class b extends C0.e {

    public static final Companion INSTANCE = new Companion(null);

    private final String type;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LE0/b$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "type", "msg", "LC0/e;", "a", "(Ljava/lang/String;Ljava/lang/String;)LC0/e;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0.e a(String type, String msg) throws F0.a {
            Intrinsics.checkNotNullParameter(type, "type");
            try {
                if (StringsKt.K(type, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION", false, 2, (Object) null)) {
                    return a.INSTANCE.a(type, msg);
                }
                throw new F0.a();
            } catch (F0.a unused) {
                return new C0.d(type, msg);
            }
        }

        private Companion() {
        }
    }

    public b(String str, CharSequence charSequence) {
        super(str, charSequence);
        Intrinsics.checkNotNullParameter(str, "type");
        this.type = str;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }

    public String getType() {
        return this.type;
    }
}
