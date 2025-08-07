package B0;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.TextUtils;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import y0.xyyu.hkVlaTTCDY;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b&\u0018\u0000  2\u00020\u0001:\u0002\u0010\u0014BK\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\t\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u0018\u0010\u0013R\u0017\u0010\r\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b\r\u0010\u001b¨\u0006!"}, d2 = {"LB0/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "type", "Landroid/os/Bundle;", "credentialData", "candidateQueryData", BuildConfig.FLAVOR, "isSystemProviderRequired", "isAutoSelectAllowed", "LB0/b$b;", "displayInfo", "origin", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/lang/String;Landroid/os/Bundle;Landroid/os/Bundle;ZZLB0/b$b;Ljava/lang/String;Z)V", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "b", "Landroid/os/Bundle;", "()Landroid/os/Bundle;", "c", "d", "Z", "f", "()Z", "LB0/b$b;", "()LB0/b$b;", "g", "h", "i", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class AbstractC0291b {

    private final String type;

    private final Bundle credentialData;

    private final Bundle candidateQueryData;

    private final boolean isSystemProviderRequired;

    private final boolean isAutoSelectAllowed;

    private final C0003b displayInfo;

    private final String origin;

    private final boolean preferImmediatelyAvailableCredentials;

    public AbstractC0291b(String str, Bundle bundle, Bundle bundle2, boolean z7, boolean z8, C0003b c0003b, String str2, boolean z9) {
        Intrinsics.checkNotNullParameter(str, "type");
        Intrinsics.checkNotNullParameter(bundle, "credentialData");
        Intrinsics.checkNotNullParameter(bundle2, "candidateQueryData");
        Intrinsics.checkNotNullParameter(c0003b, "displayInfo");
        this.type = str;
        this.credentialData = bundle;
        this.candidateQueryData = bundle2;
        this.isSystemProviderRequired = z7;
        this.isAutoSelectAllowed = z8;
        this.displayInfo = c0003b;
        this.origin = str2;
        this.preferImmediatelyAvailableCredentials = z9;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z8);
        bundle.putBoolean(hkVlaTTCDY.zgrwxuzzg, z9);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z8);
    }

    public final Bundle getCandidateQueryData() {
        return this.candidateQueryData;
    }

    public final Bundle getCredentialData() {
        return this.credentialData;
    }

    public final C0003b getDisplayInfo() {
        return this.displayInfo;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final String getType() {
        return this.type;
    }

    public final boolean getIsSystemProviderRequired() {
        return this.isSystemProviderRequired;
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 \u001c2\u00020\u0001:\u0001\rB/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"LB0/b$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "userId", "userDisplayName", "Landroid/graphics/drawable/Icon;", "credentialTypeIcon", BuildConfig.FLAVOR, "preferDefaultProvider", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Landroid/graphics/drawable/Icon;Ljava/lang/String;)V", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "Landroid/os/Bundle;", "a", "()Landroid/os/Bundle;", "Ljava/lang/CharSequence;", "getUserId", "()Ljava/lang/CharSequence;", "b", "getUserDisplayName", "c", "Landroid/graphics/drawable/Icon;", "getCredentialTypeIcon", "()Landroid/graphics/drawable/Icon;", "d", "Ljava/lang/String;", "getPreferDefaultProvider", "()Ljava/lang/String;", "e", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class C0003b {

        private final CharSequence userId;

        private final CharSequence userDisplayName;

        private final Icon credentialTypeIcon;

        private final String preferDefaultProvider;

        public C0003b(CharSequence charSequence, CharSequence charSequence2, Icon icon, String str) {
            Intrinsics.checkNotNullParameter(charSequence, "userId");
            this.userId = charSequence;
            this.userDisplayName = charSequence2;
            this.credentialTypeIcon = icon;
            this.preferDefaultProvider = str;
            if (charSequence.length() <= 0) {
                throw new IllegalArgumentException("userId should not be empty");
            }
        }

        public final Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_ID", this.userId);
            if (!TextUtils.isEmpty(this.userDisplayName)) {
                bundle.putCharSequence("androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME", this.userDisplayName);
            }
            if (!TextUtils.isEmpty(this.preferDefaultProvider)) {
                bundle.putString("androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER", this.preferDefaultProvider);
            }
            return bundle;
        }

        public C0003b(CharSequence charSequence, CharSequence charSequence2) {
            this(charSequence, charSequence2, null, null);
            Intrinsics.checkNotNullParameter(charSequence, "userId");
        }
    }
}
