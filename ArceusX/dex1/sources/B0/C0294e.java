package B0;

import B0.AbstractC0291b;
import Z.tNT.PexNRiLSd;
import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018BQ\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fB9\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"LB0/e;", "LB0/b;", BuildConfig.FLAVOR, "id", "password", BuildConfig.FLAVOR, "isAutoSelectAllowed", "LB0/b$b;", "displayInfo", "origin", "preferImmediatelyAvailableCredentials", "Landroid/os/Bundle;", "credentialData", "candidateQueryData", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLB0/b$b;Ljava/lang/String;ZLandroid/os/Bundle;Landroid/os/Bundle;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V", "j", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "k", "h", "l", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C0294e extends AbstractC0291b {

    public static final Companion INSTANCE = new Companion(null);

    private final String id;

    private final String password;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\r¨\u0006\u000f"}, d2 = {"LB0/e$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "id", "password", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "BUNDLE_KEY_ID", "Ljava/lang/String;", "BUNDLE_KEY_PASSWORD", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle a() {
            return new Bundle();
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

    public C0294e(String str, String str2) {
        this(str, str2, null, false, false, 28, null);
        Intrinsics.checkNotNullParameter(str, PexNRiLSd.BpzrsvGmIHjIhK);
        Intrinsics.checkNotNullParameter(str2, "password");
    }

    public final String getId() {
        return this.id;
    }

    public final String getPassword() {
        return this.password;
    }

    C0294e(String str, String str2, boolean z7, AbstractC0291b.C0003b c0003b, String str3, boolean z8, Bundle bundle, Bundle bundle2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, z7, c0003b, (i7 & 16) != 0 ? null : str3, z8, (i7 & 64) != 0 ? INSTANCE.b(str, str2) : bundle, (i7 & 128) != 0 ? INSTANCE.a() : bundle2);
    }

    private C0294e(String str, String str2, boolean z7, AbstractC0291b.C0003b c0003b, String str3, boolean z8, Bundle bundle, Bundle bundle2) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, false, z7, c0003b, str3, z8);
        this.id = str;
        this.password = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    public C0294e(String str, String str2, String str3, boolean z7, boolean z8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i7 & 4) != 0 ? null : str3, (i7 & 8) != 0 ? false : z7, (i7 & 16) != 0 ? false : z8);
    }

    public C0294e(String str, String str2, String str3, boolean z7, boolean z8) {
        this(str, str2, z8, new AbstractC0291b.C0003b(str, null), str3, z7, null, null, 192, null);
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "password");
    }
}
