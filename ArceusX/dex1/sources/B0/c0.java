package B0;

import android.content.ComponentName;
import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B9\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB-\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"LB0/c0;", "LB0/m;", BuildConfig.FLAVOR, "requestJson", BuildConfig.FLAVOR, "clientDataHash", BuildConfig.FLAVOR, "Landroid/content/ComponentName;", "allowedProviders", "Landroid/os/Bundle;", "requestData", "candidateQueryData", "<init>", "(Ljava/lang/String;[BLjava/util/Set;Landroid/os/Bundle;Landroid/os/Bundle;)V", "(Ljava/lang/String;[BLjava/util/Set;)V", "h", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "i", "[B", "getClientDataHash", "()[B", "j", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c0 extends AbstractC0302m {

    public static final Companion INSTANCE = new Companion(null);

    private final String requestJson;

    private final byte[] clientDataHash;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"LB0/c0$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "requestJson", BuildConfig.FLAVOR, "clientDataHash", "Landroid/os/Bundle;", "a", "(Ljava/lang/String;[B)Landroid/os/Bundle;", "BUNDLE_KEY_CLIENT_DATA_HASH", "Ljava/lang/String;", "BUNDLE_KEY_REQUEST_JSON", "BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle a(String requestJson, byte[] clientDataHash) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }

        private Companion() {
        }
    }

    public c0(String str) {
        this(str, (byte[]) null, (Set) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(str, "requestJson");
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    private c0(String str, byte[] bArr, Set<ComponentName> set, Bundle bundle, Bundle bundle2) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, true, set);
        this.requestJson = str;
        this.clientDataHash = bArr;
        if (!F0.c.INSTANCE.a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    public c0(String str, byte[] bArr, Set set, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? null : bArr, (i7 & 4) != 0 ? kotlin.collections.L.d() : set);
    }

    public c0(String str, byte[] bArr, Set<ComponentName> set) {
        Intrinsics.checkNotNullParameter(str, "requestJson");
        Intrinsics.checkNotNullParameter(set, "allowedProviders");
        Companion companion = INSTANCE;
        this(str, bArr, set, companion.a(str, bArr), companion.a(str, bArr));
    }
}
