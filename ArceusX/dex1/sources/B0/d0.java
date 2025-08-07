package B0;

import android.os.Bundle;
import backtraceio.library.interfaces.TNiz.vxbbqXNtzfMxs;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00102\u00020\u0001:\u0001\fB!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0011"}, d2 = {"LB0/d0;", "LB0/i;", BuildConfig.FLAVOR, "id", "password", "Landroid/os/Bundle;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "d", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "e", "b", "f", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d0 extends AbstractC0298i {

    public static final Companion INSTANCE = new Companion(null);

    private final String id;

    private final String password;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"LB0/d0$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "id", "password", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;", "data", "LB0/d0;", "a", "(Landroid/os/Bundle;)LB0/d0;", "BUNDLE_KEY_ID", "Ljava/lang/String;", "BUNDLE_KEY_PASSWORD", "TYPE_PASSWORD_CREDENTIAL", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d0 a(Bundle data) throws F0.a {
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_ID");
                String string2 = data.getString(vxbbqXNtzfMxs.GcR);
                Intrinsics.d(string);
                Intrinsics.d(string2);
                return new d0(string, string2, data, null);
            } catch (Exception unused) {
                throw new F0.a();
            }
        }

        public final Bundle b(String id, String password) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(password, "password");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", id);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", password);
            return bundle;
        }

        private Companion() {
        }
    }

    public d0(String str, String str2, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bundle);
    }

    public final String getId() {
        return this.id;
    }

    public final String getPassword() {
        return this.password;
    }

    private d0(String str, String str2, Bundle bundle) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle);
        this.id = str;
        this.password = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    public d0(String str, String str2) {
        this(str, str2, INSTANCE.b(str, str2));
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "password");
    }
}
