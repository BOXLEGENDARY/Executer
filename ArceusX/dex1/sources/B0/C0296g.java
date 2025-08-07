package B0;

import B0.AbstractC0291b;
import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bBS\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B=\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"LB0/g;", "LB0/b;", BuildConfig.FLAVOR, "requestJson", BuildConfig.FLAVOR, "clientDataHash", BuildConfig.FLAVOR, "isAutoSelectAllowed", "preferImmediatelyAvailableCredentials", "LB0/b$b;", "displayInfo", "origin", "Landroid/os/Bundle;", "credentialData", "candidateQueryData", "<init>", "(Ljava/lang/String;[BZZLB0/b$b;Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;)V", "(Ljava/lang/String;[BZLjava/lang/String;Z)V", "j", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "k", "[B", "getClientDataHash", "()[B", "l", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C0296g extends AbstractC0291b {

    public static final Companion INSTANCE = new Companion(null);

    private final String requestJson;

    private final byte[] clientDataHash;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\b\u0010\tJ#\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0001¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0014"}, d2 = {"LB0/g$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "requestJson", "defaultProvider", "LB0/b$b;", "a", "(Ljava/lang/String;Ljava/lang/String;)LB0/b$b;", BuildConfig.FLAVOR, "clientDataHash", "Landroid/os/Bundle;", "d", "(Ljava/lang/String;[B)Landroid/os/Bundle;", "c", "BUNDLE_KEY_CLIENT_DATA_HASH", "Ljava/lang/String;", "BUNDLE_KEY_REQUEST_JSON", "BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static AbstractC0291b.C0003b b(Companion companion, String str, String str2, int i7, Object obj) {
            if ((i7 & 2) != 0) {
                str2 = null;
            }
            return companion.a(str, str2);
        }

        public final AbstractC0291b.C0003b a(String requestJson, String defaultProvider) throws JSONException {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            try {
                JSONObject jSONObject = new JSONObject(requestJson).getJSONObject("user");
                String string = jSONObject.getString("name");
                String string2 = jSONObject.isNull("displayName") ? null : jSONObject.getString("displayName");
                Intrinsics.checkNotNullExpressionValue(string, "userName");
                return new AbstractC0291b.C0003b(string, string2, null, defaultProvider);
            } catch (Exception unused) {
                throw new IllegalArgumentException("user.name must be defined in requestJson");
            }
        }

        public final Bundle c(String requestJson, byte[] clientDataHash) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }

        public final Bundle d(String requestJson, byte[] clientDataHash) {
            Intrinsics.checkNotNullParameter(requestJson, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_SUBTYPE", "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST");
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", requestJson);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", clientDataHash);
            return bundle;
        }

        private Companion() {
        }
    }

    public C0296g(String str) {
        this(str, null, false, null, false, 30, null);
        Intrinsics.checkNotNullParameter(str, "requestJson");
    }

    public final String getRequestJson() {
        return this.requestJson;
    }

    C0296g(String str, byte[] bArr, boolean z7, boolean z8, AbstractC0291b.C0003b c0003b, String str2, Bundle bundle, Bundle bundle2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, z7, z8, c0003b, (i7 & 32) != 0 ? null : str2, (i7 & 64) != 0 ? INSTANCE.d(str, bArr) : bundle, (i7 & 128) != 0 ? INSTANCE.c(str, bArr) : bundle2);
    }

    private C0296g(String str, byte[] bArr, boolean z7, boolean z8, AbstractC0291b.C0003b c0003b, String str2, Bundle bundle, Bundle bundle2) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle, bundle2, false, z7, c0003b, str2, z8);
        this.requestJson = str;
        this.clientDataHash = bArr;
        if (!F0.c.INSTANCE.a(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    public C0296g(String str, byte[] bArr, boolean z7, String str2, boolean z8, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i7 & 2) != 0 ? null : bArr, (i7 & 4) != 0 ? false : z7, (i7 & 8) != 0 ? null : str2, (i7 & 16) != 0 ? false : z8);
    }

    public C0296g(String str, byte[] bArr, boolean z7, String str2, boolean z8) {
        this(str, bArr, z8, z7, Companion.b(INSTANCE, str, null, 2, null), str2, null, null, 192, null);
        Intrinsics.checkNotNullParameter(str, "requestJson");
    }
}
