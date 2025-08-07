package B0;

import android.content.ComponentName;
import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import g1.kQwt.YGBtcyQ;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u001b2\u00020\u0001:\u0002\u000e\u0011BC\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001c"}, d2 = {"LB0/Y;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "LB0/m;", "credentialOptions", BuildConfig.FLAVOR, "origin", BuildConfig.FLAVOR, "preferIdentityDocUi", "Landroid/content/ComponentName;", "preferUiBrandingComponentName", "preferImmediatelyAvailableCredentials", "<init>", "(Ljava/util/List;Ljava/lang/String;ZLandroid/content/ComponentName;Z)V", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Z", "()Z", "d", "Landroid/content/ComponentName;", "()Landroid/content/ComponentName;", "e", "f", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Y {

    public static final Companion INSTANCE = new Companion(null);

    private final List<AbstractC0302m> credentialOptions;

    private final String origin;

    private final boolean preferIdentityDocUi;

    private final ComponentName preferUiBrandingComponentName;

    private final boolean preferImmediatelyAvailableCredentials;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0015R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LB0/Y$a;", BuildConfig.FLAVOR, "<init>", "()V", "LB0/m;", "credentialOption", "a", "(LB0/m;)LB0/Y$a;", BuildConfig.FLAVOR, "preferImmediatelyAvailableCredentials", "c", "(Z)LB0/Y$a;", "LB0/Y;", "b", "()LB0/Y;", BuildConfig.FLAVOR, "Ljava/util/List;", "credentialOptions", BuildConfig.FLAVOR, "Ljava/lang/String;", "origin", "Z", "preferIdentityDocUi", "d", "Landroid/content/ComponentName;", "e", "Landroid/content/ComponentName;", "preferUiBrandingComponentName", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        private List<AbstractC0302m> credentialOptions = new ArrayList();

        private String origin;

        private boolean preferIdentityDocUi;

        private boolean preferImmediatelyAvailableCredentials;

        private ComponentName preferUiBrandingComponentName;

        public final a a(AbstractC0302m credentialOption) {
            Intrinsics.checkNotNullParameter(credentialOption, "credentialOption");
            this.credentialOptions.add(credentialOption);
            return this;
        }

        public final Y b() {
            return new Y(CollectionsKt.r0(this.credentialOptions), this.origin, this.preferIdentityDocUi, this.preferUiBrandingComponentName, this.preferImmediatelyAvailableCredentials);
        }

        public final a c(boolean preferImmediatelyAvailableCredentials) {
            this.preferImmediatelyAvailableCredentials = preferImmediatelyAvailableCredentials;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"LB0/Y$b;", BuildConfig.FLAVOR, "<init>", "()V", "LB0/Y;", "request", "Landroid/os/Bundle;", "a", "(LB0/Y;)Landroid/os/Bundle;", BuildConfig.FLAVOR, "BUNDLE_KEY_PREFER_IDENTITY_DOC_UI", "Ljava/lang/String;", "BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", "BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", "credentials_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Bundle a(Y request) {
            Intrinsics.checkNotNullParameter(request, "request");
            Bundle bundle = new Bundle();
            bundle.putBoolean(YGBtcyQ.tWsYVhkAK, request.getPreferIdentityDocUi());
            bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", request.getPreferImmediatelyAvailableCredentials());
            bundle.putParcelable("androidx.credentials.BUNDLE_KEY_PREFER_UI_BRANDING_COMPONENT_NAME", request.getPreferUiBrandingComponentName());
            return bundle;
        }

        private Companion() {
        }
    }

    public Y(List<? extends AbstractC0302m> list, String str, boolean z7, ComponentName componentName, boolean z8) {
        Intrinsics.checkNotNullParameter(list, "credentialOptions");
        this.credentialOptions = list;
        this.origin = str;
        this.preferIdentityDocUi = z7;
        this.preferUiBrandingComponentName = componentName;
        this.preferImmediatelyAvailableCredentials = z8;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("credentialOptions should not be empty");
        }
    }

    public final List<AbstractC0302m> a() {
        return this.credentialOptions;
    }

    public final String getOrigin() {
        return this.origin;
    }

    public final boolean getPreferIdentityDocUi() {
        return this.preferIdentityDocUi;
    }

    public final ComponentName getPreferUiBrandingComponentName() {
        return this.preferUiBrandingComponentName;
    }

    public final boolean getPreferImmediatelyAvailableCredentials() {
        return this.preferImmediatelyAvailableCredentials;
    }
}
