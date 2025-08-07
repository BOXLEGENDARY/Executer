package B0;

import android.content.ComponentName;
import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import java.util.ArrayList;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00132\u00020\u0001:\u0001\u0014B=\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rB3\b\u0017\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0004\b\f\u0010\u000eR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"LB0/b0;", "LB0/m;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "allowedUserIds", BuildConfig.FLAVOR, "isAutoSelectAllowed", "Landroid/content/ComponentName;", "allowedProviders", "Landroid/os/Bundle;", "requestData", "candidateQueryData", "<init>", "(Ljava/util/Set;ZLjava/util/Set;Landroid/os/Bundle;Landroid/os/Bundle;)V", "(Ljava/util/Set;ZLjava/util/Set;)V", "h", "Ljava/util/Set;", "getAllowedUserIds", "()Ljava/util/Set;", "i", "a", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class b0 extends AbstractC0302m {

    public static final Companion INSTANCE = new Companion(null);

    private final Set<String> allowedUserIds;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"LB0/b0$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "allowUserIds", "Landroid/os/Bundle;", "a", "(Ljava/util/Set;)Landroid/os/Bundle;", "BUNDLE_KEY_ALLOWED_USER_IDS", "Ljava/lang/String;", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle a(Set<String> allowUserIds) {
            Intrinsics.checkNotNullParameter(allowUserIds, "allowUserIds");
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("androidx.credentials.BUNDLE_KEY_ALLOWED_USER_IDS", new ArrayList<>(allowUserIds));
            return bundle;
        }

        private Companion() {
        }
    }

    public b0() {
        this((Set) null, false, (Set) null, 7, (DefaultConstructorMarker) null);
    }

    public b0(Set<String> set) {
        this((Set) set, false, (Set) null, 6, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(set, "allowedUserIds");
    }

    private b0(Set<String> set, boolean z7, Set<ComponentName> set2, Bundle bundle, Bundle bundle2) {
        super("android.credentials.TYPE_PASSWORD_CREDENTIAL", bundle, bundle2, false, z7, set2);
        this.allowedUserIds = set;
    }

    public b0(Set set, boolean z7, Set set2, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this((i7 & 1) != 0 ? kotlin.collections.L.d() : set, (i7 & 2) != 0 ? false : z7, (i7 & 4) != 0 ? kotlin.collections.L.d() : set2);
    }

    public b0(Set<String> set, boolean z7, Set<ComponentName> set2) {
        Intrinsics.checkNotNullParameter(set, "allowedUserIds");
        Intrinsics.checkNotNullParameter(set2, "allowedProviders");
        Companion companion = INSTANCE;
        this(set, z7, set2, companion.a(set), companion.a(set));
    }
}
