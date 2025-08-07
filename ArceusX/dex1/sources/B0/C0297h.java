package B0;

import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 \r2\u00020\u0001:\u0001\u000bB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"LB0/h;", "LB0/c;", BuildConfig.FLAVOR, "registrationResponseJson", "Landroid/os/Bundle;", "data", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;)V", "(Ljava/lang/String;)V", "d", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "e", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class C0297h extends AbstractC0292c {

    public static final Companion INSTANCE = new Companion(null);

    private final String registrationResponseJson;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LB0/h$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "registrationResponseJson", "Landroid/os/Bundle;", "b", "(Ljava/lang/String;)Landroid/os/Bundle;", "data", "LB0/h;", "a", "(Landroid/os/Bundle;)LB0/h;", "BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final C0297h a(Bundle data) throws F0.a {
            Intrinsics.checkNotNullParameter(data, "data");
            try {
                String string = data.getString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON");
                Intrinsics.d(string);
                return new C0297h(string, data, null);
            } catch (Exception unused) {
                throw new F0.a();
            }
        }

        public final Bundle b(String registrationResponseJson) {
            Intrinsics.checkNotNullParameter(registrationResponseJson, "registrationResponseJson");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON", registrationResponseJson);
            return bundle;
        }

        private Companion() {
        }
    }

    public C0297h(String str, Bundle bundle, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bundle);
    }

    public final String getRegistrationResponseJson() {
        return this.registrationResponseJson;
    }

    private C0297h(String str, Bundle bundle) {
        super("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL", bundle);
        this.registrationResponseJson = str;
        if (!F0.c.INSTANCE.a(str)) {
            throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
        }
    }

    public C0297h(String str) {
        this(str, INSTANCE.b(str));
        Intrinsics.checkNotNullParameter(str, "registrationResponseJson");
    }
}
