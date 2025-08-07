package androidx.credentials.playservices.controllers.CreatePublicKeyCredential;

import B0.C0296g;
import B0.c0;
import C0.c;
import C0.k;
import C0.m;
import D0.B;
import D0.C0366a;
import D0.C0367b;
import D0.C0369d;
import D0.e;
import D0.f;
import D0.l;
import D0.n;
import D0.p;
import D0.r;
import D0.s;
import D0.x;
import D0.z;
import E0.a;
import E0.d;
import P9.t;
import Y3.qE.KpBmp;
import android.util.Base64;
import android.util.Log;
import com.appsflyer.AppsFlyerProperties;
import com.github.luben.zstd.BuildConfig;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.SignInCredential;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.fido2.api.common.Attachment;
import com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference;
import com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria;
import com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier;
import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension;
import com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity;
import com.google.android.gms.fido.fido2.api.common.ResidentKeyRequirement;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension;
import j0.tkB.pkcpMQSgx;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ka.oik.UJEa;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.F;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility;", BuildConfig.FLAVOR, "()V", "Companion", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PublicKeyCredentialControllerUtility {
    private static final int FLAGS = 11;
    private static final String TAG = "PublicKeyUtility";

    public static final Companion INSTANCE = new Companion(null);
    private static final String JSON_KEY_CLIENT_DATA = "clientDataJSON";
    private static final String JSON_KEY_ATTESTATION_OBJ = "attestationObject";
    private static final String JSON_KEY_AUTH_DATA = "authenticatorData";
    private static final String JSON_KEY_SIGNATURE = "signature";
    private static final String JSON_KEY_USER_HANDLE = "userHandle";
    private static final String JSON_KEY_RESPONSE = "response";
    private static final String JSON_KEY_ID = "id";
    private static final String JSON_KEY_RAW_ID = "rawId";
    private static final String JSON_KEY_TYPE = "type";
    private static final String JSON_KEY_RPID = UJEa.aPrjVIDuVFWBW;
    private static final String JSON_KEY_CHALLENGE = "challenge";
    private static final String JSON_KEY_APPID = AppsFlyerProperties.APP_ID;
    private static final String JSON_KEY_THIRD_PARTY_PAYMENT = "thirdPartyPayment";
    private static final String JSON_KEY_AUTH_SELECTION = "authenticatorSelection";
    private static final String JSON_KEY_REQUIRE_RES_KEY = "requireResidentKey";
    private static final String JSON_KEY_RES_KEY = "residentKey";
    private static final String JSON_KEY_AUTH_ATTACHMENT = "authenticatorAttachment";
    private static final String JSON_KEY_TIMEOUT = "timeout";
    private static final String JSON_KEY_EXCLUDE_CREDENTIALS = "excludeCredentials";
    private static final String JSON_KEY_TRANSPORTS = "transports";
    private static final String JSON_KEY_RP = "rp";
    private static final String JSON_KEY_NAME = "name";
    private static final String JSON_KEY_ICON = "icon";
    private static final String JSON_KEY_ALG = "alg";
    private static final String JSON_KEY_USER = "user";
    private static final String JSON_KEY_DISPLAY_NAME = "displayName";
    private static final String JSON_KEY_USER_VERIFICATION_METHOD = "userVerificationMethod";
    private static final String JSON_KEY_KEY_PROTECTION_TYPE = "keyProtectionType";
    private static final String JSON_KEY_MATCHER_PROTECTION_TYPE = "matcherProtectionType";
    private static final String JSON_KEY_EXTENSTIONS = "extensions";
    private static final String JSON_KEY_ATTESTATION = "attestation";
    private static final String JSON_KEY_PUB_KEY_CRED_PARAMS = "pubKeyCredParams";
    private static final String JSON_KEY_CLIENT_EXTENSION_RESULTS = "clientExtensionResults";
    private static final String JSON_KEY_RK = "rk";
    private static final String JSON_KEY_CRED_PROPS = "credProps";
    private static final LinkedHashMap<ErrorCode, e> orderedErrorCodeToExceptions = F.j(new Pair[]{t.a(ErrorCode.UNKNOWN_ERR, new B()), t.a(ErrorCode.ABORT_ERR, new C0366a()), t.a(ErrorCode.ATTESTATION_NOT_PRIVATE_ERR, new r()), t.a(ErrorCode.CONSTRAINT_ERR, new C0367b()), t.a(ErrorCode.DATA_ERR, new C0369d()), t.a(ErrorCode.INVALID_STATE_ERR, new l()), t.a(ErrorCode.ENCODING_ERR, new f()), t.a(ErrorCode.NETWORK_ERR, new n()), t.a(ErrorCode.NOT_ALLOWED_ERR, new p()), t.a(ErrorCode.NOT_SUPPORTED_ERR, new s()), t.a(ErrorCode.f14513v, new x()), t.a(ErrorCode.TIMEOUT_ERR, new z())});

    @Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\bJ\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00062\u000e\u0010\u0015\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u00132\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u001b\u001a\u00020&¢\u0006\u0004\b(\u0010)J!\u00100\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\b\u0010,\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b.\u0010/J\u001f\u00105\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b3\u00104J\u001f\u00107\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b6\u00104J\u001f\u00109\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b8\u00104J\u001f\u0010;\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b:\u00104J\u001f\u0010=\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b<\u00104J\u001f\u0010?\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00102\u001a\u000201H\u0000¢\u0006\u0004\b>\u00104J\u0015\u0010A\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0014¢\u0006\u0004\bA\u0010BJ\u0015\u0010D\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u0006¢\u0006\u0004\bD\u0010EJ\u0015\u0010I\u001a\u00020H2\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bO\u0010L\u001a\u0004\bP\u0010NR\u001a\u0010Q\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\bR\u0010NR\u001a\u0010S\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bS\u0010L\u001a\u0004\bT\u0010NR\u001a\u0010U\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bU\u0010L\u001a\u0004\bV\u0010NR\u001a\u0010W\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bW\u0010L\u001a\u0004\bX\u0010NR\u001a\u0010Y\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bY\u0010L\u001a\u0004\bZ\u0010NR\u001a\u0010[\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b[\u0010L\u001a\u0004\b\\\u0010NR\u001a\u0010]\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b]\u0010L\u001a\u0004\b^\u0010NR\u001a\u0010_\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b_\u0010L\u001a\u0004\b`\u0010NR\u001a\u0010a\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\ba\u0010L\u001a\u0004\bb\u0010NR\u001a\u0010c\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bc\u0010L\u001a\u0004\bd\u0010NR\u001a\u0010e\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\be\u0010L\u001a\u0004\bf\u0010NR\u001a\u0010g\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bg\u0010L\u001a\u0004\bh\u0010NR\u001a\u0010i\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bi\u0010L\u001a\u0004\bj\u0010NR\u001a\u0010k\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bk\u0010L\u001a\u0004\bl\u0010NR\u001a\u0010m\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bm\u0010L\u001a\u0004\bn\u0010NR\u001a\u0010o\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bo\u0010L\u001a\u0004\bp\u0010NR\u001a\u0010q\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bq\u0010L\u001a\u0004\br\u0010NR\u001a\u0010s\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bs\u0010L\u001a\u0004\bt\u0010NR\u001a\u0010u\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bu\u0010L\u001a\u0004\bv\u0010NR\u001a\u0010w\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\bw\u0010L\u001a\u0004\bx\u0010NR\u001a\u0010y\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\by\u0010L\u001a\u0004\bz\u0010NR\u001a\u0010{\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b{\u0010L\u001a\u0004\b|\u0010NR\u001a\u0010}\u001a\u00020\u00148\u0000X\u0080D¢\u0006\f\n\u0004\b}\u0010L\u001a\u0004\b~\u0010NR\u001b\u0010\u007f\u001a\u00020\u00148\u0000X\u0080D¢\u0006\r\n\u0004\b\u007f\u0010L\u001a\u0005\b\u0080\u0001\u0010NR\u001d\u0010\u0081\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010L\u001a\u0005\b\u0082\u0001\u0010NR\u001d\u0010\u0083\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010L\u001a\u0005\b\u0084\u0001\u0010NR\u001d\u0010\u0085\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010L\u001a\u0005\b\u0086\u0001\u0010NR\u001d\u0010\u0087\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010L\u001a\u0005\b\u0088\u0001\u0010NR\u001d\u0010\u0089\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010L\u001a\u0005\b\u008a\u0001\u0010NR\u001d\u0010\u008b\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010L\u001a\u0005\b\u008c\u0001\u0010NR\u001d\u0010\u008d\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010L\u001a\u0005\b\u008e\u0001\u0010NR\u001d\u0010\u008f\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010L\u001a\u0005\b\u0090\u0001\u0010NR\u001d\u0010\u0091\u0001\u001a\u00020\u00148\u0000X\u0080D¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010L\u001a\u0005\b\u0092\u0001\u0010NR?\u0010\u0096\u0001\u001a\"\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030\u0094\u00010\u0093\u0001j\u0010\u0012\u0004\u0012\u00020*\u0012\u0005\u0012\u00030\u0094\u0001`\u0095\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0017\u0010\u009a\u0001\u001a\u00020F8\u0002X\u0082T¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0016\u0010\u009c\u0001\u001a\u00020\u00148\u0002X\u0082T¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010L¨\u0006\u009d\u0001"}, d2 = {"Landroidx/credentials/playservices/controllers/CreatePublicKeyCredential/PublicKeyCredentialControllerUtility$Companion;", BuildConfig.FLAVOR, "<init>", "()V", "Lorg/json/JSONObject;", "json", BuildConfig.FLAVOR, "getChallenge", "(Lorg/json/JSONObject;)[B", "LB0/g;", "request", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "convert", "(LB0/g;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "convertJSON$credentials_play_services_auth_release", "(Lorg/json/JSONObject;)Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions;", "convertJSON", "clientDataJSON", "attestationObject", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "transportArray", BuildConfig.FLAVOR, "addAuthenticatorAttestationResponse$credentials_play_services_auth_release", "([B[B[Ljava/lang/String;Lorg/json/JSONObject;)V", "addAuthenticatorAttestationResponse", "Lcom/google/android/gms/auth/api/identity/SignInCredential;", "cred", "toAssertPasskeyResponse", "(Lcom/google/android/gms/auth/api/identity/SignInCredential;)Ljava/lang/String;", "LB0/c0;", "option", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "convertToPlayAuthPasskeyJsonRequest", "(LB0/c0;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeyJsonRequestOptions;", "Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "convertToPlayAuthPasskeyRequest", "(LB0/c0;)Lcom/google/android/gms/auth/api/identity/BeginSignInRequest$PasskeysRequestOptions;", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;", "LC0/e;", "publicKeyCredentialResponseContainsError", "(Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredential;)LC0/e;", "Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;", "code", "msg", "LC0/m;", "beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release", "(Lcom/google/android/gms/fido/fido2/api/common/ErrorCode;Ljava/lang/String;)LC0/m;", "beginSignInPublicKeyCredentialResponseContainsError", "Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$a;", "builder", "parseOptionalExtensions$credentials_play_services_auth_release", "(Lorg/json/JSONObject;Lcom/google/android/gms/fido/fido2/api/common/PublicKeyCredentialCreationOptions$a;)V", "parseOptionalExtensions", "parseOptionalAuthenticatorSelection$credentials_play_services_auth_release", "parseOptionalAuthenticatorSelection", "parseOptionalTimeout$credentials_play_services_auth_release", "parseOptionalTimeout", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release", "parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials", "parseRequiredRpAndParams$credentials_play_services_auth_release", "parseRequiredRpAndParams", "parseRequiredChallengeAndUser$credentials_play_services_auth_release", "parseRequiredChallengeAndUser", "str", "b64Decode", "(Ljava/lang/String;)[B", "data", "b64Encode", "([B)Ljava/lang/String;", BuildConfig.FLAVOR, "alg", BuildConfig.FLAVOR, "checkAlgSupported", "(I)Z", "JSON_KEY_CLIENT_DATA", "Ljava/lang/String;", "getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release", "()Ljava/lang/String;", "JSON_KEY_ATTESTATION_OBJ", "getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release", "JSON_KEY_AUTH_DATA", "getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release", "JSON_KEY_SIGNATURE", "getJSON_KEY_SIGNATURE$credentials_play_services_auth_release", "JSON_KEY_USER_HANDLE", "getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release", "JSON_KEY_RESPONSE", "getJSON_KEY_RESPONSE$credentials_play_services_auth_release", "JSON_KEY_ID", "getJSON_KEY_ID$credentials_play_services_auth_release", "JSON_KEY_RAW_ID", "getJSON_KEY_RAW_ID$credentials_play_services_auth_release", "JSON_KEY_TYPE", "getJSON_KEY_TYPE$credentials_play_services_auth_release", "JSON_KEY_RPID", "getJSON_KEY_RPID$credentials_play_services_auth_release", "JSON_KEY_CHALLENGE", "getJSON_KEY_CHALLENGE$credentials_play_services_auth_release", "JSON_KEY_APPID", "getJSON_KEY_APPID$credentials_play_services_auth_release", "JSON_KEY_THIRD_PARTY_PAYMENT", "getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release", "JSON_KEY_AUTH_SELECTION", "getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release", "JSON_KEY_REQUIRE_RES_KEY", "getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release", "JSON_KEY_RES_KEY", "getJSON_KEY_RES_KEY$credentials_play_services_auth_release", "JSON_KEY_AUTH_ATTACHMENT", "getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release", "JSON_KEY_TIMEOUT", "getJSON_KEY_TIMEOUT$credentials_play_services_auth_release", "JSON_KEY_EXCLUDE_CREDENTIALS", "getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release", "JSON_KEY_TRANSPORTS", "getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release", "JSON_KEY_RP", "getJSON_KEY_RP$credentials_play_services_auth_release", "JSON_KEY_NAME", "getJSON_KEY_NAME$credentials_play_services_auth_release", "JSON_KEY_ICON", "getJSON_KEY_ICON$credentials_play_services_auth_release", "JSON_KEY_ALG", "getJSON_KEY_ALG$credentials_play_services_auth_release", "JSON_KEY_USER", "getJSON_KEY_USER$credentials_play_services_auth_release", "JSON_KEY_DISPLAY_NAME", "getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release", "JSON_KEY_USER_VERIFICATION_METHOD", "getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release", "JSON_KEY_KEY_PROTECTION_TYPE", "getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release", "JSON_KEY_MATCHER_PROTECTION_TYPE", "getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release", "JSON_KEY_EXTENSTIONS", "getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release", "JSON_KEY_ATTESTATION", "getJSON_KEY_ATTESTATION$credentials_play_services_auth_release", "JSON_KEY_PUB_KEY_CRED_PARAMS", "getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release", "JSON_KEY_CLIENT_EXTENSION_RESULTS", "getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release", "JSON_KEY_RK", "getJSON_KEY_RK$credentials_play_services_auth_release", "JSON_KEY_CRED_PROPS", "getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release", "Ljava/util/LinkedHashMap;", "LD0/e;", "Lkotlin/collections/LinkedHashMap;", "orderedErrorCodeToExceptions", "Ljava/util/LinkedHashMap;", "getOrderedErrorCodeToExceptions$credentials_play_services_auth_release", "()Ljava/util/LinkedHashMap;", "FLAGS", "I", "TAG", "credentials-play-services-auth_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final byte[] getChallenge(JSONObject json) throws JSONException {
            String strOptString = json.optString(getJSON_KEY_CHALLENGE$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(strOptString, "challengeB64");
            if (strOptString.length() != 0) {
                return b64Decode(strOptString);
            }
            throw new JSONException("Challenge not found in request or is unexpectedly empty");
        }

        public final void addAuthenticatorAttestationResponse$credentials_play_services_auth_release(byte[] clientDataJSON, byte[] attestationObject, String[] transportArray, JSONObject json) throws JSONException {
            Intrinsics.checkNotNullParameter(clientDataJSON, "clientDataJSON");
            Intrinsics.checkNotNullParameter(attestationObject, "attestationObject");
            Intrinsics.checkNotNullParameter(transportArray, "transportArray");
            Intrinsics.checkNotNullParameter(json, "json");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release(), b64Encode(clientDataJSON));
            jSONObject.put(getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release(), b64Encode(attestationObject));
            jSONObject.put(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release(), new JSONArray(transportArray));
            json.put(getJSON_KEY_RESPONSE$credentials_play_services_auth_release(), jSONObject);
        }

        public final byte[] b64Decode(String str) {
            Intrinsics.checkNotNullParameter(str, "str");
            byte[] bArrDecode = Base64.decode(str, 11);
            Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(str, FLAGS)");
            return bArrDecode;
        }

        public final String b64Encode(byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            String strEncodeToString = Base64.encodeToString(data, 11);
            Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(data, FLAGS)");
            return strEncodeToString;
        }

        public final m beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(ErrorCode code, String msg) {
            Intrinsics.checkNotNullParameter(code, "code");
            e eVar = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(code);
            if (eVar != null) {
                return (code == ErrorCode.CONSTRAINT_ERR && msg != null && StringsKt.K(msg, "Unable to get sync account", false, 2, (Object) null)) ? new k("Passkey retrieval was cancelled by the user.") : new d(eVar, msg);
            }
            return new d(new B(), "unknown fido gms exception - " + msg);
        }

        public final boolean checkAlgSupported(int alg) {
            try {
                COSEAlgorithmIdentifier.a(alg);
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }

        public final PublicKeyCredentialCreationOptions convert(C0296g request) {
            Intrinsics.checkNotNullParameter(request, "request");
            return convertJSON$credentials_play_services_auth_release(new JSONObject(request.getRequestJson()));
        }

        public final PublicKeyCredentialCreationOptions convertJSON$credentials_play_services_auth_release(JSONObject json) throws JSONException, a {
            Intrinsics.checkNotNullParameter(json, "json");
            PublicKeyCredentialCreationOptions.a aVar = new PublicKeyCredentialCreationOptions.a();
            parseRequiredChallengeAndUser$credentials_play_services_auth_release(json, aVar);
            parseRequiredRpAndParams$credentials_play_services_auth_release(json, aVar);
            parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(json, aVar);
            parseOptionalTimeout$credentials_play_services_auth_release(json, aVar);
            parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(json, aVar);
            parseOptionalExtensions$credentials_play_services_auth_release(json, aVar);
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptionsA = aVar.a();
            Intrinsics.checkNotNullExpressionValue(publicKeyCredentialCreationOptionsA, "builder.build()");
            return publicKeyCredentialCreationOptionsA;
        }

        public final BeginSignInRequest.PasskeyJsonRequestOptions convertToPlayAuthPasskeyJsonRequest(c0 option) {
            Intrinsics.checkNotNullParameter(option, "option");
            BeginSignInRequest.PasskeyJsonRequestOptions passkeyJsonRequestOptionsA = new BeginSignInRequest.PasskeyJsonRequestOptions.a().c(true).b(option.getRequestJson()).a();
            Intrinsics.checkNotNullExpressionValue(passkeyJsonRequestOptionsA, "Builder()\n        .setSu…estJson)\n        .build()");
            return passkeyJsonRequestOptionsA;
        }

        public final BeginSignInRequest.PasskeysRequestOptions convertToPlayAuthPasskeyRequest(c0 option) throws JSONException {
            Intrinsics.checkNotNullParameter(option, "option");
            JSONObject jSONObject = new JSONObject(option.getRequestJson());
            String strOptString = jSONObject.optString(getJSON_KEY_RPID$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(strOptString, "rpId");
            if (strOptString.length() == 0) {
                throw new JSONException("GetPublicKeyCredentialOption - rpId not specified in the request or is unexpectedly empty");
            }
            BeginSignInRequest.PasskeysRequestOptions passkeysRequestOptionsA = new BeginSignInRequest.PasskeysRequestOptions.a().d(true).c(strOptString).b(getChallenge(jSONObject)).a();
            Intrinsics.checkNotNullExpressionValue(passkeysRequestOptionsA, "Builder()\n        .setSu…allenge)\n        .build()");
            return passkeysRequestOptionsA;
        }

        public final String getJSON_KEY_ALG$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ALG;
        }

        public final String getJSON_KEY_APPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_APPID;
        }

        public final String getJSON_KEY_ATTESTATION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION;
        }

        public final String getJSON_KEY_ATTESTATION_OBJ$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ATTESTATION_OBJ;
        }

        public final String getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_ATTACHMENT;
        }

        public final String getJSON_KEY_AUTH_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA;
        }

        public final String getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_SELECTION;
        }

        public final String getJSON_KEY_CHALLENGE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE;
        }

        public final String getJSON_KEY_CLIENT_DATA$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_DATA;
        }

        public final String getJSON_KEY_CLIENT_EXTENSION_RESULTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CLIENT_EXTENSION_RESULTS;
        }

        public final String getJSON_KEY_CRED_PROPS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS;
        }

        public final String getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME;
        }

        public final String getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXCLUDE_CREDENTIALS;
        }

        public final String getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_EXTENSTIONS;
        }

        public final String getJSON_KEY_ICON$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ICON;
        }

        public final String getJSON_KEY_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_ID;
        }

        public final String getJSON_KEY_KEY_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_KEY_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_MATCHER_PROTECTION_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_MATCHER_PROTECTION_TYPE;
        }

        public final String getJSON_KEY_NAME$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_NAME;
        }

        public final String getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_PUB_KEY_CRED_PARAMS;
        }

        public final String getJSON_KEY_RAW_ID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RAW_ID;
        }

        public final String getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_REQUIRE_RES_KEY;
        }

        public final String getJSON_KEY_RESPONSE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE;
        }

        public final String getJSON_KEY_RES_KEY$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RES_KEY;
        }

        public final String getJSON_KEY_RK$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RK;
        }

        public final String getJSON_KEY_RP$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RP;
        }

        public final String getJSON_KEY_RPID$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_RPID;
        }

        public final String getJSON_KEY_SIGNATURE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE;
        }

        public final String getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_THIRD_PARTY_PAYMENT;
        }

        public final String getJSON_KEY_TIMEOUT$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TIMEOUT;
        }

        public final String getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS;
        }

        public final String getJSON_KEY_TYPE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_TYPE;
        }

        public final String getJSON_KEY_USER$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        }

        public final String getJSON_KEY_USER_HANDLE$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_HANDLE;
        }

        public final String getJSON_KEY_USER_VERIFICATION_METHOD$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.JSON_KEY_USER_VERIFICATION_METHOD;
        }

        public final LinkedHashMap<ErrorCode, e> getOrderedErrorCodeToExceptions$credentials_play_services_auth_release() {
            return PublicKeyCredentialControllerUtility.orderedErrorCodeToExceptions;
        }

        public final void parseOptionalAuthenticatorSelection$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.a builder) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_AUTH_SELECTION$credentials_play_services_auth_release());
                AuthenticatorSelectionCriteria.a aVar = new AuthenticatorSelectionCriteria.a();
                boolean zOptBoolean = jSONObject.optBoolean(getJSON_KEY_REQUIRE_RES_KEY$credentials_play_services_auth_release(), false);
                String strOptString = jSONObject.optString(getJSON_KEY_RES_KEY$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
                Intrinsics.checkNotNullExpressionValue(strOptString, "residentKey");
                aVar.c(Boolean.valueOf(zOptBoolean)).d(strOptString.length() > 0 ? ResidentKeyRequirement.c(strOptString) : null);
                String strOptString2 = jSONObject.optString(getJSON_KEY_AUTH_ATTACHMENT$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
                Intrinsics.checkNotNullExpressionValue(strOptString2, "authenticatorAttachmentString");
                if (strOptString2.length() > 0) {
                    aVar.b(Attachment.c(strOptString2));
                }
                builder.d(aVar.a());
            }
        }

        public final void parseOptionalExtensions$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.a builder) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (json.has(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release())) {
                JSONObject jSONObject = json.getJSONObject(getJSON_KEY_EXTENSTIONS$credentials_play_services_auth_release());
                AuthenticationExtensions.a aVar = new AuthenticationExtensions.a();
                String strOptString = jSONObject.optString(getJSON_KEY_APPID$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
                Intrinsics.checkNotNullExpressionValue(strOptString, "appIdExtension");
                if (strOptString.length() > 0) {
                    aVar.b(new FidoAppIdExtension(strOptString));
                }
                if (jSONObject.optBoolean(getJSON_KEY_THIRD_PARTY_PAYMENT$credentials_play_services_auth_release(), false)) {
                    aVar.c(new GoogleThirdPartyPaymentExtension(true));
                }
                if (jSONObject.optBoolean("uvm", false)) {
                    aVar.d(new UserVerificationMethodExtension(true));
                }
                builder.c(aVar.a());
            }
        }

        public final void parseOptionalTimeout$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.a builder) {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, pkcpMQSgx.VtTvLfk);
            if (json.has(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release())) {
                builder.i(Double.valueOf(json.getLong(getJSON_KEY_TIMEOUT$credentials_play_services_auth_release()) / 1000));
            }
        }

        public final void parseOptionalWithRequiredDefaultsAttestationAndExcludeCredentials$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.a builder) throws JSONException, a {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            ArrayList arrayList2 = new ArrayList();
            if (json.has(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release())) {
                JSONArray jSONArray = json.getJSONArray(getJSON_KEY_EXCLUDE_CREDENTIALS$credentials_play_services_auth_release());
                int length = jSONArray.length();
                for (int i7 = 0; i7 < length; i7++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i7);
                    String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
                    Intrinsics.checkNotNullExpressionValue(string, "descriptorJSON.getString(JSON_KEY_ID)");
                    byte[] bArrB64Decode = b64Decode(string);
                    String string2 = jSONObject.getString(getJSON_KEY_TYPE$credentials_play_services_auth_release());
                    Intrinsics.checkNotNullExpressionValue(string2, "descriptorType");
                    if (string2.length() == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor type value is not found or unexpectedly empty");
                    }
                    if (bArrB64Decode.length == 0) {
                        throw new JSONException("PublicKeyCredentialDescriptor id value is not found or unexpectedly empty");
                    }
                    if (jSONObject.has(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release())) {
                        arrayList = new ArrayList();
                        JSONArray jSONArray2 = jSONObject.getJSONArray(getJSON_KEY_TRANSPORTS$credentials_play_services_auth_release());
                        int length2 = jSONArray2.length();
                        for (int i8 = 0; i8 < length2; i8++) {
                            try {
                                Transport transportC = Transport.c(jSONArray2.getString(i8));
                                Intrinsics.checkNotNullExpressionValue(transportC, "fromString(descriptorTransports.getString(j))");
                                arrayList.add(transportC);
                            } catch (Transport.a e7) {
                                throw new a(new f(), e7.getMessage());
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                    arrayList2.add(new PublicKeyCredentialDescriptor(string2, bArrB64Decode, arrayList));
                }
            }
            builder.f(arrayList2);
            String strOptString = json.optString(getJSON_KEY_ATTESTATION$credentials_play_services_auth_release(), "none");
            Intrinsics.checkNotNullExpressionValue(strOptString, "attestationString");
            builder.b(AttestationConveyancePreference.c(strOptString.length() != 0 ? strOptString : "none"));
        }

        public final void parseRequiredChallengeAndUser$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.a builder) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            builder.e(getChallenge(json));
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_USER$credentials_play_services_auth_release());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            Intrinsics.checkNotNullExpressionValue(string, "user.getString(JSON_KEY_ID)");
            byte[] bArrB64Decode = b64Decode(string);
            String string2 = jSONObject.getString(getJSON_KEY_NAME$credentials_play_services_auth_release());
            String string3 = jSONObject.getString(getJSON_KEY_DISPLAY_NAME$credentials_play_services_auth_release());
            String strOptString = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
            Intrinsics.checkNotNullExpressionValue(string3, "displayName");
            if (string3.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing displayName or they are unexpectedly empty");
            }
            if (bArrB64Decode.length == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user id or they are unexpectedly empty");
            }
            Intrinsics.checkNotNullExpressionValue(string2, "userName");
            if (string2.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions UserEntity missing user name or they are unexpectedly empty");
            }
            builder.j(new PublicKeyCredentialUserEntity(bArrB64Decode, string2, strOptString, string3));
        }

        public final void parseRequiredRpAndParams$credentials_play_services_auth_release(JSONObject json, PublicKeyCredentialCreationOptions.a builder) throws JSONException {
            Intrinsics.checkNotNullParameter(json, "json");
            Intrinsics.checkNotNullParameter(builder, "builder");
            JSONObject jSONObject = json.getJSONObject(getJSON_KEY_RP$credentials_play_services_auth_release());
            String string = jSONObject.getString(getJSON_KEY_ID$credentials_play_services_auth_release());
            String strOptString = jSONObject.optString(getJSON_KEY_NAME$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
            String strOptString2 = jSONObject.optString(getJSON_KEY_ICON$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
            Intrinsics.d(strOptString2);
            if (strOptString2.length() == 0) {
                strOptString2 = null;
            }
            Intrinsics.checkNotNullExpressionValue(strOptString, "rpName");
            if (strOptString.length() == 0) {
                throw new JSONException("PublicKeyCredentialCreationOptions rp name is missing or unexpectedly empty");
            }
            Intrinsics.checkNotNullExpressionValue(string, "rpId");
            if (string.length() == 0) {
                throw new JSONException(KpBmp.YHCxr);
            }
            builder.h(new PublicKeyCredentialRpEntity(string, strOptString, strOptString2));
            JSONArray jSONArray = json.getJSONArray(getJSON_KEY_PUB_KEY_CRED_PARAMS$credentials_play_services_auth_release());
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i7 = 0; i7 < length; i7++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i7);
                int i8 = (int) jSONObject2.getLong(getJSON_KEY_ALG$credentials_play_services_auth_release());
                String strOptString3 = jSONObject2.optString(getJSON_KEY_TYPE$credentials_play_services_auth_release(), BuildConfig.FLAVOR);
                Intrinsics.checkNotNullExpressionValue(strOptString3, "typeParam");
                if (strOptString3.length() == 0) {
                    throw new JSONException("PublicKeyCredentialCreationOptions PublicKeyCredentialParameter type missing or unexpectedly empty");
                }
                if (checkAlgSupported(i8)) {
                    arrayList.add(new PublicKeyCredentialParameters(strOptString3, i8));
                }
            }
            builder.g(arrayList);
        }

        public final C0.e publicKeyCredentialResponseContainsError(PublicKeyCredential cred) {
            Intrinsics.checkNotNullParameter(cred, "cred");
            AuthenticatorResponse authenticatorResponseR = cred.r();
            Intrinsics.checkNotNullExpressionValue(authenticatorResponseR, "cred.response");
            if (!(authenticatorResponseR instanceof AuthenticatorErrorResponse)) {
                return null;
            }
            AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) authenticatorResponseR;
            ErrorCode errorCodeL = authenticatorErrorResponse.l();
            Intrinsics.checkNotNullExpressionValue(errorCodeL, "authenticatorResponse.errorCode");
            e eVar = getOrderedErrorCodeToExceptions$credentials_play_services_auth_release().get(errorCodeL);
            String strO = authenticatorErrorResponse.o();
            if (eVar != null) {
                return (errorCodeL == ErrorCode.CONSTRAINT_ERR && strO != null && StringsKt.K(strO, "Unable to get sync account", false, 2, (Object) null)) ? new c("Passkey registration was cancelled by the user.") : new a(eVar, strO);
            }
            return new a(new B(), "unknown fido gms exception - " + strO);
        }

        public final String toAssertPasskeyResponse(SignInCredential cred) throws m {
            Intrinsics.checkNotNullParameter(cred, "cred");
            JSONObject jSONObject = new JSONObject();
            PublicKeyCredential publicKeyCredentialV = cred.v();
            AuthenticatorResponse authenticatorResponseR = publicKeyCredentialV != null ? publicKeyCredentialV.r() : null;
            Intrinsics.d(authenticatorResponseR);
            if (authenticatorResponseR instanceof AuthenticatorErrorResponse) {
                AuthenticatorErrorResponse authenticatorErrorResponse = (AuthenticatorErrorResponse) authenticatorResponseR;
                ErrorCode errorCodeL = authenticatorErrorResponse.l();
                Intrinsics.checkNotNullExpressionValue(errorCodeL, "authenticatorResponse.errorCode");
                throw beginSignInPublicKeyCredentialResponseContainsError$credentials_play_services_auth_release(errorCodeL, authenticatorErrorResponse.o());
            }
            if (!(authenticatorResponseR instanceof AuthenticatorAssertionResponse)) {
                Log.e(PublicKeyCredentialControllerUtility.TAG, "AuthenticatorResponse expected assertion response but got: " + authenticatorResponseR.getClass().getName());
                String string = jSONObject.toString();
                Intrinsics.checkNotNullExpressionValue(string, "json.toString()");
                return string;
            }
            try {
                String strT = publicKeyCredentialV.t();
                Intrinsics.checkNotNullExpressionValue(strT, "publicKeyCred.toJson()");
                return strT;
            } catch (Throwable th) {
                throw new C0.p("The PublicKeyCredential response json had an unexpected exception when parsing: " + th.getMessage());
            }
        }

        private Companion() {
        }
    }

    public static final PublicKeyCredentialCreationOptions convert(C0296g c0296g) {
        return INSTANCE.convert(c0296g);
    }
}
