package F0;

import B0.AbstractC0291b;
import B0.C0294e;
import B0.C0296g;
import B0.g0;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0001\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LF0/b;", BuildConfig.FLAVOR, "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b {

    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LF0/b$a;", BuildConfig.FLAVOR, "<init>", "()V", "LB0/b;", "request", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "a", "(LB0/b;Landroid/content/Context;)Landroid/os/Bundle;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle a(AbstractC0291b request, Context context) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            Bundle credentialData = request.getCredentialData();
            Bundle bundleA = request.getDisplayInfo().a();
            bundleA.putParcelable("androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON", Icon.createWithResource(context, request instanceof C0294e ? g0.f331c : request instanceof C0296g ? g0.f330b : g0.f329a));
            credentialData.putBundle("androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO", bundleA);
            return credentialData;
        }

        private Companion() {
        }
    }
}
