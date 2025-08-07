package B0;

import android.content.ComponentName;
import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0013\b&\u0018\u0000 \u001d2\u00020\u0001:\u0001\u000fB?\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0013\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u000f\u0010\u001c¨\u0006\u001e"}, d2 = {"LB0/m;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "type", "Landroid/os/Bundle;", "requestData", "candidateQueryData", BuildConfig.FLAVOR, "isSystemProviderRequired", "isAutoSelectAllowed", BuildConfig.FLAVOR, "Landroid/content/ComponentName;", "allowedProviders", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLjava/util/Set;)V", "a", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "c", "()Landroid/os/Bundle;", "Z", "f", "()Z", "e", "Ljava/util/Set;", "()Ljava/util/Set;", "g", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractC0302m {

    private final String type;

    private final Bundle requestData;

    private final Bundle candidateQueryData;

    private final boolean isSystemProviderRequired;

    private final boolean isAutoSelectAllowed;

    private final Set<ComponentName> allowedProviders;

    public AbstractC0302m(String str, Bundle bundle, Bundle bundle2, boolean z7, boolean z8, Set<ComponentName> set) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(bundle, "requestData");
        Intrinsics.checkNotNullParameter(bundle2, "candidateQueryData");
        Intrinsics.checkNotNullParameter(set, "allowedProviders");
        this.type = str;
        this.requestData = bundle;
        this.candidateQueryData = bundle2;
        this.isSystemProviderRequired = z7;
        this.isAutoSelectAllowed = z8;
        this.allowedProviders = set;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z8);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z8);
    }

    public final Set<ComponentName> a() {
        return this.allowedProviders;
    }

    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final Bundle getRequestData() {
        return this.requestData;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean getIsAutoSelectAllowed() {
        return this.isAutoSelectAllowed;
    }

    public final boolean getIsSystemProviderRequired() {
        return this.isSystemProviderRequired;
    }
}
