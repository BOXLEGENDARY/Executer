package B0;

import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00072\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006¨\u0006\t"}, d2 = {"LB0/f;", "LB0/c;", "Landroid/os/Bundle;", "data", "<init>", "(Landroid/os/Bundle;)V", "()V", "d", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C0295f extends AbstractC0292c {

    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LB0/f$a;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/os/Bundle;", "data", "LB0/f;", "a", "(Landroid/os/Bundle;)LB0/f;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0295f a(Bundle data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new C0295f(data, null);
        }

        private Companion() {
        }
    }

    public C0295f(Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(bundle);
    }

    private C0295f(Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
    }

    public C0295f() {
        this(new Bundle());
    }
}
