package b4;

import B0.X;
import android.net.Uri;
import android.os.Bundle;
import com.github.luben.zstd.BuildConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \r2\u00020\u0001:\u0002\u000e\u000fBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lb4/c;", "LB0/X;", BuildConfig.FLAVOR, "id", "idToken", "displayName", "familyName", "givenName", "Landroid/net/Uri;", "profilePictureUri", "phoneNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "k", "a", "b", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class c extends X {

    private final String f12583d;

    private final String f12584e;

    private final String f12585f;

    private final String f12586g;

    private final String f12587h;

    private final Uri f12588i;

    private final String f12589j;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\u0007J\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u0007J\u0015\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0007J\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0007J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0019R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0019R\u0016\u0010\f\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0019R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lb4/c$a;", BuildConfig.FLAVOR, "<init>", "()V", BuildConfig.FLAVOR, "displayName", "b", "(Ljava/lang/String;)Lb4/c$a;", "familyName", "c", "givenName", "d", "id", "e", "idToken", "f", "phoneNumber", "g", "Landroid/net/Uri;", "profilePictureUri", "h", "(Landroid/net/Uri;)Lb4/c$a;", "Lb4/c;", "a", "()Lb4/c;", "Ljava/lang/String;", "Landroid/net/Uri;", "java.com.google.android.libraries.identity.googleid.granule_granule"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {

        private String f12590a = BuildConfig.FLAVOR;

        private String f12591b = BuildConfig.FLAVOR;

        private String f12592c;

        private String f12593d;

        private String f12594e;

        private Uri f12595f;

        private String f12596g;

        public final c a() {
            return new c(this.f12590a, this.f12591b, this.f12592c, this.f12593d, this.f12594e, this.f12595f, this.f12596g);
        }

        public final a b(String displayName) {
            this.f12592c = displayName;
            return this;
        }

        public final a c(String familyName) {
            this.f12593d = familyName;
            return this;
        }

        public final a d(String givenName) {
            this.f12594e = givenName;
            return this;
        }

        public final a e(String id) {
            Intrinsics.checkNotNullParameter(id, "id");
            this.f12590a = id;
            return this;
        }

        public final a f(String idToken) {
            Intrinsics.checkNotNullParameter(idToken, "idToken");
            this.f12591b = idToken;
            return this;
        }

        public final a g(String phoneNumber) {
            this.f12596g = phoneNumber;
            return this;
        }

        public final a h(Uri profilePictureUri) {
            this.f12595f = profilePictureUri;
            return this;
        }
    }

    public c(String str, String str2, String str3, String str4, String str5, Uri uri, String str6) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "idToken");
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "idToken");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super("com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL", bundle);
        this.f12583d = str;
        this.f12584e = str2;
        this.f12585f = str3;
        this.f12586g = str4;
        this.f12587h = str5;
        this.f12588i = uri;
        this.f12589j = str6;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
    }
}
