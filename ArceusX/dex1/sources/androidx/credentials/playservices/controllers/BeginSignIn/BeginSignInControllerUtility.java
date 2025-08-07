package androidx.credentials.playservices.controllers.BeginSignIn;

import B0.AbstractC0302m;
import B0.Y;
import B0.b0;
import B0.c0;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import b4.C1740a;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility;", BuildConfig.FLAVOR, "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class BeginSignInControllerUtility {
    private static final long AUTH_MIN_VERSION_JSON_PARSING = 231815000;

    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "BeginSignInUtility";

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Landroidx/credentials/playservices/controllers/BeginSignIn/BeginSignInControllerUtility$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Landroid/content/Context;", "context", BuildConfig.FLAVOR, "determineDeviceGMSVersionCode", "(Landroid/content/Context;)J", "curAuthVersion", BuildConfig.FLAVOR, "needsBackwardsCompatibleRequest", "(J)Z", "Lb4/a;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "convertToGoogleIdTokenOption", "(Lb4/a;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$GoogleIdTokenRequestOptions;", "LB0/Y;", "request", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "constructBeginSignInRequest$credentials_play_services_auth_release", "(LB0/Y;Landroid/content/Context;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest;", "constructBeginSignInRequest", "AUTH_MIN_VERSION_JSON_PARSING", "J", BuildConfig.FLAVOR, "TAG", "Ljava/lang/String;", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final BeginSignInRequest.GoogleIdTokenRequestOptions convertToGoogleIdTokenOption(C1740a option) {
            BeginSignInRequest.GoogleIdTokenRequestOptions.a aVarG = BeginSignInRequest.GoogleIdTokenRequestOptions.l().c(option.getF12573j()).d(option.getF12572i()).e(option.getF12576m()).f(option.getF12571h()).g(true);
            Intrinsics.checkNotNullExpressionValue(aVarG, "builder()\n              …      .setSupported(true)");
            if (option.getF12574k() != null) {
                String f12574k = option.getF12574k();
                Intrinsics.d(f12574k);
                aVarG.a(f12574k, option.i());
            }
            BeginSignInRequest.GoogleIdTokenRequestOptions googleIdTokenRequestOptionsB = aVarG.b();
            Intrinsics.checkNotNullExpressionValue(googleIdTokenRequestOptionsB, "idTokenOption.build()");
            return googleIdTokenRequestOptionsB;
        }

        private final long determineDeviceGMSVersionCode(Context context) {
            Intrinsics.checkNotNullExpressionValue(context.getPackageManager(), "context.packageManager");
            return r3.getPackageInfo("com.google.android.gms", 0).versionCode;
        }

        private final boolean needsBackwardsCompatibleRequest(long curAuthVersion) {
            return curAuthVersion < BeginSignInControllerUtility.AUTH_MIN_VERSION_JSON_PARSING;
        }

        public final BeginSignInRequest constructBeginSignInRequest$credentials_play_services_auth_release(Y request, Context context) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(context, "context");
            BeginSignInRequest.a aVar = new BeginSignInRequest.a();
            boolean z7 = false;
            boolean z8 = false;
            for (AbstractC0302m abstractC0302m : request.a()) {
                if (abstractC0302m instanceof b0) {
                    aVar.f(new BeginSignInRequest.PasswordRequestOptions.a().b(true).a());
                    z7 = z7 || abstractC0302m.getIsAutoSelectAllowed();
                } else if ((abstractC0302m instanceof c0) && !z8) {
                    if (needsBackwardsCompatibleRequest(determineDeviceGMSVersionCode(context))) {
                        aVar.e(PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyRequest((c0) abstractC0302m));
                    } else {
                        aVar.d(PublicKeyCredentialControllerUtility.INSTANCE.convertToPlayAuthPasskeyJsonRequest((c0) abstractC0302m));
                    }
                    z8 = true;
                } else if (abstractC0302m instanceof C1740a) {
                    C1740a c1740a = (C1740a) abstractC0302m;
                    aVar.c(convertToGoogleIdTokenOption(c1740a));
                    if (z7 || c1740a.getF12577n()) {
                    }
                }
            }
            BeginSignInRequest beginSignInRequestA = aVar.b(z7).a();
            Intrinsics.checkNotNullExpressionValue(beginSignInRequestA, "requestBuilder\n         …\n                .build()");
            return beginSignInRequestA;
        }

        private Companion() {
        }
    }
}
