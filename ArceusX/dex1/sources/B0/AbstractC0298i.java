package B0;

import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b&\u0018\u0000 \u00102\u00020\u0001:\u0001\bB\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LB0/i;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "type", "Landroid/os/Bundle;", "data", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "a", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "getData", "()Landroid/os/Bundle;", "c", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractC0298i {

    public static final Companion INSTANCE = new Companion(null);

    private final String type;

    private final Bundle data;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LB0/i$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "type", "Landroid/os/Bundle;", "data", "LB0/i;", "a", "(Ljava/lang/String;Landroid/os/Bundle;)LB0/i;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AbstractC0298i a(String type, Bundle data) throws F0.a {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                if (Intrinsics.b(type, "android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                    return d0.INSTANCE.a(data);
                }
                if (Intrinsics.b(type, "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                    return f0.INSTANCE.a(data);
                }
                throw new F0.a();
            } catch (F0.a unused) {
                return new X(type, data);
            }
        }

        private Companion() {
        }
    }

    public AbstractC0298i(String str, Bundle bundle) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(bundle, "data");
        this.type = str;
        this.data = bundle;
    }
}
